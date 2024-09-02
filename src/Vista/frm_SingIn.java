package Vista;

import Controlador.ctrl_SingIn;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;

public class frm_SingIn extends javax.swing.JFrame {
    private ctrl_SingIn controlador;
    public frm_SingIn() {
        initComponents();
        
        addPlaceholderStyle(txt_Correo_SingIn);
        addPlaceholderStyle(txt_Contra_SingIn);
        controlador = new ctrl_SingIn(this);
    }
    
    public void addPlaceholderStyle(JTextField textField){
        Font font = textField.getFont();
        font = font.deriveFont(Font.ITALIC);
        textField.setFont(font);
        textField.setForeground(Color.gray);
    }
    
    public void removePlaceholderStyle(JTextField textField){
        Font font = textField.getFont();
        font = font.deriveFont(Font.PLAIN|Font.BOLD);
        textField.setFont(font);
        textField.setForeground(Color.black);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_Correo_SingIn = new Componentes.TextField();
        txt_Contra_SingIn = new Componentes.TextField();
        btn_SingIn = new Componentes.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_Correo_SingIn.setText("Correo");
        txt_Correo_SingIn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_Correo_SingInFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_Correo_SingInFocusLost(evt);
            }
        });

        txt_Contra_SingIn.setText("Contraseña");
        txt_Contra_SingIn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_Contra_SingInFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_Contra_SingInFocusLost(evt);
            }
        });

        btn_SingIn.setText("Iniciar Sesiòn");
        btn_SingIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SingInActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_Correo_SingIn, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                            .addComponent(txt_Contra_SingIn, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                            .addComponent(btn_SingIn, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE))))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(txt_Correo_SingIn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_Contra_SingIn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97)
                .addComponent(btn_SingIn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_Correo_SingInFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_Correo_SingInFocusGained
        if(txt_Correo_SingIn.getText().equals("Correo")){
            txt_Correo_SingIn.setText(null);
            txt_Correo_SingIn.requestFocus();
            
            removePlaceholderStyle(txt_Correo_SingIn);
        }
    }//GEN-LAST:event_txt_Correo_SingInFocusGained

    private void txt_Contra_SingInFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_Contra_SingInFocusGained
        if(txt_Contra_SingIn.getText().equals("Contraseña")){
            txt_Contra_SingIn.setText(null);
            txt_Contra_SingIn.requestFocus();
            
            removePlaceholderStyle(txt_Contra_SingIn);
        }
    }//GEN-LAST:event_txt_Contra_SingInFocusGained

    private void txt_Correo_SingInFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_Correo_SingInFocusLost
        if(txt_Correo_SingIn.getText().length()==0){
            addPlaceholderStyle(txt_Correo_SingIn);
            txt_Correo_SingIn.setText("Correo");
        }
    }//GEN-LAST:event_txt_Correo_SingInFocusLost

    private void txt_Contra_SingInFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_Contra_SingInFocusLost
         if(txt_Contra_SingIn.getText().length()==0){
            addPlaceholderStyle(txt_Contra_SingIn);
            txt_Contra_SingIn.setText("Contraseña");
        }
    }//GEN-LAST:event_txt_Contra_SingInFocusLost

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        this.requestFocus();
    }//GEN-LAST:event_formWindowGainedFocus

    private void btn_SingInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SingInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_SingInActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_SingIn().setVisible(true);
            }
        });
    }
   
    public String getCorreo() {
        return txt_Correo_SingIn.getText();
    }

    public String getContrasena() {
        return txt_Contra_SingIn.getText();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public Componentes.Button btn_SingIn;
    private javax.swing.JPanel jPanel1;
    public Componentes.TextField txt_Contra_SingIn;
    public Componentes.TextField txt_Correo_SingIn;
    // End of variables declaration//GEN-END:variables
    
    private void addListeners() {
        btn_SingIn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controlador.procesarLogin();
            }
        });
    }
}
