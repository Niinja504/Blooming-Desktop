package Vista.Paneles_Admin;

import Card.Item.Sales_Admin;
import Cards.ScrollBar;
import Cards.Card_Desing.card_sales_Ad;
import Cards.EventItemImpl_Ventas;
import Cards.Eventos.EventItem_Ventas_Ad;
import Controlador.Admin.Ctrl_Ventas_Admin;
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

public class Panel_Ventas extends javax.swing.JPanel {
    
    private EventItem_Ventas_Ad event;
    private Ctrl_Ventas_Admin controlador;
    
    public Panel_Ventas(Ctrl_Ventas_Admin controlador) {
        this.controlador = controlador;
        this.event = new EventItemImpl_Ventas();
        try {
            UIManager.setLookAndFeel(new FlatMaterialPalenightIJTheme());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        initComponents();
        scroll.setVerticalScrollBar(new ScrollBar());
        jPanel.setPreferredSize(new Dimension(300, 720));
    }
    
    public void setControlador(Ctrl_Ventas_Admin controlador) {
        this.controlador = controlador;
    }
    
    public void addItem(Sales_Admin data) {
        card_sales_Ad item = new card_sales_Ad(controlador);
        item.setData(data);
        item.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                if (SwingUtilities.isLeftMouseButton(me)) {
                    setSelected(item);
                    event.itemClick(item, data, Panel_Ventas.this);
                }
            }
        });
        panelItem.add(item);
        panelItem.repaint();
        panelItem.revalidate();
    }
    
    public void setSelected(Component item){
        for (Component com : panelItem.getComponents()){
            card_sales_Ad i = (card_sales_Ad) com;
            if (i.isSelected()){
                i.setSelected(false);
            }
        }
        ((card_sales_Ad) item).setSelected(true);
    }
    
    public void eliminarNotificacion(card_sales_Ad item) {
        if (item != null && item.getData() != null) {
            String uuid = item.getData().getUuid();
            boolean eliminado = controlador.eliminarVenta(uuid);
            if (eliminado) {
                JOptionPane.showMessageDialog(this, "La notificación se ha eliminado exitosamente.", "Eliminación Exitosa", JOptionPane.INFORMATION_MESSAGE);
                controlador.mostrarVentas();
                cargarVentas(controlador.cargarVentas());
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo eliminar la notificación.", "Error en la Eliminación", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo eliminar la notificación.", "Error en la Eliminación", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void ShowItem(Sales_Admin data){
        lbl_NombreCliente_Ventas_Admin.setText(data.getNombreCliente());
        lbl_NombreEmpleado_Ventas_Admin.setText(data.getNombreCliente());
        lbl_FechaVenta_Ventas_Admin.setText(data.getFechaVenta());
        lbl_HoraVenta_Ventas_Admin.setText(data.getHoraVenta());
        DecimalFormat df = new DecimalFormat("$#, ##0.00");
        lbl_TotalVenta_Ventas_Admin.setText(df.format(data.getTotalVenta()));
    }
    
    public void cargarVentas(List<Sales_Admin> ventas) {
       panelItem.removeAll(); 
       for (Sales_Admin venta : ventas) {
            addItem(venta);
        }
       panelItem.revalidate(); 
       panelItem.repaint();
    }

    public void setEvent(EventItem_Ventas_Ad event) {
        this.event = event;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scroll = new javax.swing.JScrollPane();
        panelItem = new Cards.PanelItem();
        jPanel = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        lbl_NombreCliente_Ventas_Admin = new javax.swing.JLabel();
        lbl_NombreEmpleado_Ventas_Admin = new javax.swing.JLabel();
        lbl_FechaVenta_Ventas_Admin = new javax.swing.JLabel();
        lbl_HoraVenta_Ventas_Admin = new javax.swing.JLabel();
        lbl_TotalVenta_Ventas_Admin = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 252, 245));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scroll.setBorder(null);
        scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        panelItem.setBackground(new java.awt.Color(255, 255, 255));
        scroll.setViewportView(panelItem);

        add(scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 0, 608, 720));

        jPanel.setBackground(new java.awt.Color(255, 252, 245));
        jPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(74, 51, 28));
        jLabel37.setText("Ventas");
        jPanel.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nombre cliente:");
        jPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 362, -1, -1));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre empleado:");
        jPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 390, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Información de envio:");
        jPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 434, -1, -1));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Fecha de la venta:");
        jPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 468, -1, -1));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Hora de la venta:");
        jPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 513, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Detalles del pedido:");
        jPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 563, -1, -1));

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Total de la venta:");
        jPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 591, -1, -1));

        jButton1.setBackground(new java.awt.Color(243, 143, 154));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Eliminar venta");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 660, 272, 36));
        jPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 547, 272, 10));
        jPanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 418, 272, 10));
        jPanel.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 346, 272, 10));

        lbl_NombreCliente_Ventas_Admin.setForeground(new java.awt.Color(0, 0, 0));
        jPanel.add(lbl_NombreCliente_Ventas_Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 362, -1, -1));

        lbl_NombreEmpleado_Ventas_Admin.setForeground(new java.awt.Color(0, 0, 0));
        jPanel.add(lbl_NombreEmpleado_Ventas_Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 390, -1, -1));

        lbl_FechaVenta_Ventas_Admin.setForeground(new java.awt.Color(0, 0, 0));
        jPanel.add(lbl_FechaVenta_Ventas_Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 468, -1, -1));

        lbl_HoraVenta_Ventas_Admin.setForeground(new java.awt.Color(0, 0, 0));
        jPanel.add(lbl_HoraVenta_Ventas_Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 513, -1, -1));

        lbl_TotalVenta_Ventas_Admin.setForeground(new java.awt.Color(0, 0, 0));
        jPanel.add(lbl_TotalVenta_Ventas_Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 591, -1, -1));

        add(jPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 720));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lbl_FechaVenta_Ventas_Admin;
    private javax.swing.JLabel lbl_HoraVenta_Ventas_Admin;
    private javax.swing.JLabel lbl_NombreCliente_Ventas_Admin;
    private javax.swing.JLabel lbl_NombreEmpleado_Ventas_Admin;
    private javax.swing.JLabel lbl_TotalVenta_Ventas_Admin;
    private Cards.PanelItem panelItem;
    private javax.swing.JScrollPane scroll;
    // End of variables declaration//GEN-END:variables
}
