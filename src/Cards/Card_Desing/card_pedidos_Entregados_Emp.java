package Cards.Card_Desing;

import Card.Item.PedidosEntregados_Emp;
import Controlador.Employed.Ctrl_PedidosEntregados_Emp;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.text.DecimalFormat;

public class card_pedidos_Entregados_Emp extends javax.swing.JPanel {
    
    private boolean selected;
    private PedidosEntregados_Emp data;
    private Ctrl_PedidosEntregados_Emp controlador;
    
    public boolean isSelected(){
        return selected;
    }
    
    public void setSelected(boolean selected){
        this.selected = selected;
        repaint();
    }
    
    public card_pedidos_Entregados_Emp(Ctrl_PedidosEntregados_Emp controlador) {
        this.controlador = controlador;
        initComponents();
        setOpaque(false);
    }

    public void setData(PedidosEntregados_Emp data){
        this.data = data;
        DecimalFormat df = new DecimalFormat("$#, ##0.00");
        Lbl_Costo_Pedidos_Admin.setText(df.format(data.getSubTotal()));
        Lbl_FechaEntrega_Pedidos_Admin.setText(data.getFechaEntrega());
        Lbl_HoraEntrega_Pedidos_Admin.setText(data.getHorarioEntrega());
        Lbl_NombreCliente_Pedidos_Admin.setText(data.getNombreCliente());
    }
    
    @Override
    public void paint(Graphics grphcs){
        Graphics2D g2 = (Graphics2D) grphcs.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(new Color (242, 242, 242));
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
        if(selected){
            g2.setColor(new Color(171, 71, 188));
            g2.setStroke(new BasicStroke(4));
            g2.drawRoundRect(0, 0, getWidth() -1, getHeight() -1, 20, 20);
        }
        g2.dispose();
        super.paint(grphcs);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Lbl_Costo_Pedidos_Admin = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Lbl_NombreCliente_Pedidos_Admin = new javax.swing.JLabel();
        Lbl_FechaEntrega_Pedidos_Admin = new javax.swing.JLabel();
        Lbl_HoraEntrega_Pedidos_Admin = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Costo de pedido:");

        Lbl_Costo_Pedidos_Admin.setForeground(new java.awt.Color(0, 0, 0));
        Lbl_Costo_Pedidos_Admin.setText("$0.00");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Fecha de entrega:");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Hora de entrega:");

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Colonia:");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Nombre cliente:");

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Calle:");

        Lbl_NombreCliente_Pedidos_Admin.setForeground(new java.awt.Color(0, 0, 0));
        Lbl_NombreCliente_Pedidos_Admin.setText("jLabel6");

        Lbl_FechaEntrega_Pedidos_Admin.setForeground(new java.awt.Color(0, 0, 0));
        Lbl_FechaEntrega_Pedidos_Admin.setText("jLabel9");

        Lbl_HoraEntrega_Pedidos_Admin.setForeground(new java.awt.Color(0, 0, 0));
        Lbl_HoraEntrega_Pedidos_Admin.setText("jLabel10");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addComponent(Lbl_Costo_Pedidos_Admin)
                .addGap(5, 96, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Lbl_HoraEntrega_Pedidos_Admin)
                                    .addComponent(Lbl_FechaEntrega_Pedidos_Admin))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(48, 48, 48)
                                        .addComponent(Lbl_NombreCliente_Pedidos_Admin))
                                    .addComponent(jLabel8))
                                .addContainerGap(93, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Lbl_Costo_Pedidos_Admin))
                .addGap(22, 22, 22)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Lbl_FechaEntrega_Pedidos_Admin))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Lbl_HoraEntrega_Pedidos_Admin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Lbl_NombreCliente_Pedidos_Admin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel Lbl_Costo_Pedidos_Admin;
    public javax.swing.JLabel Lbl_FechaEntrega_Pedidos_Admin;
    private javax.swing.JLabel Lbl_HoraEntrega_Pedidos_Admin;
    public javax.swing.JLabel Lbl_NombreCliente_Pedidos_Admin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
