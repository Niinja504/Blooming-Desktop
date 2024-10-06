package Modelo;

import Controlador.Admin.Ctrl_Usuarios;
import Controlador.Client.Ctrl_Ofertas_Client;
import Controlador.Ctrl_DashBoard_Admin;
import Controlador.Ctrl_DashBoard_Employed;
import Controlador.Ctrl_Dashboard_Client;
import Controlador.Employed.Ctrl_Caja;
import Modelo.Admin.Usuarios;
import Vista.Paneles_Admin.Panel_Usuarios;
import Vista.Paneles_Client.Panel_Inicio_Client;
import Vista.Paneles_Employed.Panel_Caja_Employed;
import Vista.frm_Dashboard_Admin;
import Vista.frm_Dashboard_Client;
import Vista.frm_Dashboard_Employed;
import Vista.frm_SignIn;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;

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
                                    currentFrame = new frm_Dashboard_Admin(UUID);
                                    Panel_Usuarios panelUsuarios = new Panel_Usuarios();
                                    ((frm_Dashboard_Admin) currentFrame).jpContenedor_Admin.add(panelUsuarios);
                                    Usuarios modeloUsuarios = new Usuarios();
                                    Ctrl_Usuarios controladorUsuarios = new Ctrl_Usuarios(modeloUsuarios, panelUsuarios);
                                    Ctrl_DashBoard_Admin controlador = new Ctrl_DashBoard_Admin((frm_Dashboard_Admin) currentFrame, panelUsuarios);
                                    break;
                                case 1:
                                    currentFrame = new frm_Dashboard_Employed(UUID);
                                    Panel_Caja_Employed panelCaja = new Panel_Caja_Employed(null);
                                    ((frm_Dashboard_Employed) currentFrame).jpContenedor_Employed.add(panelCaja);
                                    Ctrl_Caja controladorCaja = new Ctrl_Caja(panelCaja);
                                    panelCaja.setControlador(controladorCaja);
                                    controladorCaja.mostrarProductos();
                                    Ctrl_DashBoard_Employed controladorEmployed = new Ctrl_DashBoard_Employed((frm_Dashboard_Employed) currentFrame, panelCaja, UUID);   
                                    break;
                                case 2:
                                    currentFrame = new frm_Dashboard_Client(UUID);
                                    Panel_Inicio_Client panelOfertas = new Panel_Inicio_Client(null);
                                    ((frm_Dashboard_Employed) currentFrame).jpContenedor_Employed.add(panelOfertas);
                                    Ctrl_Ofertas_Client controladorOfertas = new Ctrl_Ofertas_Client(panelOfertas);
                                    Ctrl_Dashboard_Client controladorCliente = new Ctrl_Dashboard_Client((frm_Dashboard_Client) currentFrame, panelOfertas, UUID);
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
