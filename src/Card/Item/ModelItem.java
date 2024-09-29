package Card.Item;

import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class ModelItem {
    String uuid;
    String uuid_Cliente;
    String FechaVenta;
    String HoraVenta;
    Float SubTotal;
    String Pendiente;
    String UUID_Producto;
    Float PrecioProducto;
    int CantidadProducto;
    String FechaEntrega;
    String HorarioEntrega;
    String NombreCliente;
    String NombreCalle;
    String LugarEntrega;
    String Colonia;
    String Coordenadas;
    String SinMensaje;
    String Dedicatoria;
    String EnvioSinNombre;
    String NombreEmisor;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUuid_Cliente() {
        return uuid_Cliente;
    }

    public void setUuid_Cliente(String uuid_Cliente) {
        this.uuid_Cliente = uuid_Cliente;
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

    public Float getSubTotal() {
        return SubTotal;
    }

    public void setSubTotal(Float SubTotal) {
        this.SubTotal = SubTotal;
    }

    public String getPendiente() {
        return Pendiente;
    }

    public void setPendiente(String Pendiente) {
        this.Pendiente = Pendiente;
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

    public String getFechaEntrega() {
        return FechaEntrega;
    }

    public void setFechaEntrega(String FechaEntrega) {
        this.FechaEntrega = FechaEntrega;
    }

    public String getHorarioEntrega() {
        return HorarioEntrega;
    }

    public void setHorarioEntrega(String HorarioEntrega) {
        this.HorarioEntrega = HorarioEntrega;
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }

    public String getNombreCalle() {
        return NombreCalle;
    }

    public void setNombreCalle(String NombreCalle) {
        this.NombreCalle = NombreCalle;
    }

    public String getLugarEntrega() {
        return LugarEntrega;
    }

    public void setLugarEntrega(String LugarEntrega) {
        this.LugarEntrega = LugarEntrega;
    }

    public String getColonia() {
        return Colonia;
    }

    public void setColonia(String Colonia) {
        this.Colonia = Colonia;
    }

    public String getCoordenadas() {
        return Coordenadas;
    }

    public void setCoordenadas(String Coordenadas) {
        this.Coordenadas = Coordenadas;
    }

    public String getSinMensaje() {
        return SinMensaje;
    }

    public void setSinMensaje(String SinMensaje) {
        this.SinMensaje = SinMensaje;
    }

    public String getDedicatoria() {
        return Dedicatoria;
    }

    public void setDedicatoria(String Dedicatoria) {
        this.Dedicatoria = Dedicatoria;
    }

    public String getEnvioSinNombre() {
        return EnvioSinNombre;
    }

    public void setEnvioSinNombre(String EnvioSinNombre) {
        this.EnvioSinNombre = EnvioSinNombre;
    }

    public String getNombreEmisor() {
        return NombreEmisor;
    }

    public void setNombreEmisor(String NombreEmisor) {
        this.NombreEmisor = NombreEmisor;
    }
    
    
    public ModelItem(String Item_uuid, String Item_uuid_Cliente, String Item_FechaVenta, String Item_HoraVenta, Float Item_SubTotal, String Item_Pendiente, String Item_UUID_Producto, Float Item_PrecioProducto, int Item_CantidadProducto,
    String Item_FechaEntrega, String Item_HorarioEntrega, String Item_NombreCliente, String Item_NombreCalle, String Item_LugarEntrega, String Item_Colonia, String Item_Coordenadas, String Item_SinMensaje, String Item_Dedicatoria, String Item_EnvioSinNombre,
    String Item_NombreEmisor){
        this.uuid = Item_uuid;
        this.SubTotal = Item_SubTotal;
        this.FechaEntrega = Item_FechaEntrega;
        this.HorarioEntrega = Item_HorarioEntrega;
        this.NombreCliente = Item_NombreCliente;
        this.Colonia = Item_Colonia;
        this.NombreCalle = Item_NombreCalle;
    }
    
    public boolean isPendiente() {
        return "Si".equalsIgnoreCase(Pendiente);
    }
    
    public static List<ModelItem> obtenerPedidosPendientes(Connection connection) {
        List<ModelItem> pedidosPendientes = new ArrayList<>();
        String query = "SELECT " +
                "p.UUID_Pedido AS uuid, " +
                "p.UUID_Cliente AS uuid_Cliente, " +
                "p.Fecha_Venta AS FechaVenta, " +
                "p.Hora_Venta AS HoraVenta, " +
                "p.Subtotal AS SubTotal, " +
                "p.Pedido_Pendiente AS Pendiente, " +
                "pr.UUID_Producto AS UUID_Producto, " +
                "pr.Precio_Producto AS PrecioProducto, " +
                "pr.Cantidad_Producto AS CantidadProducto, " +
                "h.Fecha AS FechaEntrega, " +
                "h.Horario AS HorarioEntrega, " +
                "d.Nombre_Cliente AS NombreCliente, " +
                "d.Nombre_Calle AS NombreCalle, " +
                "d.Lugar_Entrega AS LugarEntrega, " +
                "d.Colonia AS Colonia, " +
                "d.Coordenadas_Google AS Coordenadas, " +
                "de.Sin_Mensaje AS SinMensaje, " +
                "de.Dedicatoria AS Dedicatoria, " +
                "de.Envio_Sin_Nombre AS EnvioSinNombre, " +
                "de.Nombre_Emisor AS NombreEmisor " +
                "FROM TbPedido_Cliente p " +
                "LEFT JOIN TbProductosPedido pr ON p.UUID_Pedido = pr.UUID_Pedido " +
                "LEFT JOIN TbHorarioPedido h ON p.UUID_Pedido = h.UUID_Pedido " +
                "LEFT JOIN TbDireccionPedido d ON p.UUID_Pedido = d.UUID_Pedido " +
                "LEFT JOIN TbDedicatorias de ON p.UUID_Pedido = de.UUID_Pedido " +
                "WHERE p.Pedido_Pendiente = 'Si'";

        try (PreparedStatement preparedStatement = connection.prepareStatement(query);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                ModelItem pedido = new ModelItem(
                    resultSet.getString("uuid"),
                    resultSet.getString("uuid_Cliente"),
                    resultSet.getString("FechaVenta"),
                    resultSet.getString("HoraVenta"),
                    resultSet.getFloat("SubTotal"),
                    resultSet.getString("Pendiente"),
                    resultSet.getString("UUID_Producto"),
                    resultSet.getFloat("PrecioProducto"),
                    resultSet.getInt("CantidadProducto"),
                    resultSet.getString("FechaEntrega"),
                    resultSet.getString("HorarioEntrega"),
                    resultSet.getString("NombreCliente"),
                    resultSet.getString("NombreCalle"),
                    resultSet.getString("LugarEntrega"),
                    resultSet.getString("Colonia"),
                    resultSet.getString("Coordenadas"),
                    resultSet.getString("SinMensaje"),
                    resultSet.getString("Dedicatoria"),
                    resultSet.getString("EnvioSinNombre"),
                    resultSet.getString("NombreEmisor")
                );
                pedidosPendientes.add(pedido);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return pedidosPendientes;
    }
}
