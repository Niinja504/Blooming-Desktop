package Vista.Paneles_Admin;

import Mapa.EventPunto;
import Mapa.MyWaypoint;
import Mapa.Renderizar_Button;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialPalenightIJTheme;
import java.awt.Color;
import java.awt.Font;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
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
        try {
            UIManager.setLookAndFeel(new FlatMaterialPalenightIJTheme());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        initComponents();
        init();
        
        addPlaceholderStyle(txt_Zona_Cost_Admin);
        addPlaceholderStyle(txt_Costo_Cost_Admin);
    }
    
    public void addPlaceholderStyle(JTextField textField){
        Font font = textField.getFont();
        font = font.deriveFont(Font.ITALIC);
        textField.setFont(font);
        textField.setForeground(Color.BLACK);
    }
    
    public void removePlaceholderStyle(JTextField textField){
        Font font = textField.getFont();
        font = font.deriveFont(Font.PLAIN);
        textField.setFont(font);
        textField.setForeground(Color.BLACK);
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

        setBackground(new java.awt.Color(255, 252, 250));
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_Buscar_Cost_admin.setBackground(new java.awt.Color(255, 255, 255));
        txt_Buscar_Cost_admin.setForeground(new java.awt.Color(0, 0, 0));
        txt_Buscar_Cost_admin.setText("Buscar...");
        txt_Buscar_Cost_admin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_Buscar_Cost_adminFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_Buscar_Cost_adminFocusLost(evt);
            }
        });
        add(txt_Buscar_Cost_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 450, 36));

        cmdAdd.setBackground(new java.awt.Color(243, 143, 154));
        cmdAdd.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        cmdAdd.setForeground(new java.awt.Color(255, 255, 255));
        cmdAdd.setText("Marcar");
        cmdAdd.setFocusPainted(false);
        cmdAdd.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                cmdAddMouseDragged(evt);
            }
        });
        cmdAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmdAddMouseClicked(evt);
            }
        });
        cmdAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAddActionPerformed(evt);
            }
        });

        cmdClear.setBackground(new java.awt.Color(243, 143, 154));
        cmdClear.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        cmdClear.setForeground(new java.awt.Color(255, 255, 255));
        cmdClear.setText("Limpiar");
        cmdClear.setFocusPainted(false);
        cmdClear.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                cmdClearMouseDragged(evt);
            }
        });
        cmdClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmdClearMouseClicked(evt);
            }
        });
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmdClear)
                .addContainerGap(214, Short.MAX_VALUE))
        );
        jXMapViewerLayout.setVerticalGroup(
            jXMapViewerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXMapViewerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jXMapViewerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdClear, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(601, Short.MAX_VALUE))
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

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 79, -1, -1));

        comboMap.setForeground(new java.awt.Color(255, 255, 255));
        comboMap.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Hibrido", "Satelite", "Relieve" }));
        comboMap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMapActionPerformed(evt);
            }
        });
        add(comboMap, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 113, 36));

        jtb_Cost.setForeground(new java.awt.Color(255, 255, 255));
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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 287, 472, -1));

        txt_Zona_Cost_Admin.setBackground(new java.awt.Color(255, 255, 255));
        txt_Zona_Cost_Admin.setForeground(new java.awt.Color(0, 0, 0));
        txt_Zona_Cost_Admin.setText("Nombre de la zona");
        txt_Zona_Cost_Admin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_Zona_Cost_AdminFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_Zona_Cost_AdminFocusLost(evt);
            }
        });
        add(txt_Zona_Cost_Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 309, 40));

        txt_Costo_Cost_Admin.setBackground(new java.awt.Color(255, 255, 255));
        txt_Costo_Cost_Admin.setForeground(new java.awt.Color(0, 0, 0));
        txt_Costo_Cost_Admin.setText("Costo");
        txt_Costo_Cost_Admin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_Costo_Cost_AdminFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_Costo_Cost_AdminFocusLost(evt);
            }
        });
        add(txt_Costo_Cost_Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 309, 40));

        btn_Add_Cost_Admin.setBackground(new java.awt.Color(243, 143, 154));
        btn_Add_Cost_Admin.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btn_Add_Cost_Admin.setForeground(new java.awt.Color(255, 255, 255));
        btn_Add_Cost_Admin.setText("Agregar");
        btn_Add_Cost_Admin.setBorderPainted(false);
        add(btn_Add_Cost_Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(749, 79, 100, 40));

        btn_Update_Cost_Admin.setBackground(new java.awt.Color(243, 143, 154));
        btn_Update_Cost_Admin.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btn_Update_Cost_Admin.setForeground(new java.awt.Color(255, 255, 255));
        btn_Update_Cost_Admin.setText("Actualizar");
        btn_Update_Cost_Admin.setBorderPainted(false);
        add(btn_Update_Cost_Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 145, 100, 40));

        btn_Delete_Cost_Admin.setBackground(new java.awt.Color(243, 143, 154));
        btn_Delete_Cost_Admin.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btn_Delete_Cost_Admin.setForeground(new java.awt.Color(255, 255, 255));
        btn_Delete_Cost_Admin.setText("Eliminar");
        btn_Delete_Cost_Admin.setBorderPainted(false);
        add(btn_Delete_Cost_Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(749, 213, 100, 37));
    }// </editor-fold>//GEN-END:initComponents

    private void txt_Buscar_Cost_adminFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_Buscar_Cost_adminFocusGained
        if(txt_Buscar_Cost_admin.getText().trim().equals("Buscar...")){
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
        TileFactoryInfo info = null;
        int index = comboMap.getSelectedIndex();
        System.out.println("Selected Index: " + index);
        try {
        if (index == 0) {
            info = new OSMTileFactoryInfo();
        } else if (index == 1) {
            info = new VirtualEarthTileFactoryInfo(VirtualEarthTileFactoryInfo.MAP);
        } else if (index == 2) {
            info = new VirtualEarthTileFactoryInfo(VirtualEarthTileFactoryInfo.HYBRID);
        } else if (index == 3) {
            info = new VirtualEarthTileFactoryInfo(VirtualEarthTileFactoryInfo.SATELLITE);
        }
        
        if (info != null) {
            DefaultTileFactory tileFactory = new DefaultTileFactory(info);
            jXMapViewer.setTileFactory(tileFactory);
        } else {
            throw new IllegalArgumentException("TileFactoryInfo no válido");
        }
        } catch (Exception e) {
         e.printStackTrace();
         JOptionPane.showMessageDialog(this, "Error al cambiar el mapa: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
      }
    }//GEN-LAST:event_comboMapActionPerformed

    private void cmdAddMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdAddMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdAddMouseDragged

    private void cmdAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdAddMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdAddMouseClicked

    private void cmdAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdAddActionPerformed

    private void cmdClearMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdClearMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdClearMouseDragged

    private void cmdClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdClearMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdClearMouseClicked

    private void cmdClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdClearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdClearActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        this.requestFocus();
    }//GEN-LAST:event_formFocusGained

    private void txt_Zona_Cost_AdminFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_Zona_Cost_AdminFocusGained
        if(txt_Zona_Cost_Admin.getText().trim().equals("Nombre de la zona")){
            txt_Zona_Cost_Admin.setText("");
            txt_Zona_Cost_Admin.requestFocus();

            removePlaceholderStyle(txt_Zona_Cost_Admin);
        }
    }//GEN-LAST:event_txt_Zona_Cost_AdminFocusGained

    private void txt_Zona_Cost_AdminFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_Zona_Cost_AdminFocusLost
        if(txt_Zona_Cost_Admin.getText().length()==0){
            addPlaceholderStyle(txt_Zona_Cost_Admin);
            txt_Zona_Cost_Admin.setText("Nombre de la zona");
        }
    }//GEN-LAST:event_txt_Zona_Cost_AdminFocusLost

    private void txt_Costo_Cost_AdminFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_Costo_Cost_AdminFocusGained
        if(txt_Costo_Cost_Admin.getText().trim().equals("Costo")){
            txt_Costo_Cost_Admin.setText("");
            txt_Costo_Cost_Admin.requestFocus();

            removePlaceholderStyle(txt_Costo_Cost_Admin);
        }
    }//GEN-LAST:event_txt_Costo_Cost_AdminFocusGained

    private void txt_Costo_Cost_AdminFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_Costo_Cost_AdminFocusLost
        if(txt_Costo_Cost_Admin.getText().length()==0){
            addPlaceholderStyle(txt_Costo_Cost_Admin);
            txt_Costo_Cost_Admin.setText("Costo");
        }
    }//GEN-LAST:event_txt_Costo_Cost_AdminFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_Add_Cost_Admin;
    public javax.swing.JButton btn_Delete_Cost_Admin;
    public javax.swing.JButton btn_Update_Cost_Admin;
    public javax.swing.JButton cmdAdd;
    public javax.swing.JButton cmdClear;
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
