package Modelo;

import Vista.frm_Dashboard_Admin;
import Vista.frm_Dashboard_Client;
import Vista.frm_Dashboard_Employed;
import Vista.frm_SingIn;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.Timer;

public class SingIn {
    private final frm_SingIn Vista;

    // Constructor que recibe la referencia a la vista de inicio de sesión
    public SingIn(frm_SingIn vista) {
        this.Vista = vista;
        System.out.println("SingIn model instantiated.");
    }

    // Método para iniciar sesión
    public void IniciarSesion() throws SQLException {
        System.out.println("IniciarSesion method called.");
        Connection conexion = null;

        try {
            conexion = ClaseConexion.getConexion();
            System.out.println("Database connection established.");

            String ContraseEncrip = hashSHA256(Vista.txt_Contra_SingIn.getText());
            String Correo = Vista.txt_Correo_SingIn.getText();
            
            String sql = "SELECT * FROM TbUsers WHERE Email_User = ? AND Contra_User = ?";
            PreparedStatement Comprobar_Usu = conexion.prepareStatement(sql);
            Comprobar_Usu.setString(1, Correo);
            Comprobar_Usu.setString(2, ContraseEncrip);
            ResultSet Resultado = Comprobar_Usu.executeQuery();

            if (Resultado.next()) {
                String RolS = Resultado.getString("Rol_User");
                String UUID = Resultado.getString("UUID_User");


                Integer Rol = null;
                if (RolS != null) {
                    final String finalRolS = RolS;
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
                        final Integer finalRol = Rol;
                        Vista.setVisible(false);

                        Timer timer = new Timer(200, e -> {
                            JFrame currentFrame = null;
                            
                            switch (finalRol) {
                                case 0:
                                    currentFrame = new frm_Dashboard_Admin();
                                    break;
                                case 1:
                                    currentFrame = new frm_Dashboard_Employed();
                                    break;
                                case 2:
                                    currentFrame = new frm_Dashboard_Client();
                                    break;
                            }

                            if (currentFrame != null) {
                                currentFrame.setVisible(true);
                            } else {
                                System.err.println("Error: No se pudo abrir la ventana correspondiente");
                            }
                            
                            System.out.println("El rol del usuario es: " + finalRolS);

                            Vista.dispose();
                        });

                        timer.setRepeats(false);
                        timer.start();
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
}
