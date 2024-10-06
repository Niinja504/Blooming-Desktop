package Cards.Eventos;

import Card.Item.PedidosPendientes_Client;
import Vista.Paneles_Client.Panel_Pedido_Pendiente_Cliente;
import java.awt.Component;

public interface EventItem_PedidosPendientes_Cli {
    void itemClick(Component com, PedidosPendientes_Client item, Panel_Pedido_Pendiente_Cliente panel);
}
