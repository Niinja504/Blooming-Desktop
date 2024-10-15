package Cards.Card_Desing;

import Card.Item.Notificaciones;
import Controlador.Admin.Ctrl_Notificaciones;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JOptionPane;

public class card_notifications extends javax.swing.JPanel {

    private boolean selected;
    private Notificaciones data;
    private Ctrl_Notificaciones controlador;

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
        repaint();
    }

    public card_notifications(Ctrl_Notificaciones controlador) {
        this.controlador = controlador;
        initComponents();
        setOpaque(false);
        Btn_delete_Notificacion.addActionListener(e -> eliminarNotificacion());
    }

    public void setData(Notificaciones data) {
        this.data = data;
        lbl_Titulo_Notification_card.setText(data.getTitulo());
        lbl_Mensaje_Notification_card.setText(data.getMensaje());
        lbl_Fecha_Notification_card.setText(data.getFecha());
        lbl_Hora_Notification_card.setText(data.getTiempo());
    }

    public Notificaciones getData() {
        return data;
    }

    private void eliminarNotificacion() {
        if (data != null) {
            String uuid = data.getUUID();
            boolean eliminado = controlador.eliminarNotificacion(uuid);
            if (eliminado) {
                JOptionPane.showMessageDialog(this, "La notificación se ha eliminado exitosamente.", "Eliminación Exitosa", JOptionPane.INFORMATION_MESSAGE);
                controlador.actualizarNotificacion();
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo eliminar la notificación.", "Error en la Eliminación", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo eliminar la notificación.", "Error en la Eliminación", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void paint(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(new Color(242, 242, 242));
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
        if (selected) {
            g2.setColor(new Color(171, 71, 188));
            g2.setStroke(new BasicStroke(4));
            g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 20, 20);
        }
        g2.dispose();
        super.paint(grphcs);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lbl_Titulo_Notification_card = new javax.swing.JLabel();
        lbl_Fecha_Notification_card = new javax.swing.JLabel();
        lbl_Hora_Notification_card = new javax.swing.JLabel();
        Btn_delete_Notificacion = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lbl_Mensaje_Notification_card = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(204, 204, 204));

        lbl_Titulo_Notification_card.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_Titulo_Notification_card.setForeground(new java.awt.Color(0, 0, 0));
        lbl_Titulo_Notification_card.setText("jLabel2");

        lbl_Fecha_Notification_card.setForeground(new java.awt.Color(0, 0, 0));
        lbl_Fecha_Notification_card.setText("jLabel2");

        lbl_Hora_Notification_card.setForeground(new java.awt.Color(0, 0, 0));
        lbl_Hora_Notification_card.setText("jLabel2");

        Btn_delete_Notificacion.setBackground(new java.awt.Color(204, 204, 204));
        Btn_delete_Notificacion.setForeground(new java.awt.Color(204, 204, 204));
        Btn_delete_Notificacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/delete.png"))); // NOI18N
        Btn_delete_Notificacion.setBorder(null);
        Btn_delete_Notificacion.setBorderPainted(false);
        Btn_delete_Notificacion.setContentAreaFilled(false);
        Btn_delete_Notificacion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Btn_delete_Notificacion.setFocusPainted(false);
        Btn_delete_Notificacion.setFocusable(false);
        Btn_delete_Notificacion.setRequestFocusEnabled(false);
        Btn_delete_Notificacion.addActionListener(e -> eliminarNotificacion());

        lbl_Mensaje_Notification_card.setColumns(20);
        lbl_Mensaje_Notification_card.setRows(5);
        jScrollPane1.setViewportView(lbl_Mensaje_Notification_card);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 21, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lbl_Titulo_Notification_card)
                .addGap(55, 55, 55)
                .addComponent(lbl_Fecha_Notification_card)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_Hora_Notification_card)
                .addGap(42, 42, 42)
                .addComponent(Btn_delete_Notificacion))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl_Fecha_Notification_card)
                                    .addComponent(lbl_Hora_Notification_card)))
                            .addComponent(Btn_delete_Notificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbl_Titulo_Notification_card)
                        .addGap(18, 18, 18)))
                .addComponent(jLabel1)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Btn_delete_Notificacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_Fecha_Notification_card;
    private javax.swing.JLabel lbl_Hora_Notification_card;
    public javax.swing.JTextArea lbl_Mensaje_Notification_card;
    private javax.swing.JLabel lbl_Titulo_Notification_card;
    // End of variables declaration//GEN-END:variables
}
