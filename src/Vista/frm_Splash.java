package Vista;

import javax.swing.JOptionPane;


public class frm_Splash extends javax.swing.JFrame {
    public frm_Splash() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backGroundPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        LoadingBar = new javax.swing.JProgressBar();
        LoadingLabel = new javax.swing.JLabel();
        LoadingValue = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 51, 0));
        setMinimumSize(new java.awt.Dimension(509, 336));
        setUndecorated(true);

        backGroundPanel.setBackground(new java.awt.Color(255, 255, 255));
        backGroundPanel.setMaximumSize(new java.awt.Dimension(509, 336));
        backGroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/SplashScreen.png"))); // NOI18N
        backGroundPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, -1, -1));

        LoadingBar.setBackground(new java.awt.Color(0, 0, 153));
        LoadingBar.setForeground(new java.awt.Color(204, 0, 0));
        LoadingBar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 51)));
        backGroundPanel.add(LoadingBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 510, 10));

        LoadingLabel.setText("Cargando...");
        backGroundPanel.add(LoadingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        LoadingValue.setText("0 %");
        backGroundPanel.add(LoadingValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/FrosadoPequeño.png"))); // NOI18N
        jLabel8.setText("jLabel8");
        backGroundPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-160, 190, 290, 80));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/FverdePequeña.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        backGroundPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 290, 80));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/FrosaPequeña.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        backGroundPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 250, 70));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/FblancaPequeña.png"))); // NOI18N
        jLabel4.setText("jLabel3");
        backGroundPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-230, 60, 290, 90));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/FnaranjaPequeña.png"))); // NOI18N
        jLabel6.setText("jLabel4");
        backGroundPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, -40, 250, 100));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/FrosaPequeña.png"))); // NOI18N
        jLabel7.setText("jLabel2");
        backGroundPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 250, 70));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/FblancaPequeña.png"))); // NOI18N
        jLabel9.setText("jLabel3");
        backGroundPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 290, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backGroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backGroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(frm_Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        try{
           for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing. UIManager.getInstalledLookAndFeels()){
               if ("Nimbus".equals(info.getName())){
                   javax.swing.UIManager.setLookAndFeel(info.getClassName());
                   break;
               }
           }
        }catch (ClassNotFoundException ex){
            java.util.logging.Logger.getLogger(frm_Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            
        }catch (InstantiationException ex){
            java.util.logging.Logger.getLogger(frm_Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            
        }catch (IllegalAccessException ex){
            java.util.logging.Logger.getLogger(frm_Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            
        }catch (javax.swing.UnsupportedLookAndFeelException ex){
            java.util.logging.Logger.getLogger(frm_Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
            
        frm_Splash Sp = new frm_Splash();
        Sp.setVisible(true);
        
        frm_SignIn Login = new frm_SignIn();
        try{
            
            for(int i=0; i<=100;i++){
                Thread.sleep(100);
                Sp.LoadingValue.setText(i + "%");
                
                if(i == 10){
                    Sp.LoadingLabel.setText("Inicializando...");
                }
                if(i == 20){
                    Sp.LoadingLabel.setText("Cargando Modulos...");
                }
                if(i == 50){
                    Sp.LoadingLabel.setText("Cargando...");
                }
                if(i == 70){
                    Sp.LoadingLabel.setText("Conectando...");
                }
                if(i == 80){
                    Sp.LoadingLabel.setText("Iniciando la aplicación...");
                }
                Sp.LoadingBar.setValue(i);
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        Sp.setVisible(false);
        Login.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar LoadingBar;
    private javax.swing.JLabel LoadingLabel;
    private javax.swing.JLabel LoadingValue;
    private javax.swing.JPanel backGroundPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
