
package Vista;

import Controlador.Ctrl_Password_recovery1;
import Modelo.Password_recovery1;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialPalenightIJTheme;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class frm_Password_recovery1 extends javax.swing.JFrame {

    private Controlador.Ctrl_Password_recovery1  ctrl;
    
    public frm_Password_recovery1(Ctrl_Password_recovery1 controlador) {
        try {
            // UIManager.setLookAndFeel(new FlatLightLaf()); 
            UIManager.setLookAndFeel(new FlatMaterialPalenightIJTheme());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        this.ctrl = controlador; 
        setIconImage(new ImageIcon(getClass().getResource("/Vista/images/Logo.png")).getImage());
        initComponents();
        addPlaceholderStyle(txt_Correo_Password_Recovery1);
        this.setLocationRelativeTo(null);
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
    
    public void setControlador(Ctrl_Password_recovery1 controlador) {
        this.ctrl = controlador;
    }

    public static void init_frm_Password_recovery1() {
        Password_recovery1 modelo = new Password_recovery1();
        frm_Password_recovery1 vista = new frm_Password_recovery1(null);
        Ctrl_Password_recovery1 controlador = new Ctrl_Password_recovery1(modelo, vista);
        vista.setControlador(controlador);
        vista.setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_EnviarCodigo_Password_Recovery1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_Correo_Password_Recovery1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btn_EnviarCodigo_Password_Recovery1.setText("Enviar código");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Restablecer contraseña");

        txt_Correo_Password_Recovery1.setText("Correo");
        txt_Correo_Password_Recovery1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_Correo_Password_Recovery1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_Correo_Password_Recovery1FocusLost(evt);
            }
        });

        jLabel3.setText("¿Recuerda su contraseña?");

        jLabel2.setText("<html><p>Ingrese su correo con el cual se registró<p>" +
            "<p> para verificar que es realmente usted <p>"
            + "<p> y asi poder enviarle el código de<p> "
            + "<p>verificación<p><html>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_Correo_Password_Recovery1, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                            .addComponent(btn_EnviarCodigo_Password_Recovery1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel3)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(112, 112, 112)
                .addComponent(txt_Correo_Password_Recovery1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(84, 84, 84)
                .addComponent(btn_EnviarCodigo_Password_Recovery1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_Correo_Password_Recovery1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_Correo_Password_Recovery1FocusGained
        if(txt_Correo_Password_Recovery1.getText().equals("Correo")){
            txt_Correo_Password_Recovery1.setText(null);
            txt_Correo_Password_Recovery1.requestFocus();
            
            removePlaceholderStyle(txt_Correo_Password_Recovery1);
        }
    }//GEN-LAST:event_txt_Correo_Password_Recovery1FocusGained

    private void txt_Correo_Password_Recovery1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_Correo_Password_Recovery1FocusLost
       if(txt_Correo_Password_Recovery1.getText().length()==0){
           addPlaceholderStyle(txt_Correo_Password_Recovery1);
           txt_Correo_Password_Recovery1.setText("Correo");
       }
    }//GEN-LAST:event_txt_Correo_Password_Recovery1FocusLost

   
    
     private void btn_EnviarCodigo_Password_Recovery1ActionPerformed(java.awt.event.ActionEvent evt) {                                                                    
        if (ctrl != null) {
        ctrl.enviarCodigo();
       }
    }                                                                   
                                                                                                            

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frm_Password_recovery1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_Password_recovery1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_Password_recovery1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_Password_recovery1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               init_frm_Password_recovery1();
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_EnviarCodigo_Password_Recovery1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JTextField txt_Correo_Password_Recovery1;
    // End of variables declaration//GEN-END:variables
}
