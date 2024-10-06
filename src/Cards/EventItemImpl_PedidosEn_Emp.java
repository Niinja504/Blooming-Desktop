package Cards;

import Card.Item.PedidosEntregados_Emp;
import Cards.Eventos.EventItem_PedidosEntregados_Emp;
import Vista.Paneles_Employed.Panel_Pedidos_Entregados_Emp;
import java.awt.Component;

public class EventItemImpl_PedidosEn_Emp implements EventItem_PedidosEntregados_Emp {
    @Override
    public void itemClick(Component com, PedidosEntregados_Emp item, Panel_Pedidos_Entregados_Emp panel) {
        System.out.println("Item clicked: " + item.getNombreCliente());
        panel.ShowItem(item);
    }
    
}
