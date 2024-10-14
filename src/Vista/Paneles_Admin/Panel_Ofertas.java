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
        txt_Titulo_Offers_Admin = new javax.swing.JTextField();
        Cb_Productos_Offers_Admin = new javax.swing.JComboBox<>();
        txt_Porcentaje_Offers_Admin = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtb_Offers_Admin = new javax.swing.JTable();
        txt_Descrip_Offers_Admin = new javax.swing.JTextPane();
        btn_Add_Offers_Admin = new javax.swing.JButton();
        btn_Update_Offers_Admin = new javax.swing.JButton();
        Btn_Delete_Offers_Admin = new javax.swing.JButton();
        IMG_Offers_admin = new javax.swing.JLabel();
        btn_Upload_photo_Ofertas = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

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

        btn_Upload_photo_Ofertas.setBackground(new java.awt.Color(255, 252, 245));
        btn_Upload_photo_Ofertas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/ic_upload.png"))); // NOI18N
        btn_Upload_photo_Ofertas.setBorder(null);

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Descripción");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(IMG_Offers_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(btn_Upload_photo_Ofertas, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Cb_Productos_Offers_Admin, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_Titulo_Offers_Admin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_Porcentaje_Offers_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Descrip_Offers_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_Add_Offers_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_Update_Offers_Admin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Btn_Delete_Offers_Admin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(txt_Buscar_Offers_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(22, Short.MAX_VALUE))
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(txt_Titulo_Offers_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addComponent(Cb_Productos_Offers_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_Porcentaje_Offers_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txt_Buscar_Offers_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(btn_Add_Offers_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(btn_Update_Offers_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_Upload_photo_Ofertas)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_Descrip_Offers_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Btn_Delete_Offers_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(IMG_Offers_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Btn_Delete_Offers_Admin;
    public javax.swing.JComboBox<String> Cb_Productos_Offers_Admin;
    public javax.swing.JLabel IMG_Offers_admin;
    public javax.swing.JButton btn_Add_Offers_Admin;
    public javax.swing.JButton btn_Update_Offers_Admin;
    public javax.swing.JButton btn_Upload_photo_Ofertas;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    public javax.swing.JTable jtb_Offers_Admin;
    public javax.swing.JTextField txt_Buscar_Offers_Admin;
    public javax.swing.JTextPane txt_Descrip_Offers_Admin;
    public javax.swing.JTextField txt_Porcentaje_Offers_Admin;
    public javax.swing.JTextField txt_Titulo_Offers_Admin;
    // End of variables declaration//GEN-END:variables
}
