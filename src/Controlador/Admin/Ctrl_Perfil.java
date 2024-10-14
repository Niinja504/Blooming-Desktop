package Controlador.Admin;

import Componentes.Limites;
import Modelo.Admin.Perfil;
import Vista.Paneles_Admin.Panel_Perfil;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.text.AbstractDocument;

public class Ctrl_Perfil implements MouseListener {

    private Perfil Modelo;
    private Panel_Perfil Vista;
    private String imageUrl;
    private String UUID;

    public Ctrl_Perfil(Perfil Modelo, Panel_Perfil Vista, String UUID) {
        this.Modelo = Modelo;
        this.Vista = Vista;
        this.UUID = UUID;

        Vista.btn_Upload_photo_Admin.addMouseListener(this);
        Vista.Btn_Update_Perfil.addMouseListener(this);
        
        //Limites de caracteres
        ((AbstractDocument) Vista.Txt_Nombres_Profile.getDocument()).setDocumentFilter(new Limites(15));
        ((AbstractDocument) Vista.Txt_Apellidos_Profile.getDocument()).setDocumentFilter(new Limites(15));
        ((AbstractDocument) Vista.Txt_NombreUsuario_Profile.getDocument()).setDocumentFilter(new Limites(13));
        ((AbstractDocument) Vista.Txt_Telefono_Profile.getDocument()).setDocumentFilter(new Limites(11));
        ((AbstractDocument) Vista.Txt_Correo_Profile.getDocument()).setDocumentFilter(new Limites(30));
        ((AbstractDocument) Vista.Txt_Contra_Profile.getDocument()).setDocumentFilter(new Limites(20));
        ((AbstractDocument) Vista.Txt_ContraConfirmar_Profile.getDocument()).setDocumentFilter(new Limites(20));
    }

    public void Cargar(String UUID) {
        Modelo.MostrarPerfil(UUID);
        Vista.Txt_Nombres_Profile.setText(Modelo.getNombres_User());
        Vista.Txt_Apellidos_Profile.setText(Modelo.getApellido_User());
        Vista.Txt_NombreUsuario_Profile.setText(Modelo.getNombre_de_Usuario());
        Vista.Txt_Correo_Profile.setText(Modelo.getEmail_User());
        Vista.Txt_Edad_Profile.setText(String.valueOf(Modelo.getEdad_User()));
        Vista.Txt_Telefono_Profile.setText(Modelo.getNum_Telefono_User());
    }

    public void setVista(Panel_Perfil vista) {
        this.Vista = vista;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == Vista.btn_Upload_photo_Admin) {
            try {
                ProcessBuilder processBuilder = new ProcessBuilder("python", "C:/Users/vladk/Desktop/Blooming-Desktop/src/python/Subir_IMG_Profile.py");
                Process process = processBuilder.start();
                BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
                String line;
                String imageUrl = null;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                    imageUrl = line;
                }
                process.waitFor();

                if (imageUrl != null) {
                    BufferedImage img = ImageIO.read(new URL(imageUrl));
                    Vista.roundedImagePanel.setImage(img);
                }

            } catch (IOException | InterruptedException ex) {
                ex.printStackTrace();
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
        
        if (e.getSource() == Vista.Btn_Update_Perfil) {
            if (!verificarContraUpdate()) {
                return;
            }

            Modelo.setNombres_User(Vista.Txt_Nombres_Profile.getText());
            Modelo.setApellido_User(Vista.Txt_Apellidos_Profile.getText());
            Modelo.setNombre_de_Usuario(Vista.Txt_NombreUsuario_Profile.getText());
            Modelo.setNum_Telefono_User(Vista.Txt_Telefono_Profile.getText());
            int Edad = Integer.parseInt(Vista.Txt_Edad_Profile.getText());
            Modelo.setEdad_User(Edad);
            Modelo.setEmail_User(Vista.Txt_Correo_Profile.getText());
            String ContraseEncrip = hashSHA256(Vista.Txt_Contra_Profile.getText());
            Modelo.setContra_User(ContraseEncrip);
            Modelo.setImg_User(imageUrl);
            Modelo.ActualizarPerfil(UUID);

        }
    }

    private boolean verificarContraUpdate() {
        String contrasenia = Vista.Txt_Contra_Profile.getText();
        String confirmarContrasenia = Vista.Txt_ContraConfirmar_Profile.getText();

        if (!contrasenia.isEmpty() && !contrasenia.equals(confirmarContrasenia)) {
            JOptionPane.showMessageDialog(Vista, "Las contraseñas no coinciden.", "Error de entrada", JOptionPane.ERROR_MESSAGE);
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
    
    public static String hashSHA256(String input) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] bytes = digest.digest(input.getBytes());
            StringBuilder hexString = new StringBuilder();
            for (byte b : bytes) {
                hexString.append(String.format("%02x", b));
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
    
}
