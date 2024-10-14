package Card.Item;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Notificaciones {
    String UUID;
    String UUID_User;
    String Titulo;
    String Mensaje;
    String Tiempo;
    String Fecha;

    public String getUUID() {
        return UUID;
    }

    public void setUUID(String UUID) {
        this.UUID = UUID;
    }

    public String getUUID_User() {
        return UUID_User;
    }

    public void setUUID_User(String UUID_User) {
        this.UUID_User = UUID_User;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getMensaje() {
        return Mensaje;
    }

    public void setMensaje(String Mensaje) {
        this.Mensaje = Mensaje;
    }

    public String getTiempo() {
        return Tiempo;
    }

    public void setTiempo(String Tiempo) {
        this.Tiempo = Tiempo;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }
    
    public Notificaciones(String Item_UUID, String Item_UUID_User, String Item_Titulo, String Item_Mensaje, String Item_Tiempo, String Item_Fecha){
        this.UUID = Item_UUID;
        this.UUID_User = Item_UUID_User;
        this.Titulo = Item_Titulo;
        this.Mensaje = Item_Mensaje;
        this.Tiempo = Item_Tiempo;
        this.Fecha = Item_Fecha;
    } 

    public static List<Notificaciones> obtenerNotificaciones(Connection connection, String UUID_User) {
        List<Notificaciones> notificacionesUser = new ArrayList<>();
        String query = "SELECT * FROM TbNotificaciones WHERE UUID_User = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, UUID_User);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    Notificaciones notificacion = new Notificaciones(
                            resultSet.getString("UUID_Notificacion"),
                            resultSet.getString("UUID_User"),
                            resultSet.getString("Titulo"),
                            resultSet.getString("Mensaje"),
                            resultSet.getString("Tiempo_Envio"),
                            resultSet.getString("Fecha_Envio")
                    );
                    notificacionesUser.add(notificacion);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return notificacionesUser;
    }

}
