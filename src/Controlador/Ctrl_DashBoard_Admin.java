
package Controlador;

import Controlador.Admin.Ctrl_Ofertas;
import Controlador.Admin.Ctrl_PedidosPendientes_admin;
import Controlador.Admin.Ctrl_Usuarios;
import Controlador.Admin.Ctrl_Ventas_Admin;
import Controlador.Admin.Ctrl_Inventario;
import Controlador.Admin.Ctrl_Costo_Envio;
import Controlador.Admin.Ctrl_Notificaciones;
import Controlador.Admin.Ctrl_PedidosEntregados_admin;
import Controlador.Admin.Ctrl_Perfil;
import Modelo.ComboBox.Lista_Productos;
import Modelo.Admin.Costo_Envio;
import Modelo.Admin.Inventario;
import Modelo.Admin.Ofertas;
import Modelo.Admin.Perfil;
import Modelo.Admin.Usuarios;
import Modelo.ClaseConexion;
import java.sql.*;
import Vista.Paneles_Admin.Panel_CostoEnvio_Admin;
import Vista.Paneles_Admin.Panel_Inventario;
import Vista.Paneles_Admin.Panel_Notificaciones;
import Vista.Paneles_Admin.Panel_Ofertas;
import Vista.Paneles_Admin.Panel_Pedidos_Entregados;
import Vista.Paneles_Admin.Panel_Pedidos_Pendientes;
import Vista.Paneles_Admin.Panel_Perfil;
import Vista.Paneles_Admin.Panel_Usuarios;
import Vista.Paneles_Admin.Panel_Ventas;
import Vista.frm_Dashboard_Admin;
import static Vista.frm_SignIn.init_frm_SignIn;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Ctrl_DashBoard_Admin implements MouseListener {
    frm_Dashboard_Admin Vista;
    Panel_Usuarios Panel;   
    String UUID;
    
    public Ctrl_DashBoard_Admin(frm_Dashboard_Admin vista, Panel_Usuarios Panel, String UUID){
        this.Vista = vista;
        this.Panel = Panel;
        this.UUID = UUID;
        
        System.out.println("Controlador inicializado.");
        
        Vista.Btn_Usuarios.addMouseListener(this);
        Vista.Btn_Inventario.addMouseListener(this);
        Vista.Btn_CostoEnvio.addMouseListener(this);
        Vista.Btn_Ofertas.addMouseListener(this);
        Vista.Btn_Ventas.addMouseListener(this);
        Vista.Btn_Notificaciones.addMouseListener(this);
        Vista.Btn_Perfil.addMouseListener(this);
        Vista.btn_logout_Dashboard_Admin.addMouseListener(this);
    }
        
    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == Vista.Btn_Usuarios){
            System.out.println("Usuarios");
            //1-Creo un objeto del panel que quiero mostrar
            Panel_Usuarios objUsuarios = new Panel_Usuarios();
            Usuarios modeloUsuarios = new Usuarios();
            Ctrl_Usuarios controladorUsuarios = new Ctrl_Usuarios(modeloUsuarios, objUsuarios);
            
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
            Panel_Inventario objInventario = new Panel_Inventario();
            Inventario modeloInventario = new Inventario();
            Ctrl_Inventario controladorInventario = new Ctrl_Inventario(modeloInventario, objInventario);
            
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
            Costo_Envio modeloCosto = new Costo_Envio();
            Ctrl_Costo_Envio controladorCosto = new Ctrl_Costo_Envio(modeloCosto, objCostoEnvio);
            
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
            Panel_Ofertas objOfertas = new Panel_Ofertas();
            Ofertas modeloOfertas = new Ofertas();
            Lista_Productos modeloProductos = new Lista_Productos();
            Ctrl_Ofertas controladorOfertas = new Ctrl_Ofertas(modeloOfertas, modeloProductos, objOfertas);
            
            
            //2- Limpio el panel contendor (por si acaso)
            Vista.jpContenedor_Admin.removeAll();
            //3- muestro el panel que quiero
            Vista.jpContenedor_Admin.add(objOfertas);
            
            //4- Refrescar todo
            Vista.jpContenedor_Admin.revalidate();
            Vista.jpContenedor_Admin.repaint();
        }
        
        if(e.getSource() == Vista.Btn_Ventas){
            //1-Creo un objeto del panel que quiero mostrar
            Panel_Ventas objVentas = new Panel_Ventas(null);
            Ctrl_Ventas_Admin controladorVentas = new Ctrl_Ventas_Admin(objVentas);
            objVentas.setControlador(controladorVentas);
            controladorVentas.mostrarVentas();
            //2- Limpio el panel contendor (por si acaso)
            Vista.jpContenedor_Admin.removeAll();
            //3- muestro el panel que quiero
            Vista.jpContenedor_Admin.add(objVentas);
            
            //4- Refrescar todo
            Vista.jpContenedor_Admin.revalidate();
            Vista.jpContenedor_Admin.repaint();
        }
        
        if(e.getSource() == Vista.Btn_Notificaciones){
            Panel_Notificaciones objNotificaciones = new Panel_Notificaciones(null);
            Ctrl_Notificaciones controladorNotificaciones = new Ctrl_Notificaciones(objNotificaciones, UUID);
            // Establecer el controlador en el panel
            objNotificaciones.setControlador(controladorNotificaciones);
            controladorNotificaciones.mostrarNotificacion();
            //2- Limpio el panel contendor (por si acaso)
            Vista.jpContenedor_Admin.removeAll();
            //3- muestro el panel que quiero
            Vista.jpContenedor_Admin.add(objNotificaciones);
            
            //4- Refrescar todo
            Vista.jpContenedor_Admin.revalidate();
            Vista.jpContenedor_Admin.repaint();
        }
        
        if(e.getSource() == Vista.Btn_Perfil){
            Perfil modeloPerfil = new Perfil();
            Panel_Perfil objPerfil = new Panel_Perfil(UUID, null);
            Ctrl_Perfil controladorPerfil = new Ctrl_Perfil(modeloPerfil, objPerfil, UUID);

            // Establecer el controlador en el panel
            objPerfil.setControlador(controladorPerfil);
            controladorPerfil.Cargar(UUID);
            //2- Limpio el panel contendor (por si acaso)
            Vista.jpContenedor_Admin.removeAll();
            //3- muestro el panel que quiero
            Vista.jpContenedor_Admin.add(objPerfil);
            
            //4- Refrescar todo
            Vista.jpContenedor_Admin.revalidate();
            Vista.jpContenedor_Admin.repaint();
        }
        
        if(e.getSource() == Vista.btn_logout_Dashboard_Admin){
            Connection connection = ClaseConexion.getConexion();
            cerrarSesion(connection); 
        }
    }
    
    private void cerrarSesion(Connection connection) {
        int resultado = JOptionPane.showConfirmDialog(
                null,
                "¿Estás seguro de que deseas cerrar sesión?",
                "Cerrar sesión",
                JOptionPane.YES_NO_OPTION
        );

        if (resultado == JOptionPane.YES_OPTION) {
            new Thread(() -> {
                PreparedStatement cerrar = null;

                try {
                    String sql = "UPDATE TbUsers SET Sesion_User = ? WHERE UUID_User = ?";
                    cerrar = connection.prepareStatement(sql);
                    int cerrado = 0;

                    cerrar.setInt(1, cerrado);
                    cerrar.setString(2, UUID);
                    cerrar.executeUpdate();
                    
                    Vista.dispose();
                    init_frm_SignIn();

                } catch (SQLException e) {
                    e.printStackTrace();
                } finally {
                    try {
                        if (cerrar != null) {
                            cerrar.close();
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        } else if (resultado == JOptionPane.NO_OPTION) {
            
        }
    }

    public void AbrirPanelPendientes(){
        Panel_Pedidos_Pendientes objPedidosPe = new Panel_Pedidos_Pendientes(null);
        Ctrl_PedidosPendientes_admin controladorPedidosPe = new Ctrl_PedidosPendientes_admin(objPedidosPe);           
        objPedidosPe.setControlador(controladorPedidosPe);
        controladorPedidosPe.mostrarPedidos();
        Vista.jpContenedor_Admin.removeAll();
        Vista.jpContenedor_Admin.add(objPedidosPe);
        Vista.jpContenedor_Admin.revalidate();
        Vista.jpContenedor_Admin.repaint();
    } 
    
    public void AbrirPanelEntregados(){                                
        Panel_Pedidos_Entregados objPedidosEn = new Panel_Pedidos_Entregados(null);
        Ctrl_PedidosEntregados_admin controladorPedidosEn = new Ctrl_PedidosEntregados_admin(objPedidosEn);           
        objPedidosEn.setControlador(controladorPedidosEn);
        controladorPedidosEn.mostrarPedidos();
        Vista.jpContenedor_Admin.removeAll();
        Vista.jpContenedor_Admin.add(objPedidosEn);
        Vista.jpContenedor_Admin.revalidate();
        Vista.jpContenedor_Admin.repaint();
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
