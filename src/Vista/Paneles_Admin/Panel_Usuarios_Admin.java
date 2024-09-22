package Vista.Paneles_Admin;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
public class Panel_Usuarios_Admin extends javax.swing.JPanel {
    public Panel_Usuarios_Admin() {
        initComponents();
        addPlaceholderStyle(txt_Nombre);
        addPlaceholderStyle(txt_Apellido);
        addPlaceholderStyle(txt_NombreDeUsuario);
        addPlaceholderStyle(txt_Correo);
        addPlaceholderStyle(txt_Contra);
        addPlaceholderStyle(txt_Telefono);
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        txt_Nombre = new javax.swing.JTextField();
        txt_Correo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtb_Usuarios = new javax.swing.JTable();
        txt_Apellido = new javax.swing.JTextField();
        txt_Contra = new javax.swing.JTextField();
        txt_Confirmar_Contra = new javax.swing.JTextField();
        txt_Edad = new javax.swing.JTextField();
        txt_Telefono = new javax.swing.JTextField();
        btn_Agregar = new javax.swing.JButton();
        cb_Rol = new javax.swing.JComboBox<>();
        txt_Buscar = new javax.swing.JTextField();
        txt_NombreDeUsuario = new javax.swing.JTextField();
        btn_Update = new javax.swing.JButton();
        Btn_Delete = new javax.swing.JButton();
        btn_Subir_IMG_Users_Admin = new javax.swing.JButton();
        IMG_User_admin = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        setBackground(new java.awt.Color(153, 153, 153));
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuarios");

        txt_Nombre.setText("Nombre");
        txt_Nombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_NombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_NombreFocusLost(evt);
            }
        });

        txt_Correo.setText("Correo");
        txt_Correo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_CorreoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_CorreoFocusLost(evt);
            }
        });
        txt_Correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_CorreoActionPerformed(evt);
            }
        });

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

        txt_Apellido.setText("Apellido");
        txt_Apellido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_ApellidoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_ApellidoFocusLost(evt);
            }
        });

        txt_Contra.setText("Contraseña");
        txt_Contra.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_ContraFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_ContraFocusLost(evt);
            }
        });

        txt_Confirmar_Contra.setText("Confirmar contraseña");
        txt_Confirmar_Contra.setName(""); // NOI18N
        txt_Confirmar_Contra.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_Confirmar_ContraFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_Confirmar_ContraFocusLost(evt);
            }
        });

        txt_Edad.setText("Edad");
        txt_Edad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_EdadFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_EdadFocusLost(evt);
            }
        });

        txt_Telefono.setText("Telefono");
        txt_Telefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_TelefonoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_TelefonoFocusLost(evt);
            }
        });

        btn_Agregar.setText("Agregar usuario");

        cb_Rol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Empleado", "Cliente" }));

        txt_Buscar.setText("Buscar...");
        txt_Buscar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_BuscarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_BuscarFocusLost(evt);
            }
        });

        txt_NombreDeUsuario.setText("Usuario");
        txt_NombreDeUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_NombreDeUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_NombreDeUsuarioFocusLost(evt);
            }
        });

        btn_Update.setText("Actualizar");

        Btn_Delete.setText("Eliminar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_Telefono)
                                .addComponent(btn_Agregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cb_Rol, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_Edad, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txt_Confirmar_Contra)
                                .addComponent(txt_Contra)
                                .addComponent(txt_Correo)
                                .addComponent(txt_NombreDeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Nombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(IMG_User_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_Buscar, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btn_Subir_IMG_Users_Admin)
                                .addGap(87, 87, 87)
                                .addComponent(btn_Update)
                                .addGap(43, 43, 43)
                                .addComponent(Btn_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(137, 137, 137))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(IMG_User_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_NombreDeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Contra, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Confirmar_Contra, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_Rol)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Subir_IMG_Users_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE))))
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

    private void txt_ContraFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_ContraFocusGained

        if(txt_Contra.getText().equals("Contraseña")){
            txt_Contra.setText(null);
            txt_Contra.requestFocus();
            
            removePlaceholderStyle(txt_Contra);
        }
    }//GEN-LAST:event_txt_ContraFocusGained

    private void txt_Confirmar_ContraFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_Confirmar_ContraFocusGained
        if(txt_Confirmar_Contra.getText().equals("Confirmar contraseña")){
            txt_Confirmar_Contra.setText(null);
            txt_Confirmar_Contra.requestFocus();
            
            removePlaceholderStyle(txt_Confirmar_Contra);
        }
    }//GEN-LAST:event_txt_Confirmar_ContraFocusGained

    private void txt_EdadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_EdadFocusGained
        if(txt_Edad.getText().equals("Edad")){
            txt_Edad.setText(null);
            txt_Edad.requestFocus();
            
            removePlaceholderStyle(txt_Edad);
        }
    }//GEN-LAST:event_txt_EdadFocusGained

    private void txt_TelefonoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_TelefonoFocusGained
        if(txt_Telefono.getText().equals("Telefono")){
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

    private void txt_ContraFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_ContraFocusLost
        if(txt_Contra.getText().length()==0){
            addPlaceholderStyle(txt_Contra);
            txt_Contra.setText("Contraseña");
        }
    }//GEN-LAST:event_txt_ContraFocusLost

    private void txt_Confirmar_ContraFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_Confirmar_ContraFocusLost
        if(txt_Confirmar_Contra.getText().length()==0){
            addPlaceholderStyle(txt_Confirmar_Contra);
            txt_Confirmar_Contra.setText("Confirmar contraseña");
        }
    }//GEN-LAST:event_txt_Confirmar_ContraFocusLost

    private void txt_EdadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_EdadFocusLost
        if(txt_Confirmar_Contra.getText().length()==0){
            addPlaceholderStyle(txt_Confirmar_Contra);
            txt_Confirmar_Contra.setText("Edad");
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
        if(txt_Buscar.getText().equals("Buscar")){
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

    private void txt_CorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_CorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_CorreoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Btn_Delete;
    public javax.swing.JLabel IMG_User_admin;
    public javax.swing.JButton btn_Agregar;
    public javax.swing.JButton btn_Subir_IMG_Users_Admin;
    public javax.swing.JButton btn_Update;
    public javax.swing.JComboBox<String> cb_Rol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jtb_Usuarios;
    public javax.swing.JTextField txt_Apellido;
    public javax.swing.JTextField txt_Buscar;
    public javax.swing.JTextField txt_Confirmar_Contra;
    public javax.swing.JTextField txt_Contra;
    public javax.swing.JTextField txt_Correo;
    public javax.swing.JTextField txt_Edad;
    public javax.swing.JTextField txt_Nombre;
    public javax.swing.JTextField txt_NombreDeUsuario;
    public javax.swing.JTextField txt_Telefono;
    // End of variables declaration//GEN-END:variables
}
