package Cards.Card_Desing;

import Card.Item.Ofertas_Client;
import Controlador.Client.Ctrl_Ofertas_Client;
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

public class card_ofertas_Cli extends javax.swing.JPanel {
    
    private boolean selected;
    private Ofertas_Client data;
    private Ctrl_Ofertas_Client controlador;
    
    public boolean isSelected(){
        return selected;
    }
    
    public void setSelected(boolean selected){
        this.selected = selected;
        repaint();
    }
    
    public card_ofertas_Cli(Ctrl_Ofertas_Client controlador) {
        this.controlador = controlador;
        initComponents();
        setOpaque(false);
    }
    
    public void setData(Ofertas_Client data){
        this.data = data;
        Lbl_Titulo_CardOffers_Cli.setText(data.getTitulo());
        Lbl_Porcentaje_CardOffers_Cli.setText(data.getPorcentaje());
        
        String imgPath = data.getImg_oferta();
        
        if (imgPath != null && !imgPath.isEmpty()){
            try {
                URL url = new URL (imgPath);
                Image image = ImageIO.read(url);
                ImageIcon icon = new ImageIcon(image);
                IMG_CardOferta_Client.setIcon(icon);
                IMG_CardOferta_Client.setText(null);
            } catch (IOException e) {
                System.out.println("Error al cargar la imagen: " + e.getMessage());
            }
            
        } else {
                IMG_CardOferta_Client.setIcon(null);
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

        shadow1 = new Componentes.Shadow();
        bordesRendodeados1 = new Componentes.BordesRendodeados();
        Lbl_Titulo_CardOffers_Cli = new javax.swing.JLabel();
        Lbl_Porcentaje_CardOffers_Cli = new javax.swing.JLabel();
        IMG_CardOferta_Client = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setDoubleBuffered(false);
        setEnabled(false);

        bordesRendodeados1.setBackground(new java.awt.Color(204, 204, 204));
        bordesRendodeados1.setEnabled(false);

        Lbl_Titulo_CardOffers_Cli.setForeground(new java.awt.Color(0, 0, 0));
        Lbl_Titulo_CardOffers_Cli.setText("jLabel1");

        Lbl_Porcentaje_CardOffers_Cli.setForeground(new java.awt.Color(0, 0, 0));
        Lbl_Porcentaje_CardOffers_Cli.setText("jLabel2");

        IMG_CardOferta_Client.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout bordesRendodeados1Layout = new javax.swing.GroupLayout(bordesRendodeados1);
        bordesRendodeados1.setLayout(bordesRendodeados1Layout);
        bordesRendodeados1Layout.setHorizontalGroup(
            bordesRendodeados1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bordesRendodeados1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(bordesRendodeados1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lbl_Titulo_CardOffers_Cli)
                    .addComponent(Lbl_Porcentaje_CardOffers_Cli))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(IMG_CardOferta_Client, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        bordesRendodeados1Layout.setVerticalGroup(
            bordesRendodeados1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bordesRendodeados1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(bordesRendodeados1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IMG_CardOferta_Client, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bordesRendodeados1Layout.createSequentialGroup()
                        .addComponent(Lbl_Titulo_CardOffers_Cli)
                        .addGap(33, 33, 33)
                        .addComponent(Lbl_Porcentaje_CardOffers_Cli)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bordesRendodeados1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bordesRendodeados1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel IMG_CardOferta_Client;
    public javax.swing.JLabel Lbl_Porcentaje_CardOffers_Cli;
    public javax.swing.JLabel Lbl_Titulo_CardOffers_Cli;
    private Componentes.BordesRendodeados bordesRendodeados1;
    private Componentes.Shadow shadow1;
    // End of variables declaration//GEN-END:variables
}
