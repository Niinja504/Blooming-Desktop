package Controlador;

import Modelo.Register;
import Vista.frm_Register;
import static Vista.frm_SignIn.init_frm_SignIn;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ctrl_Register extends MouseAdapter  {
    private Register Modelo;
    private frm_Register Vista;
    
    public Ctrl_Register(Register modelo, frm_Register vista){
        this.Modelo = modelo;
        this.Vista = vista;
        
        Vista.Btn_CrearCuenta_Register.addMouseListener(this);
        Vista.Lbl_SingIn_Register.addMouseListener(this);
    }
    
     public void mouseClicked(MouseEvent e) {
        if (e.getSource() == Vista.Btn_CrearCuenta_Register) {
           
        }
        
        if (e.getSource() == Vista.Lbl_SingIn_Register){
            Vista.dispose();
            init_frm_SignIn();
        }
    }
}
