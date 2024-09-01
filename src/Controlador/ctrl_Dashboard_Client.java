package Controlador;

import Vista.frm_Dashboard_Client;
import Vista.panel_Inicio_Cliente;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class ctrl_Dashboard_Client implements MouseListener{
    frm_Dashboard_Client vista;
    
    public ctrl_Dashboard_Client (frm_Dashboard_Client Vista){
        this.vista = Vista;
        vista.btnInicio.addMouseListener(this);
        vista.btnInicio.addMouseListener(this);
        vista.btnOfertas.addMouseListener(this);
        vista.btnPerfil.addMouseListener(this);
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == vista.btnInicio){
            
            panel_Inicio_Cliente objInicioCL = new panel_Inicio_Cliente ();
            
            vista.jp_Inicio_CL.removeAll();
            vista.jp_Inicio_CL.add(objInicioCL);
            
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
