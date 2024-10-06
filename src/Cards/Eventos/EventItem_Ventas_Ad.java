package Cards.Eventos;

import Card.Item.Sales_Admin;
import Vista.Paneles_Admin.Panel_Ventas;
import java.awt.Component;

public interface EventItem_Ventas_Ad {
    void itemClick(Component com, Sales_Admin item, Panel_Ventas panel);
}
