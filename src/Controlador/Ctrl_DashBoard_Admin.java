package Controlador;

import Vista.Paneles_Admin.Panel_CostoEnvio_Admin;
import Vista.Paneles_Admin.Panel_Inventario_Admin;
import Vista.Paneles_Admin.Panel_Ofertas_Admin;
import Vista.Paneles_Admin.Panel_Pedidos_Admin;
import Vista.Paneles_Admin.Panel_Perfil_Admin;
import Vista.Paneles_Admin.Panel_Usuarios_Admin;
import Vista.Paneles_Admin.Panel_Ventas_Admin;
import Vista.frm_Dashboard_Admin;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Ctrl_DashBoard_Admin implements MouseListener {

    frm_Dashboard_Admin Vista;
    Panel_Usuarios_Admin Panel;
    
    public Ctrl_DashBoard_Admin(frm_Dashboard_Admin vista, Panel_Usuarios_Admin Panel){
        this.Vista = vista;
        this.Panel = Panel;
        
        System.out.println("Controlador inicializado.");
        
        Vista.Btn_Usuarios.addMouseListener(this);
        Vista.Btn_Inventario.addMouseListener(this);
        Vista.Btn_CostoEnvio.addMouseListener(this);
        Vista.Btn_Ofertas.addMouseListener(this);
        Vista.Btn_Pedidos.addMouseListener(this);
        Vista.Btn_Ventas.addMouseListener(this);
        Vista.Btn_Perfil.addMouseListener(this);
    }
        
    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == Vista.Btn_Usuarios){
            System.out.println("Usuarios");
            //1-Creo un objeto del panel que quiero mostrar
            Panel_Usuarios_Admin objUsuarios = new Panel_Usuarios_Admin();
            
            //2- Limpio el panel contendor (por si acaso)
            Vista.jpContenedor_Admin.removeAll();
            //3- muestro el panel que quiero
            Vista.jpContenedor_Admin.add(objUsuarios);
            
            //4- Refrescar todo
            Vista.jpContenedor_Admin.revalidate();
            Vista.jpContenedor_Admin.repaint();
        }
        
        if(e.getSource() == Vista.Btn_Inventario){
            //1-Creo un objeto del panel que quiero mostrar
            Panel_Inventario_Admin objInventario = new Panel_Inventario_Admin();
            
            //2- Limpio el panel contendor (por si acaso)
            Vista.jpContenedor_Admin.removeAll();
            //3- muestro el panel que quiero
            Vista.jpContenedor_Admin.add(objInventario);
            
            //4- Refrescar todo
            Vista.jpContenedor_Admin.revalidate();
            Vista.jpContenedor_Admin.repaint();
        }
        
        if(e.getSource() == Vista.Btn_CostoEnvio){
            //1-Creo un objeto del panel que quiero mostrar
            Panel_CostoEnvio_Admin objCostoEnvio = new Panel_CostoEnvio_Admin();
            
            //2- Limpio el panel contendor (por si acaso)
            Vista.jpContenedor_Admin.removeAll();
            //3- muestro el panel que quiero
            Vista.jpContenedor_Admin.add(objCostoEnvio);
            
            //4- Refrescar todo
            Vista.jpContenedor_Admin.revalidate();
            Vista.jpContenedor_Admin.repaint();
        }
        
        if(e.getSource() == Vista.Btn_Ofertas){
            //1-Creo un objeto del panel que quiero mostrar
            Panel_Ofertas_Admin objInventario = new Panel_Ofertas_Admin();
            
            //2- Limpio el panel contendor (por si acaso)
            Vista.jpContenedor_Admin.removeAll();
            //3- muestro el panel que quiero
            Vista.jpContenedor_Admin.add(objInventario);
            
            //4- Refrescar todo
            Vista.jpContenedor_Admin.revalidate();
            Vista.jpContenedor_Admin.repaint();
        }
        
        if(e.getSource() == Vista.Btn_Pedidos){
            //1-Creo un objeto del panel que quiero mostrar
            Panel_Pedidos_Admin objPedidos = new Panel_Pedidos_Admin();
            
            //2- Limpio el panel contendor (por si acaso)
            Vista.jpContenedor_Admin.removeAll();
            //3- muestro el panel que quiero
            Vista.jpContenedor_Admin.add(objPedidos);
            
            //4- Refrescar todo
            Vista.jpContenedor_Admin.revalidate();
            Vista.jpContenedor_Admin.repaint();
        }
        
        if(e.getSource() == Vista.Btn_Ventas){
            //1-Creo un objeto del panel que quiero mostrar
            Panel_Ventas_Admin objVentas = new Panel_Ventas_Admin();
            
            //2- Limpio el panel contendor (por si acaso)
            Vista.jpContenedor_Admin.removeAll();
            //3- muestro el panel que quiero
            Vista.jpContenedor_Admin.add(objVentas);
            
            //4- Refrescar todo
            Vista.jpContenedor_Admin.revalidate();
            Vista.jpContenedor_Admin.repaint();
        }
        
        if(e.getSource() == Vista.Btn_Perfil){
            //1-Creo un objeto del panel que quiero mostrar
            Panel_Perfil_Admin objPerfil = new Panel_Perfil_Admin();
            
            //2- Limpio el panel contendor (por si acaso)
            Vista.jpContenedor_Admin.removeAll();
            //3- muestro el panel que quiero
            Vista.jpContenedor_Admin.add(objPerfil);
            
            //4- Refrescar todo
            Vista.jpContenedor_Admin.revalidate();
            Vista.jpContenedor_Admin.repaint();
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
