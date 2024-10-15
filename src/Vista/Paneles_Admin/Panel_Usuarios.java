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
        font = font.deriveFont(Font.PLAIN);
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
        txt_Buscar_User = new javax.swing.JTextField();
        txt_NombreDeUsuario = new javax.swing.JTextField();
        btn_Update = new javax.swing.JButton();
        Btn_Delete = new javax.swing.JButton();
        btn_Agregar = new javax.swing.JButton();
        txt_Contra = new javax.swing.JTextField();
        IMG_User = new javax.swing.JLabel();
        btn_Upload_photo_User = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        setBackground(new java.awt.Color(255, 252, 245));
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 80, 65));
        jLabel1.setText("Usuarios");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 11, -1, 31));

        txt_Nombre.setForeground(new java.awt.Color(255, 255, 255));
        txt_Nombre.setText("Nombre");
        txt_Nombre.setSelectionEnd(9);
        txt_Nombre.setSelectionStart(9);
        txt_Nombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_NombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_NombreFocusLost(evt);
            }
        });
        add(txt_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 235, 309, 35));

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
        add(txt_Correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 358, 309, 35));

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
        jtb_Usuarios.setPreferredSize(new java.awt.Dimension(520, 80));
        jScrollPane1.setViewportView(jtb_Usuarios);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 211, 551, 501));

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
        add(txt_Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 276, 309, 35));

        txt_Confirmar_Contra.setForeground(new java.awt.Color(255, 255, 255));
        txt_Confirmar_Contra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Confirmar_ContraActionPerformed(evt);
            }
        });
        add(txt_Confirmar_Contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 489, 309, 35));

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
        add(txt_Edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 542, 309, 35));

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
        add(txt_Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 583, 309, 35));

        cb_Rol.setForeground(new java.awt.Color(255, 255, 255));
        cb_Rol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Empleado", "Cliente" }));
        cb_Rol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_RolActionPerformed(evt);
            }
        });
        add(cb_Rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 624, 309, 43));

        txt_Buscar_User.setText("Buscar...");
        txt_Buscar_User.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_Buscar_UserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_Buscar_UserFocusLost(evt);
            }
        });
        add(txt_Buscar_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 0, 551, 36));

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
        add(txt_NombreDeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 317, 309, 35));

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
        add(btn_Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 65, 106, -1));

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
        add(Btn_Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 65, 98, -1));

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
        add(btn_Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 673, 309, 39));

        txt_Contra.setForeground(new java.awt.Color(255, 255, 255));
        txt_Contra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ContraActionPerformed(evt);
            }
        });
        add(txt_Contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 420, 309, 35));
        add(IMG_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 54, 175, 175));

        btn_Upload_photo_User.setBackground(new java.awt.Color(255, 252, 245));
        btn_Upload_photo_User.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/ic_upload.png"))); // NOI18N
        btn_Upload_photo_User.setBorder(null);
        add(btn_Upload_photo_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 132, 58, 61));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Contraseña");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 398, -1, -1));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Confirmar contraseña");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 467, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

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

    private void txt_ContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ContraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ContraActionPerformed

    private void txt_EdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_EdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_EdadActionPerformed

    private void cb_RolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_RolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_RolActionPerformed

    private void txt_Buscar_UserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_Buscar_UserFocusGained
        if(txt_Buscar_User.getText().equals("Buscar...")){
            txt_Buscar_User.setText(null);
            txt_Buscar_User.requestFocus();

            removePlaceholderStyle(txt_Buscar_User);
        }
    }//GEN-LAST:event_txt_Buscar_UserFocusGained

    private void txt_Buscar_UserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_Buscar_UserFocusLost
        if(txt_Buscar_User.getText().length()==0){
            addPlaceholderStyle(txt_Buscar_User);
            txt_Buscar_User.setText("Buscar...");
        }
    }//GEN-LAST:event_txt_Buscar_UserFocusLost

    private void txt_NombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_NombreFocusGained
        if(txt_Nombre.getText().equals("Nombre")){
            txt_Nombre.setText(null);
            txt_Nombre.requestFocus();

            removePlaceholderStyle(txt_Nombre);
        }
    }//GEN-LAST:event_txt_NombreFocusGained

    private void txt_NombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_NombreFocusLost
        if(txt_Nombre.getText().length()==0){
            addPlaceholderStyle(txt_Nombre);
            txt_Nombre.setText("Nombre");
        }
    }//GEN-LAST:event_txt_NombreFocusLost

    private void txt_ApellidoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_ApellidoFocusGained
        if(txt_Apellido.getText().equals("Apellido")){
            txt_Apellido.setText(null);
            txt_Apellido.requestFocus();

            removePlaceholderStyle(txt_Apellido);
        }
    }//GEN-LAST:event_txt_ApellidoFocusGained

    private void txt_ApellidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_ApellidoFocusLost
        if(txt_Apellido.getText().length()==0){
            addPlaceholderStyle(txt_Apellido);
            txt_Apellido.setText("Apellido");
        }
    }//GEN-LAST:event_txt_ApellidoFocusLost

    private void txt_NombreDeUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_NombreDeUsuarioFocusGained
        if(txt_NombreDeUsuario.getText().equals("Usuario")){
            txt_NombreDeUsuario.setText(null);
            txt_NombreDeUsuario.requestFocus();

            removePlaceholderStyle(txt_NombreDeUsuario);
        }
    }//GEN-LAST:event_txt_NombreDeUsuarioFocusGained

    private void txt_NombreDeUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_NombreDeUsuarioFocusLost
        if(txt_NombreDeUsuario.getText().length()==0){
            addPlaceholderStyle(txt_NombreDeUsuario);
            txt_NombreDeUsuario.setText("Usuario");
        }
    }//GEN-LAST:event_txt_NombreDeUsuarioFocusLost

    private void txt_CorreoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_CorreoFocusGained
        if(txt_Correo.getText().equals("Correo")){
            txt_Correo.setText(null);
            txt_Correo.requestFocus();

            removePlaceholderStyle(txt_Correo);
        }
    }//GEN-LAST:event_txt_CorreoFocusGained

    private void txt_CorreoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_CorreoFocusLost
        if(txt_Correo.getText().length()==0){
            addPlaceholderStyle(txt_Correo);
            txt_Correo.setText("Correo");
        }
    }//GEN-LAST:event_txt_CorreoFocusLost

    private void txt_EdadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_EdadFocusGained
        if(txt_Edad.getText().equals("Edad")){
            txt_Edad.setText(null);
            txt_Edad.requestFocus();

            removePlaceholderStyle(txt_Edad);
        }
    }//GEN-LAST:event_txt_EdadFocusGained

    private void txt_EdadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_EdadFocusLost
        if(txt_Edad.getText().length()==0){
            addPlaceholderStyle(txt_Edad);
            txt_Edad.setText("Edad");
        }
    }//GEN-LAST:event_txt_EdadFocusLost


    private void txt_TelefonoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_TelefonoFocusGained
        if(txt_Telefono.getText().equals("Telefono")){
            txt_Telefono.setText(null);
            txt_Telefono.requestFocus();

            removePlaceholderStyle(txt_Telefono);
        }
    }//GEN-LAST:event_txt_TelefonoFocusGained

    private void txt_TelefonoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_TelefonoFocusLost
        if(txt_Telefono.getText().length()==0){
            addPlaceholderStyle(txt_Telefono);
            txt_Telefono.setText("Telefono");
        }
    }//GEN-LAST:event_txt_TelefonoFocusLost

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        this.requestFocus();
    }//GEN-LAST:event_formFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Btn_Delete;
    public javax.swing.JLabel IMG_User;
    public javax.swing.JButton btn_Agregar;
    public javax.swing.JButton btn_Update;
    public javax.swing.JButton btn_Upload_photo_User;
    public javax.swing.JComboBox<String> cb_Rol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jtb_Usuarios;
    public javax.swing.JTextField txt_Apellido;
    public javax.swing.JTextField txt_Buscar_User;
    public javax.swing.JTextField txt_Confirmar_Contra;
    public javax.swing.JTextField txt_Contra;
    public javax.swing.JTextField txt_Correo;
    public javax.swing.JTextField txt_Edad;
    public javax.swing.JTextField txt_Nombre;
    public javax.swing.JTextField txt_NombreDeUsuario;
    public javax.swing.JTextField txt_Telefono;
    // End of variables declaration//GEN-END:variables
}
