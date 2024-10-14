package Vista.Paneles_Admin;

import Card.Item.Notificaciones;
import Cards.Card_Desing.card_notifications;
import Cards.EventItemImpl_Notifications;
import Cards.Eventos.EventItem_Notifications;
import Cards.ScrollBar;
import Controlador.Admin.Ctrl_Notificaciones;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialPalenightIJTheme;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Panel_Notificaciones extends javax.swing.JPanel {

    private EventItem_Notifications event;
    private Ctrl_Notificaciones controlador;

    public Panel_Notificaciones(Ctrl_Notificaciones controlador) {
        this.controlador = controlador;
        this.event = new EventItemImpl_Notifications();
        try {
            UIManager.setLookAndFeel(new FlatMaterialPalenightIJTheme());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        initComponents();
        scroll.setVerticalScrollBar(new ScrollBar());
        jPanel.setPreferredSize(new Dimension(878, 43));
    }

    public void setControlador(Ctrl_Notificaciones controlador) {
        this.controlador = controlador;
    }

    public void addItem(Notificaciones data) {
        card_notifications item = new card_notifications(controlador);
        item.setData(data);
        item.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                if (SwingUtilities.isLeftMouseButton(me)) {
                    setSelected(item);
                    event.itemClick(item, data, Panel_Notificaciones.this);
                }
            }
        });
        panelItem.add(item);
        panelItem.repaint();
        panelItem.revalidate();
    }

    public void setSelected(Component item) {
        for (Component com : panelItem.getComponents()) {
            card_notifications i = (card_notifications) com;
            if (i.isSelected()) {
                i.setSelected(false);
            }
        }
        ((card_notifications) item).setSelected(true);
    }

    public void eliminarNotificacion(card_notifications item) {
        if (item != null && item.getData() != null) {
            String uuid = item.getData().getUUID();
            boolean eliminado = controlador.eliminarNotificacion(uuid);
            if (eliminado) {
                JOptionPane.showMessageDialog(this, "La notificación se ha eliminado exitosamente.", "Eliminación Exitosa", JOptionPane.INFORMATION_MESSAGE);
                controlador.mostrarNotificacion();
                cargarNotificaciones(controlador.cargarNotificacion());
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo eliminar la notificación.", "Error en la Eliminación", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo eliminar la notificación.", "Error en la Eliminación", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void cargarNotificaciones(List<Notificaciones> notificaciones) {
        panelItem.removeAll();
        for (Notificaciones notificacion : notificaciones) {
            addItem(notificacion);
        }
        panelItem.revalidate();
        panelItem.repaint();
    }

    public void setEvent(EventItem_Notifications event) {
        this.event = event;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scroll = new javax.swing.JScrollPane();
        panelItem = new Cards.PanelItem();
        jPanel = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();

        scroll.setBorder(null);
        scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        panelItem.setBackground(new java.awt.Color(51, 51, 51));
        scroll.setViewportView(panelItem);

        jPanel.setBackground(new java.awt.Color(204, 204, 204));

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 0, 0));
        jLabel37.setText("Notificaciones");

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(361, 361, 361)
                .addComponent(jLabel37)
                .addContainerGap(395, Short.MAX_VALUE))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel37)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 878, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 878, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 677, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 42, Short.MAX_VALUE)
                    .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel37;
    private javax.swing.JPanel jPanel;
    private Cards.PanelItem panelItem;
    private javax.swing.JScrollPane scroll;
    // End of variables declaration//GEN-END:variables
}
