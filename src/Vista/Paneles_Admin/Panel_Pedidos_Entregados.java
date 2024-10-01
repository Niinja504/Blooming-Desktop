package Vista.Paneles_Admin;

import Card.Item.PedidosEntregados_Admin;
import Cards.EventItemImpl_PedidosEn;
import Cards.EventItem_PedidosEntregados;
import Cards.ScrollBar;
import Cards.card_pedidos_Entregados;
import Controlador.Admin.Ctrl_PedidosEntregados_admin;
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
        panelItem.setPreferredSize(new Dimension(600, 720));
        jPanel4.setPreferredSize(new Dimension(300, 720));
    }
    
    public void setControlador(Ctrl_PedidosEntregados_admin controlador) {
       this.controlador = controlador;
    }

    public void addItem(PedidosEntregados_Admin data) {
        card_pedidos_Entregados item = new card_pedidos_Entregados(controlador);
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
            card_pedidos_Entregados i = (card_pedidos_Entregados) com;
            if (i.isSelected()){
                i.setSelected(false);
            }
        }
        ((card_pedidos_Entregados) item).setSelected(true);
    }
    
    public void ShowItem(PedidosEntregados_Admin data){
        Lbl_Nombre_Detalles_Pedido.setText(data.getNombreCliente());
        Lbl_FechaEntrga_Detalles_Pedido.setText(data.getFechaEntrega());
        Lbl_HoraEntrga_Detalles_Pedido.setText(data.getHorarioEntrega());
        Lbl_DireccionEntrega_Detalles_Pedido.setText(data.getLugarEntrega());
        Lbl_Dedicatoria_Detalles_Pedido.setText(data.getSinMensaje());
        DecimalFormat df = new DecimalFormat("$#, ##0.00");
        Lbl_Costo_Detalles_Pedido.setText(df.format(data.getSubTotal()));
        //Costo de envio
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
        Lbl_Nombre_Detalles_Pedido3 = new javax.swing.JLabel();
        Lbl_FechaEntrga_Detalles_Pedido3 = new javax.swing.JLabel();
        Lbl_HoraEntrga_Detalles_Pedido3 = new javax.swing.JLabel();
        Lbl_Dedicatoria_Detalles_Pedido3 = new javax.swing.JLabel();
        Lbl_DireccionEntrega_Detalles_Pedido3 = new javax.swing.JLabel();
        Lbl_Costo_Detalles_Pedido3 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        scroll1 = new javax.swing.JScrollPane();
        panelItem1 = new Cards.PanelItem();
        jPanel6 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jSeparator21 = new javax.swing.JSeparator();
        jSeparator22 = new javax.swing.JSeparator();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jSeparator23 = new javax.swing.JSeparator();
        jSeparator24 = new javax.swing.JSeparator();
        jLabel56 = new javax.swing.JLabel();
        jSeparator25 = new javax.swing.JSeparator();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel59 = new javax.swing.JLabel();
        Lbl_Nombre_Detalles_Pedido4 = new javax.swing.JLabel();
        Lbl_FechaEntrga_Detalles_Pedido4 = new javax.swing.JLabel();
        Lbl_HoraEntrga_Detalles_Pedido4 = new javax.swing.JLabel();
        Lbl_Dedicatoria_Detalles_Pedido4 = new javax.swing.JLabel();
        Lbl_DireccionEntrega_Detalles_Pedido4 = new javax.swing.JLabel();
        Lbl_Costo_Detalles_Pedido4 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();

        scroll.setBorder(null);
        scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        panelItem.setPreferredSize(new java.awt.Dimension(10, 20));
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

        jButton4.setText("Eliminar pedido");

        jLabel47.setForeground(new java.awt.Color(0, 0, 0));
        jLabel47.setText("Nota:");

        Lbl_Nombre_Detalles_Pedido3.setForeground(new java.awt.Color(0, 0, 0));
        Lbl_Nombre_Detalles_Pedido3.setText("jLabel12");

        Lbl_FechaEntrga_Detalles_Pedido3.setForeground(new java.awt.Color(0, 0, 0));
        Lbl_FechaEntrga_Detalles_Pedido3.setText("jLabel12");

        Lbl_HoraEntrga_Detalles_Pedido3.setForeground(new java.awt.Color(0, 0, 0));
        Lbl_HoraEntrga_Detalles_Pedido3.setText("jLabel12");

        Lbl_Dedicatoria_Detalles_Pedido3.setForeground(new java.awt.Color(0, 0, 0));
        Lbl_Dedicatoria_Detalles_Pedido3.setText("jLabel12");

        Lbl_DireccionEntrega_Detalles_Pedido3.setForeground(new java.awt.Color(0, 0, 0));
        Lbl_DireccionEntrega_Detalles_Pedido3.setText("jLabel12");

        Lbl_Costo_Detalles_Pedido3.setForeground(new java.awt.Color(0, 0, 0));
        Lbl_Costo_Detalles_Pedido3.setText("jLabel12");

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
                        .addComponent(Lbl_Costo_Detalles_Pedido3)
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
                        .addComponent(Lbl_Nombre_Detalles_Pedido3))
                    .addComponent(jLabel41)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel40)
                        .addGap(47, 47, 47)
                        .addComponent(Lbl_DireccionEntrega_Detalles_Pedido3))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel44)
                        .addGap(81, 81, 81)
                        .addComponent(Lbl_Dedicatoria_Detalles_Pedido3))
                    .addComponent(jLabel45)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel42)
                            .addComponent(jLabel43))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Lbl_HoraEntrga_Detalles_Pedido3)
                            .addComponent(Lbl_FechaEntrga_Detalles_Pedido3))))
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
                    .addComponent(Lbl_Nombre_Detalles_Pedido3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator17, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(Lbl_FechaEntrga_Detalles_Pedido3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(Lbl_HoraEntrga_Detalles_Pedido3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator18, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(Lbl_DireccionEntrega_Detalles_Pedido3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator19, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(Lbl_Dedicatoria_Detalles_Pedido3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator20, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(jLabel46)
                    .addComponent(Lbl_Costo_Detalles_Pedido3))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel47)))
        );

        scroll1.setBorder(null);
        scroll1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        panelItem1.setPreferredSize(new java.awt.Dimension(10, 20));
        scroll1.setViewportView(panelItem1);

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));

        jLabel49.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(0, 0, 0));
        jLabel49.setText("Pedidos pendientes");

        jLabel50.setForeground(new java.awt.Color(0, 0, 0));
        jLabel50.setText("Cliente:");

        jLabel51.setForeground(new java.awt.Color(0, 0, 0));
        jLabel51.setText("Costo pedido:");

        jLabel52.setForeground(new java.awt.Color(0, 0, 0));
        jLabel52.setText("Dirección de envio");

        jLabel53.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(0, 0, 0));
        jLabel53.setText("Información de envio:");

        jLabel54.setForeground(new java.awt.Color(0, 0, 0));
        jLabel54.setText("Fecha de entrega:");

        jLabel55.setForeground(new java.awt.Color(0, 0, 0));
        jLabel55.setText("Hora de entrega:");

        jLabel56.setForeground(new java.awt.Color(0, 0, 0));
        jLabel56.setText("Dedicatoria:");

        jLabel57.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(0, 0, 0));
        jLabel57.setText("Detalles del pedido");

        jLabel58.setForeground(new java.awt.Color(0, 0, 0));
        jLabel58.setText("Envio:");

        jButton5.setText("Eliminar pedido");

        jLabel59.setForeground(new java.awt.Color(0, 0, 0));
        jLabel59.setText("Nota:");

        Lbl_Nombre_Detalles_Pedido4.setForeground(new java.awt.Color(0, 0, 0));
        Lbl_Nombre_Detalles_Pedido4.setText("jLabel12");

        Lbl_FechaEntrga_Detalles_Pedido4.setForeground(new java.awt.Color(0, 0, 0));
        Lbl_FechaEntrga_Detalles_Pedido4.setText("jLabel12");

        Lbl_HoraEntrga_Detalles_Pedido4.setForeground(new java.awt.Color(0, 0, 0));
        Lbl_HoraEntrga_Detalles_Pedido4.setText("jLabel12");

        Lbl_Dedicatoria_Detalles_Pedido4.setForeground(new java.awt.Color(0, 0, 0));
        Lbl_Dedicatoria_Detalles_Pedido4.setText("jLabel12");

        Lbl_DireccionEntrega_Detalles_Pedido4.setForeground(new java.awt.Color(0, 0, 0));
        Lbl_DireccionEntrega_Detalles_Pedido4.setText("jLabel12");

        Lbl_Costo_Detalles_Pedido4.setForeground(new java.awt.Color(0, 0, 0));
        Lbl_Costo_Detalles_Pedido4.setText("jLabel12");

        jLabel60.setForeground(new java.awt.Color(0, 0, 0));
        jLabel60.setText("Sin nota");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator21)
            .addComponent(jSeparator24)
            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator23, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel59)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel60, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel51)
                        .addGap(18, 18, 18)
                        .addComponent(Lbl_Costo_Detalles_Pedido4)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel58)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addComponent(jSeparator25)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel50)
                        .addGap(73, 73, 73)
                        .addComponent(Lbl_Nombre_Detalles_Pedido4))
                    .addComponent(jLabel53)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel52)
                        .addGap(47, 47, 47)
                        .addComponent(Lbl_DireccionEntrega_Detalles_Pedido4))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel56)
                        .addGap(81, 81, 81)
                        .addComponent(Lbl_Dedicatoria_Detalles_Pedido4))
                    .addComponent(jLabel57)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel54)
                            .addComponent(jLabel55))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Lbl_HoraEntrga_Detalles_Pedido4)
                            .addComponent(Lbl_FechaEntrga_Detalles_Pedido4))))
                .addContainerGap(87, Short.MAX_VALUE))
            .addComponent(jSeparator22)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel49)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel49)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 267, Short.MAX_VALUE)
                .addComponent(jSeparator21, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(Lbl_Nombre_Detalles_Pedido4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator22, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel53)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(Lbl_FechaEntrga_Detalles_Pedido4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(Lbl_HoraEntrga_Detalles_Pedido4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator23, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(Lbl_DireccionEntrega_Detalles_Pedido4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator24, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56)
                    .addComponent(Lbl_Dedicatoria_Detalles_Pedido4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator25, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel57)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(jLabel58)
                    .addComponent(Lbl_Costo_Detalles_Pedido4))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel59)))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(scroll1, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(scroll1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel Lbl_Costo_Detalles_Pedido;
    public javax.swing.JLabel Lbl_Costo_Detalles_Pedido1;
    public javax.swing.JLabel Lbl_Costo_Detalles_Pedido2;
    public javax.swing.JLabel Lbl_Costo_Detalles_Pedido3;
    public javax.swing.JLabel Lbl_Costo_Detalles_Pedido4;
    public javax.swing.JLabel Lbl_Dedicatoria_Detalles_Pedido;
    public javax.swing.JLabel Lbl_Dedicatoria_Detalles_Pedido1;
    public javax.swing.JLabel Lbl_Dedicatoria_Detalles_Pedido2;
    public javax.swing.JLabel Lbl_Dedicatoria_Detalles_Pedido3;
    public javax.swing.JLabel Lbl_Dedicatoria_Detalles_Pedido4;
    public javax.swing.JLabel Lbl_DireccionEntrega_Detalles_Pedido;
    public javax.swing.JLabel Lbl_DireccionEntrega_Detalles_Pedido1;
    public javax.swing.JLabel Lbl_DireccionEntrega_Detalles_Pedido2;
    public javax.swing.JLabel Lbl_DireccionEntrega_Detalles_Pedido3;
    public javax.swing.JLabel Lbl_DireccionEntrega_Detalles_Pedido4;
    public javax.swing.JLabel Lbl_FechaEntrga_Detalles_Pedido;
    public javax.swing.JLabel Lbl_FechaEntrga_Detalles_Pedido1;
    public javax.swing.JLabel Lbl_FechaEntrga_Detalles_Pedido2;
    public javax.swing.JLabel Lbl_FechaEntrga_Detalles_Pedido3;
    public javax.swing.JLabel Lbl_FechaEntrga_Detalles_Pedido4;
    public javax.swing.JLabel Lbl_HoraEntrga_Detalles_Pedido;
    public javax.swing.JLabel Lbl_HoraEntrga_Detalles_Pedido1;
    public javax.swing.JLabel Lbl_HoraEntrga_Detalles_Pedido2;
    public javax.swing.JLabel Lbl_HoraEntrga_Detalles_Pedido3;
    public javax.swing.JLabel Lbl_HoraEntrga_Detalles_Pedido4;
    public javax.swing.JLabel Lbl_Nombre_Detalles_Pedido;
    public javax.swing.JLabel Lbl_Nombre_Detalles_Pedido1;
    public javax.swing.JLabel Lbl_Nombre_Detalles_Pedido2;
    public javax.swing.JLabel Lbl_Nombre_Detalles_Pedido3;
    public javax.swing.JLabel Lbl_Nombre_Detalles_Pedido4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JSeparator jSeparator25;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private Cards.PanelItem panelItem;
    private Cards.PanelItem panelItem1;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JScrollPane scroll1;
    // End of variables declaration//GEN-END:variables
}
