package Cards;

import Card.Item.PedidosPendientes_Admin;
import Vista.Paneles_Admin.Panel_Pedidos_Pendientes;
import java.awt.Component;

public class EventItemImpl_PedidosPe implements EventItem_PedidosPendientes  {
    @Override
    public void itemClick(Component com, PedidosPendientes_Admin item, Panel_Pedidos_Pendientes panel) {
        System.out.println("Item clicked: " + item.getNombreCliente());
        panel.ShowItem(item);
    }
}
