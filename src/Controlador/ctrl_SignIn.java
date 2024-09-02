package Controlador;

import Vista.frm_SignIn;
import Modelo.SignIn;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

public class ctrl_SignIn {
    
    private frm_SignIn Vista;
    private SignIn Modelo;

    public ctrl_SignIn(frm_SignIn vista) {
        this.Vista = vista;
        this.Modelo = new SignIn(vista);
        Vista.btn_SingIn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                procesarLogin();
            }
        });
    }

    public void procesarLogin() {
        try {
            Modelo.IniciarSesion();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
