package Vista.Paneles_Admin;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialPalenightIJTheme;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Panel_Inventario extends javax.swing.JPanel {
    public Panel_Inventario() {
        try {
            UIManager.setLookAndFeel(new FlatMaterialPalenightIJTheme());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        initComponents();
    }

    public void addPlaceholderStyle(JTextField textField){
        Font font = textField.getFont();
        font = font.deriveFont(Font.ITALIC);
        textField.setFont(font);
        textField.setForeground(Color.BLACK);
    }
    
    public void removePlaceholderStyle(JTextField textField){
        Font font = textField.getFont();
        font = font.deriveFont(Font.PLAIN);
        textField.setFont(font);
        textField.setForeground(Color.BLACK);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        txt_Buscar_Inventory_Admin = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtb_Inventory = new javax.swing.JTable();
        txt_Nombre_Inventory_Admin = new javax.swing.JTextField();
        txt_Precio_Inventory_Admin = new javax.swing.JTextField();
        txt_Cantidad_Inventory_Admin = new javax.swing.JTextField();
        Cb_Categoria_Flores_Inventory_admin = new javax.swing.JComboBox<>();
        Cb_Categoria_Diseno_Inventory_admin = new javax.swing.JComboBox<>();
        Cb_Categoria_Evento_Inventory_admin = new javax.swing.JComboBox<>();
        txt_Descrip_Inventory_Admin = new javax.swing.JTextPane();
        IMG_Inventory_admin = new javax.swing.JLabel();
        btn_Update_Inventory_Admin = new javax.swing.JButton();
        btn_Add_Inventory_Admin = new javax.swing.JButton();
        Btn_Delete_Inventory_Admin = new javax.swing.JButton();
        btn_Upload_photo_Inventario = new javax.swing.JButton();
        Descripción = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 252, 250));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_Buscar_Inventory_Admin.setBackground(new java.awt.Color(255, 255, 255));
        txt_Buscar_Inventory_Admin.setForeground(new java.awt.Color(0, 0, 0));
        txt_Buscar_Inventory_Admin.setText("Buscar...");
        txt_Buscar_Inventory_Admin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_Buscar_Inventory_AdminFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_Buscar_Inventory_AdminFocusLost(evt);
            }
        });
        add(txt_Buscar_Inventory_Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 510, 36));

        jtb_Inventory.setForeground(new java.awt.Color(255, 255, 255));
        jtb_Inventory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre producto", "Precio", "Cantidad disponible", "Categoria flores", "Categoria diseño", "Categoria evento", "Descripción"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtb_Inventory);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 474, 866, 240));

        txt_Nombre_Inventory_Admin.setBackground(new java.awt.Color(255, 255, 255));
        txt_Nombre_Inventory_Admin.setForeground(new java.awt.Color(0, 0, 0));
        txt_Nombre_Inventory_Admin.setText("Nombre");
        txt_Nombre_Inventory_Admin.setPreferredSize(new java.awt.Dimension(121, 22));
        txt_Nombre_Inventory_Admin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_Nombre_Inventory_AdminFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_Nombre_Inventory_AdminFocusLost(evt);
            }
        });
        add(txt_Nombre_Inventory_Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 79, 309, 40));

        txt_Precio_Inventory_Admin.setBackground(new java.awt.Color(255, 255, 255));
        txt_Precio_Inventory_Admin.setForeground(new java.awt.Color(0, 0, 0));
        txt_Precio_Inventory_Admin.setText("Precio");
        txt_Precio_Inventory_Admin.setPreferredSize(new java.awt.Dimension(121, 22));
        txt_Precio_Inventory_Admin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_Precio_Inventory_AdminFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_Precio_Inventory_AdminFocusLost(evt);
            }
        });
        add(txt_Precio_Inventory_Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 125, 309, 40));

        txt_Cantidad_Inventory_Admin.setBackground(new java.awt.Color(255, 255, 255));
        txt_Cantidad_Inventory_Admin.setForeground(new java.awt.Color(0, 0, 0));
        txt_Cantidad_Inventory_Admin.setText("Cantidad disponible");
        txt_Cantidad_Inventory_Admin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_Cantidad_Inventory_AdminFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_Cantidad_Inventory_AdminFocusLost(evt);
            }
        });
        add(txt_Cantidad_Inventory_Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 171, 309, 40));

        Cb_Categoria_Flores_Inventory_admin.setForeground(new java.awt.Color(255, 255, 255));
        Cb_Categoria_Flores_Inventory_admin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hortencias", "Rosas", "Tulipanes", "Girasoles", "Mixtas" }));
        add(Cb_Categoria_Flores_Inventory_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 217, 309, 40));

        Cb_Categoria_Diseno_Inventory_admin.setForeground(new java.awt.Color(255, 255, 255));
        Cb_Categoria_Diseno_Inventory_admin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cajas", "Ramos", "Botellas", "Corazones", "Rosas preservadas", "Individual" }));
        add(Cb_Categoria_Diseno_Inventory_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 263, 309, 40));

        Cb_Categoria_Evento_Inventory_admin.setForeground(new java.awt.Color(255, 255, 255));
        Cb_Categoria_Evento_Inventory_admin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cumpleaños", "Aniversario", "Amor", "Nacimiento", "Condolencias" }));
        add(Cb_Categoria_Evento_Inventory_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 309, 309, 40));

        txt_Descrip_Inventory_Admin.setBackground(new java.awt.Color(255, 255, 255));
        txt_Descrip_Inventory_Admin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        txt_Descrip_Inventory_Admin.setForeground(new java.awt.Color(0, 0, 0));
        txt_Descrip_Inventory_Admin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_Descrip_Inventory_AdminFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_Descrip_Inventory_AdminFocusLost(evt);
            }
        });
        add(txt_Descrip_Inventory_Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 381, 307, 60));

        IMG_Inventory_admin.setBackground(new java.awt.Color(243, 143, 154));
        add(IMG_Inventory_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 17, 280, 280));

        btn_Update_Inventory_Admin.setBackground(new java.awt.Color(243, 143, 154));
        btn_Update_Inventory_Admin.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btn_Update_Inventory_Admin.setForeground(new java.awt.Color(255, 255, 255));
        btn_Update_Inventory_Admin.setText("Actualizar");
        btn_Update_Inventory_Admin.setBorderPainted(false);
        btn_Update_Inventory_Admin.setFocusPainted(false);
        add(btn_Update_Inventory_Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(661, 232, -1, 37));

        btn_Add_Inventory_Admin.setBackground(new java.awt.Color(243, 143, 154));
        btn_Add_Inventory_Admin.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btn_Add_Inventory_Admin.setForeground(new java.awt.Color(255, 255, 255));
        btn_Add_Inventory_Admin.setText("Agregar");
        btn_Add_Inventory_Admin.setBorderPainted(false);
        btn_Add_Inventory_Admin.setFocusPainted(false);
        add(btn_Add_Inventory_Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(661, 117, 100, 37));

        Btn_Delete_Inventory_Admin.setBackground(new java.awt.Color(243, 143, 154));
        Btn_Delete_Inventory_Admin.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        Btn_Delete_Inventory_Admin.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Delete_Inventory_Admin.setText("Eliminar");
        Btn_Delete_Inventory_Admin.setBorderPainted(false);
        Btn_Delete_Inventory_Admin.setFocusPainted(false);
        add(Btn_Delete_Inventory_Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(661, 359, 100, 37));

        btn_Upload_photo_Inventario.setBackground(new java.awt.Color(243, 143, 154));
        btn_Upload_photo_Inventario.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btn_Upload_photo_Inventario.setForeground(new java.awt.Color(255, 255, 255));
        btn_Upload_photo_Inventario.setText("Subir foto");
        btn_Upload_photo_Inventario.setBorderPainted(false);
        add(btn_Upload_photo_Inventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 358, 109, 40));

        Descripción.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        Descripción.setForeground(new java.awt.Color(51, 51, 51));
        Descripción.setText("Descripción");
        add(Descripción, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 359, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txt_Descrip_Inventory_AdminFocusGained(java.awt.event.FocusEvent evt) {
        
    }
    
    private void txt_Descrip_Inventory_AdminFocusLost(java.awt.event.FocusEvent evt) {
        
    }
    

    private void txt_Buscar_Inventory_AdminFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_Buscar_Inventory_AdminFocusGained
        if(txt_Buscar_Inventory_Admin.getText().trim().equals("Buscar...")){
            txt_Buscar_Inventory_Admin.setText(null);
            txt_Buscar_Inventory_Admin.requestFocus();

            removePlaceholderStyle(txt_Buscar_Inventory_Admin);
        }
    }//GEN-LAST:event_txt_Buscar_Inventory_AdminFocusGained

    private void txt_Buscar_Inventory_AdminFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_Buscar_Inventory_AdminFocusLost
        if(txt_Buscar_Inventory_Admin.getText().length()==0){
            addPlaceholderStyle(txt_Buscar_Inventory_Admin);
            txt_Buscar_Inventory_Admin.setText("Buscar...");
        }
    }//GEN-LAST:event_txt_Buscar_Inventory_AdminFocusLost

    private void txt_Nombre_Inventory_AdminFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_Nombre_Inventory_AdminFocusGained
        if(txt_Nombre_Inventory_Admin.getText().trim().equals("Nombre")){
            txt_Nombre_Inventory_Admin.setText("");
            txt_Nombre_Inventory_Admin.requestFocus();

            removePlaceholderStyle(txt_Nombre_Inventory_Admin);
        }
    }//GEN-LAST:event_txt_Nombre_Inventory_AdminFocusGained

    private void txt_Nombre_Inventory_AdminFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_Nombre_Inventory_AdminFocusLost
        if(txt_Nombre_Inventory_Admin.getText().length()==0){
            addPlaceholderStyle(txt_Nombre_Inventory_Admin);
            txt_Nombre_Inventory_Admin.setText("Nombre");
        }
    }//GEN-LAST:event_txt_Nombre_Inventory_AdminFocusLost

    private void txt_Precio_Inventory_AdminFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_Precio_Inventory_AdminFocusGained
        if(txt_Precio_Inventory_Admin.getText().equals("Precio")){
            txt_Precio_Inventory_Admin.setText("");
            txt_Precio_Inventory_Admin.requestFocus();

            removePlaceholderStyle(txt_Precio_Inventory_Admin);
        }
    }//GEN-LAST:event_txt_Precio_Inventory_AdminFocusGained

    private void txt_Precio_Inventory_AdminFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_Precio_Inventory_AdminFocusLost
        if(txt_Precio_Inventory_Admin.getText().length()==0){
            addPlaceholderStyle(txt_Precio_Inventory_Admin);
            txt_Precio_Inventory_Admin.setText("Precio");
        }
    }//GEN-LAST:event_txt_Precio_Inventory_AdminFocusLost

    private void txt_Cantidad_Inventory_AdminFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_Cantidad_Inventory_AdminFocusGained
        if(txt_Cantidad_Inventory_Admin.getText().equals("Cantidad disponible")){
            txt_Cantidad_Inventory_Admin.setText("");
            txt_Cantidad_Inventory_Admin.requestFocus();

            removePlaceholderStyle(txt_Cantidad_Inventory_Admin);
        }
    }//GEN-LAST:event_txt_Cantidad_Inventory_AdminFocusGained

    private void txt_Cantidad_Inventory_AdminFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_Cantidad_Inventory_AdminFocusLost
        if(txt_Cantidad_Inventory_Admin.getText().length()==0){
            addPlaceholderStyle(txt_Cantidad_Inventory_Admin);
            txt_Cantidad_Inventory_Admin.setText("Cantidad disponible");
        }
    }//GEN-LAST:event_txt_Cantidad_Inventory_AdminFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Btn_Delete_Inventory_Admin;
    public javax.swing.JComboBox<String> Cb_Categoria_Diseno_Inventory_admin;
    public javax.swing.JComboBox<String> Cb_Categoria_Evento_Inventory_admin;
    public javax.swing.JComboBox<String> Cb_Categoria_Flores_Inventory_admin;
    private javax.swing.JLabel Descripción;
    public javax.swing.JLabel IMG_Inventory_admin;
    public javax.swing.JButton btn_Add_Inventory_Admin;
    public javax.swing.JButton btn_Update_Inventory_Admin;
    public javax.swing.JButton btn_Upload_photo_Inventario;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jtb_Inventory;
    public javax.swing.JTextField txt_Buscar_Inventory_Admin;
    public javax.swing.JTextField txt_Cantidad_Inventory_Admin;
    public javax.swing.JTextPane txt_Descrip_Inventory_Admin;
    public javax.swing.JTextField txt_Nombre_Inventory_Admin;
    public javax.swing.JTextField txt_Precio_Inventory_Admin;
    // End of variables declaration//GEN-END:variables
}
