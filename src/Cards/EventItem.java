package Cards;

import Card.Item.ModelItem;
import Vista.Paneles_Admin.Panel_Pedidos_Admin;
import java.awt.Component;

public interface EventItem {
    void itemClick(Component com, ModelItem item, Panel_Pedidos_Admin panel);
}
