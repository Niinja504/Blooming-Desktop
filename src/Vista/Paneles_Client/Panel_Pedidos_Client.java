/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista.Paneles_Client;

import Controlador.Ctrl_Pedidos_Client;

/**
 *
 * @author Acer
 */
public class Panel_Pedidos_Client extends javax.swing.JPanel {

    /**
     * Creates new form Panel_Pedidos_Clent
     */
    public Panel_Pedidos_Client() {
        initComponents();
    }
    
    public static void initPanel_Pedidos_Client(){
    Panel_Pedidos_Client vista = new Panel_Pedidos_Client();
    Panel_Pedido_Pendiente_Cliente panel = new Panel_Pedido_Pendiente_Cliente();
    Ctrl_Pedidos_Client controlador = new Ctrl_Pedidos_Client(vista);
    
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

        btn_Pedidos_Pendientes_Client = new javax.swing.JButton();
        btn_Pedidos_Entregados_Client = new javax.swing.JButton();
        jp_Pedidos_Client = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 252, 245));

        btn_Pedidos_Pendientes_Client.setBackground(new java.awt.Color(255, 252, 245));
        btn_Pedidos_Pendientes_Client.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Pedidos_Pendientes_Client.setForeground(new java.awt.Color(93, 89, 92));
        btn_Pedidos_Pendientes_Client.setText("Pendientes");
        btn_Pedidos_Pendientes_Client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Pedidos_Pendientes_ClientActionPerformed(evt);
            }
        });

        btn_Pedidos_Entregados_Client.setBackground(new java.awt.Color(255, 252, 245));
        btn_Pedidos_Entregados_Client.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Pedidos_Entregados_Client.setForeground(new java.awt.Color(93, 89, 92));
        btn_Pedidos_Entregados_Client.setText("Entregados");
        btn_Pedidos_Entregados_Client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Pedidos_Entregados_ClientActionPerformed(evt);
            }
        });

        jp_Pedidos_Client.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addComponent(btn_Pedidos_Pendientes_Client, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Pedidos_Entregados_Client, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(245, Short.MAX_VALUE))
            .addComponent(jp_Pedidos_Client, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Pedidos_Pendientes_Client, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Pedidos_Entregados_Client, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jp_Pedidos_Client, javax.swing.GroupLayout.DEFAULT_SIZE, 784, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_Pedidos_Pendientes_ClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Pedidos_Pendientes_ClientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Pedidos_Pendientes_ClientActionPerformed

    private void btn_Pedidos_Entregados_ClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Pedidos_Entregados_ClientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Pedidos_Entregados_ClientActionPerformed

    
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
            java.util.logging.Logger.getLogger(Panel_Pedidos_Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Panel_Pedidos_Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Panel_Pedidos_Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Panel_Pedidos_Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                initPanel_Pedidos_Client();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_Pedidos_Entregados_Client;
    public javax.swing.JButton btn_Pedidos_Pendientes_Client;
    public javax.swing.JPanel jp_Pedidos_Client;
    // End of variables declaration//GEN-END:variables
}
