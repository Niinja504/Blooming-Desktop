package Vista.Paneles_Admin;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialPalenightIJTheme;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Panel_Ofertas extends javax.swing.JPanel {
    public Panel_Ofertas() {
        try {
            // UIManager.setLookAndFeel(new FlatLightLaf()); 
            UIManager.setLookAndFeel(new FlatMaterialPalenightIJTheme());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        initComponents();
        addPlaceholderStyle(txt_Titulo_Offers_Admin);
        addPlaceholderStyle(txt_Porcentaje_Offers_Admin);
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
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        txt_Buscar_Offers_Admin = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_Titulo_Offers_Admin = new javax.swing.JTextField();
        Cb_Productos_Offers_Admin = new javax.swing.JComboBox<>();
        txt_Porcentaje_Offers_Admin = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtb_Offers_Admin = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_Descrip_Offers_Admin = new javax.swing.JTextPane();
        btn_Add_Offers_Admin = new javax.swing.JButton();
        btn_Update_Offers_Admin = new javax.swing.JButton();
        Btn_Delete_Offers_Admin = new javax.swing.JButton();
        IMG_Offers_admin = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        setBackground(new java.awt.Color(255, 252, 245));

        txt_Buscar_Offers_Admin.setText("Buscar...");
        txt_Buscar_Offers_Admin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_Buscar_Offers_AdminFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_Buscar_Offers_AdminFocusLost(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ofertas");

        txt_Titulo_Offers_Admin.setForeground(new java.awt.Color(255, 255, 255));
        txt_Titulo_Offers_Admin.setText("Titulo de oferta");
        txt_Titulo_Offers_Admin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_Titulo_Offers_AdminFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_Titulo_Offers_AdminFocusLost(evt);
            }
        });

        Cb_Productos_Offers_Admin.setForeground(new java.awt.Color(255, 255, 255));
        Cb_Productos_Offers_Admin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Cb_Productos_Offers_Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cb_Productos_Offers_AdminActionPerformed(evt);
            }
        });

        txt_Porcentaje_Offers_Admin.setForeground(new java.awt.Color(255, 255, 255));
        txt_Porcentaje_Offers_Admin.setText("Porcentaje oferta");
        txt_Porcentaje_Offers_Admin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_Porcentaje_Offers_AdminFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_Porcentaje_Offers_AdminFocusLost(evt);
            }
        });

        jtb_Offers_Admin.setForeground(new java.awt.Color(255, 255, 255));
        jtb_Offers_Admin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Titulo", "Porcentaje de oferta", "Descripciòn"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtb_Offers_Admin);

        txt_Descrip_Offers_Admin.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(txt_Descrip_Offers_Admin);

        btn_Add_Offers_Admin.setBackground(new java.awt.Color(243, 143, 154));
        btn_Add_Offers_Admin.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btn_Add_Offers_Admin.setForeground(new java.awt.Color(255, 255, 255));
        btn_Add_Offers_Admin.setText("Guadar");
        btn_Add_Offers_Admin.setBorderPainted(false);
        btn_Add_Offers_Admin.setFocusPainted(false);

        btn_Update_Offers_Admin.setBackground(new java.awt.Color(243, 143, 154));
        btn_Update_Offers_Admin.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btn_Update_Offers_Admin.setForeground(new java.awt.Color(255, 255, 255));
        btn_Update_Offers_Admin.setText("Actualizar");
        btn_Update_Offers_Admin.setToolTipText("");
        btn_Update_Offers_Admin.setBorderPainted(false);
        btn_Update_Offers_Admin.setFocusPainted(false);

        Btn_Delete_Offers_Admin.setBackground(new java.awt.Color(243, 143, 154));
        Btn_Delete_Offers_Admin.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        Btn_Delete_Offers_Admin.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Delete_Offers_Admin.setText("Eliminar");
        Btn_Delete_Offers_Admin.setToolTipText("");
        Btn_Delete_Offers_Admin.setBorderPainted(false);
        Btn_Delete_Offers_Admin.setFocusPainted(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(IMG_Offers_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Cb_Productos_Offers_Admin, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_Titulo_Offers_Admin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_Porcentaje_Offers_Admin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_Add_Offers_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_Update_Offers_Admin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Btn_Delete_Offers_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(txt_Buscar_Offers_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txt_Buscar_Offers_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_Add_Offers_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(btn_Update_Offers_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_Titulo_Offers_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Cb_Productos_Offers_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_Porcentaje_Offers_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Btn_Delete_Offers_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IMG_Offers_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_Buscar_Offers_AdminFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_Buscar_Offers_AdminFocusGained
        if(txt_Buscar_Offers_Admin.getText().equals("Buscar")){
            txt_Buscar_Offers_Admin.setText(null);
            txt_Buscar_Offers_Admin.requestFocus();

            removePlaceholderStyle(txt_Buscar_Offers_Admin);
        }
    }//GEN-LAST:event_txt_Buscar_Offers_AdminFocusGained

    private void txt_Buscar_Offers_AdminFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_Buscar_Offers_AdminFocusLost
        if(txt_Buscar_Offers_Admin.getText().length()==0){
            addPlaceholderStyle(txt_Buscar_Offers_Admin);
            txt_Buscar_Offers_Admin.setText("Buscar...");
        }
    }//GEN-LAST:event_txt_Buscar_Offers_AdminFocusLost

    private void txt_Titulo_Offers_AdminFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_Titulo_Offers_AdminFocusGained
        if(txt_Titulo_Offers_Admin.getText().equals("Titulo de oferta")){
            txt_Titulo_Offers_Admin.setText(null);
            txt_Titulo_Offers_Admin.requestFocus();

            removePlaceholderStyle(txt_Titulo_Offers_Admin);
        }
    }//GEN-LAST:event_txt_Titulo_Offers_AdminFocusGained

    private void txt_Titulo_Offers_AdminFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_Titulo_Offers_AdminFocusLost
        if(txt_Titulo_Offers_Admin.getText().length()==0){
            addPlaceholderStyle(txt_Titulo_Offers_Admin);
            txt_Titulo_Offers_Admin.setText("Titulo de oferta");
        }
    }//GEN-LAST:event_txt_Titulo_Offers_AdminFocusLost

    private void txt_Porcentaje_Offers_AdminFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_Porcentaje_Offers_AdminFocusGained
        if(txt_Porcentaje_Offers_Admin.getText().equals("Porcentaje oferta")){
            txt_Porcentaje_Offers_Admin.setText(null);
            txt_Porcentaje_Offers_Admin.requestFocus();

            removePlaceholderStyle(txt_Porcentaje_Offers_Admin);
        }
    }//GEN-LAST:event_txt_Porcentaje_Offers_AdminFocusGained

    private void txt_Porcentaje_Offers_AdminFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_Porcentaje_Offers_AdminFocusLost
        if(txt_Porcentaje_Offers_Admin.getText().length()==0){
            addPlaceholderStyle(txt_Porcentaje_Offers_Admin);
            txt_Porcentaje_Offers_Admin.setText("Porcentaje oferta");
        }
    }//GEN-LAST:event_txt_Porcentaje_Offers_AdminFocusLost

    private void Cb_Productos_Offers_AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cb_Productos_Offers_AdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cb_Productos_Offers_AdminActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Btn_Delete_Offers_Admin;
    public javax.swing.JComboBox<String> Cb_Productos_Offers_Admin;
    public javax.swing.JLabel IMG_Offers_admin;
    public javax.swing.JButton btn_Add_Offers_Admin;
    public javax.swing.JButton btn_Update_Offers_Admin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    public javax.swing.JTable jtb_Offers_Admin;
    public javax.swing.JTextField txt_Buscar_Offers_Admin;
    public javax.swing.JTextPane txt_Descrip_Offers_Admin;
    public javax.swing.JTextField txt_Porcentaje_Offers_Admin;
    public javax.swing.JTextField txt_Titulo_Offers_Admin;
    // End of variables declaration//GEN-END:variables
}
