package Modelo.Admin;

import Modelo.ClaseConexion;
import java.sql.*;

public class Perfil {

    String UUID_User;
    String Nombres_User;
    String Apellido_User;
    String Nombre_de_Usuario;
    String Num_Telefono_User;
    int Edad_User;
    String Email_User;
    String Contra_User;
    String Img_User;

    public String getUUID_User() {
        return UUID_User;
    }

    public void setUUID_User(String UUID_User) {
        this.UUID_User = UUID_User;
    }

    public String getNombres_User() {
        return Nombres_User;
    }

    public void setNombres_User(String Nombres_User) {
        this.Nombres_User = Nombres_User;
    }

    public String getApellido_User() {
        return Apellido_User;
    }

    public void setApellido_User(String Apellido_User) {
        this.Apellido_User = Apellido_User;
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

    public void MostrarPerfil(String UUID) {
        Connection conexion = ClaseConexion.getConexion();

        try {
            PreparedStatement ps = conexion.prepareStatement("SELECT * FROM TbUsers WHERE UUID_User = ?");
            ps.setString(1, UUID);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                setUUID_User(rs.getString("UUID_User"));
                setNombres_User(rs.getString("Nombres_User"));
                setApellido_User(rs.getString("Apellido_User"));
                setNombre_de_Usuario(rs.getString("Nombre_de_Usuario"));
                setNum_Telefono_User(rs.getString("Num_Telefono_User"));
                setEdad_User(rs.getInt("Edad_User"));
                setEmail_User(rs.getString("Email_User"));
                setImg_User(rs.getString("Img_User"));
            }
        } catch (Exception e) {
            System.out.println("Error al obtener los datos del perfil: " + e);
        }
    }
    
    public void ActualizarPerfil(String UUID){
        Connection conexion = ClaseConexion.getConexion();
        
        
    }

}
