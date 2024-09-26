package Componentes;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

public class RoundedImagePanel extends JPanel {
    private BufferedImage image;
    
    public void setImage(BufferedImage img) {
        this.image = img;
        repaint();
    }
   
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (image != null) {
            g.drawImage(image, 0, 0, getWidth(), getHeight(), null);
        }
    }
    
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(280, 280); 
    }
}
