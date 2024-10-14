package Controlador.Admin;

import Card.Item.PedidosEntregados_Admin;
import Modelo.ClaseConexion;
import Vista.Paneles_Admin.Panel_Pedidos_Entregados;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

public class Ctrl_PedidosEntregados_admin {
    private Panel_Pedidos_Entregados panelPedidos;
    
    public Ctrl_PedidosEntregados_admin(Panel_Pedidos_Entregados panelPedidos) {
        this.panelPedidos = panelPedidos;
    }

    public void mostrarPedidos() {
        List<PedidosEntregados_Admin> pedidos = cargarPedidos();
        panelPedidos.cargarPedidos(pedidos);
    }

    public List<PedidosEntregados_Admin> cargarPedidos() {
        try (Connection connection = ClaseConexion.getConexion()) {
            return PedidosEntregados_Admin.obtenerPedidosEntregados(connection);
        } catch (SQLException e) {
            return Collections.emptyList(); 
        }
    }

    public boolean eliminarPedido(String uuid) {
        int respuesta = JOptionPane.showConfirmDialog(null,
                "¿Estás seguro de que deseas eliminar este pedido?",
                "Confirmar eliminación",
                JOptionPane.YES_NO_OPTION);

        if (respuesta == JOptionPane.YES_OPTION) {
            System.out.println("UUID a eliminar: " + uuid);

            String deleteProductos = "DELETE FROM TbProductosPedido WHERE UUID_Pedido = ?";
            String deleteHorario= "DELETE FROM TbHorarioPedido WHERE UUID_Pedido = ?";
            String deleteDireccion= "DELETE FROM TbDireccionPedido WHERE UUID_Pedido = ?";
            String deleteDedicatorias = "DELETE FROM TbDedicatorias WHERE UUID_Pedido = ?";
            String deletePedido = "DELETE FROM TbPedido_Cliente WHERE UUID_Pedido = ?";

            try (Connection connection = ClaseConexion.getConexion()) {
                connection.setAutoCommit(false);
                
                try (PreparedStatement stmt = connection.prepareStatement(deleteProductos)) {
                    stmt.setObject(1, uuid);
                    stmt.executeUpdate();
                }

                try (PreparedStatement stmt = connection.prepareStatement(deleteHorario)) {
                    stmt.setObject(1, uuid);
                    stmt.executeUpdate();
                }

                try (PreparedStatement stmt = connection.prepareStatement(deleteDireccion)) {
                    stmt.setObject(1, uuid);
                    stmt.executeUpdate();
                }

                try (PreparedStatement stmt = connection.prepareStatement(deleteDedicatorias)) {
                    stmt.setObject(1, uuid);
                    stmt.executeUpdate();
                }

                try (PreparedStatement stmt = connection.prepareStatement(deletePedido)) {
                    stmt.setObject(1, uuid);
                    int filasAfectadas = stmt.executeUpdate();
                    System.out.println("Filas afectadas: " + filasAfectadas);

                    if (filasAfectadas > 0) {
                        connection.commit();
                        return true;
                    } else {
                        System.out.println("No se encontró ningún pedido con el UUID proporcionado.");
                        connection.rollback();
                        return false;
                    }
                } catch (SQLException e) {
                    connection.rollback();
                    System.out.println("Error durante la eliminación del pedido: " + e.getMessage());
                    e.printStackTrace();
                    return false;
                }
            } catch (SQLException e) {
                System.out.println("Error de conexión: " + e.getMessage());
                e.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public void actualizarPedidos() {
        mostrarPedidos();
    }
}
