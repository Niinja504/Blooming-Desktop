package Cards;

import Cards.Eventos.EventItem_PedidosEntregados;
import Card.Item.PedidosEntregados_Admin;
import Vista.Paneles_Admin.Panel_Pedidos_Entregados;
import java.awt.Component;

public class EventItemImpl_PedidosEn implements EventItem_PedidosEntregados {
    @Override
    public void itemClick(Component com, PedidosEntregados_Admin item, Panel_Pedidos_Entregados panel) {
        System.out.println("Item clicked: " + item.getNombreCliente());
        panel.ShowItem(item);
    }
    
}
