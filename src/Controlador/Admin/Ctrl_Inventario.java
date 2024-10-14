package Controlador.Admin;

import Componentes.Limites;
import Modelo.Admin.Inventario;
import Vista.Paneles_Admin.Panel_Inventario;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;
import javax.swing.text.AbstractDocument;


public class Ctrl_Inventario implements MouseListener {
    private Inventario Modelo;
    private Panel_Inventario Vista;
    private String imageUrl;
    
    public Ctrl_Inventario(Inventario modelo, Panel_Inventario vista){
        this.Modelo = modelo;
        this.Vista = vista;
        
        vista.btn_Add_Inventory_Admin.addMouseListener(this);
        modelo.Mostrar(vista.jtb_Inventory);
        vista.btn_Update_Inventory_Admin.addMouseListener(this);
        vista.jtb_Inventory.addMouseListener(this);
        vista.Btn_Delete_Inventory_Admin.addMouseListener(this);
        Vista.btn_Upload_photo_Inventario.addMouseListener(this);
        
        ((AbstractDocument) Vista.txt_Nombre_Inventory_Admin.getDocument()).setDocumentFilter(new Limites(28));
        ((AbstractDocument) Vista.txt_Precio_Inventory_Admin.getDocument()).setDocumentFilter(new Limites(8));
        ((AbstractDocument) Vista.txt_Descrip_Inventory_Admin.getDocument()).setDocumentFilter(new Limites(2000));
        
        Vista.txt_Precio_Inventory_Admin.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                // Permitir solo números, punto y coma
                if (!Character.isDigit(caracter) && caracter != '.' && caracter != ',' && !Character.isISOControl(caracter)) {
                    e.consume(); // Ignorar el evento de teclado
                    JOptionPane.showMessageDialog(Vista, "Por favor, ingrese solo números, '.' o ',' para el precio.", "Entrada no válida", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        
        Vista.txt_Cantidad_Inventory_Admin.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                // Permitir solo números
                if (!Character.isDigit(caracter) && !Character.isISOControl(caracter)) {
                    e.consume(); // Ignorar el evento de teclado
                    JOptionPane.showMessageDialog(Vista, "Por favor, ingrese solo números para la cantidad.", "Entrada no válida", JOptionPane.WARNING_MESSAGE);
                }
            }
        });


    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == Vista.btn_Add_Inventory_Admin) {
            if (!verificarCampos()) {
                return;
            }
            
            if (imageUrl != null) {
                Modelo.setImg_Producto(imageUrl);
            }
            Modelo.setNombre_Producto(Vista.txt_Nombre_Inventory_Admin.getText());

            // Convertir lo introducido a entero y decimal
            try {
                float precio = Float.parseFloat(Vista.txt_Precio_Inventory_Admin.getText());
                Modelo.setPrecio_Producto(precio);
                int cantidad = Integer.parseInt(Vista.txt_Cantidad_Inventory_Admin.getText());
                Modelo.setCantidad_Bodega_Productos(cantidad);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(Vista, "Por favor, ingrese un valor numérico válido para precio y cantidad.", "Error de entrada", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String Categoria_Flores = Vista.Cb_Categoria_Flores_Inventory_admin.getSelectedItem().toString();
            Modelo.setCategoria_Flores(Categoria_Flores);
            String Categoria_Diseno = Vista.Cb_Categoria_Diseno_Inventory_admin.getSelectedItem().toString();
            Modelo.setCategoria_Diseno(Categoria_Diseno);
            String Categoria_Evento = Vista.Cb_Categoria_Evento_Inventory_admin.getSelectedItem().toString();
            Modelo.setCategoria_Evento(Categoria_Evento);

            Modelo.Guardar();
            Modelo.Mostrar(Vista.jtb_Inventory);
            JOptionPane.showMessageDialog(Vista, "El usuario se ha añadido", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        }

        if (e.getSource() == Vista.btn_Upload_photo_Inventario) {
            SwingWorker<Void, BufferedImage> worker = new SwingWorker<Void, BufferedImage>() {
                @Override
                protected Void doInBackground() {
                    try {
                        ProcessBuilder processBuilder = new ProcessBuilder("python", "C:/Users/vladk/Desktop/Blooming-Desktop/src/python/Subir_IMG_Inventario.py");
                        Process process = processBuilder.start();
                        try (BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
                            String line;
                            String imageUrl = null;
                            while ((line = reader.readLine()) != null) {
                                System.out.println(line);
                                imageUrl = line;
                            }
                            process.waitFor();

                            if (imageUrl != null) {
                                BufferedImage img = ImageIO.read(new URL(imageUrl));
                                publish(img);
                            }
                        }
                    } catch (IOException | InterruptedException ex) {
                        ex.printStackTrace();
                    }
                    return null;
                }

                //Con esto convertimos la imagen a icono =)
                @Override
                protected void process(List<BufferedImage> chunks) {
                    if (!chunks.isEmpty()) {
                        BufferedImage img = chunks.get(chunks.size() - 1);
                        Vista.IMG_Inventory_admin.setIcon(new ImageIcon(img));
                    }
                }
            };

            worker.execute();
        }

        
        if(e.getSource() == Vista.Btn_Delete_Inventory_Admin){
          Modelo.Eliminar(Vista.jtb_Inventory);
          JOptionPane.showMessageDialog(Vista, "El usuario se ha eliminado", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
          Modelo.Mostrar(Vista.jtb_Inventory);
        }
        
        if(e.getSource() == Vista.jtb_Inventory){
          Modelo.cargarDatosTabla(Vista);
        }
        
        if(e.getSource() == Vista.btn_Update_Inventory_Admin){
        Modelo.setNombre_Producto(Vista.txt_Nombre_Inventory_Admin.getText());
        
         //Con este try catch nos encargamos de convertir lo introducido a entero y decimal
          try {
             float precio = Float.parseFloat(Vista.txt_Precio_Inventory_Admin.getText());
             Modelo.setPrecio_Producto(precio);
             int cantidad = Integer.parseInt(Vista.txt_Cantidad_Inventory_Admin.getText());
             Modelo.setCantidad_Bodega_Productos(cantidad);
          }  catch (NumberFormatException ex) {
             JOptionPane.showMessageDialog(Vista, "Por favor, ingrese un valor numérico válido para precio y cantidad.", "Error de entrada", JOptionPane.ERROR_MESSAGE);
             return;
          }
         
          String Categoria_Flores = Vista.Cb_Categoria_Flores_Inventory_admin.getSelectedItem().toString();
          Modelo.setCategoria_Flores(Categoria_Flores);
          String Categoria_Diseno = Vista.Cb_Categoria_Diseno_Inventory_admin.getSelectedItem().toString();
          Modelo.setCategoria_Diseno(Categoria_Diseno);
          String Categoria_Evento = Vista.Cb_Categoria_Evento_Inventory_admin.getSelectedItem().toString();
          Modelo.setCategoria_Evento(Categoria_Evento);
          Modelo.Actualizar(Vista.jtb_Inventory);
          Modelo.Mostrar(Vista.jtb_Inventory);
        }
    }
    
    private boolean verificarCampos() {
        String nombreProducto = Vista.txt_Nombre_Inventory_Admin.getText();
        String precio = Vista.txt_Precio_Inventory_Admin.getText();
        String cantidad = Vista.txt_Cantidad_Inventory_Admin.getText();

        // Verificar si los campos de texto están vacíos
        if (nombreProducto.isEmpty() || precio.isEmpty() || cantidad.isEmpty()) {
            JOptionPane.showMessageDialog(Vista, "Por favor, complete todos los campos.", "Error de entrada", JOptionPane.WARNING_MESSAGE);
            return false; // Hay campos vacíos
        }

        // Verificar si las categorías han sido seleccionadas
        if (Vista.Cb_Categoria_Flores_Inventory_admin.getSelectedItem() == null
                || Vista.Cb_Categoria_Diseno_Inventory_admin.getSelectedItem() == null
                || Vista.Cb_Categoria_Evento_Inventory_admin.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(Vista, "Por favor, seleccione una categoría para cada campo.", "Error de entrada", JOptionPane.WARNING_MESSAGE);
            return false; // Falta alguna categoría
        }

        return true; // Todos los campos están llenos y categorías seleccionadas
    }


    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
    
}
