package Controlador;

import Vista.Panel_Inicio_Client;
import Vista.Panel_Ofertas_Client;
import Vista.Panel_Pedidos_Client;
import Vista.Panel_Perfil_Client;
import Vista.Panel_Tienda_Client;
import Vista.frm_Dashboard_Client;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class ctrl_Dashboard_Client implements MouseListener{
    frm_Dashboard_Client vista;
    
    public ctrl_Dashboard_Client(frm_Dashboard_Client Vista){
        this.vista = Vista;
        
    vista.btnInicio.addMouseListener(this);
    vista.btnTienda.addMouseListener(this);
    vista.btnPedidos.addMouseListener(this);
    vista.btnOfertas.addMouseListener(this);
    vista.btnPerfil.addMouseListener(this);
    
}

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == vista.btnInicio){
            Panel_Inicio_Client objPanelInicioCL = new Panel_Inicio_Client();
            
            vista.jp_Inicio_CL.removeAll();
            vista.jp_Inicio_CL.add(objPanelInicioCL);
            
            vista.jp_Inicio_CL.revalidate();
            vista.jp_Inicio_CL.repaint();

        }
        
        if(e.getSource() == vista.btnTienda){
            Panel_Tienda_Client objPanelTiendaCL = new Panel_Tienda_Client();
            
            vista.jp_Inicio_CL.removeAll();
            vista.jp_Inicio_CL.add(objPanelTiendaCL);
            
            vista.jp_Inicio_CL.revalidate();
            vista.jp_Inicio_CL.repaint();
            
        }
        
         if(e.getSource() == vista.btnPedidos){
            Panel_Pedidos_Client objPanelPedidosCL = new Panel_Pedidos_Client();
            
            vista.jp_Inicio_CL.removeAll();
            vista.jp_Inicio_CL.add(objPanelPedidosCL);
            
            vista.jp_Inicio_CL.revalidate();
            vista.jp_Inicio_CL.repaint();
            
        }
         
        if(e.getSource() == vista.btnOfertas){
            Panel_Ofertas_Client objPanelOfertasCL = new Panel_Ofertas_Client();
            
            vista.jp_Inicio_CL.removeAll();
            vista.jp_Inicio_CL.add(objPanelOfertasCL);
            
            vista.jp_Inicio_CL.revalidate();
            vista.jp_Inicio_CL.repaint();
            
        }
        
        if(e.getSource() == vista.btnPerfil){
            Panel_Perfil_Client objPanelPerfilCL = new Panel_Perfil_Client();
            
            vista.jp_Inicio_CL.removeAll();
            vista.jp_Inicio_CL.add(objPanelPerfilCL);
            
            vista.jp_Inicio_CL.revalidate();
            vista.jp_Inicio_CL.repaint();
            
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