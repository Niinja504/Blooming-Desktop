import firebase_admin
from firebase_admin import credentials, storage
from PIL import Image
import io
from datetime import datetime
import tkinter as tk
from tkinter import filedialog, messagebox

# Inicializar la aplicación de Firebase con tus credenciales JSON
cred = credentials.Certificate("src/python/service.json")
firebase_admin.initialize_app(cred, {
    'storageBucket': 'blooming-1c6bf.appspot.com'
})

def center_messagebox(msg):
    messagebox.showinfo("Mensaje", msg)

# Función para seleccionar archivo desde el explorador
def select_image_from_files():
    file_path = filedialog.askopenfilename(filetypes=[("Image files", "*.jpg *.jpeg *.png")])
    return file_path

# Función para comprimir y subir la imagen a Firebase Storage
def compress_and_upload_image(image_path):
    with Image.open(image_path) as img:
        max_size = 1080
        if img.width > max_size or img.height > max_size:
            img.thumbnail((max_size, max_size))

        # Convertir RGBA a RGB si es necesario
        if img.mode == 'RGBA':
            img = img.convert('RGB')

        compressed_image = io.BytesIO()
        img.save(compressed_image, format='JPEG', quality=100)
        compressed_image.seek(0)

        bucket = storage.bucket()

        timestamp = datetime.now().strftime('%Y-%m-%d-%H-%M-%S')
        blob = bucket.blob(f'Inventario/{timestamp}.jpg')
        blob.upload_from_file(compressed_image, content_type='image/jpeg')

        blob.make_public()
        print(blob.public_url)  # Imprime la URL de la imagen
        return blob.public_url

def on_select():
    image_path = select_image_from_files()
    if not image_path:
        center_messagebox("No se seleccionó ninguna imagen.")
    else:
        center_messagebox(f"Imagen seleccionada: {image_path}")
        
        url = compress_and_upload_image(image_path)
        center_messagebox(f"Image URL: {url}")

    # Cierra la ventana principal al seleccionar
    root.quit()

if __name__ == "__main__":
    # Crear la ventana principal
    root = tk.Tk()
    root.title("Seleccionar Imagen")
    root.geometry("150x100")  # Tamaño de la ventana principal

    # Crear botón para seleccionar archivo
    button_file = tk.Button(root, text="Seleccionar Archivo", command=on_select)
    button_file.pack(pady=20)

    # Ejecutar la ventana principal
    root.mainloop()
