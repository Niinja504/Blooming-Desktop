package Controlador.Admin;

import Modelo.Admin.Perfil;
import Vista.Paneles_Admin.Panel_Perfil;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import javax.imageio.ImageIO;

public class Ctrl_Perfil implements MouseListener {

    private Perfil Modelo;
    private Panel_Perfil Vista;

    public Ctrl_Perfil(Perfil Modelo, Panel_Perfil Vista) {
        this.Modelo = Modelo;
        this.Vista = Vista;

        Vista.btn_Upload_photo_Admin.addMouseListener(this);
        Vista.Btn_Update_Perfil.addMouseListener(this);
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
