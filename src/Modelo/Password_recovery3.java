package Modelo;

import Modelo.ClaseConexion;
import Modelo.Envio_Correo.Envio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

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

    public void ActualizarPassword() {
        Connection conexion = ClaseConexion.getConexion();
        try {
            
            String uuid = obtenerUUID(correo);
            
            PreparedStatement updateUser = conexion.prepareStatement(
                "UPDATE TbUsers SET Contra_User = ? WHERE Email_User = ?"
            );
            updateUser.setString(1, getContra());
            updateUser.setString(2, getCorreo());
            updateUser.executeUpdate();
            
            PreparedStatement Notificacion = conexion.prepareStatement("INSERT INTO TbNotificaciones (UUID_Notificacion, UUID_User, Titulo, Mensaje, Tiempo_Envio, Fecha_Envio) VALUES (?, ?, ?, ?, ?, ?)");
            String horaDispositivo = obtenerHoraDispositivo();
            String fechaDispositivo = obtenerFechaDispositivo();
            String UUIDNotificacion = UUID.randomUUID().toString();
            String sistemaOperativo = System.getProperty("os.name") + " " + System.getProperty("os.version");
            
            Notificacion.setString(1, UUIDNotificacion);
            Notificacion.setString(2, uuid);
            Notificacion.setString(3, "Cambio de contraseña");
            Notificacion.setString(4, "Se ha modificado la contraseña de su cuenta:\n"
                    + "Sistema operativo:" + sistemaOperativo);
            Notificacion.setString(5, horaDispositivo);
            Notificacion.setString(6, fechaDispositivo);
            Notificacion.executeUpdate();
           
        } catch (Exception e) {
            System.out.println("Error al actualizar la contraseña: " + e);
        }
    }
    
    public void EnviarCorreo() {
        String Mensaje = obtenerInformacionDispositivo();
        String subject = "Cambio de contraseña";

        String content = "<html>"
                + "<body>"
                + "<p>Se ha cambiado su contraseña</p>"
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

        Envio.enviarCorreo(correo, subject, content);
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
