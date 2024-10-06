package Cards.Eventos;

import Card.Item.Inventario_Emp;
import Vista.Paneles_Employed.Panel_Inventario_Employed;
import java.awt.Component;

public interface EventItem_Inventario_Emp {
    void itemClick(Component com, Inventario_Emp item, Panel_Inventario_Employed panel);
}
