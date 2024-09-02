/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.ctrl_Dashboard_Client;


/**
 *
 * @author vladk
 */
public class frm_Dashboard_Client extends javax.swing.JFrame {

    /**
     * Creates new form frm_Dashboard_Client
     */
    public frm_Dashboard_Client() {
        initComponents();
    }

 
public static void initfrm_Dashboard_Client(){
    frm_Dashboard_Client vista = new frm_Dashboard_Client();
    ctrl_Dashboard_Client controlador = new ctrl_Dashboard_Client(vista);
    
    vista.setVisible(true);
    
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnInicio = new javax.swing.JButton();
        btnPedidos = new javax.swing.JButton();
        btnOfertas = new javax.swing.JButton();
        btnPerfil = new javax.swing.JButton();
        btnTienda = new javax.swing.JButton();
        jp_Inicio_CL = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 252, 245));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/SplashScreen.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel3.setBackground(new java.awt.Color(224, 224, 224));
        jPanel3.setForeground(new java.awt.Color(0, 51, 153));
        jPanel3.setAutoscrolls(true);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Ajustes");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 760, 260, 40));

        btnInicio.setBackground(new java.awt.Color(224, 224, 224));
        btnInicio.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        btnInicio.setText("Inicio");
        btnInicio.setBorderPainted(false);
        btnInicio.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                btnInicioMouseDragged(evt);
            }
        });
        btnInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInicioMouseClicked(evt);
            }
        });
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        jPanel3.add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 80, -1));

        btnPedidos.setBackground(new java.awt.Color(224, 224, 224));
        btnPedidos.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        btnPedidos.setText("Pedidos");
        btnPedidos.setBorderPainted(false);
        btnPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidosActionPerformed(evt);
            }
        });
        jPanel3.add(btnPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        btnOfertas.setBackground(new java.awt.Color(224, 224, 224));
        btnOfertas.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        btnOfertas.setText("Ofertas");
        btnOfertas.setBorderPainted(false);
        btnOfertas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOfertasActionPerformed(evt);
            }
        });
        jPanel3.add(btnOfertas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        btnPerfil.setBackground(new java.awt.Color(224, 224, 224));
        btnPerfil.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        btnPerfil.setText("Perfil");
        btnPerfil.setBorderPainted(false);
        jPanel3.add(btnPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        btnTienda.setBackground(new java.awt.Color(224, 224, 224));
        btnTienda.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        btnTienda.setText("Tienda");
        btnTienda.setBorderPainted(false);
        btnTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTiendaActionPerformed(evt);
            }
        });
        jPanel3.add(btnTienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 80, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 870));

        jp_Inicio_CL.setBackground(new java.awt.Color(255, 252, 245));

        javax.swing.GroupLayout jp_Inicio_CLLayout = new javax.swing.GroupLayout(jp_Inicio_CL);
        jp_Inicio_CL.setLayout(jp_Inicio_CLLayout);
        jp_Inicio_CLLayout.setHorizontalGroup(
            jp_Inicio_CLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 830, Short.MAX_VALUE)
        );
        jp_Inicio_CLLayout.setVerticalGroup(
            jp_Inicio_CLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 870, Short.MAX_VALUE)
        );

        jPanel1.add(jp_Inicio_CL, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 830, 870));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnOfertasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOfertasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOfertasActionPerformed

    private void btnPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPedidosActionPerformed

    private void btnTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTiendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTiendaActionPerformed

    private void btnInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInicioMouseClicked

    private void btnInicioMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInicioMouseDragged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(frm_Dashboard_Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_Dashboard_Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_Dashboard_Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_Dashboard_Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_Dashboard_Client().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnInicio;
    public javax.swing.JButton btnOfertas;
    public javax.swing.JButton btnPedidos;
    public javax.swing.JButton btnPerfil;
    public javax.swing.JButton btnTienda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JPanel jp_Inicio_CL;
    // End of variables declaration//GEN-END:variables
}
