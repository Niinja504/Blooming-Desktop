package Vista.Paneles_Admin;

import Card.Item.PedidosEntregados_Admin;
import Cards.EventItemImpl_PedidosEn;
import Cards.Eventos.EventItem_PedidosEntregados;
import Cards.ScrollBar;
import Cards.Card_Desing.card_pedidos_Entregados_Ad;
import Controlador.Admin.Ctrl_PedidosEntregados_admin;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialPalenightIJTheme;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Panel_Pedidos_Entregados extends javax.swing.JPanel {
    
    private EventItem_PedidosEntregados event;
    private Ctrl_PedidosEntregados_admin controlador;
    
    public Panel_Pedidos_Entregados(Ctrl_PedidosEntregados_admin controlador) {
        this.controlador = controlador;
        this.event = new EventItemImpl_PedidosEn();
        try {
            UIManager.setLookAndFeel(new FlatMaterialPalenightIJTheme());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        initComponents();
        scroll.setVerticalScrollBar(new ScrollBar());
        jPanel4.setPreferredSize(new Dimension(300, 720));
    }
    
    public void setControlador(Ctrl_PedidosEntregados_admin controlador) {
       this.controlador = controlador;
    }

    public void addItem(PedidosEntregados_Admin data) {
        card_pedidos_Entregados_Ad item = new card_pedidos_Entregados_Ad(controlador);
        item.setData(data);
        item.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                if (SwingUtilities.isLeftMouseButton(me)) {
                    setSelected(item);
                    event.itemClick(item, data, Panel_Pedidos_Entregados.this);
                }
            }
        });
        panelItem.add(item);
        panelItem.repaint();
        panelItem.revalidate();
    }
    
    public void setSelected(Component item){
        for (Component com : panelItem.getComponents()){
            card_pedidos_Entregados_Ad i = (card_pedidos_Entregados_Ad) com;
            if (i.isSelected()){
                i.setSelected(false);
            }
        }
        ((card_pedidos_Entregados_Ad) item).setSelected(true);
    }
    
    public void eliminarNotificacion(card_pedidos_Entregados_Ad item) {
        if (item != null && item.getData() != null) {
            String uuid = item.getData().getUuid();
            boolean eliminado = controlador.eliminarPedido(uuid);
            if (eliminado) {
                JOptionPane.showMessageDialog(this, "La notificación se ha eliminado exitosamente.", "Eliminación Exitosa", JOptionPane.INFORMATION_MESSAGE);
                controlador.mostrarPedidos();
                cargarPedidos(controlador.cargarPedidos());
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo eliminar la notificación.", "Error en la Eliminación", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo eliminar la notificación.", "Error en la Eliminación", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void ShowItem(PedidosEntregados_Admin data){
        Lbl_Nombre_Detalles_Pedido.setText(data.getNombreCliente());
        Lbl_FechaEntrga_Detalles_Pedido.setText(data.getFechaEntrega());
        Lbl_HoraEntrga_Detalles_Pedido.setText(data.getHorarioEntrega());
        Lbl_DireccionEntrega_Detalles_Pedido.setText(data.getLugarEntrega());
        Lbl_Dedicatoria_Detalles_Pedido.setText(data.getSinMensaje());
        DecimalFormat df = new DecimalFormat("$#, ##0.00");
        Lbl_Costo_Detalles_Pedido.setText(df.format(data.getSubTotal()));
    }
    
    public void cargarPedidos(List<PedidosEntregados_Admin> pedidos) {
       panelItem.removeAll(); 
       for (PedidosEntregados_Admin pedido : pedidos) {
            addItem(pedido);
        }
       panelItem.revalidate(); 
       panelItem.repaint();
    }
    
    public void setEvent(EventItem_PedidosEntregados event) {
        this.event = event;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scroll = new javax.swing.JScrollPane();
        panelItem = new Cards.PanelItem();
        jPanel4 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jSeparator16 = new javax.swing.JSeparator();
        jSeparator17 = new javax.swing.JSeparator();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jSeparator18 = new javax.swing.JSeparator();
        jSeparator19 = new javax.swing.JSeparator();
        jLabel44 = new javax.swing.JLabel();
        jSeparator20 = new javax.swing.JSeparator();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel47 = new javax.swing.JLabel();
        Lbl_Nombre_Detalles_Pedido = new javax.swing.JLabel();
        Lbl_FechaEntrga_Detalles_Pedido = new javax.swing.JLabel();
        Lbl_HoraEntrga_Detalles_Pedido = new javax.swing.JLabel();
        Lbl_Dedicatoria_Detalles_Pedido = new javax.swing.JLabel();
        Lbl_DireccionEntrega_Detalles_Pedido = new javax.swing.JLabel();
        Lbl_Costo_Detalles_Pedido = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();

        scroll.setBorder(null);
        scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        panelItem.setPreferredSize(new java.awt.Dimension(13, 20));
        scroll.setViewportView(panelItem);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 0, 0));
        jLabel37.setText("Pedidos pendientes");

        jLabel38.setForeground(new java.awt.Color(0, 0, 0));
        jLabel38.setText("Cliente:");

        jLabel39.setForeground(new java.awt.Color(0, 0, 0));
        jLabel39.setText("Costo pedido:");

        jLabel40.setForeground(new java.awt.Color(0, 0, 0));
        jLabel40.setText("Dirección de envio");

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(0, 0, 0));
        jLabel41.setText("Información de envio:");

        jLabel42.setForeground(new java.awt.Color(0, 0, 0));
        jLabel42.setText("Fecha de entrega:");

        jLabel43.setForeground(new java.awt.Color(0, 0, 0));
        jLabel43.setText("Hora de entrega:");

        jLabel44.setForeground(new java.awt.Color(0, 0, 0));
        jLabel44.setText("Dedicatoria:");

        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(0, 0, 0));
        jLabel45.setText("Detalles del pedido");

        jLabel46.setForeground(new java.awt.Color(0, 0, 0));
        jLabel46.setText("Envio:");

        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Eliminar pedido");

        jLabel47.setForeground(new java.awt.Color(0, 0, 0));
        jLabel47.setText("Nota:");

        Lbl_Nombre_Detalles_Pedido.setForeground(new java.awt.Color(0, 0, 0));
        Lbl_Nombre_Detalles_Pedido.setText("jLabel12");

        Lbl_FechaEntrga_Detalles_Pedido.setForeground(new java.awt.Color(0, 0, 0));
        Lbl_FechaEntrga_Detalles_Pedido.setText("jLabel12");

        Lbl_HoraEntrga_Detalles_Pedido.setForeground(new java.awt.Color(0, 0, 0));
        Lbl_HoraEntrga_Detalles_Pedido.setText("jLabel12");

        Lbl_Dedicatoria_Detalles_Pedido.setForeground(new java.awt.Color(0, 0, 0));
        Lbl_Dedicatoria_Detalles_Pedido.setText("jLabel12");

        Lbl_DireccionEntrega_Detalles_Pedido.setForeground(new java.awt.Color(0, 0, 0));
        Lbl_DireccionEntrega_Detalles_Pedido.setText("jLabel12");

        Lbl_Costo_Detalles_Pedido.setForeground(new java.awt.Color(0, 0, 0));
        Lbl_Costo_Detalles_Pedido.setText("jLabel12");

        jLabel48.setForeground(new java.awt.Color(0, 0, 0));
        jLabel48.setText("Sin nota");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator16)
            .addComponent(jSeparator19)
            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator18, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel47)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel39)
                        .addGap(18, 18, 18)
                        .addComponent(Lbl_Costo_Detalles_Pedido)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel46)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addComponent(jSeparator20)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addGap(73, 73, 73)
                        .addComponent(Lbl_Nombre_Detalles_Pedido))
                    .addComponent(jLabel41)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel40)
                        .addGap(47, 47, 47)
                        .addComponent(Lbl_DireccionEntrega_Detalles_Pedido))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel44)
                        .addGap(81, 81, 81)
                        .addComponent(Lbl_Dedicatoria_Detalles_Pedido))
                    .addComponent(jLabel45)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel42)
                            .addComponent(jLabel43))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Lbl_HoraEntrga_Detalles_Pedido)
                            .addComponent(Lbl_FechaEntrga_Detalles_Pedido))))
                .addContainerGap(87, Short.MAX_VALUE))
            .addComponent(jSeparator17)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel37)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 267, Short.MAX_VALUE)
                .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(Lbl_Nombre_Detalles_Pedido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator17, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(Lbl_FechaEntrga_Detalles_Pedido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(Lbl_HoraEntrga_Detalles_Pedido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator18, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(Lbl_DireccionEntrega_Detalles_Pedido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator19, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(Lbl_Dedicatoria_Detalles_Pedido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator20, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(jLabel46)
                    .addComponent(Lbl_Costo_Detalles_Pedido))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel47)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(597, 597, 597))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 281, Short.MAX_VALUE)
                    .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(scroll, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel Lbl_Costo_Detalles_Pedido;
    public javax.swing.JLabel Lbl_Dedicatoria_Detalles_Pedido;
    public javax.swing.JLabel Lbl_DireccionEntrega_Detalles_Pedido;
    public javax.swing.JLabel Lbl_FechaEntrga_Detalles_Pedido;
    public javax.swing.JLabel Lbl_HoraEntrga_Detalles_Pedido;
    public javax.swing.JLabel Lbl_Nombre_Detalles_Pedido;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator20;
    private Cards.PanelItem panelItem;
    private javax.swing.JScrollPane scroll;
    // End of variables declaration//GEN-END:variables
}
