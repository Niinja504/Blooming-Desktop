package Controlador;

import Controlador.Employed.Ctrl_Caja;
import Controlador.Employed.Ctrl_Inventario_Emp;
import Controlador.Employed.Ctrl_PedidosEntregados_Emp;
import Controlador.Employed.Ctrl_Ventas_Emp;
import Vista.Paneles_Employed.Panel_Caja_Employed;
import Vista.Paneles_Employed.Panel_Inventario_Employed;
import Vista.Paneles_Employed.Panel_Pedidos_Entregados_Emp;
import Vista.Paneles_Employed.Panel_Ventas_Employed;
import Vista.frm_Dashboard_Employed;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Ctrl_DashBoard_Employed implements MouseListener {
    frm_Dashboard_Employed Vista;
    Panel_Caja_Employed Panel;
    String UUID;
    
    public Ctrl_DashBoard_Employed(frm_Dashboard_Employed vista, Panel_Caja_Employed panel, String UUID){
        this.Vista = vista;
        this.Panel = panel;
        this.UUID = UUID;
        
        System.out.println("Controlador inicializado.");
        
        Vista.Btn_Caja_DashBoard_Employed.addMouseListener(this);
        Vista.Btn_Compra_DashBoard_Employed.addMouseListener(this);
        Vista.Btn_Inventario_DashBoard_Employed.addMouseListener(this);
        Vista.Btn_Ventas_DashBoard_Employed.addMouseListener(this);
    
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == Vista.Btn_Caja_DashBoard_Employed){
            //1-Creo un objeto del panel que quiero mostrar
            Panel_Caja_Employed objOfertas = new Panel_Caja_Employed(null);
            Ctrl_Caja controladorOfertas = new Ctrl_Caja(objOfertas);
            objOfertas.setControlador(controladorOfertas);
            controladorOfertas.mostrarProductos();
            //2- Limpio el panel contendor (por si acaso)
            Vista.jpContenedor_Employed.removeAll();
            //3- muestro el panel que quiero
            Vista.jpContenedor_Employed.add(objOfertas);
            
            //4- Refrescar todo
            Vista.jpContenedor_Employed.revalidate();
            Vista.jpContenedor_Employed.repaint();
        }
        
        if(e.getSource() == Vista.Btn_Ventas_DashBoard_Employed){
            //1-Creo un objeto del panel que quiero mostrar
            Panel_Ventas_Employed objVentas = new Panel_Ventas_Employed(null);
            Ctrl_Ventas_Emp controladorVentas = new Ctrl_Ventas_Emp(objVentas);
            objVentas.setControlador(controladorVentas);
            controladorVentas.mostrarVentas();
            //2- Limpio el panel contendor (por si acaso)
            Vista.jpContenedor_Employed.removeAll();
            //3- muestro el panel que quiero
            Vista.jpContenedor_Employed.add(objVentas);
            
            //4- Refrescar todo
            Vista.jpContenedor_Employed.revalidate();
            Vista.jpContenedor_Employed.repaint();
        }
        
        if(e.getSource() == Vista.Btn_Inventario_DashBoard_Employed){
            //1-Creo un objeto del panel que quiero mostrar
            Panel_Inventario_Employed objInventario = new Panel_Inventario_Employed(null);
            Ctrl_Inventario_Emp controladorInventario = new Ctrl_Inventario_Emp(objInventario);
            objInventario.setControlador(controladorInventario);
            controladorInventario.mostrarProductos();
            //2- Limpio el panel contendor (por si acaso)
            Vista.jpContenedor_Employed.removeAll();
            //3- muestro el panel que quiero
            Vista.jpContenedor_Employed.add(objInventario);
            
            //4- Refrescar todo
            Vista.jpContenedor_Employed.revalidate();
            Vista.jpContenedor_Employed.repaint();
        }
    }
    
    public void AbrirPanelEntregados(){                                
        Panel_Pedidos_Entregados_Emp objPedidosEn = new Panel_Pedidos_Entregados_Emp(null);
        Ctrl_PedidosEntregados_Emp controladorPedidosEn = new Ctrl_PedidosEntregados_Emp(objPedidosEn);           
        objPedidosEn.setControlador(controladorPedidosEn);
        controladorPedidosEn.mostrarPedidos();
        Vista.jpContenedor_Employed.removeAll();
        Vista.jpContenedor_Employed.add(objPedidosEn);
        Vista.jpContenedor_Employed.revalidate();
        Vista.jpContenedor_Employed.repaint();
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
