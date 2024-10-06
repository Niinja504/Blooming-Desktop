package Cards;

import Card.Item.Sales_Admin;
import Cards.Eventos.EventItem_Ventas_Ad;
import Vista.Paneles_Admin.Panel_Ventas;
import java.awt.Component;

public class EventItemImpl_Ventas implements EventItem_Ventas_Ad {
    @Override
    public void itemClick(Component com, Sales_Admin item, Panel_Ventas panel) {
        System.out.println("Item clicked: " + item.getNombreCliente());
        panel.ShowItem(item);
    }
}
