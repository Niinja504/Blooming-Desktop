package Controlador.Admin;

import Componentes.Limites;
import Modelo.Admin.Costo_Envio;
import Vista.Paneles_Admin.Panel_CostoEnvio_Admin;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import javax.swing.text.AbstractDocument;
import org.jxmapviewer.viewer.GeoPosition;

public class Ctrl_Costo_Envio implements MouseListener, KeyListener {

    private Costo_Envio Modelo;
    private Panel_CostoEnvio_Admin Vista;

    public Ctrl_Costo_Envio(Costo_Envio modelo, Panel_CostoEnvio_Admin vista) {
        this.Modelo = modelo;
        this.Vista = vista;

        vista.btn_Add_Cost_Admin.addMouseListener(this);
        modelo.Mostrar(vista.jtb_Cost);
        vista.btn_Update_Cost_Admin.addMouseListener(this);
        vista.jtb_Cost.addMouseListener(this);
        vista.btn_Delete_Cost_Admin.addMouseListener(this);
        vista.txt_Buscar_Cost_admin.addKeyListener(this);
        
        ((AbstractDocument) Vista.txt_Zona_Cost_Admin.getDocument()).setDocumentFilter(new Limites(30));
        ((AbstractDocument) Vista.txt_Costo_Cost_Admin.getDocument()).setDocumentFilter(new Limites(6));
        
        Vista.txt_Costo_Cost_Admin.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                // Permitir solo números, punto y coma =)
                if (!Character.isDigit(caracter) && caracter != '.' && caracter != ',' && !Character.isISOControl(caracter)) {
                    e.consume(); // Ignorar el evento de teclado =)
                    JOptionPane.showMessageDialog(Vista, "Por favor, ingrese solo números, '.' o ',' para el costo.", "Entrada no válida", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == Vista.btn_Add_Cost_Admin) {
            if (!verificarCampos()) {
                Modelo.setNombre_Zona(Vista.txt_Zona_Cost_Admin.getText());

                //Con este try catch nos encargamos de convertir lo introducido a decimal
                try {
                    float Costo = Float.parseFloat(Vista.txt_Costo_Cost_Admin.getText());
                    Modelo.setCosto(Costo);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(Vista, "Por favor, ingrese un valor numérico válido para precio y cantidad.", "Error de entrada", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                GeoPosition waypointPosition = Vista.getCurrentWaypointPosition();
                if (waypointPosition != null) {
                    double latitude = waypointPosition.getLatitude();
                    double longitude = waypointPosition.getLongitude();
                    String coordenadasString = latitude + "," + longitude;
                    Modelo.setCoordernadas_Google(coordenadasString);
                }

                Modelo.Guardar();
                Modelo.limpiar(Vista);
                Modelo.Mostrar(Vista.jtb_Cost);
                JOptionPane.showMessageDialog(Vista, "El usuario se ha añadido", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            }
        }

        if (e.getSource() == Vista.btn_Delete_Cost_Admin) {
            Modelo.Eliminar(Vista.jtb_Cost);
            JOptionPane.showMessageDialog(Vista, "El usuario se ha eliminado", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            Modelo.Mostrar(Vista.jtb_Cost);
        }

        if (e.getSource() == Vista.jtb_Cost) {
            Modelo.cargarDatosTabla(Vista);
        }

        if (e.getSource() == Vista.btn_Update_Cost_Admin) {
            Modelo.setNombre_Zona(Vista.txt_Zona_Cost_Admin.getText());

            //Con este try catch nos encargamos de convertir lo introducido a decimal
            try {
                float Costo = Float.parseFloat(Vista.txt_Costo_Cost_Admin.getText());
                Modelo.setCosto(Costo);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(Vista, "Por favor, ingrese un valor numérico válido para precio y cantidad.", "Error de entrada", JOptionPane.ERROR_MESSAGE);
                return;
            }

            GeoPosition waypointPosition = Vista.getCurrentWaypointPosition();
            if (waypointPosition != null) {
                double latitude = waypointPosition.getLatitude();
                double longitude = waypointPosition.getLongitude();
                String coordenadasString = latitude + "," + longitude;
                Modelo.setCoordernadas_Google(coordenadasString);
            }

            Modelo.Actualizar(Vista.jtb_Cost);
            Modelo.Mostrar(Vista.jtb_Cost);

        }
    }

    private boolean verificarCampos() {
        String zona = Vista.txt_Zona_Cost_Admin.getText();
        String costo = Vista.txt_Costo_Cost_Admin.getText();

        if (zona.isEmpty() || costo.isEmpty()) {
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

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getSource() == Vista.txt_Buscar_Cost_admin) {
            Modelo.Buscar(Vista.jtb_Cost, Vista.txt_Buscar_Cost_admin);
        }
    }

}
