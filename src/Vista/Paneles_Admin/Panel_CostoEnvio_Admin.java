package Vista.Paneles_Admin;

import Mapa.EventPunto;
import Mapa.MyWaypoint;
import Mapa.Renderizar_Button;
import java.awt.Color;
import java.awt.Font;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.event.MouseInputListener;
import org.jxmapviewer.OSMTileFactoryInfo;
import org.jxmapviewer.VirtualEarthTileFactoryInfo;
import org.jxmapviewer.input.PanMouseInputListener;
import org.jxmapviewer.input.ZoomMouseWheelListenerCenter;
import org.jxmapviewer.viewer.DefaultTileFactory;
import org.jxmapviewer.viewer.GeoPosition;
import org.jxmapviewer.viewer.TileFactoryInfo;
import org.jxmapviewer.viewer.WaypointPainter;

public class Panel_CostoEnvio_Admin extends javax.swing.JPanel {
    
    
    private final Set<MyWaypoint> waypoints = new HashSet<>();
    private EventPunto event;
    private MyWaypoint currentWaypoint;
    
    public Panel_CostoEnvio_Admin() {
        initComponents();
        init();
    }
    
    private GeoPosition geo;
    
    private void init() {
        TileFactoryInfo info = new OSMTileFactoryInfo();
        DefaultTileFactory tileFactory = new DefaultTileFactory(info);
        jXMapViewer.setTileFactory(tileFactory);
        geo = new GeoPosition(13.694048301077249, -89.2167184011952);
        jXMapViewer.setAddressLocation(geo);
        jXMapViewer.setZoom(12);

        MouseInputListener mm = new PanMouseInputListener(jXMapViewer);
        jXMapViewer.addMouseListener(mm);
        jXMapViewer.addMouseMotionListener(mm);
        jXMapViewer.addMouseWheelListener(new ZoomMouseWheelListenerCenter(jXMapViewer));

        event = new EventPunto() {
            @Override
            public void selected(MyWaypoint waypoint) {
                JOptionPane.showMessageDialog(Panel_CostoEnvio_Admin.this, waypoint.getName());
            }

            @Override
            public void deselected(MyWaypoint waypoint) {
                waypoints.remove(waypoint);
                clearWaypoint();
                initWaypoint();
            }
        };
        currentWaypoint = new MyWaypoint("Movible", event, geo);
        addWaypoint(currentWaypoint);
    }
    
    private void addWaypoint(MyWaypoint waypoint) {
        for (MyWaypoint d : waypoints) {
            jXMapViewer.remove(d.getButton());
        }
        waypoints.add(waypoint);
        initWaypoint();
    }
    
    private void initWaypoint() {
        WaypointPainter<MyWaypoint> wp = new Renderizar_Button();
        wp.setWaypoints(waypoints);
        jXMapViewer.setOverlayPainter(wp);
        for (MyWaypoint d : waypoints) {
            jXMapViewer.add(d.getButton());
        }
    }
    
    private void clearWaypoint() {
        for (MyWaypoint d : waypoints) {
            jXMapViewer.remove(d.getButton());
        }
        waypoints.clear();
        initWaypoint();
    }
    
    public GeoPosition getCurrentWaypointPosition() {
    return currentWaypoint != null ? currentWaypoint.getPosition() : null;
    }


    public void addPlaceholderStyle(JTextField textField){
        Font font = textField.getFont();
        font = font.deriveFont(Font.ITALIC);
        textField.setFont(font);
        textField.setForeground(Color.gray);
    }
    
    public void removePlaceholderStyle(JTextField textField){
        Font font = textField.getFont();
        font = font.deriveFont(Font.PLAIN);
        textField.setFont(font);
        textField.setForeground(Color.black);
    }
    
    public void actualizarMapaConCoordenadas(String coordenadas) {
    String[] partes = coordenadas.split(",");
    if (partes.length == 2) {
        try {
            double latitud = Double.parseDouble(partes[0].trim());
            double longitud = Double.parseDouble(partes[1].trim());
            GeoPosition nuevaPosicion = new GeoPosition(latitud, longitud);
            jXMapViewer.setAddressLocation(nuevaPosicion);
            clearWaypoint();
            currentWaypoint = new MyWaypoint("Movible", event, nuevaPosicion);
            addWaypoint(currentWaypoint);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Formato de coordenadas no válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_Buscar_Cost_admin = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jXMapViewer = new org.jxmapviewer.JXMapViewer();
        cmdAdd = new javax.swing.JButton();
        cmdClear = new javax.swing.JButton();
        comboMap = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtb_Cost = new javax.swing.JTable();
        txt_Zona_Cost_Admin = new javax.swing.JTextField();
        txt_Costo_Cost_Admin = new javax.swing.JTextField();
        btn_Add_Cost_Admin = new javax.swing.JButton();
        btn_Update_Cost_Admin = new javax.swing.JButton();
        btn_Delete_Cost_Admin = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 255, 204));

        txt_Buscar_Cost_admin.setText("Buscar...");
        txt_Buscar_Cost_admin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_Buscar_Cost_adminFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_Buscar_Cost_adminFocusLost(evt);
            }
        });

        cmdAdd.setText("Marcar");
        cmdAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAddActionPerformed(evt);
            }
        });

        cmdClear.setText("Limpiar");
        cmdClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jXMapViewerLayout = new javax.swing.GroupLayout(jXMapViewer);
        jXMapViewer.setLayout(jXMapViewerLayout);
        jXMapViewerLayout.setHorizontalGroup(
            jXMapViewerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXMapViewerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmdAdd)
                .addGap(18, 18, 18)
                .addComponent(cmdClear)
                .addContainerGap(224, Short.MAX_VALUE))
        );
        jXMapViewerLayout.setVerticalGroup(
            jXMapViewerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXMapViewerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jXMapViewerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdAdd)
                    .addComponent(cmdClear))
                .addContainerGap(606, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jXMapViewer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jXMapViewer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        comboMap.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Hibrido", "Satelite", "Relieve" }));
        comboMap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMapActionPerformed(evt);
            }
        });

        jtb_Cost.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre de la zona", "Costo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtb_Cost);

        txt_Zona_Cost_Admin.setText("Nombre");
        txt_Zona_Cost_Admin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_Zona_Cost_AdminFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_Zona_Cost_AdminFocusLost(evt);
            }
        });

        txt_Costo_Cost_Admin.setText("Precio");
        txt_Costo_Cost_Admin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_Costo_Cost_AdminFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_Costo_Cost_AdminFocusLost(evt);
            }
        });

        btn_Add_Cost_Admin.setText("jButton1");

        btn_Update_Cost_Admin.setText("jButton2");

        btn_Delete_Cost_Admin.setText("jButton3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(comboMap, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 233, Short.MAX_VALUE)
                .addComponent(txt_Buscar_Cost_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_Zona_Cost_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Costo_Cost_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_Add_Cost_Admin)
                            .addComponent(btn_Update_Cost_Admin)
                            .addComponent(btn_Delete_Cost_Admin))
                        .addGap(37, 37, 37))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_Buscar_Cost_admin, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(comboMap))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_Zona_Cost_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Add_Cost_Admin))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_Costo_Cost_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Update_Cost_Admin))
                        .addGap(56, 56, 56)
                        .addComponent(btn_Delete_Cost_Admin)
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_Buscar_Cost_adminFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_Buscar_Cost_adminFocusGained
        if(txt_Buscar_Cost_admin.getText().equals("Buscar")){
            txt_Buscar_Cost_admin.setText(null);
            txt_Buscar_Cost_admin.requestFocus();

            removePlaceholderStyle(txt_Buscar_Cost_admin);
        }
    }//GEN-LAST:event_txt_Buscar_Cost_adminFocusGained

    private void txt_Buscar_Cost_adminFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_Buscar_Cost_adminFocusLost
        if(txt_Buscar_Cost_admin.getText().length()==0){
            addPlaceholderStyle(txt_Buscar_Cost_admin);
            txt_Buscar_Cost_admin.setText("Buscar...");
        }
    }//GEN-LAST:event_txt_Buscar_Cost_adminFocusLost

    private void comboMapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMapActionPerformed
        TileFactoryInfo info;
        int index = comboMap.getSelectedIndex();
        if (index == 0){
            info = new OSMTileFactoryInfo();
        }
        else if (index == 1){
            info = new VirtualEarthTileFactoryInfo(VirtualEarthTileFactoryInfo.MAP);
        }
        else if (index == 2){
            info = new VirtualEarthTileFactoryInfo(VirtualEarthTileFactoryInfo.HYBRID);
        }
        else {
            info = new VirtualEarthTileFactoryInfo(VirtualEarthTileFactoryInfo.SATELLITE);
        }
        
        DefaultTileFactory tileFactory = new DefaultTileFactory(info);
        jXMapViewer.setTileFactory(tileFactory);
    }//GEN-LAST:event_comboMapActionPerformed

    private void cmdClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdClearActionPerformed
        clearWaypoint();
        currentWaypoint = new MyWaypoint("Movible", event, geo);
        currentWaypoint.setMovable(true);
        addWaypoint(currentWaypoint);
    }//GEN-LAST:event_cmdClearActionPerformed

    private void cmdAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAddActionPerformed
        if (currentWaypoint != null && currentWaypoint.getPosition() != null) {
        currentWaypoint.setMovable(false);
        GeoPosition geo = currentWaypoint.getPosition();
        JOptionPane.showMessageDialog(this, "Coordenadas: " + geo.getLatitude() + ", " + geo.getLongitude());
    } else {
        JOptionPane.showMessageDialog(this, "No hay un punto seleccionado.");
    }
    }//GEN-LAST:event_cmdAddActionPerformed

    private void txt_Zona_Cost_AdminFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_Zona_Cost_AdminFocusGained
        if(txt_Zona_Cost_Admin.getText().equals("Titulo de oferta")){
            txt_Zona_Cost_Admin.setText(null);
            txt_Zona_Cost_Admin.requestFocus();

            removePlaceholderStyle(txt_Zona_Cost_Admin);
        }
    }//GEN-LAST:event_txt_Zona_Cost_AdminFocusGained

    private void txt_Zona_Cost_AdminFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_Zona_Cost_AdminFocusLost
        if(txt_Zona_Cost_Admin.getText().length()==0){
            addPlaceholderStyle(txt_Zona_Cost_Admin);
            txt_Zona_Cost_Admin.setText("Titulo de oferta");
        }
    }//GEN-LAST:event_txt_Zona_Cost_AdminFocusLost

    private void txt_Costo_Cost_AdminFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_Costo_Cost_AdminFocusGained
        if(txt_Costo_Cost_Admin.getText().equals("Porcentaje oferta")){
            txt_Costo_Cost_Admin.setText(null);
            txt_Costo_Cost_Admin.requestFocus();

            removePlaceholderStyle(txt_Costo_Cost_Admin);
        }
    }//GEN-LAST:event_txt_Costo_Cost_AdminFocusGained

    private void txt_Costo_Cost_AdminFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_Costo_Cost_AdminFocusLost
        if(txt_Costo_Cost_Admin.getText().length()==0){
            addPlaceholderStyle(txt_Costo_Cost_Admin);
            txt_Costo_Cost_Admin.setText("Porcentaje oferta");
        }
    }//GEN-LAST:event_txt_Costo_Cost_AdminFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_Add_Cost_Admin;
    public javax.swing.JButton btn_Delete_Cost_Admin;
    public javax.swing.JButton btn_Update_Cost_Admin;
    public javax.swing.JButton cmdAdd;
    private javax.swing.JButton cmdClear;
    public javax.swing.JComboBox<String> comboMap;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public org.jxmapviewer.JXMapViewer jXMapViewer;
    public javax.swing.JTable jtb_Cost;
    public javax.swing.JTextField txt_Buscar_Cost_admin;
    public javax.swing.JTextField txt_Costo_Cost_Admin;
    public javax.swing.JTextField txt_Zona_Cost_Admin;
    // End of variables declaration//GEN-END:variables
}
