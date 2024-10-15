package Controlador.Admin;

import Componentes.Limites;
import Modelo.Admin.Inventario;
import Modelo.ClaseConexion;
import Modelo.Envio_Correo.Envio;
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
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;
import javax.swing.text.AbstractDocument;

public class Ctrl_Inventario implements MouseListener {

    private Inventario Modelo;
    private Panel_Inventario Vista;
    private String imageUrl;

    public Ctrl_Inventario(Inventario modelo, Panel_Inventario vista) {
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
            DB();
            JOptionPane.showMessageDialog(Vista, "El producto se ha añadido", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            EnviarCorreo();
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

        if (e.getSource() == Vista.Btn_Delete_Inventory_Admin) {
            Modelo.Eliminar(Vista.jtb_Inventory);
            JOptionPane.showMessageDialog(Vista, "El producto se ha eliminado", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            Modelo.Mostrar(Vista.jtb_Inventory);
        }

        if (e.getSource() == Vista.jtb_Inventory) {
            Modelo.cargarDatosTabla(Vista);
        }

        if (e.getSource() == Vista.btn_Update_Inventory_Admin) {
            Modelo.setNombre_Producto(Vista.txt_Nombre_Inventory_Admin.getText());

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
            Modelo.Actualizar(Vista.jtb_Inventory);
            Modelo.Mostrar(Vista.jtb_Inventory);
        }
    }

    private boolean verificarCampos() {
        String nombreProducto = Vista.txt_Nombre_Inventory_Admin.getText();
        String precio = Vista.txt_Precio_Inventory_Admin.getText();
        String cantidad = Vista.txt_Cantidad_Inventory_Admin.getText();

        if (nombreProducto.isEmpty() || precio.isEmpty() || cantidad.isEmpty()) {
            JOptionPane.showMessageDialog(Vista, "Por favor, complete todos los campos.", "Error de entrada", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        if (Vista.Cb_Categoria_Flores_Inventory_admin.getSelectedItem() == null
                || Vista.Cb_Categoria_Diseno_Inventory_admin.getSelectedItem() == null
                || Vista.Cb_Categoria_Evento_Inventory_admin.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(Vista, "Por favor, seleccione una categoría para cada campo.", "Error de entrada", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        return true;
    }

    public List<String> obtenerCorreosClientes() {
        List<String> correos = new ArrayList<>();
        String sql = "SELECT Email_User FROM TbUsers WHERE Rol_User = ?";

        try (Connection conexion = ClaseConexion.getConexion(); PreparedStatement preparedStatement = conexion.prepareStatement(sql)) {

            preparedStatement.setString(1, "cliente");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                correos.add(resultSet.getString("Email_User"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return correos;
    }

    public List<String> obtenerUUID() {
        List<String> uuids = new ArrayList<>();
        String sql = "SELECT UUID_User FROM TbUsers WHERE Rol_User = ?";

        try (Connection conexion = ClaseConexion.getConexion(); PreparedStatement preparedStatement = conexion.prepareStatement(sql)) {

            preparedStatement.setString(1, "cliente");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                uuids.add(resultSet.getString("UUID_User"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return uuids;
    }
    
    public void DB() {
        Connection conexion = ClaseConexion.getConexion();
        try {
            List<String> uuids = obtenerUUID(); // Cambiar el tipo de retorno a List<String>

            // Prepara la declaración para insertar la notificación
            PreparedStatement notificacion = conexion.prepareStatement(
                    "INSERT INTO TbNotificaciones (UUID_Notificacion, UUID_User, Titulo, Mensaje, Tiempo_Envio, Fecha_Envio) VALUES (?, ?, ?, ?, ?, ?)");

            String horaDispositivo = obtenerHoraDispositivo();
            String fechaDispositivo = obtenerFechaDispositivo();
            String UUIDNotificacion = UUID.randomUUID().toString();

            StringBuilder mensaje = new StringBuilder();
            mensaje.append("Aprovecha nuestra nueva oferta por tiempo limitado.\n")
                    .append("Detalles de la oferta:\n")
                    .append("• Título: ").append(Vista.txt_Nombre_Inventory_Admin.getText()).append("\n")
                    .append("• Precio: $").append(Vista.txt_Precio_Inventory_Admin.getText()).append("\n")
                    .append("• Cantidad: ").append(Vista.txt_Cantidad_Inventory_Admin.getText()).append("\n")
                    .append("• Categoría de Flores: ").append(Vista.Cb_Categoria_Flores_Inventory_admin.getSelectedItem()).append("\n")
                    .append("• Categoría de Diseño: ").append(Vista.Cb_Categoria_Diseno_Inventory_admin.getSelectedItem()).append("\n")
                    .append("• Categoría de Evento: ").append(Vista.Cb_Categoria_Evento_Inventory_admin.getSelectedItem()).append("\n");

            for (String uuid : uuids) {
                // Establece los valores para la notificación
                notificacion.setString(1, UUIDNotificacion);
                notificacion.setString(2, uuid);
                notificacion.setString(3, "Nueva oferta");
                notificacion.setString(4, mensaje.toString());
                notificacion.setString(5, horaDispositivo);
                notificacion.setString(6, fechaDispositivo);

                // Ejecuta la inserción
                notificacion.executeUpdate();
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void EnviarCorreo() {
        String nombreProducto = Vista.txt_Nombre_Inventory_Admin.getText();
        String precioProducto = Vista.txt_Precio_Inventory_Admin.getText();
        String cantidadProducto = Vista.txt_Cantidad_Inventory_Admin.getText();
        String categoriaFlores = Vista.Cb_Categoria_Flores_Inventory_admin.getSelectedItem().toString();
        String categoriaDiseno = Vista.Cb_Categoria_Diseno_Inventory_admin.getSelectedItem().toString();
        String categoriaEvento = Vista.Cb_Categoria_Evento_Inventory_admin.getSelectedItem().toString();
        String imageUrl = Modelo.getImg_Producto();

        String subject = "Nueva oferta en Blooming";
        String content = "<html>"
                + "<body>"
                + "<p>Estimado/a cliente,</p>"
                + "<p>Nos complace informarle sobre una nueva oferta especial por tiempo limitado de nuestra innovadora aplicación de pedidos en línea.</p>"
                + "<h3>Detalles de la oferta:</h3>"
                + "<p><strong>Título:</strong> " + nombreProducto + "</p>"
                + "<p><strong>Precio:</strong> $" + precioProducto + "</p>"
                + "<p><strong>Cantidad:</strong> " + cantidadProducto + "</p>"
                + "<p><strong>Categoría de Flores:</strong> " + categoriaFlores + "</p>"
                + "<p><strong>Categoría de Diseño:</strong> " + categoriaDiseno + "</p>"
                + "<p><strong>Categoría de Evento:</strong> " + categoriaEvento + "</p>"
                + "<p><strong>Imagen de la oferta:</strong></p>"
                + "<img src=\"" + imageUrl + "\" alt=\"Imagen de la oferta\" style=\"max-width: 100%; height: auto;\"/>"
                + "<p>No pierda la oportunidad de beneficiarse de esta promoción. Si desea más información, no dude en contactarnos.</p>"
                + "<p>Atentamente,<br>Equipo de ventas de Blooming</p>"
                + "</body>"
                + "</html>";

        List<String> correosClientes = obtenerCorreosClientes();
        for (String correo : correosClientes) {
            Envio.enviarCorreo(correo, subject, content);
        }
    }


    private String obtenerHoraDispositivo() {
        String hora = new SimpleDateFormat("HH:mm:ss").format(new java.util.Date());
        return hora;
    }

    private String obtenerFechaDispositivo() {
        String fecha = new SimpleDateFormat("yyyy-MM-dd").format(new java.util.Date());
        return fecha;
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
