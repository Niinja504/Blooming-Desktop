package Controlador.Client;

import Card.Item.PedidosPendientes_Client;
import Modelo.ClaseConexion;
import Vista.Paneles_Client.Panel_Pedido_Pendiente_Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

public class Ctrl_PedidosPendientes_client {
    private Panel_Pedido_Pendiente_Cliente panelPedidos;
    private String UUID;

    public Ctrl_PedidosPendientes_client(Panel_Pedido_Pendiente_Cliente panelPedidos, String UUID) {
        this.panelPedidos = panelPedidos;
        this.UUID = UUID;
    }

    public void mostrarPedidos() {
        List<PedidosPendientes_Client> pedidos = cargarPedidos();
        panelPedidos.cargarPedidos(pedidos);
    }

    private List<PedidosPendientes_Client> cargarPedidos() {
        try (Connection connection = ClaseConexion.getConexion()) {
            return PedidosPendientes_Client.obtenerPedidosPendientes(connection, UUID);
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

    public void actualizarPedidos() {
        mostrarPedidos();
    }
}
