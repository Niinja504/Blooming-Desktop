package Controlador.Admin;

import Modelo.ComboBox.Lista_Productos;
import Modelo.Ofertas;
import Vista.Paneles_Admin.Panel_Ofertas;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;

public class Ctrl_Ofertas implements MouseListener {
    private Ofertas Modelo;
    private Lista_Productos ModeloCom;
    private Panel_Ofertas Vista;
    
    public Ctrl_Ofertas(Ofertas modelo, Lista_Productos modeloCom, Panel_Ofertas vista){
        this.Modelo = modelo;
        this.ModeloCom = modeloCom;
        this.Vista = vista;
        
        vista.btn_Add_Offers_Admin.addMouseListener(this);
        modelo.Mostrar(vista.jtb_Offers_Admin);
        vista.btn_Update_Offers_Admin.addMouseListener(this);
        vista.jtb_Offers_Admin.addMouseListener(this);
        vista.Btn_Delete_Offers_Admin.addMouseListener(this);
        this.ModeloCom.CargarComboProductos(Vista.Cb_Productos_Offers_Admin);
        
        Vista.Cb_Productos_Offers_Admin.addActionListener(e -> {
            if (e.getSource() == Vista.Cb_Productos_Offers_Admin) {
                Lista_Productos selectedItem = (Lista_Productos) Vista.Cb_Productos_Offers_Admin.getSelectedItem();
                if (selectedItem != null) {
                    String UUID = selectedItem.getUUID_Producto();
                    ModeloCom.setUUID_Producto(UUID);
                }
            }
        });
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    if(e.getSource() == Vista.btn_Add_Offers_Admin){
        Modelo.setTitulo(Vista.txt_Titulo_Offers_Admin.getText());
        Modelo.setUUID_Producto(ModeloCom.getUUID_Producto());
        Modelo.setPorcentaje_Oferta(Vista.txt_Porcentaje_Offers_Admin.getText());
        Modelo.setDescripcion_Oferta(Vista.txt_Descrip_Offers_Admin.getText());
        
        Modelo.Guardar();
        Modelo.Mostrar(Vista.jtb_Offers_Admin);
        JOptionPane.showMessageDialog(Vista, "El usuario se ha añadido", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
    }
    
    if(e.getSource() == Vista.Btn_Delete_Offers_Admin){
        Modelo.Eliminar(Vista.jtb_Offers_Admin);
        JOptionPane.showMessageDialog(Vista, "El usuario se ha eliminado", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        Modelo.Mostrar(Vista.jtb_Offers_Admin);
    }
    
    if(e.getSource() == Vista.jtb_Offers_Admin){
        Modelo.cargarDatosTabla(Vista);
    }
    
    if(e.getSource() == Vista.btn_Update_Offers_Admin){
        Modelo.setTitulo(Vista.txt_Titulo_Offers_Admin.getText());
        Modelo.setUUID_Producto(ModeloCom.getUUID_Producto());
        Modelo.setPorcentaje_Oferta(Vista.txt_Porcentaje_Offers_Admin.getText());
        Modelo.setDescripcion_Oferta(Vista.txt_Descrip_Offers_Admin.getText());
        Modelo.Actualizar(Vista.jtb_Offers_Admin);
        Modelo.Mostrar(Vista.jtb_Offers_Admin);
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
