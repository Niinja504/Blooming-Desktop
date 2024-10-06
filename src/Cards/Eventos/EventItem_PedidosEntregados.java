package Cards.Eventos;

import Card.Item.PedidosEntregados_Admin;
import Vista.Paneles_Admin.Panel_Pedidos_Entregados;
import java.awt.Component;

public interface EventItem_PedidosEntregados {
    void itemClick(Component com, PedidosEntregados_Admin item, Panel_Pedidos_Entregados panel);
}
