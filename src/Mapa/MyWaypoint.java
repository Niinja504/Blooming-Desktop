package Mapa;

import java.awt.Cursor;
import org.jxmapviewer.viewer.Waypoint;
import org.jxmapviewer.viewer.GeoPosition;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyWaypoint implements Waypoint {
    private final String name;
    private final EventPunto event;
    private final GeoPosition position;
    private JButton button;
    private boolean movable = true;

    public MyWaypoint(String name, EventPunto event, GeoPosition position) {
        this.name = name;
        this.event = event;
        this.position = position;
        initButton(event);
    }

    public String getName() {
        return name;
    }

    public JButton getButton() {
        return button;
    }

    public void setMovable(boolean movable) {
        this.movable = movable;
    }

    private void initButton(EventPunto event) {
        button = new Button_Punto();
        button.addActionListener(ae -> {
            if (event != null) {
                event.selected(MyWaypoint.this);
            } else {
                event.deselected(MyWaypoint.this);
            }
        });

        button.addMouseListener(new MouseAdapter() {
            private boolean dragging = false;
            private int prevX;
            private int prevY;

            @Override
            public void mousePressed(MouseEvent e) {
                if (movable) {
                    dragging = true;
                    prevX = e.getX();
                    prevY = e.getY();
                    button.setCursor(new Cursor(Cursor.MOVE_CURSOR));
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                dragging = false;
                button.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                if (dragging && movable) {
                    int deltaX = e.getX() - prevX;
                    int deltaY = e.getY() - prevY;
                    button.setLocation(button.getX() + deltaX, button.getY() + deltaY);
                    prevX = e.getX();
                    prevY = e.getY();
                }
            }
        });
        button.setLocation(button.getX(), button.getY());
    }

    @Override
    public GeoPosition getPosition() {
        return position;
    }
}
