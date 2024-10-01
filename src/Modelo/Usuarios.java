package Modelo;

import Modelo.ClaseConexion;
import Vista.Paneles_Admin.Panel_Usuarios;
import java.sql.*;
import java.util.UUID;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Usuarios {
    private String UUID_User;
    private String Nombres_User;
    private String Apellidos_User;
    private String Nombre_de_Usuario;
    private String Num_Telefono_User;
    private int Edad_User;
    private String Email_User;
    private String Contra_User;
    private String Img_User;
    private String Rol_User;
    private int Sesion_User;
    
    private JLabel IMG_User_admin;

    public String getUUID_User() {
        return UUID_User;
    }

    public void setUUID_User(String UUID_User) {
        this.UUID_User = UUID_User;
    }
    
    public void generarUUID() {
        this.UUID_User = UUID.randomUUID().toString();
    }

    public String getNombres_User() {
        return Nombres_User;
    }

    public void setNombres_User(String Nombres_User) {
        this.Nombres_User = Nombres_User;
    }

    public String getApellidos_User() {
        return Apellidos_User;
    }

    public void setApellidos_User(String Apellidos_User) {
        this.Apellidos_User = Apellidos_User;
    }

    public String getNombre_de_Usuario() {
        return Nombre_de_Usuario;
    }

    public void setNombre_de_Usuario(String Nombre_de_Usuario) {
        this.Nombre_de_Usuario = Nombre_de_Usuario;
    }

    public String getNum_Telefono_User() {
        return Num_Telefono_User;
    }

    public void setNum_Telefono_User(String Num_Telefono_User) {
        this.Num_Telefono_User = Num_Telefono_User;
    }

    public int getEdad_User() {
        return Edad_User;
    }

    public void setEdad_User(int Edad_User) {
        this.Edad_User = Edad_User;
    }

    public String getEmail_User() {
        return Email_User;
    }

    public void setEmail_User(String Email_User) {
        this.Email_User = Email_User;
    }

    public String getContra_User() {
        return Contra_User;
    }

    public void setContra_User(String Contra_User) {
        this.Contra_User = Contra_User;
    }

    public String getImg_User() {
        return Img_User;
    }

    public void setImg_User(String Img_User) {
        this.Img_User = Img_User;
    }

    public String getRol_User() {
        return Rol_User;
    }

    public void setRol_User(String Rol_User) {
        this.Rol_User = Rol_User;
    }

    public int getSesion_User() {
        return Sesion_User;
    }

    public void setSesion_User(int Sesion_User) {
        this.Sesion_User = Sesion_User;
    }
    
    public void Guardar() {
        Connection conexion = ClaseConexion.getConexion();
        try {
            PreparedStatement addUser = conexion.prepareStatement("INSERT INTO TbUsers (UUID_User, Nombres_User, Apellido_User, Nombre_de_Usuario, Num_Telefono_User, Edad_User, Email_User, Contra_User, Img_User, Rol_User, Sesion_User) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            addUser.setString(1, UUID.randomUUID().toString());
            addUser.setString(2, getNombres_User());
            addUser.setString(3, getApellidos_User());
            addUser.setString(4, getNombre_de_Usuario());
            addUser.setString(5, getNum_Telefono_User());
            addUser.setInt(6, getEdad_User());
            addUser.setString(7, getEmail_User());
            addUser.setString(8, getContra_User());
            addUser.setString(9, getImg_User());
            addUser.setString(10, getRol_User());
            addUser.setInt(11, getSesion_User());
            addUser.executeUpdate();
 
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
    
    String uuidUser = tabla.getValueAt(filaSeleccionada, 0).toString();
    
    String sql = "DELETE FROM TbUsers WHERE UUID_User = ?";
    
    try (PreparedStatement deleteUser = conexion.prepareStatement(sql)) {
        deleteUser.setString(1, uuidUser);
        int rowsAffected = deleteUser.executeUpdate();
        
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
    modeloDeDatos.setColumnIdentifiers(new Object[]{"UUID", "Nombre", "Apellido", "Usuario", "Telefono", "Edad", "Correo", "Rol"});
    
    try {
        Statement statement = conexion.createStatement();
        ResultSet rs = statement.executeQuery("SELECT UUID_User, Nombres_User, Apellido_User, Nombre_de_Usuario, Num_Telefono_User, Edad_User, Email_User, Rol_User FROM TbUsers");
        while (rs.next()) {
            modeloDeDatos.addRow(new Object[]{
                rs.getString("UUID_User"),
                rs.getString("Nombres_User"),
                rs.getString("Apellido_User"),
                rs.getString("Nombre_de_Usuario"),
                rs.getString("Num_Telefono_User"),
                rs.getInt("Edad_User"),
                rs.getString("Email_User"),
                rs.getString("Rol_User")
            });
        }
        tabla.setModel(modeloDeDatos);
        tabla.getColumnModel().getColumn(0).setMinWidth(0);
        tabla.getColumnModel().getColumn(0).setMaxWidth(0);
    } catch (Exception e) {
        System.out.println("Este es el error en el modelo, metodo mostrar " + e);
    }
   }
    
    public void cargarDatosTabla(Panel_Usuarios Vista) {
    int filaSeleccionada = Vista.jtb_Usuarios.getSelectedRow();
    if (filaSeleccionada != -1) {
        String NombresTB = Vista.jtb_Usuarios.getValueAt(filaSeleccionada, 1).toString();
        String ApellidosTB = Vista.jtb_Usuarios.getValueAt(filaSeleccionada, 2).toString();
        String NombreDeUsuarioTB = Vista.jtb_Usuarios.getValueAt(filaSeleccionada, 3).toString();
        String TelefonoTB = Vista.jtb_Usuarios.getValueAt(filaSeleccionada, 4).toString();
        String EdadTB = Vista.jtb_Usuarios.getValueAt(filaSeleccionada, 5).toString();
        String CorreoTB = Vista.jtb_Usuarios.getValueAt(filaSeleccionada, 6).toString();
        String RolTB = Vista.jtb_Usuarios.getValueAt(filaSeleccionada, 7).toString();
        
        Vista.txt_Nombre.setText(NombresTB);
        Vista.txt_Apellido.setText(ApellidosTB);
        Vista.txt_NombreDeUsuario.setText(NombreDeUsuarioTB);
        Vista.txt_Telefono.setText(TelefonoTB);
        Vista.txt_Edad.setText(EdadTB);
        Vista.txt_Correo.setText(CorreoTB);
        Vista.cb_Rol.setSelectedItem(RolTB);
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
    String uuidUser = tabla.getValueAt(filaSeleccionada, 0).toString();
    
    try { 
        PreparedStatement updateUser = conexion.prepareStatement(
            "UPDATE TbUsers SET Nombres_User = ?, Apellido_User = ?, Nombre_de_Usuario = ?, Num_Telefono_User = ?, Email_User = ?, Contra_User = ? WHERE UUID_User = ?"
        );

        updateUser.setString(1, getNombres_User());
        updateUser.setString(2, getApellidos_User());
        updateUser.setString(3, getNombre_de_Usuario());
        updateUser.setString(4, getNum_Telefono_User());
        updateUser.setString(5, getEmail_User());
        updateUser.setString(6, getContra_User());
        updateUser.setString(7, uuidUser);

        int rowsAffected = updateUser.executeUpdate();
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
    modelo.setColumnIdentifiers(new Object[]{"UUID_User", "Nombre", "Apellido", "Usuario", "Telefono", "Edad", "Correo", "Rol"});
    try {
        PreparedStatement searchUser = conexion.prepareStatement("SELECT * FROM TbUsers WHERE Nombres_User LIKE ?");
        searchUser.setString(1, "%" + txtBuscar.getText() + "%");
        ResultSet rs = searchUser.executeQuery();
        while (rs.next()) {
            modelo.addRow(new Object[]{
                rs.getString("UUID_User"),
                rs.getString("Nombres_User"),
                rs.getString("Apellido_User"),
                rs.getString("Nombre_de_Usuario"),
                rs.getString("Num_Telefono_User"),
                rs.getInt("Edad_User"),
                rs.getString("Email_User"),
                rs.getString("Rol_User")
            });
        }
        tabla.setModel(modelo);
    } catch (Exception e) {
        System.out.println("Este es el error en el modelo, metodo buscar " + e);
    }
   }
    

}
