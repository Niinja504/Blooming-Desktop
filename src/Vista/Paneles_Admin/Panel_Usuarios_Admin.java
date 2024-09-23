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
        addPlaceholderStyle(txt_Confirmar_Contra);
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
        font = font.deriveFont(Font.PLAIN|Font.BOLD);
        textField.setFont(font);
        textField.setForeground(Color.black);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
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

        jMenuItem1.setText("jMenuItem1");

        setBackground(new java.awt.Color(255, 252, 245));
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 252, 245));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 80, 65));
        jLabel1.setText("Usuarios");

        txt_Nombre.setText("Nombre");

        txt_Correo.setText("Correo");
        txt_Correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_CorreoActionPerformed(evt);
            }
        });

        jtb_Usuarios.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
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
        jtb_Usuarios.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        jScrollPane1.setViewportView(jtb_Usuarios);

        txt_Apellido.setText("Apellido");

        txt_Confirmar_Contra.setText("Confirmar contraseña");

        txt_Edad.setText("Edad");

        txt_Telefono.setText("Telefono");

        cb_Rol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Empleado", "Cliente" }));

        txt_Buscar.setText("Buscar...");

        txt_NombreDeUsuario.setText("Usuario");

        btn_Update.setBackground(new java.awt.Color(243, 143, 154));
        btn_Update.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btn_Update.setForeground(new java.awt.Color(255, 255, 255));
        btn_Update.setText("Actualizar");
        btn_Update.setBorderPainted(false);
        btn_Update.setFocusPainted(false);

        Btn_Delete.setBackground(new java.awt.Color(243, 143, 154));
        Btn_Delete.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        Btn_Delete.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Delete.setText("Eliminar");
        Btn_Delete.setBorderPainted(false);
        Btn_Delete.setFocusPainted(false);

        btn_Agregar.setBackground(new java.awt.Color(243, 143, 154));
        btn_Agregar.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btn_Agregar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Agregar.setText("Agregar usuario");
        btn_Agregar.setFocusPainted(false);

        txt_Contra1.setText("Contraseña");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_NombreDeUsuario)
                            .addComponent(txt_Nombre)
                            .addComponent(cb_Rol, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Edad, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_Telefono)
                            .addComponent(txt_Contra1)
                            .addComponent(txt_Correo)
                            .addComponent(txt_Confirmar_Contra, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                            .addComponent(txt_Apellido)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(btn_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(btn_Update)
                        .addGap(35, 35, 35)
                        .addComponent(Btn_Delete))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(txt_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(177, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(txt_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn_Delete))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txt_NombreDeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_Contra1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_Confirmar_Contra, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cb_Rol, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btn_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 710));
    }// </editor-fold>//GEN-END:initComponents

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        this.requestFocus();
    }//GEN-LAST:event_formFocusGained

    private void txt_CorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_CorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_CorreoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Btn_Delete;
    public javax.swing.JButton btn_Agregar;
    public javax.swing.JButton btn_Update;
    public javax.swing.JComboBox<String> cb_Rol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
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
