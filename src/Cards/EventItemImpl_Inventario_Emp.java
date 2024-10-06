package Cards;

import Card.Item.Inventario_Emp;
import Cards.Eventos.EventItem_Inventario_Emp;
import Vista.Paneles_Employed.Panel_Inventario_Employed;
import java.awt.Component;

public class EventItemImpl_Inventario_Emp implements EventItem_Inventario_Emp {
    @Override
    public void itemClick(Component com, Inventario_Emp item, Panel_Inventario_Employed panel) {
        System.out.println("Item clicked: " + item.getNombre());
        panel.ShowItem(item);
    }
    
}
