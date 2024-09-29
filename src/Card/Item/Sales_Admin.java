package Card.Item;

import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Sales_Admin {
    String uuid;
    String uuid_Empleado;
    String FechaVenta;
    String HoraVenta;
    String NombreCliente;
    Float TotalVenta;
    String UUID_Producto;
    Float PrecioProducto;
    int CantidadProducto;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUuid_Empleado() {
        return uuid_Empleado;
    }

    public void setUuid_Empleado(String uuid_Empleado) {
        this.uuid_Empleado = uuid_Empleado;
    }

    public String getFechaVenta() {
        return FechaVenta;
    }

    public void setFechaVenta(String FechaVenta) {
        this.FechaVenta = FechaVenta;
    }

    public String getHoraVenta() {
        return HoraVenta;
    }

    public void setHoraVenta(String HoraVenta) {
        this.HoraVenta = HoraVenta;
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }
    
    public Float getTotalVenta() {
        return TotalVenta;
    }

    public void setTotalVenta(Float TotalVenta) {
        this.TotalVenta = TotalVenta;
    }

    public String getUUID_Producto() {
        return UUID_Producto;
    }

    public void setUUID_Producto(String UUID_Producto) {
        this.UUID_Producto = UUID_Producto;
    }

    public Float getPrecioProducto() {
        return PrecioProducto;
    }

    public void setPrecioProducto(Float PrecioProducto) {
        this.PrecioProducto = PrecioProducto;
    }

    public int getCantidadProducto() {
        return CantidadProducto;
    }

    public void setCantidadProducto(int CantidadProducto) {
        this.CantidadProducto = CantidadProducto;
    }
    
    public Sales_Admin(String Item_uuid, String Item_uuid_Empleado, String Item_FechaVenta, String Item_HoraVenta, String Item_NombreCliente,
           Float Item_TotalVenta, String Item_UUID_Producto, Float Item_PrecioProducto, int Item_CantidadProducto){
        this.uuid = Item_uuid;
        this.uuid_Empleado = Item_uuid_Empleado;
        this.FechaVenta = Item_FechaVenta;
        this.HoraVenta = Item_HoraVenta;
        this.NombreCliente = Item_NombreCliente;
        this.TotalVenta = Item_TotalVenta;
        this.UUID_Producto = Item_UUID_Producto;
        this.PrecioProducto = Item_PrecioProducto;
        this.CantidadProducto = Item_CantidadProducto;
    }
    
    public static List<Sales_Admin> obtenerVentas(Connection connection) {
        List<Sales_Admin> Ventas = new ArrayList<>();
        String query = "SELECT " +
                "e.UUID_Venta AS uuid, " +
                "e.UUID_Empleado AS uuid_Empleado, " +
                "e.Fecha_Venta AS FechaVenta, " +
                "e.Hora_Venta AS HoraVenta, " +
                "e.Nombre_Cliente AS NombreCliente, " +
                "e.Total_Venta AS TotalVenta, " +
                "a.UUID_Producto AS UUID_Producto, " +
                "a.Precio_Producto AS PrecioProducto, " +
                "a.Cantidad_Producto AS CantidadProducto " +
                "FROM TbVentaEncaja e " + 
                "LEFT JOIN TbVentaArticulos a ON e.UUID_Venta = a.UUID_Venta " + 
                "ORDER BY e.Fecha_Venta DESC, e.Hora_Venta DESC";

        try (PreparedStatement preparedStatement = connection.prepareStatement(query);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                Sales_Admin venta = new Sales_Admin(
                    resultSet.getString("uuid"),
                    resultSet.getString("uuid_Empleado"),
                    resultSet.getString("FechaVenta"),
                    resultSet.getString("HoraVenta"),
                    resultSet.getString("NombreCliente"),
                    resultSet.getFloat("TotalVenta"),
                    resultSet.getString("UUID_Producto"),
                    resultSet.getFloat("PrecioProducto"),
                    resultSet.getInt("CantidadProducto")
                );
                Ventas.add(venta);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return Ventas;
    }
}
