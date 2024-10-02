package Controlador.Client;

import Card.Item.Ofertas_Client;
import Modelo.ClaseConexion;
import Vista.Paneles_Client.Panel_Inicio_Client;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

public class Ctrl_Ofertas_Client {
    private Panel_Inicio_Client panelOfertas;
    
    public Ctrl_Ofertas_Client(Panel_Inicio_Client panelOfertas) {
        this.panelOfertas = panelOfertas;
    }

    public void mostrarOfertas() {
        List<Ofertas_Client> ofertas = cargarOfertas();
        panelOfertas.cargarOfertas(ofertas);
    }

    private List<Ofertas_Client> cargarOfertas() {
        try (Connection connection = ClaseConexion.getConexion()) {
            return Ofertas_Client.obtenerOfertas(connection);
        } catch (SQLException e) {
            return Collections.emptyList(); 
        }
    }
    
    public void actualizarOfertas() {
        mostrarOfertas();
    }
}
