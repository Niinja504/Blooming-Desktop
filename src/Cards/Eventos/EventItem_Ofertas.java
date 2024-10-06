package Cards.Eventos;

import Card.Item.Ofertas_Client;
import Vista.Paneles_Client.Panel_Inicio_Client;
import java.awt.Component;

public interface EventItem_Ofertas {
    void itemClick(Component com, Ofertas_Client item, Panel_Inicio_Client panel);
}
