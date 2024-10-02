package Cards;

import Card.Item.Ofertas_Client;
import Vista.Paneles_Client.Panel_Inicio_Client;
import java.awt.Component;

public class EventItemImpl_Ofertas_Cli implements EventItem_Ofertas {
    @Override
    public void itemClick(Component com, Ofertas_Client item, Panel_Inicio_Client panel) {
        System.out.println("Item clicked: " + item.getTitulo());
        panel.ShowItem(item);
    }
}
