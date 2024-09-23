package Vista.Paneles_Admin;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;

public class Panel_Inventario_Admin extends javax.swing.JPanel {
    public Panel_Inventario_Admin() {
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
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_Descrip_Inventory_Admin = new javax.swing.JTextPane();
        IMG_Inventory_admin = new javax.swing.JLabel();
        btn_Add_Inventory_Admin = new javax.swing.JButton();
        btn_Update_Inventory_Admin = new javax.swing.JButton();
        Btn_Delete_Inventory_Admin = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 102));

        txt_Buscar_Inventory_Admin.setText("Buscar...");
        txt_Buscar_Inventory_Admin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_Buscar_Inventory_AdminFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_Buscar_Inventory_AdminFocusLost(evt);
            }
        });

        jtb_Inventory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtb_Inventory);

        txt_Nombre_Inventory_Admin.setText("Nombre");
        txt_Nombre_Inventory_Admin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_Nombre_Inventory_AdminFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_Nombre_Inventory_AdminFocusLost(evt);
            }
        });

        txt_Precio_Inventory_Admin.setText("Precio");
        txt_Precio_Inventory_Admin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_Precio_Inventory_AdminFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_Precio_Inventory_AdminFocusLost(evt);
            }
        });

        txt_Cantidad_Inventory_Admin.setText("Cantidad disponible");
        txt_Cantidad_Inventory_Admin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_Cantidad_Inventory_AdminFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_Cantidad_Inventory_AdminFocusLost(evt);
            }
        });

        Cb_Categoria_Flores_Inventory_admin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hortencias", "Rosas", "Tulipanes", "Girasoles", "Mixtas" }));

        Cb_Categoria_Diseno_Inventory_admin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cajas", "Ramos", "Botellas", "Corazones", "Rosas preservadas" }));

        Cb_Categoria_Evento_Inventory_admin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cumpleaños", "Aniversario", "Amor", "Nacimiento", "Condolencias" }));

        jScrollPane2.setViewportView(txt_Descrip_Inventory_Admin);

        btn_Add_Inventory_Admin.setText("Agregar");

        btn_Update_Inventory_Admin.setText("Actualizar");

        Btn_Delete_Inventory_Admin.setText("Eliminar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(IMG_Inventory_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_Buscar_Inventory_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_Nombre_Inventory_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Precio_Inventory_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Cb_Categoria_Evento_Inventory_admin, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Cb_Categoria_Diseno_Inventory_admin, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Cb_Categoria_Flores_Inventory_admin, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_Cantidad_Inventory_Admin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_Add_Inventory_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn_Delete_Inventory_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Update_Inventory_Admin, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_Buscar_Inventory_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_Nombre_Inventory_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Precio_Inventory_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_Add_Inventory_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Cantidad_Inventory_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Cb_Categoria_Flores_Inventory_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Cb_Categoria_Diseno_Inventory_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btn_Update_Inventory_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21))))
                    .addComponent(IMG_Inventory_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cb_Categoria_Evento_Inventory_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Delete_Inventory_Admin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_Buscar_Inventory_AdminFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_Buscar_Inventory_AdminFocusGained
        if(txt_Buscar_Inventory_Admin.getText().equals("Buscar")){
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
        if(txt_Nombre_Inventory_Admin.getText().equals("Titulo de oferta")){
            txt_Nombre_Inventory_Admin.setText(null);
            txt_Nombre_Inventory_Admin.requestFocus();

            removePlaceholderStyle(txt_Nombre_Inventory_Admin);
        }
    }//GEN-LAST:event_txt_Nombre_Inventory_AdminFocusGained

    private void txt_Nombre_Inventory_AdminFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_Nombre_Inventory_AdminFocusLost
        if(txt_Nombre_Inventory_Admin.getText().length()==0){
            addPlaceholderStyle(txt_Nombre_Inventory_Admin);
            txt_Nombre_Inventory_Admin.setText("Titulo de oferta");
        }
    }//GEN-LAST:event_txt_Nombre_Inventory_AdminFocusLost

    private void txt_Precio_Inventory_AdminFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_Precio_Inventory_AdminFocusGained
        if(txt_Precio_Inventory_Admin.getText().equals("Porcentaje oferta")){
            txt_Precio_Inventory_Admin.setText(null);
            txt_Precio_Inventory_Admin.requestFocus();

            removePlaceholderStyle(txt_Precio_Inventory_Admin);
        }
    }//GEN-LAST:event_txt_Precio_Inventory_AdminFocusGained

    private void txt_Precio_Inventory_AdminFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_Precio_Inventory_AdminFocusLost
        if(txt_Precio_Inventory_Admin.getText().length()==0){
            addPlaceholderStyle(txt_Precio_Inventory_Admin);
            txt_Precio_Inventory_Admin.setText("Porcentaje oferta");
        }
    }//GEN-LAST:event_txt_Precio_Inventory_AdminFocusLost

    private void txt_Cantidad_Inventory_AdminFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_Cantidad_Inventory_AdminFocusGained
        if(txt_Cantidad_Inventory_Admin.getText().equals("Correo")){
            txt_Cantidad_Inventory_Admin.setText(null);
            txt_Cantidad_Inventory_Admin.requestFocus();

            removePlaceholderStyle(txt_Cantidad_Inventory_Admin);
        }
    }//GEN-LAST:event_txt_Cantidad_Inventory_AdminFocusGained

    private void txt_Cantidad_Inventory_AdminFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_Cantidad_Inventory_AdminFocusLost
        if(txt_Cantidad_Inventory_Admin.getText().length()==0){
            addPlaceholderStyle(txt_Cantidad_Inventory_Admin);
            txt_Cantidad_Inventory_Admin.setText("Usuario");
        }
    }//GEN-LAST:event_txt_Cantidad_Inventory_AdminFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Btn_Delete_Inventory_Admin;
    public javax.swing.JComboBox<String> Cb_Categoria_Diseno_Inventory_admin;
    public javax.swing.JComboBox<String> Cb_Categoria_Evento_Inventory_admin;
    public javax.swing.JComboBox<String> Cb_Categoria_Flores_Inventory_admin;
    public javax.swing.JLabel IMG_Inventory_admin;
    public javax.swing.JButton btn_Add_Inventory_Admin;
    public javax.swing.JButton btn_Update_Inventory_Admin;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable jtb_Inventory;
    public javax.swing.JTextField txt_Buscar_Inventory_Admin;
    public javax.swing.JTextField txt_Cantidad_Inventory_Admin;
    public javax.swing.JTextPane txt_Descrip_Inventory_Admin;
    public javax.swing.JTextField txt_Nombre_Inventory_Admin;
    public javax.swing.JTextField txt_Precio_Inventory_Admin;
    // End of variables declaration//GEN-END:variables
}
