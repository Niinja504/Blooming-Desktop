package Controlador;

import Controlador.ctrl_Password_recovery3;
import Modelo.Password_recovery2;
import Modelo.Password_recovery3;
import Vista.frm_Password_recovery2;
import Vista.frm_Password_recovery3;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ctrl_Password_recovery2 {

    private Password_recovery2 modelo;
    private frm_Password_recovery2 vista;

    public ctrl_Password_recovery2(Password_recovery2 modelo, frm_Password_recovery2 vista) {
        this.modelo = modelo;
        this.vista = vista;

        System.out.println("Controlador inicializado.");

        vista.btn_Reenviar_Code_Password_Recovery2.addActionListener(getReenviarCodigoListener());
        vista.btn_Verificar_Codigo_Password_Recovery2.addActionListener(getVerificarCodigoListener());

        System.out.println("ActionListeners añadidos a los botones.");
    }

    private ActionListener getReenviarCodigoListener() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                enviarCodigo();
            }
        };
    }

    private ActionListener getVerificarCodigoListener() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verificarCodigo();
            }
        };
    }

    private void enviarCodigo() {
        System.out.println("Enviando código...");
        modelo.setCorreo(vista.getCorreo());
        modelo.EnviarCodigo();

        JOptionPane.showMessageDialog(vista, "Se ha enviado un código de recuperación al correo electrónico proporcionado.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    }

    private void verificarCodigo() {
        String codigoIngresado = vista.txt_Code_Password_Recovery2.getText();
        System.out.println("Código ingresado: " + codigoIngresado);
        if (modelo.getCodigo() != null && modelo.getCodigo().equals(codigoIngresado)) {
            System.out.println("Código correcto.");

            frm_Password_recovery3 vistaRecuperacion3 = new frm_Password_recovery3();
            Password_recovery3 modeloRecuperacion3 = new Password_recovery3();

            ctrl_Password_recovery3 controlador3 = new ctrl_Password_recovery3(modeloRecuperacion3, vistaRecuperacion3, modelo.getCorreo());

            vistaRecuperacion3.setVisible(true);
            vista.dispose();
        } else {
            JOptionPane.showMessageDialog(vista, "El código ingresado es incorrecto.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
