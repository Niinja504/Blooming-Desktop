package Vista;

import Controlador.ctrl_SignIn;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;

public class frm_SignIn extends javax.swing.JFrame {
    private ctrl_SignIn controlador;
    public frm_SignIn() {
        initComponents();
        
        addPlaceholderStyle(txt_Correo_SingIn);
        addPlaceholderStyle(txt_Contra_SingIn);
        controlador = new ctrl_SignIn(this);
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

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txt_Correo_SingIn = new Componentes.TextField();
        txt_Contra_SingIn = new Componentes.TextField();
        btn_SingIn = new Componentes.Button();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/SplashScreen.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/Colorful Modern Flowered Logo.png"))); // NOI18N
        jLabel3.setText("jLabel3");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/Colorful Modern Flowered Logo (1).png"))); // NOI18N
        jLabel2.setText(" ");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/Colorful Modern Flowered Logo (3).png"))); // NOI18N
        jLabel5.setText("jLabel5");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/Colorful Modern Flowered Logo (4).png"))); // NOI18N
        jLabel6.setText("jLabel6");

        jPanel1.setBackground(new java.awt.Color(253, 149, 160));
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
        txt_Correo_SingIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Correo_SingInActionPerformed(evt);
            }
        });
        jPanel1.add(txt_Correo_SingIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 326, 50));

        txt_Contra_SingIn.setText("Contraseña");
        txt_Contra_SingIn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_Contra_SingInFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_Contra_SingInFocusLost(evt);
            }
        });
        jPanel1.add(txt_Contra_SingIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 326, 50));

        btn_SingIn.setText("Iniciar Sesiòn");
        btn_SingIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SingInActionPerformed(evt);
            }
        });
        jPanel1.add(btn_SingIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 326, 50));

        jLabel7.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 27)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Inicia sesión");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, -1));

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("para continuar");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("¿No tienes una cuenta?");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 252, 245));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(253, 149, 160));
        jButton1.setText("Registrate");
        jButton1.setBorderPainted(false);
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 490, -1, -1));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(22, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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

    private void txt_Correo_SingInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Correo_SingInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Correo_SingInActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_SignIn().setVisible(true);
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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
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
