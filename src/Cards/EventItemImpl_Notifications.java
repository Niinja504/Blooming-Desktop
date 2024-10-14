package Cards;

import Card.Item.Notificaciones;
import Cards.Eventos.EventItem_Notifications;
import Vista.Paneles_Admin.Panel_Notificaciones;
import java.awt.Component;

public class EventItemImpl_Notifications implements EventItem_Notifications {
    @Override
    public void itemClick(Component com, Notificaciones item, Panel_Notificaciones panel) {
        System.out.println("Item clicked: " + item.getTitulo());
    }
    
}
