package Vista;

import Controlador.Client.Ctrl_Ofertas_Client;
import Controlador.Ctrl_Dashboard_Client;
import Menu.Client.MenuEvent_Cli;
import Vista.Paneles_Client.Panel_Inicio_Client;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialPalenightIJTheme;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class frm_Dashboard_Client extends javax.swing.JFrame {
    
    private Ctrl_Dashboard_Client ctrl;
    public frm_Dashboard_Client() {
        try {
            UIManager.setLookAndFeel(new FlatMaterialPalenightIJTheme());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        setIconImage(new ImageIcon(getClass().getResource("/Vista/images/Logo.png")).getImage());
        initComponents();
    }

    
    public static void initfrm_Dashboard_Client(){
        frm_Dashboard_Client Vista = new frm_Dashboard_Client();
        Panel_Inicio_Client Panel = new Panel_Inicio_Client(null);
        Ctrl_Ofertas_Client ctrlOfertas = new Ctrl_Ofertas_Client(Panel);
        Panel.setControlador(ctrlOfertas);
        ctrlOfertas.mostrarOfertas();
        Vista.jpContenedor_Client.add(Panel);
        Vista.ctrl = new Ctrl_Dashboard_Client(Vista, Panel);
        Vista.menu_Cli.setEvent(new MenuEvent_Cli(){
        @Override
        public void selected(int index, int subIndex){
           switch (subIndex) {
                case 1:
                    Vista.ctrl.AbrirPanelPendientes();
                    break;
                case 2:
                    Vista.ctrl.AbrirPanelEntregados();
                    break;
            }
        }
      });
        Vista.setVisible(true);
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpMenu_Client = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Btn_Inicio_DashBoard_Client = new javax.swing.JButton();
        Btn_Perfil_DashBoard_Client = new javax.swing.JButton();
        Btn_Tienda_DashBoard_Client = new javax.swing.JButton();
        Btn_Compra_DashBoard_Client = new javax.swing.JButton();
        btn_logout_Dashboard_Client = new javax.swing.JButton();
        menu_Cli = new Menu.Client.Menu_Cli();
        jpContenedor_Client = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpMenu_Client.setBackground(new java.awt.Color(255, 153, 153));
        jpMenu_Client.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/SplashScreen.png"))); // NOI18N
        jpMenu_Client.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 23, 196, 90));

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cliente");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jpMenu_Client.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 125, 160, 48));

        Btn_Inicio_DashBoard_Client.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        Btn_Inicio_DashBoard_Client.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Inicio_DashBoard_Client.setText("Inicio");
        Btn_Inicio_DashBoard_Client.setBorderPainted(false);
        Btn_Inicio_DashBoard_Client.setContentAreaFilled(false);
        Btn_Inicio_DashBoard_Client.setFocusPainted(false);
        Btn_Inicio_DashBoard_Client.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/FnaranjaPequeña.png"))); // NOI18N
        jpMenu_Client.add(Btn_Inicio_DashBoard_Client, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 191, 100, 40));

        Btn_Perfil_DashBoard_Client.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        Btn_Perfil_DashBoard_Client.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Perfil_DashBoard_Client.setText("Perfil");
        Btn_Perfil_DashBoard_Client.setBorderPainted(false);
        Btn_Perfil_DashBoard_Client.setContentAreaFilled(false);
        Btn_Perfil_DashBoard_Client.setFocusPainted(false);
        Btn_Perfil_DashBoard_Client.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/FnaranjaPequeña.png"))); // NOI18N
        jpMenu_Client.add(Btn_Perfil_DashBoard_Client, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 620, 100, 40));

        Btn_Tienda_DashBoard_Client.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        Btn_Tienda_DashBoard_Client.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Tienda_DashBoard_Client.setText("Tienda");
        Btn_Tienda_DashBoard_Client.setBorderPainted(false);
        Btn_Tienda_DashBoard_Client.setContentAreaFilled(false);
        Btn_Tienda_DashBoard_Client.setFocusPainted(false);
        Btn_Tienda_DashBoard_Client.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/FnaranjaPequeña.png"))); // NOI18N
        jpMenu_Client.add(Btn_Tienda_DashBoard_Client, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 100, 40));

        Btn_Compra_DashBoard_Client.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        Btn_Compra_DashBoard_Client.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Compra_DashBoard_Client.setText("Compra");
        Btn_Compra_DashBoard_Client.setBorderPainted(false);
        Btn_Compra_DashBoard_Client.setContentAreaFilled(false);
        Btn_Compra_DashBoard_Client.setFocusPainted(false);
        Btn_Compra_DashBoard_Client.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/FnaranjaPequeña.png"))); // NOI18N
        jpMenu_Client.add(Btn_Compra_DashBoard_Client, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 337, 100, 40));

        btn_logout_Dashboard_Client.setText("Cerrar sesión");
        jpMenu_Client.add(btn_logout_Dashboard_Client, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 670, 260, 40));
        jpMenu_Client.add(menu_Cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 260, -1));

        jpContenedor_Client.setBackground(new java.awt.Color(255, 252, 245));
        jpContenedor_Client.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jpMenu_Client, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jpContenedor_Client, javax.swing.GroupLayout.PREFERRED_SIZE, 878, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpContenedor_Client, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpMenu_Client, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frm_Dashboard_Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_Dashboard_Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_Dashboard_Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_Dashboard_Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                initfrm_Dashboard_Client();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Btn_Compra_DashBoard_Client;
    public javax.swing.JButton Btn_Inicio_DashBoard_Client;
    public javax.swing.JButton Btn_Perfil_DashBoard_Client;
    public javax.swing.JButton Btn_Tienda_DashBoard_Client;
    public javax.swing.JButton btn_logout_Dashboard_Client;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JPanel jpContenedor_Client;
    public javax.swing.JPanel jpMenu_Client;
    private Menu.Client.Menu_Cli menu_Cli;
    // End of variables declaration//GEN-END:variables
}
