package Vista;

import Vista.Paneles_Admin.Panel_Usuarios_Admin;
import Controlador.Ctrl_DashBoard_Admin;


public class frm_Dashboard_Admin extends javax.swing.JFrame {

    public frm_Dashboard_Admin() {
        initComponents();
    }
    
    public static void init_frm_Dashboard_Admin(){
        frm_Dashboard_Admin Vista = new frm_Dashboard_Admin();
        Panel_Usuarios_Admin Panel = new Panel_Usuarios_Admin();
        Vista.jpContenedor_Admin.add(Panel);
        Ctrl_DashBoard_Admin Controlador = new Ctrl_DashBoard_Admin(Vista, Panel);
        Vista.setVisible(true);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpMenu_Admin = new javax.swing.JPanel();
        Btn_Usuarios = new javax.swing.JButton();
        Btn_Inventario = new javax.swing.JButton();
        Btn_CostoEnvio = new javax.swing.JButton();
        Btn_Ofertas = new javax.swing.JButton();
        Btn_Pedidos = new javax.swing.JButton();
        Btn_Ventas = new javax.swing.JButton();
        Btn_Perfil = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jpContenedor_Admin = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpMenu_Admin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Btn_Usuarios.setText("Usuarios");
        jpMenu_Admin.add(Btn_Usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 152, 196, 45));

        Btn_Inventario.setText("Inventario");
        jpMenu_Admin.add(Btn_Inventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 203, 196, 45));

        Btn_CostoEnvio.setText("Costo de envio");
        jpMenu_Admin.add(Btn_CostoEnvio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 254, 196, 45));

        Btn_Ofertas.setText("Ofertas");
        jpMenu_Admin.add(Btn_Ofertas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 305, 196, 45));

        Btn_Pedidos.setText("Pedidos");
        jpMenu_Admin.add(Btn_Pedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 356, 196, 45));

        Btn_Ventas.setText("Ventas");
        jpMenu_Admin.add(Btn_Ventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 407, 196, 45));

        Btn_Perfil.setText("Perfil");
        jpMenu_Admin.add(Btn_Perfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 675, 196, 45));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/SplashScreen.png"))); // NOI18N
        jpMenu_Admin.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 196, 92));

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Administrador");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jpMenu_Admin.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 98, 196, 48));

        jpContenedor_Admin.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpMenu_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpContenedor_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 878, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpMenu_Admin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpContenedor_Admin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                init_frm_Dashboard_Admin();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Btn_CostoEnvio;
    public javax.swing.JButton Btn_Inventario;
    public javax.swing.JButton Btn_Ofertas;
    public javax.swing.JButton Btn_Pedidos;
    public javax.swing.JButton Btn_Perfil;
    public javax.swing.JButton Btn_Usuarios;
    public javax.swing.JButton Btn_Ventas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JPanel jpContenedor_Admin;
    public javax.swing.JPanel jpMenu_Admin;
    // End of variables declaration//GEN-END:variables
}
