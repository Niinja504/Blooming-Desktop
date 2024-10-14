package Controlador.Admin;

import Componentes.Limites;
import Modelo.ComboBox.Lista_Productos;
import Modelo.Admin.Ofertas;
import Vista.Paneles_Admin.Panel_Ofertas;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
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

public class Ctrl_Ofertas implements MouseListener {

    private Ofertas Modelo;
    private Lista_Productos ModeloCom;
    private Panel_Ofertas Vista;
    private String imageUrl;

    public Ctrl_Ofertas(Ofertas modelo, Lista_Productos modeloCom, Panel_Ofertas vista) {
        this.Modelo = modelo;
        this.ModeloCom = modeloCom;
        this.Vista = vista;

        vista.btn_Add_Offers_Admin.addMouseListener(this);
        modelo.Mostrar(vista.jtb_Offers_Admin);
        vista.btn_Update_Offers_Admin.addMouseListener(this);
        vista.jtb_Offers_Admin.addMouseListener(this);
        vista.Btn_Delete_Offers_Admin.addMouseListener(this);
        vista.btn_Upload_photo_Ofertas.addMouseListener(this);
        this.ModeloCom.CargarComboProductos(Vista.Cb_Productos_Offers_Admin);
        
        ((AbstractDocument) Vista.txt_Titulo_Offers_Admin.getDocument()).setDocumentFilter(new Limites(14));
        ((AbstractDocument) Vista.txt_Porcentaje_Offers_Admin.getDocument()).setDocumentFilter(new Limites(3));
        ((AbstractDocument) Vista.txt_Descrip_Offers_Admin.getDocument()).setDocumentFilter(new Limites(400));

        Vista.Cb_Productos_Offers_Admin.addActionListener(e -> {
            if (e.getSource() == Vista.Cb_Productos_Offers_Admin) {
                Lista_Productos selectedItem = (Lista_Productos) Vista.Cb_Productos_Offers_Admin.getSelectedItem();
                if (selectedItem != null) {
                    String UUID = selectedItem.getUUID_Producto();
                    ModeloCom.setUUID_Producto(UUID);
                }
            }
        });
        
        Vista.txt_Porcentaje_Offers_Admin.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                // Permitir solo números
                if (!Character.isDigit(caracter) && !Character.isISOControl(caracter)) {
                    e.consume(); // Ignorar el evento de teclado
                    JOptionPane.showMessageDialog(Vista, "Por favor, ingrese solo números para el porcentaje.", "Entrada no válida", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        
        Vista.txt_Porcentaje_Offers_Admin.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                String text = Vista.txt_Porcentaje_Offers_Admin.getText();
                // Al perder el foco, agregar '%' si no está presente y el campo no está vacío
                if (!text.isEmpty() && !text.equals("%") && !text.endsWith("%")) {
                    Vista.txt_Porcentaje_Offers_Admin.setText(text + "%");
                }
            }
        });

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == Vista.btn_Add_Offers_Admin) {
            if (!verificarCampos()) {
                return;
            }

            Modelo.setTitulo(Vista.txt_Titulo_Offers_Admin.getText());
            Modelo.setUUID_Producto(ModeloCom.getUUID_Producto());
            Modelo.setPorcentaje_Oferta(Vista.txt_Porcentaje_Offers_Admin.getText());
            Modelo.setDescripcion_Oferta(Vista.txt_Descrip_Offers_Admin.getText());
            if (imageUrl != null) {
                Modelo.setImg_oferta(imageUrl);
            }

            Modelo.Guardar();
            Modelo.Mostrar(Vista.jtb_Offers_Admin);
            JOptionPane.showMessageDialog(Vista, "La oferta se ha añadido", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        }
        
        if (e.getSource() == Vista.btn_Upload_photo_Ofertas) {
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
                        Vista.IMG_Offers_admin.setIcon(new ImageIcon(img));
                    }
                }
            };

            worker.execute();
        }

        if (e.getSource() == Vista.Btn_Delete_Offers_Admin) {
            Modelo.Eliminar(Vista.jtb_Offers_Admin);
            JOptionPane.showMessageDialog(Vista, "La oferta se ha eliminado", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            Modelo.Mostrar(Vista.jtb_Offers_Admin);
        }

        if (e.getSource() == Vista.jtb_Offers_Admin) {
            Modelo.cargarDatosTabla(Vista);
        }

        if (e.getSource() == Vista.btn_Update_Offers_Admin) {
            Modelo.setTitulo(Vista.txt_Titulo_Offers_Admin.getText());
            Modelo.setUUID_Producto(ModeloCom.getUUID_Producto());
            Modelo.setPorcentaje_Oferta(Vista.txt_Porcentaje_Offers_Admin.getText());
            Modelo.setDescripcion_Oferta(Vista.txt_Descrip_Offers_Admin.getText());
            if (imageUrl != null) {
                Modelo.setImg_oferta(imageUrl);
            }
            Modelo.Actualizar(Vista.jtb_Offers_Admin);
            Modelo.Mostrar(Vista.jtb_Offers_Admin);
        }

    }
  
    private boolean verificarCampos() {
        String titulo = Vista.txt_Titulo_Offers_Admin.getText();
        String porcentaje = Vista.txt_Porcentaje_Offers_Admin.getText();
        String descripcion = Vista.txt_Descrip_Offers_Admin.getText();

        if (titulo.isEmpty() || porcentaje.isEmpty() || descripcion.isEmpty()) {
            JOptionPane.showMessageDialog(Vista, "Por favor, complete todos los campos.", "Error de entrada", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        return true;
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
