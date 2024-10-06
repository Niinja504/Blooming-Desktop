package Controlador.Employed;

import Card.Item.PedidosEntregados_Admin;
import Card.Item.PedidosEntregados_Emp;
import Modelo.ClaseConexion;
import Vista.Paneles_Employed.Panel_Pedidos_Entregados_Emp;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

public class Ctrl_PedidosEntregados_Emp {
    private Panel_Pedidos_Entregados_Emp panelPedidos;
    
    public Ctrl_PedidosEntregados_Emp(Panel_Pedidos_Entregados_Emp panelPedidos) {
        this.panelPedidos = panelPedidos;
    }

    public void mostrarPedidos() {
        List<PedidosEntregados_Emp> pedidos = cargarPedidos();
        panelPedidos.cargarPedidos(pedidos);
    }

    private List<PedidosEntregados_Emp> cargarPedidos() {
        try (Connection connection = ClaseConexion.getConexion()) {
            return PedidosEntregados_Emp.obtenerPedidosEntregados(connection);
        } catch (SQLException e) {
            return Collections.emptyList(); 
        }
    }

    public void actualizarPedidos() {
        mostrarPedidos();
    }
}
