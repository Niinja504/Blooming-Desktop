package Cards;

import Cards.Eventos.EventItem_Productos;
import Card.Item.Shop_Client;
import Vista.Paneles_Client.Panel_Tienda_Client;
import java.awt.Component;

public class EventItemImpl_Productos_Cli implements EventItem_Productos {
    @Override
    public void itemClick(Component com, Shop_Client item, Panel_Tienda_Client panel) {
        System.out.println("Item clicked: " + item.getNombre());
        panel.ShowItem(item);
    }
    
}
