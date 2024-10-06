package Cards.Eventos;

import Card.Item.PedidosEntregados_Emp;
import Vista.Paneles_Employed.Panel_Pedidos_Entregados_Emp;
import java.awt.Component;

public interface EventItem_PedidosEntregados_Emp {
    void itemClick(Component com, PedidosEntregados_Emp item, Panel_Pedidos_Entregados_Emp panel);
}
