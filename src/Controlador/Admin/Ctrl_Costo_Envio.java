package Controlador.Admin;

import Modelo.Admin.Costo_Envio;
import Vista.Paneles_Admin.Panel_CostoEnvio_Admin;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import org.jxmapviewer.viewer.GeoPosition;

public class Ctrl_Costo_Envio implements MouseListener {
    private Costo_Envio Modelo;
    private Panel_CostoEnvio_Admin Vista;
    
    public Ctrl_Costo_Envio(Costo_Envio modelo, Panel_CostoEnvio_Admin vista){
        this.Modelo = modelo;
        this.Vista = vista;
        
        vista.btn_Add_Cost_Admin.addMouseListener(this);
        modelo.Mostrar(vista.jtb_Cost);
        vista.btn_Update_Cost_Admin.addMouseListener(this);
        vista.jtb_Cost.addMouseListener(this);
        vista.btn_Delete_Cost_Admin.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == Vista.btn_Add_Cost_Admin){
         Modelo.setNombre_Zona(Vista.txt_Zona_Cost_Admin.getText());
        
         //Con este try catch nos encargamos de convertir lo introducido a decimal
          try {
             float Costo = Float.parseFloat(Vista.txt_Costo_Cost_Admin.getText());
             Modelo.setCosto(Costo);
          }  catch (NumberFormatException ex) {
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
          Modelo.Mostrar(Vista.jtb_Cost);
          JOptionPane.showMessageDialog(Vista, "El usuario se ha añadido", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        }
        
        if(e.getSource() == Vista.btn_Delete_Cost_Admin){
          Modelo.Eliminar(Vista.jtb_Cost);
          JOptionPane.showMessageDialog(Vista, "El usuario se ha eliminado", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
          Modelo.Mostrar(Vista.jtb_Cost);
        }
        
        if(e.getSource() == Vista.jtb_Cost){
          Modelo.cargarDatosTabla(Vista);
        }
        
        if(e.getSource() == Vista.btn_Update_Cost_Admin){
          Modelo.setNombre_Zona(Vista.txt_Zona_Cost_Admin.getText());
        
         //Con este try catch nos encargamos de convertir lo introducido a decimal
          try {
             float Costo = Float.parseFloat(Vista.txt_Costo_Cost_Admin.getText());
             Modelo.setCosto(Costo);
          }  catch (NumberFormatException ex) {
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
