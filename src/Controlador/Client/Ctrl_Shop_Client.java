package Controlador.Client;

import Card.Item.Shop_Client;
import Modelo.ClaseConexion;
import Vista.Paneles_Client.Panel_Tienda_Client;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

public class Ctrl_Shop_Client {
    private Panel_Tienda_Client panelProductos;
    
    public Ctrl_Shop_Client(Panel_Tienda_Client panelProductos) {
        this.panelProductos = panelProductos;
    }

    public void mostrarProductos() {
        List<Shop_Client> productos = cargarProductos();
        panelProductos.cargarProductos(productos);
    }

    private List<Shop_Client> cargarProductos() {
        try (Connection connection = ClaseConexion.getConexion()) {
            return Shop_Client.obtenerProductos(connection);
        } catch (SQLException e) {
            return Collections.emptyList(); 
        }
    }
    
    public void actualizarProductos() {
        mostrarProductos();
    }
}
