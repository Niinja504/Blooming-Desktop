
package Controlador;

import Vista.Paneles_Client.Panel_Pedidos_Entregados_Cliente;
import Vista.Paneles_Client.Panel_Pedido_Pendiente_Cliente;
import Vista.Paneles_Client.Panel_Pedidos_Client;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class Ctrl_Pedidos_Client implements MouseListener{
    Panel_Pedidos_Client vista;
    
    public Ctrl_Pedidos_Client(Panel_Pedidos_Client Vista){
        this.vista = Vista;
        
        vista.btn_Pedidos_Pendientes_Client.addMouseListener(this);
        vista.btn_Pedidos_Entregados_Client.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == vista.btn_Pedidos_Pendientes_Client){
            Panel_Pedido_Pendiente_Cliente objPanelPedidosCL = new Panel_Pedido_Pendiente_Cliente();
            
            vista.jp_Pedidos_Client.removeAll();
            vista.jp_Pedidos_Client.add(objPanelPedidosCL);
            
            vista.jp_Pedidos_Client.revalidate();
            vista.jp_Pedidos_Client.repaint();


        }
        
        if(e.getSource() == vista.btn_Pedidos_Entregados_Client){
            Panel_Pedidos_Entregados_Cliente objPanelPedidosCL = new Panel_Pedidos_Entregados_Cliente();
            
            vista.jp_Pedidos_Client.removeAll();
            vista.jp_Pedidos_Client.add(objPanelPedidosCL);
            
            vista.jp_Pedidos_Client.revalidate();
            vista.jp_Pedidos_Client.repaint();

        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    
}
