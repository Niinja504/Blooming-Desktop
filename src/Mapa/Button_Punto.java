package Mapa;

import java.awt.Cursor;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Button_Punto extends JButton {
    public Button_Punto(){
        setContentAreaFilled(false);
        setIcon(new ImageIcon(getClass().getResource("/Vista/pin.png")));
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        setSize(new Dimension(24, 24));
    }
}
