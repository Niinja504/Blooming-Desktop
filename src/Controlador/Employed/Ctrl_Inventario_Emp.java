package Controlador.Employed;

import Card.Item.Inventario_Emp;
import Modelo.ClaseConexion;
import Vista.Paneles_Employed.Panel_Inventario_Employed;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

public class Ctrl_Inventario_Emp {
    private Panel_Inventario_Employed panelInventario;
    
    public Ctrl_Inventario_Emp(Panel_Inventario_Employed panelInventario) {
        this.panelInventario = panelInventario;
    }

    public void mostrarProductos() {
        List<Inventario_Emp> Productos = cargarProductos();
        panelInventario.cargarInventario(Productos);
    }

    public List<Inventario_Emp> cargarProductos() {
        try (Connection connection = ClaseConexion.getConexion()) {
            return Inventario_Emp.obtenerProductos(connection);
        } catch (SQLException e) {
            return Collections.emptyList(); 
        }
    }
    
    public void actualizarProductos() {
        mostrarProductos();
    }
}
