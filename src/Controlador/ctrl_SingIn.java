package Controlador;

import Vista.frm_SignIn;
import Modelo.SingIn;
import Vista.frm_Password_recovery1;
import Modelo.Password_recovery1;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Ctrl_SingIn extends MouseAdapter {
    private frm_SignIn Vista;
    private SingIn Modelo;

    public Ctrl_SingIn(SingIn modelo, frm_SignIn vista) {
        this.Vista = vista;
        this.Modelo = new SingIn(vista);

        Vista.lbl_Recuperar_Contra_SignIn.addMouseListener(this);
        Vista.btn_SingIn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (validarCamposVacios()) {
                    procesarLogin();
                }
            }
        });
    }
    
    public boolean validarCamposVacios() {
        String correo = Vista.txt_Correo_SingIn.getText().trim();
        String contraseña = new String(Vista.txt_Contra_SingIn.getPassword()).trim();
        
        if (correo.isEmpty() || contraseña.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Los campos de correo y contraseña no deben estar vacíos.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
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
            Ctrl_Password_recovery1 controladorRecuperacion = new Ctrl_Password_recovery1(modeloRecuperacion, vistaPasswordRecovery);
            vistaPasswordRecovery.setControlador(controladorRecuperacion);
            vistaPasswordRecovery.setVisible(true);
        }
    }
}
