package Controlador.Admin;

import Card.Item.Notificaciones;
import Modelo.ClaseConexion;
import Vista.Paneles_Admin.Panel_Notificaciones;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

public class Ctrl_Notificaciones {
    private Panel_Notificaciones panelNotificaciones;
    private String UUID;
    
    public Ctrl_Notificaciones(Panel_Notificaciones panelNotificaciones, String UUID) {
        this.panelNotificaciones = panelNotificaciones;
        this.UUID = UUID;
    }
    
    public void mostrarNotificacion() {
        List<Notificaciones> notificacion = cargarNotificacion();
        panelNotificaciones.cargarNotificaciones(notificacion);
    }

    public List<Notificaciones> cargarNotificacion() {
        try (Connection connection = ClaseConexion.getConexion()) {
            return Notificaciones.obtenerNotificaciones(connection, UUID);
        } catch (SQLException e) {
            return Collections.emptyList(); 
        }
    }

    public boolean eliminarNotificacion(String uuid) {
        int respuesta = JOptionPane.showConfirmDialog(null, 
            "¿Estás seguro de que deseas eliminar esta notificación?", 
            "Confirmar eliminación", 
            JOptionPane.YES_NO_OPTION);
        
        if (respuesta == JOptionPane.YES_OPTION) {
            System.out.println("UUID a eliminar: " + uuid);
            String query = "DELETE FROM TbNotificaciones WHERE UUID_Notificacion = ?";
            
            try (Connection connection = ClaseConexion.getConexion();
                 PreparedStatement stmt = connection.prepareStatement(query)) {
                stmt.setObject(1, uuid);
                int filasAfectadas = stmt.executeUpdate();
                System.out.println("Filas afectadas: " + filasAfectadas);
                if (filasAfectadas > 0) {
                    return true;
                } else {
                    System.out.println("No se encontró ningúna notificación con el UUID proporcionado.");
                    return false;
                }
            } catch (SQLException e) {
                System.out.println("Error durante la eliminación: " + e.getMessage());
                e.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public void actualizarNotificacion() {
        mostrarNotificacion();
    }
}
