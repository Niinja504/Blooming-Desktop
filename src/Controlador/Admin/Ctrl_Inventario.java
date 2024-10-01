package Controlador.Admin;

import Modelo.Inventario;
import Vista.Paneles_Admin.Panel_Inventario;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;


public class Ctrl_Inventario implements MouseListener {
    private Inventario Modelo;
    private Panel_Inventario Vista;
    
    public Ctrl_Inventario(Inventario modelo, Panel_Inventario vista){
        this.Modelo = modelo;
        this.Vista = vista;
        
        vista.btn_Add_Inventory_Admin.addMouseListener(this);
        modelo.Mostrar(vista.jtb_Inventory);
        vista.btn_Update_Inventory_Admin.addMouseListener(this);
        vista.jtb_Inventory.addMouseListener(this);
        vista.Btn_Delete_Inventory_Admin.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == Vista.btn_Add_Inventory_Admin){
         Modelo.setNombre_Producto(Vista.txt_Nombre_Inventory_Admin.getText());
        
         //Con este try catch nos encargamos de convertir lo introducido a entero y decimal
          try {
             float precio = Float.parseFloat(Vista.txt_Precio_Inventory_Admin.getText());
             Modelo.setPrecio_Producto(precio);
             int cantidad = Integer.parseInt(Vista.txt_Cantidad_Inventory_Admin.getText());
             Modelo.setCantidad_Bodega_Productos(cantidad);
          }  catch (NumberFormatException ex) {
             JOptionPane.showMessageDialog(Vista, "Por favor, ingrese un valor numérico válido para precio y cantidad.", "Error de entrada", JOptionPane.ERROR_MESSAGE);
             return;
          }
         
          String Categoria_Flores = Vista.Cb_Categoria_Flores_Inventory_admin.getSelectedItem().toString();
          Modelo.setCategoria_Flores(Categoria_Flores);
          String Categoria_Diseno = Vista.Cb_Categoria_Diseno_Inventory_admin.getSelectedItem().toString();
          Modelo.setCategoria_Diseno(Categoria_Diseno);
          String Categoria_Evento = Vista.Cb_Categoria_Evento_Inventory_admin.getSelectedItem().toString();
          Modelo.setCategoria_Evento(Categoria_Evento);
          Modelo.Guardar();
          Modelo.Mostrar(Vista.jtb_Inventory);
          JOptionPane.showMessageDialog(Vista, "El usuario se ha añadido", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        }
        
        if(e.getSource() == Vista.Btn_Delete_Inventory_Admin){
          Modelo.Eliminar(Vista.jtb_Inventory);
          JOptionPane.showMessageDialog(Vista, "El usuario se ha eliminado", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
          Modelo.Mostrar(Vista.jtb_Inventory);
        }
        
        if(e.getSource() == Vista.jtb_Inventory){
          Modelo.cargarDatosTabla(Vista);
        }
        
        if(e.getSource() == Vista.btn_Update_Inventory_Admin){
        Modelo.setNombre_Producto(Vista.txt_Nombre_Inventory_Admin.getText());
        
         //Con este try catch nos encargamos de convertir lo introducido a entero y decimal
          try {
             float precio = Float.parseFloat(Vista.txt_Precio_Inventory_Admin.getText());
             Modelo.setPrecio_Producto(precio);
             int cantidad = Integer.parseInt(Vista.txt_Cantidad_Inventory_Admin.getText());
             Modelo.setCantidad_Bodega_Productos(cantidad);
          }  catch (NumberFormatException ex) {
             JOptionPane.showMessageDialog(Vista, "Por favor, ingrese un valor numérico válido para precio y cantidad.", "Error de entrada", JOptionPane.ERROR_MESSAGE);
             return;
          }
         
          String Categoria_Flores = Vista.Cb_Categoria_Flores_Inventory_admin.getSelectedItem().toString();
          Modelo.setCategoria_Flores(Categoria_Flores);
          String Categoria_Diseno = Vista.Cb_Categoria_Diseno_Inventory_admin.getSelectedItem().toString();
          Modelo.setCategoria_Diseno(Categoria_Diseno);
          String Categoria_Evento = Vista.Cb_Categoria_Evento_Inventory_admin.getSelectedItem().toString();
          Modelo.setCategoria_Evento(Categoria_Evento);
          Modelo.Actualizar(Vista.jtb_Inventory);
          Modelo.Mostrar(Vista.jtb_Inventory);
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
