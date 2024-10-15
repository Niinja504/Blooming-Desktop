package Modelo;

import Modelo.Envio_Correo.Envio;
import static Vista.frm_Dashboard_Admin.init_frm_Dashboard_Admin;
import Vista.frm_SignIn;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SingIn {

    private final frm_SignIn Vista;
    private String Correo;

    public SingIn(frm_SignIn vista) {
        this.Vista = vista;
        System.out.println("SingIn model instantiated.");
    }

    public void IniciarSesion() throws SQLException {
        Connection conexion = null;

        try {
            conexion = ClaseConexion.getConexion();
            System.out.println("Conexiòn exitosa");

            String ContraseEncrip = hashSHA256(Vista.txt_Contra_SingIn.getText());
            Correo = Vista.txt_Correo_SingIn.getText();

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
                        DB();
                        EnviarCorreo();
                        
                        
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

    public String obtenerUUID(String correo) throws SQLException {
        String uuid = null;
        Connection conexion = null;

        try {
            conexion = ClaseConexion.getConexion();
            String sql = "SELECT UUID_User FROM TbUsers WHERE Email_User = ?";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, correo);

            ResultSet resultado = ps.executeQuery();

            if (resultado.next()) {
                uuid = resultado.getString("UUID_User");
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        } finally {
            if (conexion != null) {
                conexion.close();
            }
        }

        return uuid;
    }

    public void DB() {
        Connection conexion = ClaseConexion.getConexion();
        try {

            String uuid = obtenerUUID(Correo);

            PreparedStatement Abrir = conexion.prepareStatement("UPDATE TbUsers SET Sesion_User = ? WHERE Email_User = ?");
            int Abierto = 1;

            Abrir.setInt(1, Abierto);
            Abrir.setString(2, Correo);
            Abrir.executeUpdate();

            PreparedStatement Notificacion = conexion.prepareStatement("INSERT INTO TbNotificaciones (UUID_Notificacion, UUID_User, Titulo, Mensaje, Tiempo_Envio, Fecha_Envio) VALUES (?, ?, ?, ?, ?, ?)");
            String horaDispositivo = obtenerHoraDispositivo();
            String fechaDispositivo = obtenerFechaDispositivo();
            String UUIDNotificacion = UUID.randomUUID().toString();
            String sistemaOperativo = System.getProperty("os.name") + " " + System.getProperty("os.version");

            Notificacion.setString(1, UUIDNotificacion);
            Notificacion.setString(2, uuid);
            Notificacion.setString(3, "Inicio de sesión");
            Notificacion.setString(4, "Se ha iniciado sesión en un nuevo dispositivo:\n"
                    + "Sistema operativo:" + sistemaOperativo);
            Notificacion.setString(5, horaDispositivo);
            Notificacion.setString(6, fechaDispositivo);
            Notificacion.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void EnviarCorreo() {
        String Mensaje = obtenerInformacionDispositivo();
        String subject = "Código de recuperación de contraseña";

        String content = "<html>"
                + "<body>"
                + "<p>Se ha iniciado sesión en un nuevo dispositivo.</p>"
                + Mensaje
                + "<br>"
                + "<p>Saludos cordiales,</p>"
                + "<footer style=\"text-align: center; margin-top: 20px; border-top: 1px solid #ddd; padding-top: 10px;\">"
                + "<strong>Soporte de Blooming</strong>"
                + "<p>Ubicación: San Salvador, El Salvador</p>"
                + "<p>Correo: <a href=\"mailto:bloomingservicee@gmail.com\">bloomingservicee@gmail.com</a></p>"
                + "<p>Síguenos en nuestras redes sociales:</p>"
                + "<p>"
                + "<a href=\"https://www.instagram.com/ptc_blooming/profilecard/?igsh=MWhoaXdwMTF5cnBndw==\" target=\"_blank\">"
                + "<img src=\"https://cdn-icons-png.flaticon.com/128/15713/15713420.png\" alt=\"Facebook\" width=\"24\" height=\"24\"/>"
                + "</a>"
                + "<a href=\"https://x.com/bloomingptc?s=21&t=13sdLei3-0u_F-QRr6TXlg\" target=\"_blank\">"
                + "<img src=\"https://cdn-icons-png.flaticon.com/128/5968/5968830.png\" alt=\"Twitter\" width=\"24\" height=\"24\"/>"
                + "</a>"
                + "<a href=\"https://www.tiktok.com/@sistema_blooming?_t=8oRwbbrEw6g&_r=1\" target=\"_blank\">"
                + "<img src=\"https://cdn-icons-png.flaticon.com/128/15713/15713399.png\" alt=\"Instagram\" width=\"24\" height=\"24\"/>"
                + "</a>"
                + "</p>"
                + "</footer>"
                + "</body>"
                + "</html>";

        Envio.enviarCorreo(Correo, subject, content);
    }

    private String obtenerInformacionDispositivo() {
        String fecha = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        String hora = new SimpleDateFormat("HH:mm:ss").format(new Date());
        String sistemaOperativo = System.getProperty("os.name") + " " + System.getProperty("os.version");

        return "<p><strong>Fecha:</strong> " + fecha + "</p>"
                + "<p><strong>Hora:</strong> " + hora + "</p>"
                + "<p><strong>Sistema operativo:</strong> " + sistemaOperativo + "</p>";
    }

    private String obtenerHoraDispositivo() {
        String hora = new SimpleDateFormat("HH:mm:ss").format(new Date());
        return hora;
    }

    private String obtenerFechaDispositivo() {
        String fecha = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        return fecha;
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
