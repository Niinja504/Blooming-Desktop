package Cards.Eventos;

import Card.Item.Shop_Client;
import Vista.Paneles_Client.Panel_Tienda_Client;
import java.awt.Component;

public interface EventItem_Productos {
    void itemClick(Component com, Shop_Client item, Panel_Tienda_Client panel);
}
