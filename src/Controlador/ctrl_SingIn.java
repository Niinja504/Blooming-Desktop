package Controlador;

import Vista.frm_SingIn;
import Modelo.SingIn;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

public class ctrl_SingIn {
    
    private frm_SingIn Vista;
    private SingIn Modelo;

    public ctrl_SingIn(frm_SingIn vista) {
        this.Vista = vista;
        this.Modelo = new SingIn(vista);
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
