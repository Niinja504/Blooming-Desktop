package Controlador;

import Card.Item.Sales_Admin;
import Modelo.ClaseConexion;
import Vista.Paneles_Admin.Panel_Ventas_Admin;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;
import java.sql.*;

public class Ctrl_Ventas_Admin {
    private Panel_Ventas_Admin panelVentas;

    public Ctrl_Ventas_Admin(Panel_Ventas_Admin panelVentas) {
        this.panelVentas = panelVentas;
    }

    public void mostrarVentas() {
        List<Sales_Admin> ventas = cargarVentas();
        panelVentas.cargarVentas(ventas);
    }

    private List<Sales_Admin> cargarVentas() {
        try (Connection connection = ClaseConexion.getConexion()) {
            return Sales_Admin.obtenerVentas(connection);
        } catch (SQLException e) {
            return Collections.emptyList(); 
        }
    }

    public boolean eliminarVenta(String uuid) {
        int respuesta = JOptionPane.showConfirmDialog(null, 
            "¿Estás seguro de que deseas eliminar este pedido?", 
            "Confirmar eliminación", 
            JOptionPane.YES_NO_OPTION);
        
        if (respuesta == JOptionPane.YES_OPTION) {
            System.out.println("UUID a eliminar: " + uuid);
            String query = "DELETE FROM TbPedido_Cliente WHERE UUID_Pedido = ?";
            
            try (Connection connection = ClaseConexion.getConexion();
                 PreparedStatement stmt = connection.prepareStatement(query)) {
                stmt.setObject(1, uuid);
                int filasAfectadas = stmt.executeUpdate();
                System.out.println("Filas afectadas: " + filasAfectadas);
                if (filasAfectadas > 0) {
                    return true;
                } else {
                    System.out.println("No se encontró ningún pedido con el UUID proporcionado.");
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

    public void actualizarVentas() {
        mostrarVentas();
    }
}
