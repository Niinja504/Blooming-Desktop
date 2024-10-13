package Controlador;

import Modelo.Password_recovery1;
import Vista.frm_Password_recovery1;
import Vista.frm_Password_recovery2;
import static Vista.frm_SignIn.init_frm_SignIn;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;

public class Ctrl_Password_recovery1 extends MouseAdapter {

    private Password_recovery1 Modelo;
    private frm_Password_recovery1 Vista;
    private boolean codigoEnviado = false;

    public Ctrl_Password_recovery1(Password_recovery1 modelo, frm_Password_recovery1 vista) {
        this.Modelo = modelo;
        this.Vista = vista;
        Vista.btn_EnviarCodigo_Password_Recovery1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (validarCampoVacio()) {
                    enviarCodigo();
                }
            }
        });
    }

    public void enviarCodigo() {
        String correo = Vista.txt_Correo_Password_Recovery1.getText();
        Modelo.setCorreo(correo);

        if (!codigoEnviado && Modelo.correoExisteBD(correo)) {
            Modelo.EnviarCodigo();
            JOptionPane.showMessageDialog(Vista, "Se ha enviado un código de recuperación al correo electrónico proporcionado.", "Éxito", JOptionPane.INFORMATION_MESSAGE);

            frm_Password_recovery2 vistaRecuperacion2 = new frm_Password_recovery2();
            vistaRecuperacion2.setCorreo(correo); 
            vistaRecuperacion2.setCodigo(Modelo.getCodigo());
            
            Vista.dispose();
            
            vistaRecuperacion2.setVisible(true);
            codigoEnviado = true;
        } else if (codigoEnviado) {
            JOptionPane.showMessageDialog(Vista, "Ya se ha enviado un código al correo electrónico proporcionado.", "Información", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(Vista, "El correo electrónico proporcionado no existe en la base de datos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public boolean validarCampoVacio() {
        String correo = Vista.txt_Correo_Password_Recovery1.getText().trim();
        if (correo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo no debe de estar vacio.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }

    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == Vista.Lbl_Recuerda_Contra){
            Vista.dispose();
            init_frm_SignIn();
        }
    }
}
