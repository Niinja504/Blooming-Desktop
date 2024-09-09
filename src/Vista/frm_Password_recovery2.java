package Vista;

import Controlador.Ctrl_Password_recovery2;
import Modelo.Password_recovery2;

public class frm_Password_recovery2 extends javax.swing.JFrame {
    
    private String correo;
    private String codigo;
    private Ctrl_Password_recovery2 controlador;
    
    public frm_Password_recovery2() {
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

        btn_Verificar_Codigo_Password_Recovery2 = new javax.swing.JButton();
        btn_Reenviar_Code_Password_Recovery2 = new javax.swing.JButton();
        txt_Code_Password_Recovery2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_Verificar_Codigo_Password_Recovery2.setText("Reenviar");

        btn_Reenviar_Code_Password_Recovery2.setText("Verificar código");

        txt_Code_Password_Recovery2.setText("jTextField1");

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(216, 216, 216))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(btn_Reenviar_Code_Password_Recovery2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(btn_Verificar_Codigo_Password_Recovery2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(txt_Code_Password_Recovery2, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(64, 64, 64)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                .addComponent(txt_Code_Password_Recovery2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addComponent(btn_Verificar_Codigo_Password_Recovery2)
                .addGap(52, 52, 52)
                .addComponent(btn_Reenviar_Code_Password_Recovery2)
                .addGap(62, 62, 62))
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
    private javax.swing.JLabel jLabel2;
    public javax.swing.JTextField txt_Code_Password_Recovery2;
    // End of variables declaration//GEN-END:variables
}
