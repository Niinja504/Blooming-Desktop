package Controlador;

import Controlador.Client.Ctrl_Ofertas_Client;
import Vista.Paneles_Client.Panel_Inicio_Client;
import Vista.frm_Dashboard_Client;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class Ctrl_Dashboard_Client implements MouseListener{
    frm_Dashboard_Client Vista;
    Panel_Inicio_Client Panel; 
    public Ctrl_Dashboard_Client(frm_Dashboard_Client vista, Panel_Inicio_Client panel){
        this.Vista = Vista;
        this.Panel = Panel;
        
        System.out.println("Controlador inicializado.");
//        
//        Vista.Btn_Inicio_DashBoard_Client.addMouseListener(this);
//        Vista.Btn_Tienda_DashBoard_Client.addMouseListener(this);
//        Vista.Btn_Compra_DashBoard_Client.addMouseListener(this);
//        Vista.Btn_Perfil_DashBoard_Client.addMouseListener(this);
    
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == Vista.Btn_Inicio_DashBoard_Client){
            //1-Creo un objeto del panel que quiero mostrar
            Panel_Inicio_Client objOfertas = new Panel_Inicio_Client(null);
            Ctrl_Ofertas_Client controladorOfertas = new Ctrl_Ofertas_Client(objOfertas);
            objOfertas.setControlador(controladorOfertas);
            controladorOfertas.mostrarOfertas();
            //2- Limpio el panel contendor (por si acaso)
            Vista.jpContenedor_Client.removeAll();
            //3- muestro el panel que quiero
            Vista.jpContenedor_Client.add(objOfertas);
            
            //4- Refrescar todo
            Vista.jpContenedor_Client.revalidate();
            Vista.jpContenedor_Client.repaint();
        }
    }
    
    public void AbrirPanelPendientes(){
//        Panel_Pedido_Pendiente_Cliente objPedidosPe = new Panel_Pedido_Pendiente_Cliente (null);
//        Ctrl_PedidosPendientes_client controladorPedidosPe = new Ctrl_PedidosPendientes_client(objPedidosPe);           
//        objPedidosPe.setControlador(controladorPedidosPe);
//        controladorPedidosPe.mostrarPedidos();
//        Vista.jpContenedor_Client.removeAll();
//        Vista.jpContenedor_Client.add(objPedidosPe);
//        Vista.jpContenedor_Client.revalidate();
//        Vista.jpContenedor_Client.repaint();
    }
    
    public void AbrirPanelEntregados(){
//        Panel_Pedidos_Entregados_Cliente objPedidosEn = new Panel_Pedidos_Entregados_Cliente(null);
//        Ctrl_PedidosEntregados_client controladorPedidosEn = new Ctrl_PedidosEntregados_client(objPedidosEn);           
//        objPedidosEn.setControlador(controladorPedidosEn);
//        controladorPedidosEn.mostrarPedidos();
//        Vista.jpContenedor_Client.removeAll();
//        Vista.jpContenedor_Client.add(objPedidosEn);
//        Vista.jpContenedor_Client.revalidate();
//        Vista.jpContenedor_Client.repaint();
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