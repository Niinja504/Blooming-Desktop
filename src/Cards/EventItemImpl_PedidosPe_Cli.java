package Cards;

import Cards.Eventos.EventItem_PedidosPendientes_Cli;
import Card.Item.PedidosPendientes_Client;
import Vista.Paneles_Client.Panel_Pedido_Pendiente_Cliente;
import java.awt.Component;

public class EventItemImpl_PedidosPe_Cli implements EventItem_PedidosPendientes_Cli {
    @Override
    public void itemClick(Component com, PedidosPendientes_Client item, Panel_Pedido_Pendiente_Cliente panel) {
        System.out.println("Item clicked: " + item.getNombreCliente());
        panel.ShowItem(item);
    }
    
}
