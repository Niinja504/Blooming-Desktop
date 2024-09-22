/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista.Paneles_Admin;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;

/**
 *
 * @author vladk
 */
public class Panel_CostoEnvio_Admin extends javax.swing.JPanel {
    public Panel_CostoEnvio_Admin() {
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

        txt_Buscar_Cost_admin = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 255, 204));

        txt_Buscar_Cost_admin.setText("Buscar...");
        txt_Buscar_Cost_admin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_Buscar_Cost_adminFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_Buscar_Cost_adminFocusLost(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 346, Short.MAX_VALUE)
                .addComponent(txt_Buscar_Cost_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(txt_Buscar_Cost_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 684, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_Buscar_Cost_adminFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_Buscar_Cost_adminFocusGained
        if(txt_Buscar_Cost_admin.getText().equals("Buscar")){
            txt_Buscar_Cost_admin.setText(null);
            txt_Buscar_Cost_admin.requestFocus();

            removePlaceholderStyle(txt_Buscar_Cost_admin);
        }
    }//GEN-LAST:event_txt_Buscar_Cost_adminFocusGained

    private void txt_Buscar_Cost_adminFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_Buscar_Cost_adminFocusLost
        if(txt_Buscar_Cost_admin.getText().length()==0){
            addPlaceholderStyle(txt_Buscar_Cost_admin);
            txt_Buscar_Cost_admin.setText("Buscar...");
        }
    }//GEN-LAST:event_txt_Buscar_Cost_adminFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField txt_Buscar_Cost_admin;
    // End of variables declaration//GEN-END:variables
}
