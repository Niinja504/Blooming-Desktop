package Modelo;

import static Vista.frm_Dashboard_Admin.init_frm_Dashboard_Admin;
import Vista.frm_SignIn;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SingIn {

    private final frm_SignIn Vista;

    public SingIn(frm_SignIn vista) {
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
                    if (RolS.equals("Administrador")) {
                        Rol = 0;
                    } else {
                        JPanel mensajePanel = new JPanel();
                        mensajePanel.add(new JLabel("Esta aplicación está hecha solo para administradores."));
                        JOptionPane.showMessageDialog(Vista, mensajePanel, "Acceso Denegado", JOptionPane.WARNING_MESSAGE);
                        return;
                    }

                    if (Rol != null) {
                        final Integer finalRol = Rol;
                        Vista.setVisible(false);

                        if (finalRol == 0) {
                                init_frm_Dashboard_Admin(UUID);
                            }
                            Vista.dispose();
                    }
                }
            } else {
                JOptionPane.showMessageDialog(Vista, "El correo o la contraseña son incorrectos.", "Error", JOptionPane.ERROR_MESSAGE);
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
