package Cards;

import Cards.Eventos.EventItem_CashRegister;
import Modelo.Employed.Caja_Productos;
import Vista.Paneles_Employed.Panel_Caja_Employed;
import java.awt.Component;

public class EventItemImpl_CashRegister_Emp implements EventItem_CashRegister {

    @Override
    public void itemClick(Component com, Caja_Productos item, Panel_Caja_Employed panel) {
        System.out.println("Item clicked: " + item.getNombre());
        panel.ShowItem(item);
    }
    
}
