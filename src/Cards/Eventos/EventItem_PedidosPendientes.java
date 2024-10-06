package Cards.Eventos;

import Card.Item.PedidosPendientes_Admin;
import Vista.Paneles_Admin.Panel_Pedidos_Pendientes;
import java.awt.Component;

public interface EventItem_PedidosPendientes {
    void itemClick(Component com, PedidosPendientes_Admin item, Panel_Pedidos_Pendientes panel);
}
