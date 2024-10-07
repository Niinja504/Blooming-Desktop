package Cards;

import Card.Item.PedidosPendientes_Emp;
import Cards.Eventos.EventItem_PedidosPendientes_Emp;
import Vista.Paneles_Employed.Panel_Pedido_Pendientes_Emp;
import java.awt.Component;

public class EventItemImpl_PedidosPe_Emp implements EventItem_PedidosPendientes_Emp {
    @Override
    public void itemClick(Component com, PedidosPendientes_Emp item, Panel_Pedido_Pendientes_Emp panel) {
        System.out.println("Item clicked: " + item.getNombreCliente());
        panel.ShowItem(item);
    }
    
}
