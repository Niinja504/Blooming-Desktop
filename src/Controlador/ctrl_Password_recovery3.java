package Controlador;

import Modelo.Password_recovery3;
import Vista.frm_Password_recovery3;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;

public class Ctrl_Password_recovery3 implements MouseListener {

    private Password_recovery3 modelo;
    private frm_Password_recovery3 vista;
    private String correo;

    public Ctrl_Password_recovery3(Password_recovery3 modelo, frm_Password_recovery3 vista, String correo) {
        this.modelo = modelo;
        this.vista = vista;
        this.correo = correo;

        vista.btn_UpdatePassword.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == vista.btn_UpdatePassword) {
            actualizarPassword();
        }
    }

    private void actualizarPassword() {
        String nuevaContra = new String(vista.txt_New_Password.getPassword());
        String confirmarContra = new String(vista.txt__ConfirmPassword.getPassword());

        if (!nuevaContra.equals(confirmarContra)) {
            JOptionPane.showMessageDialog(vista, "La contraseña no coincide", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String hashContra = Password_recovery3.hashSHA256(nuevaContra);
        modelo.setCorreo(correo);
        modelo.setContra(hashContra);
        modelo.ActualizarPassword();
        JOptionPane.showMessageDialog(vista, "Su contraseña se actualizó con éxito", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        vista.dispose();
    }

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}
}
