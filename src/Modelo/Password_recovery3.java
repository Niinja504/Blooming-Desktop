package Modelo;

import Modelo.ClaseConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JTable;

public class Password_recovery3 {

    private String correo;
    private String contra;

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public void ActualizarPassword() {
        Connection conexion = ClaseConexion.getConexion();
        try {
            PreparedStatement updateUser = conexion.prepareStatement(
                "UPDATE TbUsers SET Contra_User = ? WHERE Email_User = ?"
            );
            updateUser.setString(1, getContra());
            updateUser.setString(2, getCorreo());
            updateUser.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al actualizar la contraseña: " + e);
        }
    }

    public static String hashSHA256(String input) {
        try {
            java.security.MessageDigest digest = java.security.MessageDigest.getInstance("SHA-256");
            byte[] bytes = digest.digest(input.getBytes());
            StringBuilder hexString = new StringBuilder();
            for (byte b : bytes) {
                hexString.append(String.format("%02x", b));
            }
            return hexString.toString();
        } catch (java.security.NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
