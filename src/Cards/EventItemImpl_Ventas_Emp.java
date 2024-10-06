package Cards;

import Card.Item.Sales_Emp;
import Cards.Eventos.EventItem_Ventas_Emp;
import Vista.Paneles_Employed.Panel_Ventas_Employed;
import java.awt.Component;

public class EventItemImpl_Ventas_Emp implements EventItem_Ventas_Emp {
    @Override
    public void itemClick(Component com, Sales_Emp item, Panel_Ventas_Employed panel) {
        System.out.println("Item clicked: " + item.getNombreCliente());
        panel.ShowItem(item);
    }
    
}
