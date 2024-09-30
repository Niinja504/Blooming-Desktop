package Cards;

import Card.Item.ModelItem;
import Vista.Paneles_Admin.Panel_Pedidos_Admin;
import java.awt.Component;

public class EventItemImpl implements EventItem  {
    @Override
    public void itemClick(Component com, ModelItem item, Panel_Pedidos_Admin panel) {
        System.out.println("Item clicked: " + item.getNombreCliente());
        panel.ShowItem(item);
    }
}
