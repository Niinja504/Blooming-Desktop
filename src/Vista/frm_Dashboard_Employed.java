package Vista;

import Controlador.Ctrl_DashBoard_Employed;
import Controlador.Employed.Ctrl_Caja;
import Menu.Employed.MenuEvent_Emp;
import Vista.Paneles_Employed.Panel_Caja_Employed;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialPalenightIJTheme;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class frm_Dashboard_Employed extends javax.swing.JFrame {
    private String UUID;
    private Ctrl_DashBoard_Employed ctrl;
    public frm_Dashboard_Employed(String UUID) {
        this.UUID = UUID;
        try {
            UIManager.setLookAndFeel(new FlatMaterialPalenightIJTheme());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        setIconImage(new ImageIcon(getClass().getResource("/Vista/images/Logo.png")).getImage());
        initComponents();
    }
    
    public static void init_frm_Dashboard_Employed(String UUID){
        frm_Dashboard_Employed Vista = new frm_Dashboard_Employed(UUID);
        Panel_Caja_Employed Panel = new Panel_Caja_Employed(null);
        Ctrl_Caja ctrlCaja = new Ctrl_Caja(Panel);
        Panel.setControlador(ctrlCaja);
        ctrlCaja.mostrarProductos();
        Vista.jpContenedor_Employed.add(Panel);
        Vista.ctrl = new Ctrl_DashBoard_Employed(Vista, Panel, UUID);
        Vista.menu_Emp.setEvent(new MenuEvent_Emp() {
        @Override
        public void selected(int index, int subIndex) {
            if (subIndex == 1) {
//                Vista.ctrl.AbrirPanelPendientes();
            }
            
            if (subIndex == 2){
                Vista.ctrl.AbrirPanelEntregados();
            }
        }
     });
        Vista.setVisible(true);
    }
    
    public String getUUID() {
        return UUID;
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpMenu_Client = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Btn_Ventas_DashBoard_Employed = new javax.swing.JButton();
        Btn_Caja_DashBoard_Employed = new javax.swing.JButton();
        Btn_Compra_DashBoard_Employed = new javax.swing.JButton();
        Btn_Inventario_DashBoard_Employed = new javax.swing.JButton();
        btn_logout_Dashboard_Employed = new javax.swing.JButton();
        menu_Emp = new Menu.Employed.Menu_Emp();
        jpContenedor_Employed = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1080, 720));

        jpMenu_Client.setBackground(new java.awt.Color(153, 153, 0));
        jpMenu_Client.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/SplashScreen.png"))); // NOI18N
        jpMenu_Client.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 23, 196, 90));

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Empleado");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jpMenu_Client.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 125, 160, 48));

        Btn_Ventas_DashBoard_Employed.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        Btn_Ventas_DashBoard_Employed.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Ventas_DashBoard_Employed.setText("Ventas");
        Btn_Ventas_DashBoard_Employed.setBorderPainted(false);
        Btn_Ventas_DashBoard_Employed.setContentAreaFilled(false);
        Btn_Ventas_DashBoard_Employed.setFocusPainted(false);
        Btn_Ventas_DashBoard_Employed.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/FnaranjaPequeña.png"))); // NOI18N
        jpMenu_Client.add(Btn_Ventas_DashBoard_Employed, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 100, 40));

        Btn_Caja_DashBoard_Employed.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        Btn_Caja_DashBoard_Employed.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Caja_DashBoard_Employed.setText("Caja");
        Btn_Caja_DashBoard_Employed.setBorderPainted(false);
        Btn_Caja_DashBoard_Employed.setContentAreaFilled(false);
        Btn_Caja_DashBoard_Employed.setFocusPainted(false);
        Btn_Caja_DashBoard_Employed.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/FnaranjaPequeña.png"))); // NOI18N
        jpMenu_Client.add(Btn_Caja_DashBoard_Employed, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 191, 80, 40));

        Btn_Compra_DashBoard_Employed.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        Btn_Compra_DashBoard_Employed.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Compra_DashBoard_Employed.setText("Compra");
        Btn_Compra_DashBoard_Employed.setBorderPainted(false);
        Btn_Compra_DashBoard_Employed.setContentAreaFilled(false);
        Btn_Compra_DashBoard_Employed.setFocusPainted(false);
        Btn_Compra_DashBoard_Employed.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/FnaranjaPequeña.png"))); // NOI18N
        jpMenu_Client.add(Btn_Compra_DashBoard_Employed, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 110, 40));

        Btn_Inventario_DashBoard_Employed.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        Btn_Inventario_DashBoard_Employed.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Inventario_DashBoard_Employed.setText("Inventario");
        Btn_Inventario_DashBoard_Employed.setBorderPainted(false);
        Btn_Inventario_DashBoard_Employed.setContentAreaFilled(false);
        Btn_Inventario_DashBoard_Employed.setFocusPainted(false);
        Btn_Inventario_DashBoard_Employed.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/FnaranjaPequeña.png"))); // NOI18N
        jpMenu_Client.add(Btn_Inventario_DashBoard_Employed, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 120, 40));

        btn_logout_Dashboard_Employed.setForeground(new java.awt.Color(255, 255, 255));
        btn_logout_Dashboard_Employed.setText("Cerrar sesión");
        jpMenu_Client.add(btn_logout_Dashboard_Employed, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 670, 255, 40));
        jpMenu_Client.add(menu_Emp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 260, -1));

        jpContenedor_Employed.setBackground(new java.awt.Color(255, 252, 245));
        jpContenedor_Employed.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpMenu_Client, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jpContenedor_Employed, javax.swing.GroupLayout.PREFERRED_SIZE, 878, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpContenedor_Employed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpMenu_Client, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        String uuid = "fff9f9f9ff9";
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                init_frm_Dashboard_Employed(uuid);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Btn_Caja_DashBoard_Employed;
    public javax.swing.JButton Btn_Compra_DashBoard_Employed;
    public javax.swing.JButton Btn_Inventario_DashBoard_Employed;
    public javax.swing.JButton Btn_Ventas_DashBoard_Employed;
    public javax.swing.JButton btn_logout_Dashboard_Employed;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JPanel jpContenedor_Employed;
    public javax.swing.JPanel jpMenu_Client;
    private Menu.Employed.Menu_Emp menu_Emp;
    // End of variables declaration//GEN-END:variables
}
