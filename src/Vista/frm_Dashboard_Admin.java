package Vista;

import Controlador.Admin.Ctrl_Usuarios;
import Vista.Paneles_Admin.Panel_Usuarios;
import Controlador.Ctrl_DashBoard_Admin;
import Menu.Admin.MenuEvent;
import Modelo.Admin.Usuarios;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialPalenightIJTheme;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class frm_Dashboard_Admin extends javax.swing.JFrame {
    private String uuid;
    private Ctrl_DashBoard_Admin ctrl;
    public frm_Dashboard_Admin(String uuid) {
        this.uuid = uuid;
        try {
            UIManager.setLookAndFeel(new FlatMaterialPalenightIJTheme());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        setIconImage(new ImageIcon(getClass().getResource("/Vista/images/Logo.png")).getImage());
        initComponents();
    }
    
    public static void init_frm_Dashboard_Admin(String uuid){
        frm_Dashboard_Admin Vista = new frm_Dashboard_Admin(uuid);
        Panel_Usuarios Panel = new Panel_Usuarios();
        Usuarios modeloUsuarios = new Usuarios();
        Ctrl_Usuarios controladorUsuarios = new Ctrl_Usuarios(modeloUsuarios, Panel);
        Vista.jpContenedor_Admin.add(Panel);
        Vista.ctrl = new Ctrl_DashBoard_Admin(Vista, Panel, uuid);
        Vista.menu.setEvent(new MenuEvent() {
        @Override
        public void selected(int index, int subIndex) {
            if (subIndex == 1) {
                Vista.ctrl.AbrirPanelPendientes();
            }
            
            if (subIndex == 2){
                Vista.ctrl.AbrirPanelEntregados();
            }
        }
     });
        Vista.setVisible(true);
    }
    
    public String getUUID() {
        return uuid;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu1 = new Menu.Admin.Menu();
        jpMenu_Admin = new javax.swing.JPanel();
        Btn_Usuarios = new javax.swing.JButton();
        Btn_Inventario = new javax.swing.JButton();
        Btn_CostoEnvio = new javax.swing.JButton();
        Btn_Notificaciones = new javax.swing.JButton();
        Btn_Perfil = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Btn_Ofertas = new javax.swing.JButton();
        btn_logout_Dashboard_Admin = new javax.swing.JButton();
        menu = new Menu.Admin.Menu();
        Btn_Ventas = new javax.swing.JButton();
        jpContenedor_Admin = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpMenu_Admin.setBackground(new java.awt.Color(231, 204, 204));
        jpMenu_Admin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Btn_Usuarios.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        Btn_Usuarios.setForeground(new java.awt.Color(0, 0, 0));
        Btn_Usuarios.setText("Usuarios");
        Btn_Usuarios.setBorderPainted(false);
        Btn_Usuarios.setContentAreaFilled(false);
        Btn_Usuarios.setFocusPainted(false);
        Btn_Usuarios.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/FnaranjaPequeña.png"))); // NOI18N
        jpMenu_Admin.add(Btn_Usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 100, 40));

        Btn_Inventario.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        Btn_Inventario.setForeground(new java.awt.Color(0, 0, 0));
        Btn_Inventario.setText("Inventario");
        Btn_Inventario.setBorderPainted(false);
        Btn_Inventario.setContentAreaFilled(false);
        Btn_Inventario.setFocusPainted(false);
        Btn_Inventario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Btn_Inventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_InventarioActionPerformed(evt);
            }
        });
        jpMenu_Admin.add(Btn_Inventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 150, 40));

        Btn_CostoEnvio.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        Btn_CostoEnvio.setForeground(new java.awt.Color(0, 0, 0));
        Btn_CostoEnvio.setText("Costo de envío");
        Btn_CostoEnvio.setBorderPainted(false);
        Btn_CostoEnvio.setContentAreaFilled(false);
        Btn_CostoEnvio.setFocusPainted(false);
        Btn_CostoEnvio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_CostoEnvioActionPerformed(evt);
            }
        });
        jpMenu_Admin.add(Btn_CostoEnvio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 180, 40));

        Btn_Notificaciones.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        Btn_Notificaciones.setForeground(new java.awt.Color(0, 0, 0));
        Btn_Notificaciones.setText("Notificaciones");
        Btn_Notificaciones.setBorderPainted(false);
        Btn_Notificaciones.setContentAreaFilled(false);
        Btn_Notificaciones.setFocusPainted(false);
        Btn_Notificaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_NotificacionesActionPerformed(evt);
            }
        });
        jpMenu_Admin.add(Btn_Notificaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 150, -1));

        Btn_Perfil.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        Btn_Perfil.setForeground(new java.awt.Color(0, 0, 0));
        Btn_Perfil.setText("Perfil");
        Btn_Perfil.setBorderPainted(false);
        Btn_Perfil.setContentAreaFilled(false);
        Btn_Perfil.setFocusPainted(false);
        Btn_Perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_PerfilActionPerformed(evt);
            }
        });
        jpMenu_Admin.add(Btn_Perfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 620, 100, 45));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/SplashScreen.png"))); // NOI18N
        jpMenu_Admin.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 196, 90));

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(74, 51, 28));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Administrador");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jpMenu_Admin.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 160, 48));

        Btn_Ofertas.setBackground(new java.awt.Color(245, 245, 245));
        Btn_Ofertas.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        Btn_Ofertas.setForeground(new java.awt.Color(0, 0, 0));
        Btn_Ofertas.setText("Ofertas");
        Btn_Ofertas.setBorderPainted(false);
        Btn_Ofertas.setContentAreaFilled(false);
        Btn_Ofertas.setFocusPainted(false);
        Btn_Ofertas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_OfertasActionPerformed(evt);
            }
        });
        jpMenu_Admin.add(Btn_Ofertas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 341, -1, 40));

        btn_logout_Dashboard_Admin.setBackground(new java.awt.Color(243, 143, 154));
        btn_logout_Dashboard_Admin.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btn_logout_Dashboard_Admin.setForeground(new java.awt.Color(255, 255, 255));
        btn_logout_Dashboard_Admin.setText("Cerrar sesión");
        btn_logout_Dashboard_Admin.setBorderPainted(false);
        jpMenu_Admin.add(btn_logout_Dashboard_Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 670, 255, 40));

        menu.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jpMenu_Admin.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 190, -1));

        Btn_Ventas.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        Btn_Ventas.setForeground(new java.awt.Color(0, 0, 0));
        Btn_Ventas.setText("Ventas");
        Btn_Ventas.setBorderPainted(false);
        Btn_Ventas.setContentAreaFilled(false);
        Btn_Ventas.setFocusPainted(false);
        Btn_Ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_VentasActionPerformed(evt);
            }
        });
        jpMenu_Admin.add(Btn_Ventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 100, -1));

        jpContenedor_Admin.setBackground(new java.awt.Color(255, 252, 250));
        jpContenedor_Admin.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpMenu_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jpContenedor_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 878, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpMenu_Admin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpContenedor_Admin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_OfertasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_OfertasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_OfertasActionPerformed

    private void Btn_PerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_PerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_PerfilActionPerformed

    private void Btn_InventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_InventarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_InventarioActionPerformed

    private void Btn_NotificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_NotificacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_NotificacionesActionPerformed

    private void Btn_CostoEnvioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_CostoEnvioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_CostoEnvioActionPerformed

    private void Btn_VentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_VentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_VentasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Btn_CostoEnvio;
    public javax.swing.JButton Btn_Inventario;
    public javax.swing.JButton Btn_Notificaciones;
    public javax.swing.JButton Btn_Ofertas;
    public javax.swing.JButton Btn_Perfil;
    public javax.swing.JButton Btn_Usuarios;
    public javax.swing.JButton Btn_Ventas;
    public javax.swing.JButton btn_logout_Dashboard_Admin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JPanel jpContenedor_Admin;
    public javax.swing.JPanel jpMenu_Admin;
    public Menu.Admin.Menu menu;
    private Menu.Admin.Menu menu1;
    // End of variables declaration//GEN-END:variables
}
