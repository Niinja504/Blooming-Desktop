package Controlador.Admin;

import Card.Item.Sales_Admin;
import Modelo.ClaseConexion;
import Vista.Paneles_Admin.Panel_Ventas;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;
import java.sql.*;

public class Ctrl_Ventas_Admin {
    private Panel_Ventas panelVentas;

    public Ctrl_Ventas_Admin(Panel_Ventas panelVentas) {
        this.panelVentas = panelVentas;
    }

    public void mostrarVentas() {
        List<Sales_Admin> ventas = cargarVentas();
        panelVentas.cargarVentas(ventas);
    }

    public List<Sales_Admin> cargarVentas() {
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

            String Articulos = "DELETE FROM TbVentaArticulos WHERE UUID_Venta = ?";
            String Venta = "DELETE FROM TbVentaEncaja WHERE UUID_Venta = ?";

            try (Connection connection = ClaseConexion.getConexion()) {
                try (PreparedStatement stmtArticulos = connection.prepareStatement(Articulos)) {
                    stmtArticulos.setObject(1, uuid);
                    stmtArticulos.executeUpdate();
                }
                
                try (PreparedStatement stmtVenta = connection.prepareStatement(Venta)) {
                    stmtVenta.setObject(1, uuid);
                    int filasAfectadas = stmtVenta.executeUpdate();
                    System.out.println("Filas afectadas: " + filasAfectadas);
                    if (filasAfectadas > 0) {
                        return true;
                    } else {
                        System.out.println("No se encontró ningún pedido con el UUID proporcionado.");
                        return false;
                    }
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
