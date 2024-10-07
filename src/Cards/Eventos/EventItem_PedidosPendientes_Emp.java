package Cards.Eventos;

import Card.Item.PedidosPendientes_Emp;
import Vista.Paneles_Employed.Panel_Pedido_Pendientes_Emp;
import java.awt.Component;

public interface EventItem_PedidosPendientes_Emp {
    void itemClick(Component com, PedidosPendientes_Emp item, Panel_Pedido_Pendientes_Emp panel);
}
