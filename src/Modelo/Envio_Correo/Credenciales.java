package Modelo.Envio_Correo;


public class Credenciales {
    
    private String UUID_usuario;
    private String Correo;
    private String Clave;

    public String getUUID_usuario() {
        return UUID_usuario;
    }

    public void setUUID_usuario(String UUID_usuario) {
        this.UUID_usuario = UUID_usuario;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }
}
