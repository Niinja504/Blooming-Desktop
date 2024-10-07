package Controlador.Employed;

import Card.Item.PedidosPendientes_Emp;
import Modelo.ClaseConexion;
import Vista.Paneles_Employed.Panel_Pedido_Pendientes_Emp;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

public class Ctrl_PedidosPendientes_Emp {
    private Panel_Pedido_Pendientes_Emp panelPedidos;

    public Ctrl_PedidosPendientes_Emp(Panel_Pedido_Pendientes_Emp panelPedidos) {
        this.panelPedidos = panelPedidos;
    }

    public void mostrarPedidos() {
        List<PedidosPendientes_Emp> pedidos = cargarPedidos();
        panelPedidos.cargarPedidos(pedidos);
    }

    private List<PedidosPendientes_Emp> cargarPedidos() {
        try (Connection connection = ClaseConexion.getConexion()) {
            return PedidosPendientes_Emp.obtenerPedidosPendientes(connection);
        } catch (SQLException e) {
            return Collections.emptyList(); 
        }
    }

    public void actualizarPedidos() {
        mostrarPedidos();
    }
}
