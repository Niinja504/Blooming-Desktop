package Modelo.ComboBox;

import Modelo.ClaseConexion;
import javax.swing.JComboBox;
import java.sql.*;

public class Lista_Productos {
    private String UUID_Producto;
    private String Nombre_Producto;

    public String getUUID_Producto() {
        return UUID_Producto;
    }

    public void setUUID_Producto(String UUID_Producto) {
        this.UUID_Producto = UUID_Producto;
    }

    public String getNombre_Producto() {
        return Nombre_Producto;
    }

    public void setNombre_Producto(String Nombre_Producto) {
        this.Nombre_Producto = Nombre_Producto;
    }
    
    public Lista_Productos(){
        
    }
    
    public Lista_Productos(String UUID, String Nombre){
        this.UUID_Producto = UUID;
        this.Nombre_Producto = Nombre;
    }
    
    @Override
    public String toString()
    {
        return Nombre_Producto;
    }
    
    public void CargarComboProductos(JComboBox comboBox){    
        Connection conexion = ClaseConexion.getConexion();
        comboBox.removeAllItems();
        try{
            Statement statement = conexion.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM TbInventario");
            while (rs.next()) {
                String uuid = rs.getString("UUID_Producto");
                String nombre = rs.getString("Nombre_Producto");
                comboBox.addItem(new Lista_Productos(uuid,nombre));                
            }
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();  
        }
    }
}
