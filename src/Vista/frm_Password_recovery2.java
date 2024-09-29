package Vista;

import Controlador.Ctrl_Password_recovery2;
import Modelo.Password_recovery2;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialPalenightIJTheme;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class frm_Password_recovery2 extends javax.swing.JFrame {
    
    private String correo;
    private String codigo;
    private Ctrl_Password_recovery2 controlador;
    
    public frm_Password_recovery2() {
        try {
            // UIManager.setLookAndFeel(new FlatLightLaf()); 
            UIManager.setLookAndFeel(new FlatMaterialPalenightIJTheme());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        setIconImage(new ImageIcon(getClass().getResource("/Vista/images/Logo.png")).getImage());
        initComponents();
        initController();
    }
    
    private void initController() {
        Password_recovery2 modelo = new Password_recovery2();
        controlador = new Ctrl_Password_recovery2(modelo, this);
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    public String getCorreo() {
        return this.correo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_Verificar_Codigo_Password_Recovery2 = new javax.swing.JButton();
        btn_Reenviar_Code_Password_Recovery2 = new javax.swing.JButton();
        txt_Code_Password_Recovery2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_Verificar_Codigo_Password_Recovery2.setText("Reenviar");

        btn_Reenviar_Code_Password_Recovery2.setText("Verificar código");

        txt_Code_Password_Recovery2.setText("Còdigo");

        jLabel2.setText("<html><p>Revisa la bandeja de entrada de tu correo e introduce el còdigo<p>"
            + "<p>de 6 digitos que se te ha enviado para verificar<p>"
            + "<p>que eres tù quien quiere restablecer la contraseña de tu cuenta.<p><html>"
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Restablecer contraseña");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 143, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(134, 134, 134))
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txt_Code_Password_Recovery2, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                        .addComponent(btn_Verificar_Codigo_Password_Recovery2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Reenviar_Code_Password_Recovery2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addComponent(txt_Code_Password_Recovery2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btn_Reenviar_Code_Password_Recovery2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Verificar_Codigo_Password_Recovery2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
     public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new frm_Password_recovery2().setVisible(true);
            System.out.println("Vista mostrada.");
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_Reenviar_Code_Password_Recovery2;
    public javax.swing.JButton btn_Verificar_Codigo_Password_Recovery2;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField txt_Code_Password_Recovery2;
    // End of variables declaration//GEN-END:variables
}
