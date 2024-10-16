
package Vista;

import Controlador.Ctrl_SingIn;
import Modelo.SingIn;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialPalenightIJTheme;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class frm_SignIn extends javax.swing.JFrame {

    private Ctrl_SingIn ctrl;
   
    public frm_SignIn(Ctrl_SingIn controlador) {
        try {
            UIManager.setLookAndFeel(new FlatMaterialPalenightIJTheme());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        setIconImage(new ImageIcon(getClass().getResource("/Vista/images/Logo.png")).getImage());
        initComponents();
        this.ctrl = controlador; 
        
        addPlaceholderStyle(txt_Correo_SingIn);
        addPlaceholderStyle(txt_Contra_SingIn);

    }
    
    public void addPlaceholderStyle(JTextField textField){
        Font font = textField.getFont();
        font = font.deriveFont(Font.ITALIC);
        textField.setFont(font);
        textField.setForeground(Color.white);
    }
    
    public void removePlaceholderStyle(JTextField textField){
        Font font = textField.getFont();
        font = font.deriveFont(Font.PLAIN);
        textField.setFont(font);
        textField.setForeground(Color.white);
    }
    
    public void setControlador(Ctrl_SingIn controlador) {
        this.ctrl = controlador;
    }
    
    public static void init_frm_SignIn() {
        frm_SignIn vista = new frm_SignIn(null);
        SingIn modelo = new SingIn(vista);
        Ctrl_SingIn controlador = new Ctrl_SingIn(modelo, vista);
        vista.setControlador(controlador);
        vista.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_Recuperar_Contra_SignIn = new javax.swing.JLabel();
        btn_SingIn = new javax.swing.JButton();
        txt_Correo_SingIn = new javax.swing.JTextField();
        txt_Contra_SingIn = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(253, 149, 160));

        jLabel7.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 27)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Inicia sesión");

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("para continuar");

        lbl_Recuperar_Contra_SignIn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_Recuperar_Contra_SignIn.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Recuperar_Contra_SignIn.setText("¿Olvidaste tu contraseña?");

        btn_SingIn.setBackground(new java.awt.Color(255, 252, 245));
        btn_SingIn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_SingIn.setForeground(new java.awt.Color(253, 149, 160));
        btn_SingIn.setText("Inicia Sesión");
        btn_SingIn.setBorderPainted(false);
        btn_SingIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SingInActionPerformed(evt);
            }
        });

        txt_Correo_SingIn.setForeground(new java.awt.Color(255, 255, 255));
        txt_Correo_SingIn.setText("Correo");
        txt_Correo_SingIn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_Correo_SingInFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_Correo_SingInFocusLost(evt);
            }
        });

        txt_Contra_SingIn.setForeground(new java.awt.Color(255, 255, 255));
        txt_Contra_SingIn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_Contra_SingInFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_Contra_SingInFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel4)))
                .addContainerGap(153, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txt_Contra_SingIn, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                    .addComponent(txt_Correo_SingIn, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbl_Recuperar_Contra_SignIn)
                        .addGap(76, 76, 76))
                    .addComponent(btn_SingIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel7)
                .addGap(9, 9, 9)
                .addComponent(jLabel4)
                .addGap(45, 45, 45)
                .addComponent(txt_Correo_SingIn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(txt_Contra_SingIn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_Recuperar_Contra_SignIn)
                .addGap(26, 26, 26)
                .addComponent(btn_SingIn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/FrosaGrande.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, -20, 152, 155));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/FnaranjaPequeña.png"))); // NOI18N
        jLabel11.setText("jLabel11");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 250, 100));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/FblancaMediana.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 221, 116));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/SplashScreen.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 203, 109));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/FverdePequeña.png"))); // NOI18N
        jLabel2.setText(" ");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 290, 85));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/FverdaMasPequeña.png"))); // NOI18N
        jLabel12.setText("jLabel12");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(-210, 190, 290, 60));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/FblancaPequeña.png"))); // NOI18N
        jLabel10.setText("jLabel10");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-170, 320, 290, 90));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/FrosadoPequeño.png"))); // NOI18N
        jLabel9.setText("jLabel9");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-140, 450, 290, 80));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/FnaranjaMediana.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 261, 145));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/FrosaPequeña.png"))); // NOI18N
        jLabel13.setText("jLabel13");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, 250, 70));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
       this.requestFocus();
    }//GEN-LAST:event_formFocusGained

    private void txt_Correo_SingInFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_Correo_SingInFocusGained
        if(txt_Correo_SingIn.getText().equals("Correo")){
            txt_Correo_SingIn.setText(null);
            txt_Correo_SingIn.requestFocus();

            removePlaceholderStyle(txt_Correo_SingIn);
        }
    }//GEN-LAST:event_txt_Correo_SingInFocusGained

    private void txt_Correo_SingInFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_Correo_SingInFocusLost
        if(txt_Correo_SingIn.getText().length()==0){
            addPlaceholderStyle(txt_Correo_SingIn);
            txt_Correo_SingIn.setText("Correo");
        }
    }//GEN-LAST:event_txt_Correo_SingInFocusLost

    private void txt_Correo_SingInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Correo_SingInActionPerformed
        
    }//GEN-LAST:event_txt_Correo_SingInActionPerformed

    private void txt_Contra_SingInFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_Contra_SingInFocusGained

    }//GEN-LAST:event_txt_Contra_SingInFocusGained

    private void txt_Contra_SingInFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_Contra_SingInFocusLost
        //
    }//GEN-LAST:event_txt_Contra_SingInFocusLost

    private void btn_SingInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SingInActionPerformed
        
    }//GEN-LAST:event_btn_SingInActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                init_frm_SignIn();
            }
        });
    }
    
    public String getCorreo() {
        return txt_Correo_SingIn.getText();
    }

    public String getContrasena() {
        return txt_Contra_SingIn.getText();
    }
    
     private void addListeners() {
        btn_SingIn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ctrl.procesarLogin();
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_SingIn;
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JLabel lbl_Recuperar_Contra_SignIn;
    public javax.swing.JPasswordField txt_Contra_SingIn;
    public javax.swing.JTextField txt_Correo_SingIn;
    // End of variables declaration//GEN-END:variables
}
