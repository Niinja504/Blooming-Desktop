package Controlador.Admin;

import Componentes.Limites;
import Modelo.Admin.Usuarios;
import static Modelo.SingIn.hashSHA256;
import Vista.Paneles_Admin.Panel_Usuarios;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
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

public class Ctrl_Usuarios implements MouseListener, KeyListener {

    private Usuarios Modelo;
    private Panel_Usuarios Vista;
    private String imageUrl;

    public Ctrl_Usuarios(Usuarios modelo, Panel_Usuarios vista) {
        this.Modelo = modelo;
        this.Vista = vista;

        vista.btn_Agregar.addMouseListener(this);
        modelo.Mostrar(vista.jtb_Usuarios);
        vista.btn_Update.addMouseListener(this);
        vista.jtb_Usuarios.addMouseListener(this);
        vista.Btn_Delete.addMouseListener(this);
        vista.btn_Upload_photo_User.addMouseListener(this);
        vista.txt_Buscar_User.addKeyListener(this);
        
        //Limites de caracteres
        ((AbstractDocument) Vista.txt_Nombre.getDocument()).setDocumentFilter(new Limites(15));
        ((AbstractDocument) Vista.txt_Apellido.getDocument()).setDocumentFilter(new Limites(15));
        ((AbstractDocument) Vista.txt_NombreDeUsuario.getDocument()).setDocumentFilter(new Limites(13));
        ((AbstractDocument) Vista.txt_Telefono.getDocument()).setDocumentFilter(new Limites(11));
        ((AbstractDocument) Vista.txt_Correo.getDocument()).setDocumentFilter(new Limites(30));
        ((AbstractDocument) Vista.txt_Contra.getDocument()).setDocumentFilter(new Limites(20));
        ((AbstractDocument) Vista.txt_Confirmar_Contra.getDocument()).setDocumentFilter(new Limites(20));
        
        Vista.txt_Edad.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                if (!Character.isDigit(caracter) && !Character.isISOControl(caracter)) {
                    e.consume();
                    JOptionPane.showMessageDialog(Vista, "Por favor, ingrese solo números para la edad.", "Entrada no válida", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == Vista.btn_Agregar) {
            if (!verificarCampos() || !verificarContra()) {
                return;
            }

            Modelo.setNombres_User(Vista.txt_Nombre.getText());
            Modelo.setApellidos_User(Vista.txt_Apellido.getText());
            Modelo.setNombre_de_Usuario(Vista.txt_NombreDeUsuario.getText());
            Modelo.setNum_Telefono_User(Vista.txt_Telefono.getText());

            try {
                int edad = Integer.parseInt(Vista.txt_Edad.getText());
                if (edad < 18) {
                    JOptionPane.showMessageDialog(Vista, "La edad debe ser igual o mayor a 18.", "Error de entrada", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                Modelo.setEdad_User(edad);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(Vista, "Por favor, ingrese un valor numérico válido para la edad.", "Error de entrada", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Modelo.setEmail_User(Vista.txt_Correo.getText());
            String ContraseEncrip = hashSHA256(Vista.txt_Contra.getText());
            Modelo.setContra_User(ContraseEncrip);
            
            if (imageUrl != null) {
                Modelo.setImg_User(imageUrl);
            }
            
            String Rol_User = Vista.cb_Rol.getSelectedItem().toString();
            Modelo.setRol_User(Rol_User);
            Modelo.Guardar();
            Modelo.limpiar(Vista);
            Modelo.Mostrar(Vista.jtb_Usuarios);
            JOptionPane.showMessageDialog(Vista, "El usuario se ha añadido", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        }
        
        if (e.getSource() == Vista.btn_Upload_photo_User) {
            SwingWorker<Void, BufferedImage> worker = new SwingWorker<Void, BufferedImage>() {
                @Override
                protected Void doInBackground() {
                    try {
                        ProcessBuilder processBuilder = new ProcessBuilder("python", "C:/Users/vladk/Desktop/Blooming-Desktop/src/python/Subir_IMG_Profile.py");
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
                        Vista.IMG_User.setIcon(new ImageIcon(img));
                    }
                }
            };

            worker.execute();
        }

        if (e.getSource() == Vista.Btn_Delete) {
            Modelo.Eliminar(Vista.jtb_Usuarios);
            JOptionPane.showMessageDialog(Vista, "El usuario se ha eliminado", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            Modelo.Mostrar(Vista.jtb_Usuarios);
        }

        if (e.getSource() == Vista.jtb_Usuarios) {
            Modelo.cargarDatosTabla(Vista);
        }

        if (e.getSource() == Vista.btn_Update) {
            if (!verificarContraUpdate()) {
                return;
            }

            Modelo.setNombres_User(Vista.txt_Nombre.getText());
            Modelo.setApellidos_User(Vista.txt_Apellido.getText());
            Modelo.setNombre_de_Usuario(Vista.txt_NombreDeUsuario.getText());
            Modelo.setNum_Telefono_User(Vista.txt_Telefono.getText());

            try {
                int edad = Integer.parseInt(Vista.txt_Edad.getText());
                Modelo.setEdad_User(edad);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(Vista, "Por favor, ingrese un valor numérico válido para la edad.", "Error de entrada", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Modelo.setEmail_User(Vista.txt_Correo.getText());

            if (!Vista.txt_Contra.getText().isEmpty()) {
                String ContraseEncrip = hashSHA256(Vista.txt_Contra.getText());
                Modelo.setContra_User(ContraseEncrip);
            }

            if (imageUrl != null) {
                Modelo.setImg_User(imageUrl);
            }

            String Rol_User = Vista.cb_Rol.getSelectedItem().toString();
            Modelo.setRol_User(Rol_User);
            Modelo.Actualizar(Vista.jtb_Usuarios);
            Modelo.Mostrar(Vista.jtb_Usuarios);
        }

    }
    
    private boolean verificarContra() {
        String contrasenia = Vista.txt_Contra.getText();
        String confirmarContrasenia = Vista.txt_Confirmar_Contra.getText();

        if (!contrasenia.equals(confirmarContrasenia)) {
            JOptionPane.showMessageDialog(Vista, "Las contraseñas no coinciden.", "Error de entrada", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    private boolean verificarContraUpdate() {
        String contrasenia = Vista.txt_Contra.getText();
        String confirmarContrasenia = Vista.txt_Confirmar_Contra.getText();

        if (!contrasenia.isEmpty() && !contrasenia.equals(confirmarContrasenia)) {
            JOptionPane.showMessageDialog(Vista, "Las contraseñas no coinciden.", "Error de entrada", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }


    private boolean verificarCampos() {
        String nombres = Vista.txt_Nombre.getText();
        String apellidos = Vista.txt_Apellido.getText();
        String nombreDeUsuario = Vista.txt_NombreDeUsuario.getText();
        String telefono = Vista.txt_Telefono.getText();
        String edad = Vista.txt_Edad.getText();
        String email = Vista.txt_Correo.getText();
        String contra = Vista.txt_Confirmar_Contra.getText();

        if (nombres.isEmpty() || apellidos.isEmpty() || nombreDeUsuario.isEmpty()
                || telefono.isEmpty() || edad.isEmpty() || email.isEmpty() || contra.isEmpty()
                || Vista.cb_Rol.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(Vista, "Por favor, complete todos los campos.", "Error de entrada", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        return true;
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getSource() == Vista.txt_Buscar_User) {
            Modelo.Buscar(Vista.jtb_Usuarios, Vista.txt_Buscar_User);
        }
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

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
       
    }
}
