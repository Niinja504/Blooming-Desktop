package Controlador;

import Vista.frm_SingIn;
import Modelo.SingIn;
import Vista.frm_Password_recovery1;
import Modelo.Password_recovery1;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

public class ctrl_SingIn extends MouseAdapter {
    private frm_SingIn Vista;
    private SingIn Modelo;

    public ctrl_SingIn(frm_SingIn vista) {
        this.Vista = vista;
        this.Modelo = new SingIn(vista);

        Vista.lbl_Recuperar_Contra_SignIn.addMouseListener(this);
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

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == Vista.lbl_Recuperar_Contra_SignIn) {
            Vista.dispose();
            Password_recovery1 modeloRecuperacion = new Password_recovery1();
            frm_Password_recovery1 vistaPasswordRecovery = new frm_Password_recovery1(null);
            ctrl_Password_recovery1 controladorRecuperacion = new ctrl_Password_recovery1(modeloRecuperacion, vistaPasswordRecovery);
            vistaPasswordRecovery.setControlador(controladorRecuperacion);
            vistaPasswordRecovery.setVisible(true);
        }
    }
}
