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
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_Buscar_Offers_Admin.setText("Buscar...");
        txt_Buscar_Offers_Admin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_Buscar_Offers_AdminFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_Buscar_Offers_AdminFocusLost(evt);
            }
        });
        add(txt_Buscar_Offers_Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 0, 490, 36));

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
        add(txt_Titulo_Offers_Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 64, 309, 40));

        Cb_Productos_Offers_Admin.setForeground(new java.awt.Color(255, 255, 255));
        Cb_Productos_Offers_Admin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Cb_Productos_Offers_Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cb_Productos_Offers_AdminActionPerformed(evt);
            }
        });
        add(Cb_Productos_Offers_Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 124, 309, 40));

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
        add(txt_Porcentaje_Offers_Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 176, 309, 40));

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 338, 866, 376));

        txt_Descrip_Offers_Admin.setForeground(new java.awt.Color(255, 255, 255));
        txt_Descrip_Offers_Admin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_Descrip_Offers_AdminFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_Descrip_Offers_AdminFocusLost(evt);
            }
        });
        add(txt_Descrip_Offers_Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 307, 79));

        btn_Add_Offers_Admin.setBackground(new java.awt.Color(243, 143, 154));
        btn_Add_Offers_Admin.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btn_Add_Offers_Admin.setForeground(new java.awt.Color(255, 255, 255));
        btn_Add_Offers_Admin.setText("Guadar");
        btn_Add_Offers_Admin.setBorderPainted(false);
        btn_Add_Offers_Admin.setFocusPainted(false);
        add(btn_Add_Offers_Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(729, 64, 100, 37));

        btn_Update_Offers_Admin.setBackground(new java.awt.Color(243, 143, 154));
        btn_Update_Offers_Admin.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btn_Update_Offers_Admin.setForeground(new java.awt.Color(255, 255, 255));
        btn_Update_Offers_Admin.setText("Actualizar");
        btn_Update_Offers_Admin.setToolTipText("");
        btn_Update_Offers_Admin.setBorderPainted(false);
        btn_Update_Offers_Admin.setFocusPainted(false);
        add(btn_Update_Offers_Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(729, 154, -1, 37));

        Btn_Delete_Offers_Admin.setBackground(new java.awt.Color(243, 143, 154));
        Btn_Delete_Offers_Admin.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        Btn_Delete_Offers_Admin.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Delete_Offers_Admin.setText("Eliminar");
        Btn_Delete_Offers_Admin.setToolTipText("");
        Btn_Delete_Offers_Admin.setBorderPainted(false);
        Btn_Delete_Offers_Admin.setFocusPainted(false);
        add(Btn_Delete_Offers_Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(729, 222, 100, 37));
        add(IMG_Offers_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 26, 288, 288));

        btn_Upload_photo_Ofertas.setBackground(new java.awt.Color(255, 252, 245));
        btn_Upload_photo_Ofertas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/ic_upload.png"))); // NOI18N
        btn_Upload_photo_Ofertas.setBorder(null);
        add(btn_Upload_photo_Ofertas, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 152, 61, -1));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Descripción");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 222, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void Cb_Productos_Offers_AdminActionPerformed(java.awt.event.ActionEvent evt) {
        
    }
    
    private void txt_Descrip_Offers_AdminFocusGained(java.awt.event.FocusEvent evt) {
        
    }
    
    private void txt_Descrip_Offers_AdminFocusLost(java.awt.event.FocusEvent evt) {
        
    }
    

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
