package Vista.Paneles_Admin;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialPalenightIJTheme;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Panel_Usuarios extends javax.swing.JPanel {

    public Panel_Usuarios() {
        try {
            // UIManager.setLookAndFeel(new FlatLightLaf()); 
            UIManager.setLookAndFeel(new FlatMaterialPalenightIJTheme());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        initComponents();
        addPlaceholderStyle(txt_Nombre);
        addPlaceholderStyle(txt_Apellido);
        addPlaceholderStyle(txt_NombreDeUsuario);
        addPlaceholderStyle(txt_Correo);
        addPlaceholderStyle(txt_Confirmar_Contra);
        addPlaceholderStyle(txt_Telefono);
    }
    
    
    public void addPlaceholderStyle(JTextField textField){
        Font font = textField.getFont();
        font = font.deriveFont(Font.ITALIC);
        textField.setFont(font);
        textField.setForeground(Color.white);
    }
    
    public void removePlaceholderStyle(JTextField textField){
        Font font = textField.getFont();
        font = font.deriveFont(Font.PLAIN|Font.BOLD);
        textField.setFont(font);
        textField.setForeground(Color.white);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        txt_Nombre = new javax.swing.JTextField();
        txt_Correo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtb_Usuarios = new javax.swing.JTable();
        txt_Apellido = new javax.swing.JTextField();
        txt_Confirmar_Contra = new javax.swing.JTextField();
        txt_Edad = new javax.swing.JTextField();
        txt_Telefono = new javax.swing.JTextField();
        cb_Rol = new javax.swing.JComboBox<>();
        txt_Buscar = new javax.swing.JTextField();
        txt_NombreDeUsuario = new javax.swing.JTextField();
        btn_Update = new javax.swing.JButton();
        Btn_Delete = new javax.swing.JButton();
        btn_Agregar = new javax.swing.JButton();
        txt_Contra1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        setBackground(new java.awt.Color(255, 252, 245));
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 80, 65));
        jLabel1.setText("Usuarios");

        txt_Nombre.setForeground(new java.awt.Color(255, 255, 255));
        txt_Nombre.setText("Nombre");
        txt_Nombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_NombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_NombreFocusLost(evt);
            }
        });

        txt_Correo.setForeground(new java.awt.Color(255, 255, 255));
        txt_Correo.setText("Correo");
        txt_Correo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_CorreoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_CorreoFocusLost(evt);
            }
        });

        jtb_Usuarios.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtb_Usuarios.setForeground(new java.awt.Color(255, 255, 255));
        jtb_Usuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Usuario", "Telefono", "Edad", "Correo", "Rol"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtb_Usuarios);

        txt_Apellido.setForeground(new java.awt.Color(255, 255, 255));
        txt_Apellido.setText("Apellido");
        txt_Apellido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_ApellidoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_ApellidoFocusLost(evt);
            }
        });

        txt_Confirmar_Contra.setForeground(new java.awt.Color(255, 255, 255));
        txt_Confirmar_Contra.setText("Confirmar contraseña");
        txt_Confirmar_Contra.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_Confirmar_ContraFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_Confirmar_ContraFocusLost(evt);
            }
        });
        txt_Confirmar_Contra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Confirmar_ContraActionPerformed(evt);
            }
        });

        txt_Edad.setForeground(new java.awt.Color(255, 255, 255));
        txt_Edad.setText("Edad");
        txt_Edad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_EdadFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_EdadFocusLost(evt);
            }
        });
        txt_Edad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_EdadActionPerformed(evt);
            }
        });

        txt_Telefono.setForeground(new java.awt.Color(255, 255, 255));
        txt_Telefono.setText("Telefono");
        txt_Telefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_TelefonoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_TelefonoFocusLost(evt);
            }
        });

        cb_Rol.setForeground(new java.awt.Color(255, 255, 255));
        cb_Rol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Empleado", "Cliente" }));
        cb_Rol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_RolActionPerformed(evt);
            }
        });

        txt_Buscar.setText("Buscar...");
        txt_Buscar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_BuscarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_BuscarFocusLost(evt);
            }
        });

        txt_NombreDeUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txt_NombreDeUsuario.setText("Usuario");
        txt_NombreDeUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_NombreDeUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_NombreDeUsuarioFocusLost(evt);
            }
        });

        btn_Update.setBackground(new java.awt.Color(243, 143, 154));
        btn_Update.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btn_Update.setForeground(new java.awt.Color(255, 255, 255));
        btn_Update.setText("Actualizar");
        btn_Update.setBorderPainted(false);
        btn_Update.setFocusPainted(false);
        btn_Update.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                btn_UpdateMouseDragged(evt);
            }
        });
        btn_Update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_UpdateMouseClicked(evt);
            }
        });
        btn_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UpdateActionPerformed(evt);
            }
        });

        Btn_Delete.setBackground(new java.awt.Color(243, 143, 154));
        Btn_Delete.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        Btn_Delete.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Delete.setText("Eliminar");
        Btn_Delete.setBorderPainted(false);
        Btn_Delete.setFocusPainted(false);
        Btn_Delete.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Btn_DeleteMouseDragged(evt);
            }
        });
        Btn_Delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_DeleteMouseClicked(evt);
            }
        });
        Btn_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_DeleteActionPerformed(evt);
            }
        });

        btn_Agregar.setBackground(new java.awt.Color(243, 143, 154));
        btn_Agregar.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btn_Agregar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Agregar.setText("Agregar usuario");
        btn_Agregar.setFocusPainted(false);
        btn_Agregar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                btn_AgregarMouseDragged(evt);
            }
        });
        btn_Agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_AgregarMouseClicked(evt);
            }
        });
        btn_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarActionPerformed(evt);
            }
        });

        txt_Contra1.setForeground(new java.awt.Color(255, 255, 255));
        txt_Contra1.setText("Contraseña");
        txt_Contra1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_Contra1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_Contra1FocusLost(evt);
            }
        });
        txt_Contra1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Contra1ActionPerformed(evt);
            }
        });

        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_Contra1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_Telefono)
                            .addComponent(cb_Rol, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_Edad, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_Confirmar_Contra)
                            .addComponent(txt_Correo)
                            .addComponent(txt_NombreDeUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txt_Apellido, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                    .addComponent(txt_Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                    .addComponent(btn_Agregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(141, 141, 141)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Btn_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_Buscar)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_Update)
                            .addComponent(Btn_Delete))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94)
                        .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_NombreDeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Contra1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Confirmar_Contra, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_Rol, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_NombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_NombreFocusGained
        if(txt_Nombre.getText().equals("Correo")){
            txt_Nombre.setText(null);
            txt_Nombre.requestFocus();
            
            removePlaceholderStyle(txt_Nombre);
        }
    }//GEN-LAST:event_txt_NombreFocusGained

    private void txt_ApellidoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_ApellidoFocusGained
        if(txt_Apellido.getText().equals("Correo")){
            txt_Apellido.setText(null);
            txt_Apellido.requestFocus();
            
            removePlaceholderStyle(txt_Apellido);
        }
    }//GEN-LAST:event_txt_ApellidoFocusGained

    private void txt_NombreDeUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_NombreDeUsuarioFocusGained
        if(txt_NombreDeUsuario.getText().equals("Correo")){
            txt_NombreDeUsuario.setText(null);
            txt_NombreDeUsuario.requestFocus();
            
            removePlaceholderStyle(txt_NombreDeUsuario);
        }
    }//GEN-LAST:event_txt_NombreDeUsuarioFocusGained

    private void txt_CorreoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_CorreoFocusGained
        if(txt_Correo.getText().equals("Correo")){
            txt_Correo.setText(null);
            txt_Correo.requestFocus();
            
            removePlaceholderStyle(txt_Correo);
        }
    }//GEN-LAST:event_txt_CorreoFocusGained

    private void txt_Confirmar_ContraFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_Confirmar_ContraFocusGained

        if(txt_Confirmar_Contra.getText().equals("Correo")){
            txt_Confirmar_Contra.setText(null);
            txt_Confirmar_Contra.requestFocus();
            
            removePlaceholderStyle(txt_Confirmar_Contra);
        }
    }//GEN-LAST:event_txt_Confirmar_ContraFocusGained

    private void txt_EdadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_EdadFocusGained
        if(txt_Edad.getText().equals("Correo")){
            txt_Edad.setText(null);
            txt_Edad.requestFocus();
            
            removePlaceholderStyle(txt_Edad);
        }
    }//GEN-LAST:event_txt_EdadFocusGained

    private void txt_TelefonoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_TelefonoFocusGained
        if(txt_Telefono.getText().equals("Correo")){
            txt_Telefono.setText(null);
            txt_Telefono.requestFocus();
            
            removePlaceholderStyle(txt_Telefono);
        }
    }//GEN-LAST:event_txt_TelefonoFocusGained

    private void txt_NombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_NombreFocusLost
        if(txt_Nombre.getText().length()==0){
            addPlaceholderStyle(txt_Nombre);
            txt_Nombre.setText("Nombre");
        }
    }//GEN-LAST:event_txt_NombreFocusLost

    private void txt_ApellidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_ApellidoFocusLost
        if(txt_Apellido.getText().length()==0){
            addPlaceholderStyle(txt_Apellido);
            txt_Apellido.setText("Apellido");
        }
    }//GEN-LAST:event_txt_ApellidoFocusLost

    private void txt_NombreDeUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_NombreDeUsuarioFocusLost
        if(txt_NombreDeUsuario.getText().length()==0){
            addPlaceholderStyle(txt_NombreDeUsuario);
            txt_NombreDeUsuario.setText("Usuario");
        }
    }//GEN-LAST:event_txt_NombreDeUsuarioFocusLost

    private void txt_CorreoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_CorreoFocusLost
        if(txt_Correo.getText().length()==0){
            addPlaceholderStyle(txt_NombreDeUsuario);
            txt_NombreDeUsuario.setText("Correo");
        }
    }//GEN-LAST:event_txt_CorreoFocusLost

    private void txt_Confirmar_ContraFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_Confirmar_ContraFocusLost
        if(txt_Confirmar_Contra.getText().length()==0){
            addPlaceholderStyle(txt_Confirmar_Contra);
            txt_Confirmar_Contra.setText("Contraseña");
        }
    }//GEN-LAST:event_txt_Confirmar_ContraFocusLost

    private void txt_EdadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_EdadFocusLost
        if(txt_Confirmar_Contra.getText().length()==0){
            addPlaceholderStyle(txt_Confirmar_Contra);
            txt_Confirmar_Contra.setText("Confirmar contraseña");
        }
    }//GEN-LAST:event_txt_EdadFocusLost

    private void txt_TelefonoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_TelefonoFocusLost
        if(txt_Telefono.getText().length()==0){
            addPlaceholderStyle(txt_Telefono);
            txt_Telefono.setText("Telefono");
        }
    }//GEN-LAST:event_txt_TelefonoFocusLost

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        this.requestFocus();
    }//GEN-LAST:event_formFocusGained

    private void txt_BuscarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_BuscarFocusGained
        if(txt_Buscar.getText().equals("Correo")){
            txt_Buscar.setText(null);
            txt_Buscar.requestFocus();
            
            removePlaceholderStyle(txt_Buscar);
        }
    }//GEN-LAST:event_txt_BuscarFocusGained

    private void txt_BuscarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_BuscarFocusLost
        if(txt_Buscar.getText().length()==0){
            addPlaceholderStyle(txt_Buscar);
            txt_Buscar.setText("Buscar...");
        }
    }//GEN-LAST:event_txt_BuscarFocusLost

    private void btn_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_UpdateActionPerformed

    private void btn_UpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_UpdateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_UpdateMouseClicked

    private void btn_UpdateMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_UpdateMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_UpdateMouseDragged

    private void Btn_DeleteMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_DeleteMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_DeleteMouseDragged

    private void Btn_DeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_DeleteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_DeleteMouseClicked

    private void Btn_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_DeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_DeleteActionPerformed

    private void btn_AgregarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AgregarMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_AgregarMouseDragged

    private void btn_AgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AgregarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_AgregarMouseClicked

    private void btn_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_AgregarActionPerformed

    private void txt_Confirmar_ContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Confirmar_ContraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Confirmar_ContraActionPerformed

    private void txt_Contra1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_Contra1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Contra1FocusGained

    private void txt_Contra1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_Contra1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Contra1FocusLost

    private void txt_Contra1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Contra1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Contra1ActionPerformed

    private void txt_EdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_EdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_EdadActionPerformed

    private void cb_RolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_RolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_RolActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Btn_Delete;
    public javax.swing.JButton btn_Agregar;
    public javax.swing.JButton btn_Update;
    public javax.swing.JComboBox<String> cb_Rol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jtb_Usuarios;
    public javax.swing.JTextField txt_Apellido;
    public javax.swing.JTextField txt_Buscar;
    public javax.swing.JTextField txt_Confirmar_Contra;
    public javax.swing.JTextField txt_Contra1;
    public javax.swing.JTextField txt_Correo;
    public javax.swing.JTextField txt_Edad;
    public javax.swing.JTextField txt_Nombre;
    public javax.swing.JTextField txt_NombreDeUsuario;
    public javax.swing.JTextField txt_Telefono;
    // End of variables declaration//GEN-END:variables
}
