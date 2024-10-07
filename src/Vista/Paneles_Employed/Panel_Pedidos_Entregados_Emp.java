package Vista.Paneles_Employed;

import Card.Item.PedidosEntregados_Admin;
import Card.Item.PedidosEntregados_Emp;
import Cards.Card_Desing.card_pedidos_Entregados_Emp;
import Cards.EventItemImpl_PedidosEn_Emp;
import Cards.Eventos.EventItem_PedidosEntregados_Emp;
import Cards.ScrollBar;
import Controlador.Employed.Ctrl_PedidosEntregados_Emp;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialPalenightIJTheme;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;
import java.util.List;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Panel_Pedidos_Entregados_Emp extends javax.swing.JPanel {

    private EventItem_PedidosEntregados_Emp event;
    private Ctrl_PedidosEntregados_Emp controlador; 
    
    public Panel_Pedidos_Entregados_Emp(Ctrl_PedidosEntregados_Emp controlador) {
        this.controlador = controlador;
        this.event = new EventItemImpl_PedidosEn_Emp();
        try {
            UIManager.setLookAndFeel(new FlatMaterialPalenightIJTheme());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        initComponents();
        scroll.setVerticalScrollBar(new ScrollBar());
        panelItem.setPreferredSize(new Dimension(600, 720));
        jPanel1.setPreferredSize(new Dimension(300, 720));
    }
    
    public void setControlador(Ctrl_PedidosEntregados_Emp controlador) {
       this.controlador = controlador;
    }

    public void addItem(PedidosEntregados_Emp data) {
        card_pedidos_Entregados_Emp item = new card_pedidos_Entregados_Emp(controlador);
        item.setData(data);
        item.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                if (SwingUtilities.isLeftMouseButton(me)) {
                    setSelected(item);
                    event.itemClick(item, data, Panel_Pedidos_Entregados_Emp.this);
                }
            }
        });
        panelItem.add(item);
        panelItem.repaint();
        panelItem.revalidate();
    }
    
    public void setSelected(Component item){
        for (Component com : panelItem.getComponents()){
            card_pedidos_Entregados_Emp i = (card_pedidos_Entregados_Emp) com;
            if (i.isSelected()){
                i.setSelected(false);
            }
        }
        ((card_pedidos_Entregados_Emp) item).setSelected(true);
    }
    
    public void ShowItem(PedidosEntregados_Emp data){
        Lbl_Nombre_Detalles_Pedido.setText(data.getNombreCliente());
        Lbl_FechaEntrga_Detalles_Pedido.setText(data.getFechaEntrega());
        Lbl_HoraEntrga_Detalles_Pedido.setText(data.getHorarioEntrega());
        Lbl_DireccionEntrega_Detalles_Pedido.setText(data.getLugarEntrega());
        Lbl_Dedicatoria_Detalles_Pedido.setText(data.getSinMensaje());
        DecimalFormat df = new DecimalFormat("$#, ##0.00");
        Lbl_Costo_Detalles_Pedido.setText(df.format(data.getSubTotal()));
    }
    
    public void cargarPedidos(List<PedidosEntregados_Emp> pedidos) {
       panelItem.removeAll(); 
       for (PedidosEntregados_Emp pedido : pedidos) {
            addItem(pedido);
        }
       panelItem.revalidate(); 
       panelItem.repaint();
    }
    
    public void setEvent(EventItem_PedidosEntregados_Emp event) {
        this.event = event;
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        Lbl_Nombre_Detalles_Pedido = new javax.swing.JLabel();
        Lbl_FechaEntrga_Detalles_Pedido = new javax.swing.JLabel();
        Lbl_HoraEntrga_Detalles_Pedido = new javax.swing.JLabel();
        Lbl_Dedicatoria_Detalles_Pedido = new javax.swing.JLabel();
        Lbl_DireccionEntrega_Detalles_Pedido = new javax.swing.JLabel();
        Lbl_Costo_Detalles_Pedido = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        scroll = new javax.swing.JScrollPane();
        panelItem = new Cards.PanelItem();

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Pedidos entregados");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Cliente:");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Costo pedido:");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Dirección de envio");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Información de envio:");

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Fecha de entrega:");

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Hora de entrega:");

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Dedicatoria:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Detalles del pedido");

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Envio:");

        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Eliminar pedido");

        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Nota:");

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

        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Sin nota");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator4)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(Lbl_Costo_Detalles_Pedido)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addComponent(jSeparator5)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(73, 73, 73)
                        .addComponent(Lbl_Nombre_Detalles_Pedido))
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(47, 47, 47)
                        .addComponent(Lbl_DireccionEntrega_Detalles_Pedido))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(81, 81, 81)
                        .addComponent(Lbl_Dedicatoria_Detalles_Pedido))
                    .addComponent(jLabel9)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Lbl_HoraEntrga_Detalles_Pedido)
                            .addComponent(Lbl_FechaEntrga_Detalles_Pedido))))
                .addContainerGap(87, Short.MAX_VALUE))
            .addComponent(jSeparator2)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 267, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Lbl_Nombre_Detalles_Pedido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Lbl_FechaEntrga_Detalles_Pedido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Lbl_HoraEntrga_Detalles_Pedido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Lbl_DireccionEntrega_Detalles_Pedido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(Lbl_Dedicatoria_Detalles_Pedido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel10)
                    .addComponent(Lbl_Costo_Detalles_Pedido))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel11)))
        );

        scroll.setBorder(null);
        scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scroll.setViewportView(panelItem);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lbl_Costo_Detalles_Pedido;
    private javax.swing.JLabel Lbl_Dedicatoria_Detalles_Pedido;
    private javax.swing.JLabel Lbl_DireccionEntrega_Detalles_Pedido;
    private javax.swing.JLabel Lbl_FechaEntrga_Detalles_Pedido;
    private javax.swing.JLabel Lbl_HoraEntrga_Detalles_Pedido;
    private javax.swing.JLabel Lbl_Nombre_Detalles_Pedido;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private Cards.PanelItem panelItem;
    private javax.swing.JScrollPane scroll;
    // End of variables declaration//GEN-END:variables
}
