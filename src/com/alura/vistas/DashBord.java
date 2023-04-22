/*
 * Fecha de creacion: 15/04/2023 22:41:44
 * Version: v.0.1
 * Detalles: 
 */
package com.alura.vistas;

import com.alura.controllers.Botones;
import java.awt.Image;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Willy Stbn
 */
public class DashBord extends javax.swing.JFrame {

    Piso1 piso1 = new Piso1();
    DatosHabitacion datos = new DatosHabitacion();
    DatosHuesped datosHue = new DatosHuesped();
    Date fechaActual = new Date();
    String fecha = new SimpleDateFormat("dd MMM yyyy").format(fechaActual);
    
    public DashBord() {
        initComponents();
        
        this.setTitle("Sistema principal - Sesión de: " + Login.nombreUser);
        this.setLocationRelativeTo(null);
        this.txtHabitacionNumero.setVisible(false);
        
        Botones btn = new Botones(this, piso1, datos, datosHue);
        label_Fecha.setText(fecha);
        label_NombreHotel.setText("Bienvenidos al hotel: " +Configuracion.nombreHotel);
    }
    
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/ico.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Botones_Panel = new javax.swing.JPanel();
        btnConfiguracionP = new javax.swing.JButton();
        btn_ReservacionP = new javax.swing.JButton();
        btn_HuespedesP = new javax.swing.JButton();
        btn_HabitacionesP = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btn_Salir = new javax.swing.JButton();
        Banner = new javax.swing.JPanel();
        label_NombreHotel = new javax.swing.JLabel();
        label_Fecha = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panel_Datos = new javax.swing.JPanel();
        contenedor = new javax.swing.JPanel();
        btn_Piso1 = new javax.swing.JButton();
        btn_Piso5 = new javax.swing.JButton();
        btn_Piso2 = new javax.swing.JButton();
        btn_Piso3 = new javax.swing.JButton();
        btn_Piso4 = new javax.swing.JButton();
        txtHabitacionNumero = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        Botones_Panel.setBackground(new java.awt.Color(0, 102, 102));
        Botones_Panel.setForeground(new java.awt.Color(204, 255, 204));

        btnConfiguracionP.setBackground(new java.awt.Color(255, 255, 255));
        btnConfiguracionP.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        btnConfiguracionP.setForeground(new java.awt.Color(0, 153, 204));
        btnConfiguracionP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/configuraciones.png"))); // NOI18N
        btnConfiguracionP.setText("Configuracion");

        btn_ReservacionP.setBackground(new java.awt.Color(255, 255, 255));
        btn_ReservacionP.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        btn_ReservacionP.setForeground(new java.awt.Color(0, 153, 204));
        btn_ReservacionP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reserva.png"))); // NOI18N
        btn_ReservacionP.setText("Reservar");

        btn_HuespedesP.setBackground(new java.awt.Color(255, 255, 255));
        btn_HuespedesP.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        btn_HuespedesP.setForeground(new java.awt.Color(0, 153, 204));
        btn_HuespedesP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/viajero.png"))); // NOI18N
        btn_HuespedesP.setText("Huespedes");

        btn_HabitacionesP.setBackground(new java.awt.Color(255, 255, 255));
        btn_HabitacionesP.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        btn_HabitacionesP.setForeground(new java.awt.Color(0, 153, 204));
        btn_HabitacionesP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hotel.png"))); // NOI18N
        btn_HabitacionesP.setText("Habitaciones");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N

        btn_Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Salir.png"))); // NOI18N
        btn_Salir.setContentAreaFilled(false);
        btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Botones_PanelLayout = new javax.swing.GroupLayout(Botones_Panel);
        Botones_Panel.setLayout(Botones_PanelLayout);
        Botones_PanelLayout.setHorizontalGroup(
            Botones_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Botones_PanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(Botones_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_HuespedesP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_HabitacionesP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_ReservacionP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnConfiguracionP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Salir, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        Botones_PanelLayout.setVerticalGroup(
            Botones_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Botones_PanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btn_ReservacionP, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_HuespedesP, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_HabitacionesP, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnConfiguracionP, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        Banner.setBackground(new java.awt.Color(5, 25, 41));
        Banner.setForeground(new java.awt.Color(204, 153, 0));

        label_NombreHotel.setFont(new java.awt.Font("Palace Script MT", 0, 48)); // NOI18N
        label_NombreHotel.setForeground(new java.awt.Color(255, 255, 255));
        label_NombreHotel.setText("Bienvenidos al hotel:");

        label_Fecha.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        label_Fecha.setForeground(new java.awt.Color(255, 255, 255));
        label_Fecha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_Fecha.setText("12  Abril 2023");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Alura.png"))); // NOI18N

        javax.swing.GroupLayout BannerLayout = new javax.swing.GroupLayout(Banner);
        Banner.setLayout(BannerLayout);
        BannerLayout.setHorizontalGroup(
            BannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BannerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_NombreHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addGroup(BannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        BannerLayout.setVerticalGroup(
            BannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BannerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BannerLayout.createSequentialGroup()
                        .addComponent(label_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
                    .addGroup(BannerLayout.createSequentialGroup()
                        .addComponent(label_NombreHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        panel_Datos.setBackground(new java.awt.Color(153, 153, 153));

        contenedor.setBackground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btn_Piso1.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btn_Piso1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/uno.png"))); // NOI18N
        btn_Piso1.setText("Piso");
        btn_Piso1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Piso1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        btn_Piso5.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btn_Piso5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cinco.png"))); // NOI18N
        btn_Piso5.setText("Piso");
        btn_Piso5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Piso5.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        btn_Piso2.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btn_Piso2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dos.png"))); // NOI18N
        btn_Piso2.setText("Piso");
        btn_Piso2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Piso2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        btn_Piso3.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btn_Piso3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tres.png"))); // NOI18N
        btn_Piso3.setText("Piso");
        btn_Piso3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Piso3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        btn_Piso4.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btn_Piso4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cuatro.png"))); // NOI18N
        btn_Piso4.setText("Piso");
        btn_Piso4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Piso4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        txtHabitacionNumero.setEditable(false);
        txtHabitacionNumero.setBackground(new java.awt.Color(0, 102, 102));
        txtHabitacionNumero.setFont(new java.awt.Font("Roboto Medium", 1, 12)); // NOI18N
        txtHabitacionNumero.setForeground(new java.awt.Color(255, 255, 255));
        txtHabitacionNumero.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHabitacionNumero.setText("Habitacion: 000");
        txtHabitacionNumero.setBorder(null);

        javax.swing.GroupLayout panel_DatosLayout = new javax.swing.GroupLayout(panel_Datos);
        panel_Datos.setLayout(panel_DatosLayout);
        panel_DatosLayout.setHorizontalGroup(
            panel_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_DatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_DatosLayout.createSequentialGroup()
                        .addGroup(panel_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_Piso1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Piso5, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Piso2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Piso3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Piso4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_DatosLayout.createSequentialGroup()
                        .addComponent(txtHabitacionNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_DatosLayout.setVerticalGroup(
            panel_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_DatosLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btn_Piso1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Piso2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Piso3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Piso4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Piso5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(txtHabitacionNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_DatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Botones_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Banner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_Datos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Botones_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Banner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(panel_Datos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirActionPerformed
       Login login = new Login();
       Login.rol = "";
       Login.nombreUser = "";
       login.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btn_SalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashBord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashBord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Banner;
    private javax.swing.JPanel Botones_Panel;
    public javax.swing.JButton btnConfiguracionP;
    public javax.swing.JButton btn_HabitacionesP;
    public javax.swing.JButton btn_HuespedesP;
    public javax.swing.JButton btn_Piso1;
    public javax.swing.JButton btn_Piso2;
    public javax.swing.JButton btn_Piso3;
    public javax.swing.JButton btn_Piso4;
    public javax.swing.JButton btn_Piso5;
    public javax.swing.JButton btn_ReservacionP;
    private javax.swing.JButton btn_Salir;
    public javax.swing.JPanel contenedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel label_Fecha;
    private javax.swing.JLabel label_NombreHotel;
    public javax.swing.JPanel panel_Datos;
    public javax.swing.JTextField txtHabitacionNumero;
    // End of variables declaration//GEN-END:variables
}
