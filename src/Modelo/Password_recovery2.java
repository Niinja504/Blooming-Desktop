package Modelo;

import Modelo.Envio_Correo.Envio;
import java.security.SecureRandom;

public class Password_recovery2 {

    private String correo;
    private String codigo;

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void EnviarCodigo() {
    String codigo = RandomCodeGenerator.generateRandomCode();
    setCodigo(codigo);
    String subject = "Código de recuperación de contraseña";
    String content = "Tu código de recuperación es: " + codigo;
    
    System.out.println("Enviando código: " + codigo);
    Envio.enviarCorreo(correo, subject, content);

    System.out.println("Correo enviado a: " + correo);
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
