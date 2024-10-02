package Card.Item;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Ofertas_Client {
    String UUID_Oferta;
    String UUIDProducts;
    String Titulo;
    String Porcentaje;
    String Descripcion;
    String Img_oferta;

    public String getUUID_Oferta() {
        return UUID_Oferta;
    }

    public void setUUID_Oferta(String UUID_Oferta) {
        this.UUID_Oferta = UUID_Oferta;
    }

    public String getUUIDProducts() {
        return UUIDProducts;
    }

    public void setUUIDProducts(String UUIDProducts) {
        this.UUIDProducts = UUIDProducts;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getPorcentaje() {
        return Porcentaje;
    }

    public void setPorcentaje(String Porcentaje) {
        this.Porcentaje = Porcentaje;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getImg_oferta() {
        return Img_oferta;
    }

    public void setImg_oferta(String Img_oferta) {
        this.Img_oferta = Img_oferta;
    }
    
    public Ofertas_Client(String Item_UUID_Oferta, String Item_UUIDProducts, String Item_Titulo, String Item_Porcentaje, String Item_Descripcion, String Item_Img_oferta){
        this.UUID_Oferta = Item_UUID_Oferta;
        this.UUIDProducts = Item_UUIDProducts;
        this.Titulo = Item_Titulo;
        this.Porcentaje = Item_Porcentaje;
        this.Descripcion = Item_Descripcion;
        this.Img_oferta = Item_Img_oferta;
    }
    
    public static List<Ofertas_Client> obtenerOfertas(Connection connection) {
        List<Ofertas_Client> ofertas = new ArrayList<>();
        String query = "SELECT * FROM TbOfertas";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                Ofertas_Client oferta = new Ofertas_Client(
                    resultSet.getString("UUID_Oferta"),
                    resultSet.getString("UUID_Producto"),
                    resultSet.getString("Titulo"),
                    resultSet.getString("Porcentaje_Oferta"),
                    resultSet.getString("Decripcion_Oferta"),
                    resultSet.getString("Img_oferta")
                );
                ofertas.add(oferta);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ofertas;
    }
}
