package Modelo;

import Modelo.ClaseConexion;
import Modelo.Envio_Correo.Envio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.security.SecureRandom;

public class Password_recovery1 {
    private String correo;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    private String codigo;

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void EnviarCodigo() {
        String codigo = RandomCodeGenerator.generateRandomCode();
        String subject = "Código de recuperación de contraseña";
        String content = "Tu código de recuperación es: " + codigo;

        Envio.enviarCorreo(correo, subject, content);
    }

    public boolean correoExisteBD(String correo) {
        String sqlBD1 = "SELECT COUNT(*) AS correo_existe FROM TbUsers WHERE Email_User = ?";
        boolean correoExiste = false;
        Connection conexion = null;
        PreparedStatement statement1 = null;
        ResultSet resultado1 = null;

        try {
            conexion = (Connection) ClaseConexion.getConexion();
            if (conexion != null) {
                statement1 = conexion.prepareStatement(sqlBD1);
                statement1.setString(1, correo);

                resultado1 = statement1.executeQuery();
                if (resultado1.next()) {
                    int count1 = resultado1.getInt("correo_existe");
                    correoExiste = count1 > 0;
                }
            } else {
                System.out.println("No se pudo establecer la conexión a la base de datos.");
            }
        } catch (SQLException ex) {
            System.out.println("Error al ejecutar la consulta SQL: " + ex.getMessage());
        } finally {
            try {
                if (resultado1 != null) {
                    resultado1.close();
                }
                if (statement1 != null) {
                    statement1.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException ex) {
                System.out.println("Error al cerrar la conexión: " + ex.getMessage());
            }
        }

        return correoExiste;
    }

    public static class RandomCodeGenerator {

        private static final String CHARS = "ABCDEFGHJKLMNPQRSTUVWXYZabcdefghjkmnpqrstuvwxyz123456789";
        private static final SecureRandom RANDOM = new SecureRandom();

        public static String generateRandomCode() {
            StringBuilder code = new StringBuilder(6);
            for (int i = 0; i < 6; i++) {
                int index = RANDOM.nextInt(CHARS.length());
                code.append(CHARS.charAt(index));
            }
            return code.toString();
        }
    }
}