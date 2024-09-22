package Vista;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;

public class frm_Registro extends javax.swing.JFrame {
    public frm_Registro() {
        initComponents();
    }
    
    public void addPlaceholderStyle(JTextField textField){
        Font font = textField.getFont();
        font = font.deriveFont(Font.ITALIC);
        textField.setFont(font);
        textField.setForeground(Color.gray);
    }
    
    public void removePlaceholderStyle(JTextField textField){
        Font font = textField.getFont();
        font = font.deriveFont(Font.PLAIN);
        textField.setFont(font);
        textField.setForeground(Color.black);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txt_Nombre_Register = new javax.swing.JTextField();
        txt_Apellido_Register = new javax.swing.JTextField();
        txt_NombreDeUsuario_Register = new javax.swing.JTextField();
        txt_Correo_Register = new javax.swing.JTextField();
        txt_Contra = new javax.swing.JTextField();
        txt_Confirmar_Contra = new javax.swing.JTextField();
        txt_Telefono = new javax.swing.JTextField();
        cb_Rol = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/SplashScreen.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 203, 109));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/FrosaGrande.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, -20, 152, 155));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/FnaranjaPequeña.png"))); // NOI18N
        jLabel11.setText("jLabel11");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 250, 100));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/FverdePequeña.png"))); // NOI18N
        jLabel2.setText(" ");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 290, 85));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/FblancaMediana.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 221, 116));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/FrosadoPequeño.png"))); // NOI18N
        jLabel9.setText("jLabel9");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-140, 480, 290, 80));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/FblancaPequeña.png"))); // NOI18N
        jLabel10.setText("jLabel10");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-170, 320, 290, 90));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/FnaranjaMediana.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 261, 145));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/FverdaMasPequeña.png"))); // NOI18N
        jLabel12.setText("jLabel12");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(-210, 190, 290, 60));

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 27)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(253, 149, 160));
        jLabel7.setText("Registrar");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(253, 149, 160));
        jLabel4.setText("una cuenta nueva");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(253, 149, 160));
        jLabel8.setText("¿Ya tienes una cuenta?");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, -1, -1));

        jButton1.setBackground(new java.awt.Color(253, 149, 160));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(253, 255, 255));
        jButton1.setText("Inicia sesión");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 517, -1, 30));

        txt_Nombre_Register.setText("Nombre");
        txt_Nombre_Register.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_Nombre_RegisterFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_Nombre_RegisterFocusLost(evt);
            }
        });
        jPanel1.add(txt_Nombre_Register, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 309, 40));

        txt_Apellido_Register.setText("Apellido");
        txt_Apellido_Register.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_Apellido_RegisterFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_Apellido_RegisterFocusLost(evt);
            }
        });
        jPanel1.add(txt_Apellido_Register, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 309, 40));

        txt_NombreDeUsuario_Register.setText("Usuario");
        txt_NombreDeUsuario_Register.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_NombreDeUsuario_RegisterFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_NombreDeUsuario_RegisterFocusLost(evt);
            }
        });
        jPanel1.add(txt_NombreDeUsuario_Register, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 309, 40));

        txt_Correo_Register.setText("Correo");
        txt_Correo_Register.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_Correo_RegisterFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_Correo_RegisterFocusLost(evt);
            }
        });
        txt_Correo_Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Correo_RegisterActionPerformed(evt);
            }
        });
        jPanel1.add(txt_Correo_Register, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 309, 40));

        txt_Contra.setText("Contraseña");
        txt_Contra.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_ContraFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_ContraFocusLost(evt);
            }
        });
        jPanel1.add(txt_Contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 309, 40));

        txt_Confirmar_Contra.setText("Confirmar contraseña");
        txt_Confirmar_Contra.setName(""); // NOI18N
        txt_Confirmar_Contra.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_Confirmar_ContraFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_Confirmar_ContraFocusLost(evt);
            }
        });
        jPanel1.add(txt_Confirmar_Contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 309, 40));

        txt_Telefono.setText("Telefono");
        txt_Telefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_TelefonoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_TelefonoFocusLost(evt);
            }
        });
        jPanel1.add(txt_Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 309, 40));

        cb_Rol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Empleado", "Cliente" }));
        jPanel1.add(cb_Rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 309, 40));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 0, 460, 564));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/FrosaPequeña.png"))); // NOI18N
        jLabel13.setText("jLabel13");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 490, 250, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_Nombre_RegisterFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_Nombre_RegisterFocusGained
        if(txt_Nombre_Register.getText().equals("Correo")){
            txt_Nombre_Register.setText(null);
            txt_Nombre_Register.requestFocus();

            removePlaceholderStyle(txt_Nombre_Register);
        }
    }//GEN-LAST:event_txt_Nombre_RegisterFocusGained

    private void txt_Nombre_RegisterFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_Nombre_RegisterFocusLost
        if(txt_Nombre_Register.getText().length()==0){
            addPlaceholderStyle(txt_Nombre_Register);
            txt_Nombre_Register.setText("Nombre");
        }
    }//GEN-LAST:event_txt_Nombre_RegisterFocusLost

    private void txt_Apellido_RegisterFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_Apellido_RegisterFocusGained
        if(txt_Apellido_Register.getText().equals("Correo")){
            txt_Apellido_Register.setText(null);
            txt_Apellido_Register.requestFocus();

            removePlaceholderStyle(txt_Apellido_Register);
        }
    }//GEN-LAST:event_txt_Apellido_RegisterFocusGained

    private void txt_Apellido_RegisterFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_Apellido_RegisterFocusLost
        if(txt_Apellido_Register.getText().length()==0){
            addPlaceholderStyle(txt_Apellido_Register);
            txt_Apellido_Register.setText("Apellido");
        }
    }//GEN-LAST:event_txt_Apellido_RegisterFocusLost

    private void txt_NombreDeUsuario_RegisterFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_NombreDeUsuario_RegisterFocusGained
        if(txt_NombreDeUsuario_Register.getText().equals("Correo")){
            txt_NombreDeUsuario_Register.setText(null);
            txt_NombreDeUsuario_Register.requestFocus();

            removePlaceholderStyle(txt_NombreDeUsuario_Register);
        }
    }//GEN-LAST:event_txt_NombreDeUsuario_RegisterFocusGained

    private void txt_NombreDeUsuario_RegisterFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_NombreDeUsuario_RegisterFocusLost
        if(txt_NombreDeUsuario_Register.getText().length()==0){
            addPlaceholderStyle(txt_NombreDeUsuario_Register);
            txt_NombreDeUsuario_Register.setText("Usuario");
        }
    }//GEN-LAST:event_txt_NombreDeUsuario_RegisterFocusLost

    private void txt_Correo_RegisterFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_Correo_RegisterFocusGained
        if(txt_Correo_Register.getText().equals("Correo")){
            txt_Correo_Register.setText(null);
            txt_Correo_Register.requestFocus();

            removePlaceholderStyle(txt_Correo_Register);
        }
    }//GEN-LAST:event_txt_Correo_RegisterFocusGained

    private void txt_Correo_RegisterFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_Correo_RegisterFocusLost
        if(txt_Correo_Register.getText().length()==0){
            addPlaceholderStyle(txt_NombreDeUsuario_Register);
            txt_NombreDeUsuario_Register.setText("Correo");
        }
    }//GEN-LAST:event_txt_Correo_RegisterFocusLost

    private void txt_Correo_RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Correo_RegisterActionPerformed
       
    }//GEN-LAST:event_txt_Correo_RegisterActionPerformed

    private void txt_ContraFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_ContraFocusGained

        if(txt_Contra.getText().equals("Contraseña")){
            txt_Contra.setText(null);
            txt_Contra.requestFocus();

            removePlaceholderStyle(txt_Contra);
        }
    }//GEN-LAST:event_txt_ContraFocusGained

    private void txt_ContraFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_ContraFocusLost
        if(txt_Contra.getText().length()==0){
            addPlaceholderStyle(txt_Contra);
            txt_Contra.setText("Contraseña");
        }
    }//GEN-LAST:event_txt_ContraFocusLost

    private void txt_Confirmar_ContraFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_Confirmar_ContraFocusGained
        if(txt_Confirmar_Contra.getText().equals("Confirmar contraseña")){
            txt_Confirmar_Contra.setText(null);
            txt_Confirmar_Contra.requestFocus();

            removePlaceholderStyle(txt_Confirmar_Contra);
        }
    }//GEN-LAST:event_txt_Confirmar_ContraFocusGained

    private void txt_Confirmar_ContraFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_Confirmar_ContraFocusLost
        if(txt_Confirmar_Contra.getText().length()==0){
            addPlaceholderStyle(txt_Confirmar_Contra);
            txt_Confirmar_Contra.setText("Confirmar contraseña");
        }
    }//GEN-LAST:event_txt_Confirmar_ContraFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_TelefonoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_TelefonoFocusGained
        if(txt_Telefono.getText().equals("Telefono")){
            txt_Telefono.setText(null);
            txt_Telefono.requestFocus();

            removePlaceholderStyle(txt_Telefono);
        }
    }//GEN-LAST:event_txt_TelefonoFocusGained

    private void txt_TelefonoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_TelefonoFocusLost
        if(txt_Telefono.getText().length()==0){
            addPlaceholderStyle(txt_Telefono);
            txt_Telefono.setText("Telefono");
        }
    }//GEN-LAST:event_txt_TelefonoFocusLost

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
            java.util.logging.Logger.getLogger(frm_Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> cb_Rol;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JTextField txt_Apellido_Register;
    public javax.swing.JTextField txt_Confirmar_Contra;
    public javax.swing.JTextField txt_Contra;
    public javax.swing.JTextField txt_Correo_Register;
    public javax.swing.JTextField txt_NombreDeUsuario_Register;
    public javax.swing.JTextField txt_Nombre_Register;
    public javax.swing.JTextField txt_Telefono;
    // End of variables declaration//GEN-END:variables
}
