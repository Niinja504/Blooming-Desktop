package Cards.Eventos;

import Modelo.Employed.Caja_Productos;
import Vista.Paneles_Employed.Panel_Caja_Employed;
import java.awt.Component;

public interface EventItem_CashRegister {
    void itemClick(Component com, Caja_Productos item, Panel_Caja_Employed panel);
}
