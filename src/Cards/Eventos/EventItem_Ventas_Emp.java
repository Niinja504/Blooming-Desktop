package Cards.Eventos;

import Card.Item.Sales_Emp;
import Vista.Paneles_Employed.Panel_Ventas_Employed;
import java.awt.Component;

public interface EventItem_Ventas_Emp {
    void itemClick(Component com, Sales_Emp item, Panel_Ventas_Employed panel);
}
