package Cards.Card_Desing;

import Controlador.Employed.Ctrl_Caja;
import Modelo.Employed.Caja_Productos;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialPalenightIJTheme;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class card_cashRegister_employed extends javax.swing.JPanel {

    private boolean selected;
    private Caja_Productos data;
    private Ctrl_Caja controlador;
    
    public boolean isSelected(){
        return selected;
    }
    
    public void setSelected(boolean selected){
        this.selected = selected;
        repaint();
    }
    
    public card_cashRegister_employed(Ctrl_Caja controlador) {
        this.controlador = controlador;
        try {
            UIManager.setLookAndFeel(new FlatMaterialPalenightIJTheme());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        initComponents();
        setOpaque(false);
    }
    
    public void setData(Caja_Productos data){
        this.data = data;
        lbl_Nombre_CashRegister_CardEmployed.setText(data.getNombre());
        lbl_Precio_CashRegister_CardEmployed.setText(data.getPrecio().toString());
        
        String imgPath = data.getImg();
        
        if (imgPath != null && !imgPath.isEmpty()){
            try {
                URL url = new URL (imgPath);
                Image image = ImageIO.read(url);
                ImageIcon icon = new ImageIcon(image);
                IMG_CashRegister_CardEmployed.setIcon(icon);
                IMG_CashRegister_CardEmployed.setText(null);
            } catch (IOException e) {
                System.out.println("Error al cargar la imagen: " + e.getMessage());
            }
            
        } else {
                IMG_CashRegister_CardEmployed.setIcon(null);
        }
    }
    
    @Override
    public void paint(Graphics grphcs){
        Graphics2D g2 = (Graphics2D) grphcs.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(new Color (242, 242, 242));
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
        if(selected){
            g2.setColor(new Color(171, 71, 188));
            g2.setStroke(new BasicStroke(4));
            g2.drawRoundRect(0, 0, getWidth() -1, getHeight() -1, 20, 20);
        }
        g2.dispose();
        super.paint(grphcs);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        IMG_CashRegister_CardEmployed = new javax.swing.JLabel();
        lbl_Nombre_CashRegister_CardEmployed = new javax.swing.JLabel();
        lbl_Precio_CashRegister_CardEmployed = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        IMG_CashRegister_CardEmployed.setBackground(new java.awt.Color(51, 51, 51));
        IMG_CashRegister_CardEmployed.setToolTipText("");

        lbl_Nombre_CashRegister_CardEmployed.setForeground(new java.awt.Color(0, 0, 0));
        lbl_Nombre_CashRegister_CardEmployed.setText("Nombre");

        lbl_Precio_CashRegister_CardEmployed.setForeground(new java.awt.Color(0, 0, 0));
        lbl_Precio_CashRegister_CardEmployed.setText("Precio");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(IMG_CashRegister_CardEmployed, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Precio_CashRegister_CardEmployed)
                            .addComponent(lbl_Nombre_CashRegister_CardEmployed))))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(IMG_CashRegister_CardEmployed, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_Nombre_CashRegister_CardEmployed)
                .addGap(18, 18, 18)
                .addComponent(lbl_Precio_CashRegister_CardEmployed)
                .addContainerGap(21, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel IMG_CashRegister_CardEmployed;
    public javax.swing.JLabel lbl_Nombre_CashRegister_CardEmployed;
    public javax.swing.JLabel lbl_Precio_CashRegister_CardEmployed;
    // End of variables declaration//GEN-END:variables
}
