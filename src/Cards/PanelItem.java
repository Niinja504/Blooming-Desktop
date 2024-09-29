package Cards;

import java.awt.Color;
import javax.swing.JPanel;

public class PanelItem extends JPanel {
    public PanelItem() {
        setBackground(Color.gray);
        setLayout(new WrapLayout(WrapLayout.LEFT, 10, 10));
    }
}
