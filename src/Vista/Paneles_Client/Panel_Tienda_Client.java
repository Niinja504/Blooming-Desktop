package Vista.Paneles_Client;

import Card.Item.Shop_Client;
import Cards.Card_Desing.card_shop_Cli;
import Cards.EventItemImpl_Productos_Cli;
import Cards.Eventos.EventItem_Productos;
import Cards.ScrollBar;
import Controlador.Client.Ctrl_Shop_Client;
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

public class Panel_Tienda_Client extends javax.swing.JPanel {
    
    private EventItem_Productos event;
    private Ctrl_Shop_Client controlador;
    
    public Panel_Tienda_Client(Ctrl_Shop_Client controlador) {
        this.controlador = controlador;
        this.event = new EventItemImpl_Productos_Cli();
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

    public void setControlador(Ctrl_Shop_Client controlador) {
       this.controlador = controlador;
    }

    public void addItem(Shop_Client data) {
        card_shop_Cli item = new card_shop_Cli(controlador);
        item.setData(data);
        item.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                if (SwingUtilities.isLeftMouseButton(me)) {
                    setSelected(item);
                    event.itemClick(item, data, Panel_Tienda_Client.this);
                }
            }
        });
        panelItem.add(item);
        panelItem.repaint();
        panelItem.revalidate();
    }
    
    public void setSelected(Component item){
        for (Component com : panelItem.getComponents()){
            card_shop_Cli i = (card_shop_Cli) com;
            if (i.isSelected()){
                i.setSelected(false);
            }
        }
        ((card_shop_Cli) item).setSelected(true);
    }
    
    public void ShowItem(Shop_Client data){
        String imgPath = data.getImg();
        if (imgPath != null && !imgPath.isEmpty()){
            try {
                URL url = new URL (imgPath);
                Image image = ImageIO.read(url);
                ImageIcon icon = new ImageIcon(image);
                IMG_Details_Shop_Client.setIcon(icon);
                IMG_Details_Shop_Client.setText(null);
            } catch (IOException e) {
                System.out.println("Error al cargar la imagen: " + e.getMessage());
            }
            
        } else {
                IMG_Details_Shop_Client.setIcon(null);
        }
        Lbl_Nombre_Shop_Client.setText(data.getNombre());
        Lbl_Precio_Shop_Client.setText(data.getPrecio().toString());
        Lbl_CategoriaFlores_Shop_Client.setText(data.getCategoriaFlores());
        Lbl_CategoriaDiseno_Shop_Client.setText(data.getCategoriaDiseno());
        Lbl_CategoriaEvento_Shop_Client.setText(data.getCategoriaEvento());
        Lbl_Descripcion_Shop_Client.setText(data.getDescripcion());
    }
    
    public void cargarProductos(List<Shop_Client> pedidos) {
       panelItem.removeAll(); 
       for (Shop_Client pedido : pedidos) {
            addItem(pedido);
        }
       panelItem.revalidate(); 
       panelItem.repaint();
    }
    
    public void setEvent(EventItem_Productos event) {
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
        Lbl_Nombre_Shop_Client = new javax.swing.JLabel();
        IMG_Details_Shop_Client = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Lbl_Precio_Shop_Client = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Lbl_Descripcion_Shop_Client = new javax.swing.JLabel();
        Lbl_CategoriaFlores_Shop_Client = new javax.swing.JLabel();
        Lbl_CategoriaDiseno_Shop_Client = new javax.swing.JLabel();
        Lbl_CategoriaEvento_Shop_Client = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 252, 245));

        scroll.setBorder(null);
        scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scroll.setViewportView(panelItem);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(267, 710));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Producto");

        Lbl_Nombre_Shop_Client.setForeground(new java.awt.Color(0, 0, 0));
        Lbl_Nombre_Shop_Client.setText("jLabel12");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre Articulo:");

        Lbl_Precio_Shop_Client.setForeground(new java.awt.Color(0, 0, 0));
        Lbl_Precio_Shop_Client.setText("jLabel4");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Precio:");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Categoria de flores:");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Categoria de diseño:");

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Tipo de evento:");

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Descripciòn:");

        Lbl_Descripcion_Shop_Client.setForeground(new java.awt.Color(0, 0, 0));
        Lbl_Descripcion_Shop_Client.setText("jLabel8");

        Lbl_CategoriaFlores_Shop_Client.setForeground(new java.awt.Color(0, 0, 0));
        Lbl_CategoriaFlores_Shop_Client.setText("jLabel9");

        Lbl_CategoriaDiseno_Shop_Client.setForeground(new java.awt.Color(0, 0, 0));
        Lbl_CategoriaDiseno_Shop_Client.setText("jLabel10");

        Lbl_CategoriaEvento_Shop_Client.setForeground(new java.awt.Color(0, 0, 0));
        Lbl_CategoriaEvento_Shop_Client.setText("jLabel11");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(IMG_Details_Shop_Client, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Lbl_CategoriaEvento_Shop_Client)
                            .addComponent(Lbl_CategoriaDiseno_Shop_Client)
                            .addComponent(Lbl_Precio_Shop_Client)
                            .addComponent(Lbl_Nombre_Shop_Client)
                            .addComponent(Lbl_CategoriaFlores_Shop_Client))))
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Lbl_Descripcion_Shop_Client, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(IMG_Details_Shop_Client, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbl_Nombre_Shop_Client)
                    .addComponent(jLabel2))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Lbl_Precio_Shop_Client))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Lbl_CategoriaFlores_Shop_Client))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Lbl_CategoriaDiseno_Shop_Client))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Lbl_CategoriaEvento_Shop_Client))
                .addGap(33, 33, 33)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(Lbl_Descripcion_Shop_Client)
                .addGap(123, 123, 123))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 281, Short.MAX_VALUE)
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 597, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scroll, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel IMG_Details_Shop_Client;
    public javax.swing.JLabel Lbl_CategoriaDiseno_Shop_Client;
    public javax.swing.JLabel Lbl_CategoriaEvento_Shop_Client;
    public javax.swing.JLabel Lbl_CategoriaFlores_Shop_Client;
    public javax.swing.JLabel Lbl_Descripcion_Shop_Client;
    public javax.swing.JLabel Lbl_Nombre_Shop_Client;
    public javax.swing.JLabel Lbl_Precio_Shop_Client;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private Cards.PanelItem panelItem;
    private javax.swing.JScrollPane scroll;
    // End of variables declaration//GEN-END:variables
}
