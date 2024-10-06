package Modelo.Admin;

import Modelo.ClaseConexion;
import Vista.Paneles_Admin.Panel_CostoEnvio_Admin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.UUID;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Costo_Envio {
    private String Nombre_Zona;
    private Float Costo;
    private String Coordernadas_Google;

    public String getNombre_Zona() {
        return Nombre_Zona;
    }

    public void setNombre_Zona(String Nombre_Zona) {
        this.Nombre_Zona = Nombre_Zona;
    }

    public Float getCosto() {
        return Costo;
    }

    public void setCosto(Float Costo) {
        this.Costo = Costo;
    }

    public String getCoordernadas_Google() {
        return Coordernadas_Google;
    }

    public void setCoordernadas_Google(String Coordernadas_Google) {
        this.Coordernadas_Google = Coordernadas_Google;
    }
    
    public void Guardar() {
        Connection conexion = ClaseConexion.getConexion();
        try {
            PreparedStatement addCost = conexion.prepareStatement("INSERT INTO TbCostosEnvio (UUID_CostoEnvio, Nombre_Zona, Costo, Coordernadas_Google) VALUES (?, ?, ?, ?) ");
            addCost.setString(1, UUID.randomUUID().toString());
            addCost.setString(2, getNombre_Zona());
            addCost.setFloat(3, getCosto());
            addCost.setString(4, getCoordernadas_Google());
            addCost.executeUpdate();
 
        } catch (SQLException ex) {
            System.out.println("Este es el error en el modelo:metodo guardar " + ex);
        }
    }
    
    public void Eliminar(JTable tabla) {
       Connection conexion = ClaseConexion.getConexion();
       int filaSeleccionada = tabla.getSelectedRow();
      if (filaSeleccionada == -1) {
        System.out.println("No se ha seleccionado ninguna fila.");
        return;
      }
    
      String uuidCost = tabla.getValueAt(filaSeleccionada, 0).toString();
      String sql = "DELETE FROM TbCostosEnvio WHERE UUID_CostoEnvio = ?";
    
      try (PreparedStatement deleteProduct = conexion.prepareStatement(sql)) {
          deleteProduct.setString(1, uuidCost);
          int rowsAffected = deleteProduct.executeUpdate();
        
         if (rowsAffected > 0) {
            System.out.println("Registro eliminado correctamente.");
         } else {
            System.out.println("No se encontró ningún registro con el UUID especificado.");
         }
       } catch (Exception e) {
        System.out.println("Este es el error en el método de eliminar: " + e.getMessage());
      }
    }
    
    public void Mostrar(JTable tabla) {
       Connection conexion = ClaseConexion.getConexion();
       DefaultTableModel modeloDeDatos = new DefaultTableModel();
       modeloDeDatos.setColumnIdentifiers(new Object[]{"UUID", "Nombre de la zona", "Costo", "Coordenadas"});
    
      try {
          Statement statement = conexion.createStatement();
          ResultSet rs = statement.executeQuery("SELECT UUID_CostoEnvio, Nombre_Zona, Costo, Coordernadas_Google FROM TbCostosEnvio");
          while (rs.next()) {
             modeloDeDatos.addRow(new Object[]{
                rs.getString("UUID_CostoEnvio"),
                rs.getString("Nombre_Zona"),
                rs.getFloat("Costo"),
                rs.getString("Coordernadas_Google")
             });
           }
          tabla.setModel(modeloDeDatos);
          tabla.getColumnModel().getColumn(0).setMinWidth(0);
          tabla.getColumnModel().getColumn(0).setMaxWidth(0);
          tabla.getColumnModel().getColumn(3).setMinWidth(0);
          tabla.getColumnModel().getColumn(3).setMaxWidth(0);
        }catch (Exception e) {
            System.out.println("Este es el error en el modelo, metodo mostrar " + e);
        }
    }
    
    public void cargarDatosTabla(Panel_CostoEnvio_Admin Vista) {
      int filaSeleccionada = Vista.jtb_Cost.getSelectedRow();
      if (filaSeleccionada != -1) {
          String ZonaTB = Vista.jtb_Cost.getValueAt(filaSeleccionada, 1).toString();
          String PrecioTB = Vista.jtb_Cost.getValueAt(filaSeleccionada, 2).toString();
          String coordenadasTB = Vista.jtb_Cost.getValueAt(filaSeleccionada, 3).toString();
        
          Vista.txt_Zona_Cost_Admin.setText(ZonaTB);
          Vista.txt_Costo_Cost_Admin.setText(PrecioTB);
          
          Vista.actualizarMapaConCoordenadas(coordenadasTB);
        
       } else {
        System.out.println("No se ha seleccionado ninguna fila.");
       }
    }
    
    public void Actualizar(JTable tabla) {
       Connection conexion = ClaseConexion.getConexion();
       int filaSeleccionada = tabla.getSelectedRow();
       if (filaSeleccionada == -1) {
           System.out.println("No se ha seleccionado ninguna fila.");
           return;
        }
       String uuidCost = tabla.getValueAt(filaSeleccionada, 0).toString();
    
      try { 
          PreparedStatement updateCost = conexion.prepareStatement(
            "UPDATE TbCostosEnvio SET Nombre_Zona = ?, Costo = ?, Coordernadas_Google = ? WHERE UUID_CostoEnvio = ?"
          );

          updateCost.setString(1, getNombre_Zona());
          updateCost.setFloat(2, getCosto());
          updateCost.setString(3, getCoordernadas_Google());
          updateCost.setString(4, uuidCost);

          int rowsAffected = updateCost.executeUpdate();
          if (rowsAffected > 0) {
            System.out.println("Registro actualizado correctamente.");
          } else {
            System.out.println("No se actualizó ningún registro. Verifique el UUID.");
          }
        } catch (SQLException e) {
        System.out.println("Error en el método de actualizar: " + e.getMessage());
        }
    }
}
