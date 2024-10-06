package Controlador.Employed;

import Modelo.ClaseConexion;
import Modelo.Employed.Caja_Productos;
import Vista.Paneles_Employed.Panel_Caja_Employed;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

public class Ctrl_Caja {
    private Panel_Caja_Employed panelCaja;
    
    public Ctrl_Caja(Panel_Caja_Employed panelCaja) {
        this.panelCaja = panelCaja;
    }

    public void mostrarProductos() {
        List<Caja_Productos> Productos = cargarProductos();
        panelCaja.cargarProductos(Productos);
    }

    public List<Caja_Productos> cargarProductos() {
        try (Connection connection = ClaseConexion.getConexion()) {
            return Caja_Productos.obtenerProductos(connection);
        } catch (SQLException e) {
            return Collections.emptyList(); 
        }
    }
    
    public void actualizarProductos() {
        mostrarProductos();
    }
}
