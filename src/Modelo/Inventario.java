package Modelo;

import Vista.Paneles_Admin.Panel_Inventario_Admin;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.UUID;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Inventario {
    private String Img_Producto;
    private String Nombre_Producto;
    private Float Precio_Producto;
    private int Cantidad_Bodega_Productos;
    private String Categoria_Flores;
    private String Categoria_Diseno;
    private String Categoria_Evento;
    private String Descripcion_Producto;

    public String getImg_Producto() {
        return Img_Producto;
    }

    public void setImg_Producto(String Img_Producto) {
        this.Img_Producto = Img_Producto;
    }

    public String getNombre_Producto() {
        return Nombre_Producto;
    }

    public void setNombre_Producto(String Nombre_Producto) {
        this.Nombre_Producto = Nombre_Producto;
    }

    public Float getPrecio_Producto() {
        return Precio_Producto;
    }

    public void setPrecio_Producto(Float Precio_Producto) {
        this.Precio_Producto = Precio_Producto;
    }

    public int getCantidad_Bodega_Productos() {
        return Cantidad_Bodega_Productos;
    }

    public void setCantidad_Bodega_Productos(int Cantidad_Bodega_Productos) {
        this.Cantidad_Bodega_Productos = Cantidad_Bodega_Productos;
    }

    public String getCategoria_Flores() {
        return Categoria_Flores;
    }

    public void setCategoria_Flores(String Categoria_Flores) {
        this.Categoria_Flores = Categoria_Flores;
    }

    public String getCategoria_Diseno() {
        return Categoria_Diseno;
    }

    public void setCategoria_Diseno(String Categoria_Diseno) {
        this.Categoria_Diseno = Categoria_Diseno;
    }

    public String getCategoria_Evento() {
        return Categoria_Evento;
    }

    public void setCategoria_Evento(String Categoria_Evento) {
        this.Categoria_Evento = Categoria_Evento;
    }

    public String getDescripcion_Producto() {
        return Descripcion_Producto;
    }

    public void setDescripcion_Producto(String Descripcion_Producto) {
        this.Descripcion_Producto = Descripcion_Producto;
    }
    
    public void Guardar() {
        Connection conexion = ClaseConexion.getConexion();
        try {
            PreparedStatement addProduct = conexion.prepareStatement("INSERT INTO TbInventario (UUID_Producto, Img_Producto, Nombre_Producto, Precio_Producto, Cantidad_Bodega_Productos, Categoria_Flores, Categoria_Diseno, Categoria_Evento, Descripcion_Producto) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?) ");
            addProduct.setString(1, UUID.randomUUID().toString());
            addProduct.setString(2, getImg_Producto());
            addProduct.setString(3, getNombre_Producto());
            addProduct.setFloat(4, getPrecio_Producto());
            addProduct.setInt(5, getCantidad_Bodega_Productos());
            addProduct.setString(6, getCategoria_Flores());
            addProduct.setString(7, getCategoria_Diseno());
            addProduct.setString(8, getCategoria_Evento());
            addProduct.setString(9, getDescripcion_Producto());
            addProduct.executeUpdate();
 
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
    
      String uuidProduct = tabla.getValueAt(filaSeleccionada, 0).toString();
      String sql = "DELETE FROM TbInventario WHERE UUID_Producto = ?";
    
      try (PreparedStatement deleteProduct = conexion.prepareStatement(sql)) {
          deleteProduct.setString(1, uuidProduct);
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
       modeloDeDatos.setColumnIdentifiers(new Object[]{"UUID", "Img_Producto", "Apellido", "Usuario", "Telefono", "Edad", "Correo", "Rol"});
    
      try {
          Statement statement = conexion.createStatement();
          ResultSet rs = statement.executeQuery("SELECT UUID_Producto, Img_Producto, Nombre_Producto, Precio_Producto, Cantidad_Bodega_Productos, Categoria_Flores, Categoria_Diseno, Categoria_Evento, Descripcion_Producto FROM TbInventario");
          while (rs.next()) {
             modeloDeDatos.addRow(new Object[]{
                rs.getString("UUID_Producto"),
                rs.getString("Img_Producto"),
                rs.getString("Nombre_Producto"),
                rs.getFloat("Precio_Producto"),
                rs.getInt("Cantidad_Bodega_Productos"),
                rs.getString("Categoria_Flores"),
                rs.getString("Categoria_Diseno"),
                rs.getString("Categoria_Evento"),
                rs.getString("Descripcion_Producto")
             });
           }
          tabla.setModel(modeloDeDatos);
          tabla.getColumnModel().getColumn(0).setMinWidth(0);
          tabla.getColumnModel().getColumn(0).setMaxWidth(0);
        }catch (Exception e) {
            System.out.println("Este es el error en el modelo, metodo mostrar " + e);
        }
    }
    
    public void cargarDatosTabla(Panel_Inventario_Admin Vista) {
      int filaSeleccionada = Vista.jtb_Inventory.getSelectedRow();
      if (filaSeleccionada != -1) {
          String NombreTB = Vista.jtb_Inventory.getValueAt(filaSeleccionada, 1).toString();
          String PrecioTB = Vista.jtb_Inventory.getValueAt(filaSeleccionada, 2).toString();
          String CantidadTB = Vista.jtb_Inventory.getValueAt(filaSeleccionada, 3).toString();
          String Categoria_FloresTB = Vista.jtb_Inventory.getValueAt(filaSeleccionada, 4).toString();
          String Categoria_DisenoTB = Vista.jtb_Inventory.getValueAt(filaSeleccionada, 5).toString();
          String Categoria_EventoTB = Vista.jtb_Inventory.getValueAt(filaSeleccionada, 6).toString();
          String DescripcionTB = Vista.jtb_Inventory.getValueAt(filaSeleccionada, 7).toString();
          String imgPath = (String) Vista.jtb_Inventory.getValueAt(filaSeleccionada, 8);
        
          Vista.txt_Nombre_Inventory_Admin.setText(NombreTB);
          Vista.txt_Precio_Inventory_Admin.setText(PrecioTB);
          Vista.txt_Cantidad_Inventory_Admin.setText(CantidadTB);
          Vista.txt_Descrip_Inventory_Admin.setText(DescripcionTB);
          
          Vista.Cb_Categoria_Flores_Inventory_admin.setSelectedItem(Categoria_FloresTB);
          Vista.Cb_Categoria_Diseno_Inventory_admin.setSelectedItem(Categoria_DisenoTB);
          Vista.Cb_Categoria_Evento_Inventory_admin.setSelectedItem(Categoria_EventoTB);
          
          //Funcion que nos permitira mostrar la imagen al seleccionar el registro de la tabla
          if (imgPath != null && !imgPath.isEmpty()) {
                try {
                    URL url = new URL(imgPath);
                    Image image = ImageIO.read(url);
                    ImageIcon icon = new ImageIcon(image);
                    Vista.IMG_Inventory_admin.setIcon(icon);
                    Vista.IMG_Inventory_admin.setText(null);
                } catch (IOException e) {
                    System.out.println("Error al cargar la imagen: " + e.getMessage());
                }
            } else {
                Vista.IMG_Inventory_admin.setIcon(null);
            }
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
       String uuidProduct = tabla.getValueAt(filaSeleccionada, 0).toString();
    
      try { 
          PreparedStatement updateProduct = conexion.prepareStatement(
            "UPDATE TbInventario SET Nombre_Producto = ?, Precio_Producto = ?, Cantidad_Bodega_Producto = ?, Categoria_Flores = ?, Categoria_Diseno = ?, Categoria_Evento = ?, Descripcion_Producto = ?  WHERE UUID_Producto = ?"
          );

          updateProduct.setString(1, getNombre_Producto());
          updateProduct.setFloat(2, getPrecio_Producto());
          updateProduct.setInt(3, getCantidad_Bodega_Productos());
          updateProduct.setString(4, getCategoria_Flores());
          updateProduct.setString(5, getCategoria_Diseno());
          updateProduct.setString(6, getCategoria_Evento());
          updateProduct.setString(7, getDescripcion_Producto());
          updateProduct.setString(8, uuidProduct);

          int rowsAffected = updateProduct.executeUpdate();
          if (rowsAffected > 0) {
            System.out.println("Registro actualizado correctamente.");
          } else {
            System.out.println("No se actualizó ningún registro. Verifique el UUID.");
          }
        } catch (SQLException e) {
        System.out.println("Error en el método de actualizar: " + e.getMessage());
        }
    }
    
    public void Buscar(JTable tabla, JTextField txtBuscar) {
    Connection conexion = ClaseConexion.getConexion();
    DefaultTableModel modelo = new DefaultTableModel();
    modelo.setColumnIdentifiers(new Object[]{"UUID_Producto", "Nombre_Producto", "Precio_Producto", "Cantidad_Bodega_Productos", "Categoria_Flores", "Categoria_Diseno", "Categoria_Evento", "Descripcion_Producto"});
    try {
        PreparedStatement searchUser = conexion.prepareStatement("SELECT * FROM TbInventario WHERE Nombre_Producto LIKE ?");
        searchUser.setString(1, "%" + txtBuscar.getText() + "%");
        ResultSet rs = searchUser.executeQuery();
        while (rs.next()) {
            modelo.addRow(new Object[]{
                rs.getString("UUID_Producto"),
                rs.getString("Img_Producto"),
                rs.getString("Nombre_Producto"),
                rs.getFloat("Precio_Producto"),
                rs.getInt("Cantidad_Bodega_Productos"),
                rs.getString("Categoria_Flores"),
                rs.getString("Categoria_Diseno"),
                rs.getString("Categoria_Evento"),
                rs.getString("Descripcion_Producto")
            });
        }
        tabla.setModel(modelo);
    } catch (Exception e) {
        System.out.println("Este es el error en el modelo, metodo buscar " + e);
    }
   }
}
