package Vista.Paneles_Admin;

import Controlador.Admin.Ctrl_Perfil;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialPalenightIJTheme;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Panel_Perfil extends javax.swing.JPanel {

    private String UUID;
    private Ctrl_Perfil controlador;

    public Panel_Perfil(String UUID, Ctrl_Perfil controlador) {
        this.UUID = UUID;
        this.controlador = controlador;
        try {
            UIManager.setLookAndFeel(new FlatMaterialPalenightIJTheme());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        initComponents();
        initCustomComponents();
    }

    public String getUUID() {
        return UUID;
    }

    public void setControlador(Ctrl_Perfil controlador) {
        this.controlador = controlador;
        controlador.Cargar(UUID);
    }

    private void initCustomComponents() {
        try {
            InputStream imageStream = getClass().getResourceAsStream("/Vista/images/profile_user.png");
            if (imageStream != null) {
                BufferedImage image = ImageIO.read(imageStream);
                roundedImagePanel.setImage(image);
            } else {
                System.err.println("No se pudo cargar la imagen. Revisa la ruta.");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("Error al cargar la imagen: " + ex.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Txt_Nombres_Profile = new javax.swing.JTextField();
        btn_Upload_photo_Admin = new javax.swing.JButton();
        Txt_Apellidos_Profile = new javax.swing.JTextField();
        Txt_NombreUsuario_Profile = new javax.swing.JTextField();
        Txt_Correo_Profile = new javax.swing.JTextField();
        Txt_Edad_Profile = new javax.swing.JTextField();
        Txt_Telefono_Profile = new javax.swing.JTextField();
        roundedImagePanel = new Componentes.RoundedImagePanel();
        jLabel1 = new javax.swing.JLabel();
        Txt_Contra_Profile = new javax.swing.JPasswordField();
        Txt_ContraConfirmar_Profile = new javax.swing.JPasswordField();
        Btn_Update_Perfil = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 252, 245));

        Txt_Nombres_Profile.setText("Nombres");

        btn_Upload_photo_Admin.setForeground(new java.awt.Color(255, 255, 255));
        btn_Upload_photo_Admin.setText("Subir");

        Txt_Apellidos_Profile.setText("Apellidos");

        Txt_NombreUsuario_Profile.setText("Nombre de usuario");

        Txt_Correo_Profile.setText("Correo");

        Txt_Edad_Profile.setText("Edad");

        Txt_Telefono_Profile.setText("Telèfono");

        roundedImagePanel.setBackground(new java.awt.Color(255, 252, 245));

        javax.swing.GroupLayout roundedImagePanelLayout = new javax.swing.GroupLayout(roundedImagePanel);
        roundedImagePanel.setLayout(roundedImagePanelLayout);
        roundedImagePanelLayout.setHorizontalGroup(
            roundedImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );
        roundedImagePanelLayout.setVerticalGroup(
            roundedImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Contraseña");

        Btn_Update_Perfil.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Update_Perfil.setText("Actualizar");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nueva Contraseña");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Confirmar contraseña");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(roundedImagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                .addComponent(btn_Upload_photo_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(211, 211, 211))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(Txt_Contra_Profile, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Txt_Edad_Profile, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Txt_NombreUsuario_Profile, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Txt_Nombres_Profile, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE))
                                    .addComponent(jLabel2))
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(Txt_Apellidos_Profile)
                                        .addComponent(Txt_Correo_Profile)
                                        .addComponent(Txt_Telefono_Profile, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                                        .addComponent(Txt_ContraConfirmar_Profile))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(291, 291, 291)
                        .addComponent(Btn_Update_Perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(btn_Upload_photo_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(roundedImagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Nombres_Profile, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Apellidos_Profile, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_NombreUsuario_Profile, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Correo_Profile, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Edad_Profile, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Telefono_Profile, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Contra_Profile, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_ContraConfirmar_Profile, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Btn_Update_Perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Btn_Update_Perfil;
    public javax.swing.JTextField Txt_Apellidos_Profile;
    public javax.swing.JPasswordField Txt_ContraConfirmar_Profile;
    public javax.swing.JPasswordField Txt_Contra_Profile;
    public javax.swing.JTextField Txt_Correo_Profile;
    public javax.swing.JTextField Txt_Edad_Profile;
    public javax.swing.JTextField Txt_NombreUsuario_Profile;
    public javax.swing.JTextField Txt_Nombres_Profile;
    public javax.swing.JTextField Txt_Telefono_Profile;
    public javax.swing.JButton btn_Upload_photo_Admin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public Componentes.RoundedImagePanel roundedImagePanel;
    // End of variables declaration//GEN-END:variables
}
