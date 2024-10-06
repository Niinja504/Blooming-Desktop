package Card.Item;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Shop_Client {
    String uuid;
    String img;
    String nombre;
    Float precio;
    int Cantidad_Bodega;
    String categoriaFlores;
    String categoriaDiseno;
    String categoriaEvento;
    String descripcion;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }
    
    public int getCantidad_Bodega() {
        return Cantidad_Bodega;
    }

    public void setCantidad_Bodega(int Cantidad_Bodega) {
        this.Cantidad_Bodega = Cantidad_Bodega;
    }

    public String getCategoriaFlores() {
        return categoriaFlores;
    }

    public void setCategoriaFlores(String categoriaFlores) {
        this.categoriaFlores = categoriaFlores;
    }

    public String getCategoriaDiseno() {
        return categoriaDiseno;
    }

    public void setCategoriaDiseno(String categoriaDiseno) {
        this.categoriaDiseno = categoriaDiseno;
    }

    public String getCategoriaEvento() {
        return categoriaEvento;
    }

    public void setCategoriaEvento(String categoriaEvento) {
        this.categoriaEvento = categoriaEvento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public Shop_Client(String Item_UUID_Producto, String Item_Img_Producto, String Item_Nombre_Producto, Float Item_Precio_Producto, int Item_Cantidad_Bodega, String Item_Categoria_Flores,
        String Item_Categoria_diseno, String Item_Categoria_Evento, String Item_Descripcion){
        this.uuid = Item_UUID_Producto;
        this.img = Item_Img_Producto;
        this.nombre = Item_Nombre_Producto;
        this.precio = Item_Precio_Producto;
        this.Cantidad_Bodega = Item_Cantidad_Bodega;
        this.categoriaFlores = Item_Categoria_Flores;
        this.categoriaDiseno = Item_Categoria_diseno;
        this.categoriaEvento = Item_Categoria_Evento;
        this.descripcion = Item_Descripcion;
    }
    
    public static List<Shop_Client> obtenerProductos(Connection connection) {
        List<Shop_Client> productos = new ArrayList<>();
        String query = "SELECT * FROM TbInventario";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                Shop_Client producto = new Shop_Client(
                    resultSet.getString("UUID_Producto"),
                    resultSet.getString("Img_Producto"),
                    resultSet.getString("Nombre_Producto"),
                    resultSet.getFloat("Precio_Producto"),
                    resultSet.getInt("Cantidad_Bodega_Productos"),
                    resultSet.getString("Categoria_Flores"),
                    resultSet.getString("Categoria_Diseno"),
                    resultSet.getString("Categoria_Evento"),
                    resultSet.getString("Descripcion_Producto")
                );
                productos.add(producto);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return productos;
    }
}
