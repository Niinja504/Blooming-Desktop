package Controlador.Admin;

import Modelo.Admin.Usuarios;
import Vista.Paneles_Admin.Panel_Usuarios;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;

public class Ctrl_Usuarios implements MouseListener{
    private Usuarios Modelo;
    private Panel_Usuarios Vista;
    
    public Ctrl_Usuarios(Usuarios modelo, Panel_Usuarios vista){
        this.Modelo = modelo;
        this.Vista = vista;
        
        vista.btn_Agregar.addMouseListener(this);
        modelo.Mostrar(vista.jtb_Usuarios);
        vista.btn_Update.addMouseListener(this);
        vista.jtb_Usuarios.addMouseListener(this);
        vista.Btn_Delete.addMouseListener(this);
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
    if(e.getSource() == Vista.btn_Agregar){
        Modelo.setNombres_User(Vista.txt_Nombre.getText());
        Modelo.setApellidos_User(Vista.txt_Apellido.getText());
        Modelo.setNombre_de_Usuario(Vista.txt_NombreDeUsuario.getText());
        Modelo.setNum_Telefono_User(Vista.txt_Telefono.getText());
        Modelo.setEdad_User(Integer.parseInt(Vista.txt_Edad.getText()));
        Modelo.setEmail_User(Vista.txt_Correo.getText());
        Modelo.setContra_User(Vista.txt_Confirmar_Contra.getText());
        
        String Rol_User = Vista.cb_Rol.getSelectedItem().toString();
        Modelo.setRol_User(Rol_User);
        Modelo.Guardar();
        Modelo.Mostrar(Vista.jtb_Usuarios);
        JOptionPane.showMessageDialog(Vista, "El usuario se ha añadido", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
    }
    
    if(e.getSource() == Vista.Btn_Delete){
        Modelo.Eliminar(Vista.jtb_Usuarios);
        JOptionPane.showMessageDialog(Vista, "El usuario se ha eliminado", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        Modelo.Mostrar(Vista.jtb_Usuarios);
    }
    
    if(e.getSource() == Vista.jtb_Usuarios){
        Modelo.cargarDatosTabla(Vista);
    }
    
    if(e.getSource() == Vista.btn_Update){
        Modelo.setNombres_User(Vista.txt_Nombre.getText());
        Modelo.setApellidos_User(Vista.txt_Apellido.getText());
        Modelo.setNombre_de_Usuario(Vista.txt_NombreDeUsuario.getText());
        Modelo.setNum_Telefono_User(Vista.txt_Telefono.getText());
        Modelo.setEdad_User(Integer.parseInt(Vista.txt_Edad.getText()));
        Modelo.setEmail_User(Vista.txt_Correo.getText());
        Modelo.setContra_User(Vista.txt_Confirmar_Contra.getText());
        String Rol_User = Vista.cb_Rol.getSelectedItem().toString();
        Modelo.setRol_User(Rol_User);     
        Modelo.Actualizar(Vista.jtb_Usuarios);
        Modelo.Mostrar(Vista.jtb_Usuarios);
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


