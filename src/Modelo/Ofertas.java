package Modelo;

import Vista.Paneles_Admin.Panel_Ofertas;
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
import javax.swing.table.DefaultTableModel;

public class Ofertas {
    private String UUID_Oferta;
    private String UUID_Producto;
    private String Titulo;
    private String Porcentaje_Oferta;
    private String Descripcion_Oferta;
    private String Img_oferta;

    public String getUUID_Oferta() {
        return UUID_Oferta;
    }

    public void setUUID_Oferta(String UUID_Oferta) {
        this.UUID_Oferta = UUID_Oferta;
    }

    public String getUUID_Producto() {
        return UUID_Producto;
    }

    public void setUUID_Producto(String UUID_Producto) {
        this.UUID_Producto = UUID_Producto;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getPorcentaje_Oferta() {
        return Porcentaje_Oferta;
    }

    public void setPorcentaje_Oferta(String Porcentaje_Oferta) {
        this.Porcentaje_Oferta = Porcentaje_Oferta;
    }

    public String getDescripcion_Oferta() {
        return Descripcion_Oferta;
    }

    public void setDescripcion_Oferta(String Descripcion_Oferta) {
        this.Descripcion_Oferta = Descripcion_Oferta;
    }

    public String getImg_oferta() {
        return Img_oferta;
    }

    public void setImg_oferta(String Img_oferta) {
        this.Img_oferta = Img_oferta;
    }
    
    public void Guardar() {
        Connection conexion = ClaseConexion.getConexion();
        try {
            PreparedStatement addOffer = conexion.prepareStatement("INSERT INTO TbOfertas (UUID_Oferta, UUID_Producto, Titulo, Porcentaje_Oferta, Decripcion_Oferta, Img_oferta) VALUES (?, ?, ?, ?, ?, ?)");
            addOffer.setString(1, UUID.randomUUID().toString());
            addOffer.setString(2, getUUID_Producto());
            addOffer.setString(3, getTitulo());
            addOffer.setString(4, getPorcentaje_Oferta());
            addOffer.setString(5, getDescripcion_Oferta());
            addOffer.setString(6, getImg_oferta());
            addOffer.executeUpdate();
 
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
    
    String uuidOferta = tabla.getValueAt(filaSeleccionada, 0).toString();
    
    String sql = "DELETE FROM TbOfertas WHERE  = ?";
    
    try (PreparedStatement deleteOferta = conexion.prepareStatement(sql)) {
        deleteOferta.setString(1, uuidOferta);
        int rowsAffected = deleteOferta.executeUpdate();
        
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
    modeloDeDatos.setColumnIdentifiers(new Object[]{"UUID", "Titulo", "Porcentaje_Oferta", "Decripcion_Oferta", "Img_oferta"});
    
    try {
        Statement statement = conexion.createStatement();
        ResultSet rs = statement.executeQuery("SELECT UUID_Oferta, Titulo, Porcentaje_Oferta, Decripcion_Oferta, Img_oferta FROM TbOfertas");
        while (rs.next()) {
            modeloDeDatos.addRow(new Object[]{
                rs.getString("UUID_Oferta"),
                rs.getString("Titulo"),
                rs.getString("Porcentaje_Oferta"),
                rs.getString("Decripcion_Oferta"),
                rs.getString("Img_oferta")
            });
        }
        tabla.setModel(modeloDeDatos);
        tabla.getColumnModel().getColumn(0).setMinWidth(0);
        tabla.getColumnModel().getColumn(0).setMaxWidth(0);
        tabla.getColumnModel().getColumn(4).setMinWidth(1);
        tabla.getColumnModel().getColumn(4).setMaxWidth(1);
    } catch (Exception e) {
        System.out.println("Este es el error en el modelo, metodo mostrar " + e);
        e.printStackTrace();
    }
   }
    
    public void cargarDatosTabla(Panel_Ofertas Vista) {
    int filaSeleccionada = Vista.jtb_Offers_Admin.getSelectedRow();
    if (filaSeleccionada != -1) {
        String TituloTB = Vista.jtb_Offers_Admin.getValueAt(filaSeleccionada, 1).toString();
        String PorcentajeTB = Vista.jtb_Offers_Admin.getValueAt(filaSeleccionada, 2).toString();
        String DecripcionTB = Vista.jtb_Offers_Admin.getValueAt(filaSeleccionada, 3).toString();
        String imgPath = (String) Vista.jtb_Offers_Admin.getValueAt(filaSeleccionada, 4);

        Vista.txt_Titulo_Offers_Admin.setText(TituloTB);
        Vista.txt_Porcentaje_Offers_Admin.setText(PorcentajeTB);
        Vista.txt_Descrip_Offers_Admin.setText(DecripcionTB);
        
        //Funcion que nos permitira mostrar la imagen al seleccionar el registro de la tabla
        if (imgPath != null && !imgPath.isEmpty()) {
                try {
                    URL url = new URL(imgPath);
                    Image image = ImageIO.read(url);
                    ImageIcon icon = new ImageIcon(image);
                    Vista.IMG_Offers_admin.setIcon(icon);
                    Vista.IMG_Offers_admin.setText(null);
                } catch (IOException e) {
                    System.out.println("Error al cargar la imagen: " + e.getMessage());
                }
            } else {
                Vista.IMG_Offers_admin.setIcon(null);
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
    String uuidOferta = tabla.getValueAt(filaSeleccionada, 0).toString();
    
    try { 
        PreparedStatement updateOferta = conexion.prepareStatement(
            "UPDATE TbUsers SET Nombres_User = ?, Apellido_User = ?, Nombre_de_Usuario = ?, Num_Telefono_User = ?, Email_User = ?, Contra_User = ? WHERE UUID_User = ?"
        );

        updateOferta.setString(1, getTitulo());
        updateOferta.setString(2, getPorcentaje_Oferta());
        updateOferta.setString(3, getDescripcion_Oferta());
        updateOferta.setString(4, getImg_oferta());
        updateOferta.setString(5, uuidOferta);

        int rowsAffected = updateOferta.executeUpdate();
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
