package Vista.Paneles_Client;

import Card.Item.Ofertas_Client;
import Cards.Card_Desing.card_ofertas_Cli;
import Cards.EventItemImpl_Ofertas_Cli;
import Cards.Eventos.EventItem_Ofertas;
import Cards.ScrollBar;
import Controlador.Client.Ctrl_Ofertas_Client;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialPalenightIJTheme;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Panel_Inicio_Client extends javax.swing.JPanel {

    private EventItem_Ofertas event;
    private Ctrl_Ofertas_Client controlador;
    
    public Panel_Inicio_Client(Ctrl_Ofertas_Client controlador) {
        this.controlador = controlador;
        this.event = new EventItemImpl_Ofertas_Cli();
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
    
    public void setControlador(Ctrl_Ofertas_Client controlador) {
       this.controlador = controlador;
    }

    public void addItem(Ofertas_Client data) {
        card_ofertas_Cli item = new card_ofertas_Cli(controlador);
        item.setData(data);
        item.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                if (SwingUtilities.isLeftMouseButton(me)) {
                    setSelected(item);
                    event.itemClick(item, data, Panel_Inicio_Client.this);
                }
            }
        });
        panelItem.add(item);
        panelItem.repaint();
        panelItem.revalidate();
    }
    
    public void setSelected(Component item){
        for (Component com : panelItem.getComponents()){
            card_ofertas_Cli i = (card_ofertas_Cli) com;
            if (i.isSelected()){
                i.setSelected(false);
            }
        }
        ((card_ofertas_Cli) item).setSelected(true);
    }
    
    public void ShowItem(Ofertas_Client data){
        String imgPath = data.getImg_oferta();
        if (imgPath != null && !imgPath.isEmpty()){
            try {
                URL url = new URL (imgPath);
                Image image = ImageIO.read(url);
                ImageIcon icon = new ImageIcon(image);
                IMG_Details_Ofertas_Client.setIcon(icon);
                IMG_Details_Ofertas_Client.setText(null);
            } catch (IOException e) {
                System.out.println("Error al cargar la imagen: " + e.getMessage());
            }
            
        } else {
                IMG_Details_Ofertas_Client.setIcon(null);
        }
        Lbl_Titulo_Oferta_Client.setText(data.getTitulo());
        Lbl_Porcentaje_Oferta_Client.setText(data.getPorcentaje());
        Lbl_Descripcion_Oferta_Client.setText(data.getDescripcion());
    }
    
    public void cargarOfertas(List<Ofertas_Client> pedidos) {
       panelItem.removeAll(); 
       for (Ofertas_Client pedido : pedidos) {
            addItem(pedido);
        }
       panelItem.revalidate(); 
       panelItem.repaint();
    }
    
    public void setEvent(EventItem_Ofertas event) {
        this.event = event;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scroll = new javax.swing.JScrollPane();
        panelItem = new Cards.PanelItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Lbl_Titulo_Oferta_Client = new javax.swing.JLabel();
        IMG_Details_Ofertas_Client = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Lbl_Porcentaje_Oferta_Client = new javax.swing.JLabel();
        Lbl_Descripcion_Oferta_Client = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 252, 245));

        scroll.setBorder(null);
        scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scroll.setViewportView(panelItem);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(267, 710));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Ofertas");

        Lbl_Titulo_Oferta_Client.setForeground(new java.awt.Color(0, 0, 0));
        Lbl_Titulo_Oferta_Client.setText("jLabel12");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre Articulo:");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Porcentaje:");

        Lbl_Porcentaje_Oferta_Client.setForeground(new java.awt.Color(0, 0, 0));
        Lbl_Porcentaje_Oferta_Client.setText("jLabel4");

        Lbl_Descripcion_Oferta_Client.setForeground(new java.awt.Color(0, 0, 0));
        Lbl_Descripcion_Oferta_Client.setText("jLabel4");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Descripciòn:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(IMG_Details_Ofertas_Client, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Lbl_Porcentaje_Oferta_Client)
                                    .addComponent(Lbl_Titulo_Oferta_Client)))
                            .addComponent(Lbl_Descripcion_Oferta_Client, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(IMG_Details_Ofertas_Client, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbl_Titulo_Oferta_Client)
                    .addComponent(jLabel2))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Lbl_Porcentaje_Oferta_Client))
                .addGap(35, 35, 35)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Lbl_Descripcion_Oferta_Client)
                .addGap(260, 260, 260))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scroll)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel IMG_Details_Ofertas_Client;
    public javax.swing.JLabel Lbl_Descripcion_Oferta_Client;
    public javax.swing.JLabel Lbl_Porcentaje_Oferta_Client;
    public javax.swing.JLabel Lbl_Titulo_Oferta_Client;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private Cards.PanelItem panelItem;
    private javax.swing.JScrollPane scroll;
    // End of variables declaration//GEN-END:variables

}
