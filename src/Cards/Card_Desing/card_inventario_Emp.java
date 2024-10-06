package Cards.Card_Desing;

import Card.Item.Inventario_Emp;
import Controlador.Employed.Ctrl_Inventario_Emp;
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

public class card_inventario_Emp extends javax.swing.JPanel {
    
    private boolean selected;
    private Inventario_Emp data;
    private Ctrl_Inventario_Emp controlador;
    
    public boolean isSelected(){
        return selected;
    }
    
    public void setSelected(boolean selected){
        this.selected = selected;
        repaint();
    }
    
    public card_inventario_Emp(Ctrl_Inventario_Emp controlador) {
        this.controlador = controlador;
        try {
            UIManager.setLookAndFeel(new FlatMaterialPalenightIJTheme());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        initComponents();
        setOpaque(false);
    }
    
    public void setData(Inventario_Emp data){
        this.data = data;
        lbl_NombreProducto_CardEmp.setText(data.getNombre());
        lbl_PrecioProducto_CardEmp.setText(data.getPrecio().toString());
        //Int
        lbl_CantidadProducto_CardEmp.setText(String.valueOf(data.getCantidad_Bodega()));
        
        String imgPath = data.getImg();
        
        if (imgPath != null && !imgPath.isEmpty()){
            try {
                URL url = new URL (imgPath);
                Image image = ImageIO.read(url);
                ImageIcon icon = new ImageIcon(image);
                IMG_Inventario_CardEmp.setIcon(icon);
                IMG_Inventario_CardEmp.setText(null);
            } catch (IOException e) {
                System.out.println("Error al cargar la imagen: " + e.getMessage());
            }
            
        } else {
                IMG_Inventario_CardEmp.setIcon(null);
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

        IMG_Inventario_CardEmp = new javax.swing.JLabel();
        lbl_NombreProducto_CardEmp = new javax.swing.JLabel();
        lbl_PrecioProducto_CardEmp = new javax.swing.JLabel();
        lbl_CantidadProducto_CardEmp = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        lbl_NombreProducto_CardEmp.setForeground(new java.awt.Color(0, 0, 0));
        lbl_NombreProducto_CardEmp.setText("jLabel2");

        lbl_PrecioProducto_CardEmp.setForeground(new java.awt.Color(0, 0, 0));
        lbl_PrecioProducto_CardEmp.setText("jLabel3");

        lbl_CantidadProducto_CardEmp.setForeground(new java.awt.Color(0, 0, 0));
        lbl_CantidadProducto_CardEmp.setText("jLabel4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(IMG_Inventario_CardEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lbl_PrecioProducto_CardEmp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addComponent(lbl_CantidadProducto_CardEmp)
                        .addGap(41, 41, 41))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(lbl_NombreProducto_CardEmp)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(IMG_Inventario_CardEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_NombreProducto_CardEmp)
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_PrecioProducto_CardEmp)
                            .addComponent(lbl_CantidadProducto_CardEmp))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IMG_Inventario_CardEmp;
    private javax.swing.JLabel lbl_CantidadProducto_CardEmp;
    private javax.swing.JLabel lbl_NombreProducto_CardEmp;
    private javax.swing.JLabel lbl_PrecioProducto_CardEmp;
    // End of variables declaration//GEN-END:variables
}
