package Modelo;

import Vista.frm_Dashboard_Admin;
import Vista.frm_Dashboard_Client;
import Vista.frm_Dashboard_Employed;
import java.sql.Connection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import Vista.frm_SingIn;
import java.sql.SQLException;
import java.sql.ResultSet;

public class SingIn {
    private frm_SingIn Vista;
    
    public SingIn(frm_SingIn vista) {
        this.Vista = vista;
        System.out.println("SingIn model instantiated.");
    }
    
    public void IniciarSesion() throws SQLException {
        System.out.println("IniciarSesion method called.");

        Connection conexion = null;
        try {
            conexion = ClaseConexion.getConexion();
            System.out.println("Database connection established.");

            String ContraseEncrip = hashSHA256(Vista.txt_Contra_SingIn.getText());
            String Correo = Vista.txt_Correo_SingIn.getText();
            
            System.out.println("Correo: " + Correo);
            System.out.println("Contraseña Encriptada: " + ContraseEncrip);
            
            String sql = "SELECT * FROM TbUsers WHERE Email_User = ? AND Contra_User = ?";
            PreparedStatement Comprobar_Usu = conexion.prepareStatement(sql);
            Comprobar_Usu.setString(1, Correo);
            Comprobar_Usu.setString(2, ContraseEncrip);
            ResultSet Resultado = Comprobar_Usu.executeQuery();
            
            if (Resultado.next()) {
                String RolS = Resultado.getString("Rol_User");
                String UUID = Resultado.getString("UUID_User");

                System.out.println("Usuario encontrado: " + UUID + ", Rol: " + RolS);

                Integer Rol = null;
                if (RolS != null) {
                    switch (RolS) {
                        case "Administrador":
                            Rol = 0;
                            break;
                        case "Empleado":
                            Rol = 1;
                            break;
                        case "Cliente":
                            Rol = 2;
                            break;
                        default:
                            Rol = null;
                            break;
                    }

                    if (Rol != null) {
                        switch (Rol) {
                            case 0:
                                frm_Dashboard_Admin Dashboard_Admin = new frm_Dashboard_Admin();
                                Dashboard_Admin.setVisible(true);
                                break;
                            case 1:
                                frm_Dashboard_Employed Dashboard_Employed = new frm_Dashboard_Employed();
                                Dashboard_Employed.setVisible(true);
                                break;
                            case 2:
                                frm_Dashboard_Client Dashboard_Client = new frm_Dashboard_Client();
                                Dashboard_Client.setVisible(true);
                                break;
                        }
                    }
                }
            } else {
                System.out.println("Usuario o contraseña incorrectos.");
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        } finally {
            if (conexion != null) {
                conexion.close();
            }
        }
    }
    
    public static String hashSHA256(String input) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] bytes = digest.digest(input.getBytes());
            StringBuilder hexString = new StringBuilder();
            for (byte b : bytes) {
                hexString.append(String.format("%02x", b));
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void LimpiarCampos() {
        Vista.txt_Correo_SingIn.setText("");
        Vista.txt_Contra_SingIn.setText("");
    }
}
