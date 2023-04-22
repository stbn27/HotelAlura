/*
 * Fecha de creacion: 15/04/2023 23:02:02
 * Version: v.0.1
 * Detalles: 
 */
package com.alura.vistas;


import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import com.alura.models.HabitacionDao;
import com.alura.models.Huesped;


/**
 *
 * @author Willy Stbn
 */
public class DatosHabitacion extends javax.swing.JPanel {

    private Huesped hue;
    HabitacionDao habDao;
    int  pago = 0;
    
    public DatosHabitacion() {
        initComponents();

        this.setSize(600, 460);
        
        this.label_Error.setVisible(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_title = new javax.swing.JLabel();
        cmb_MedioPagoR = new javax.swing.JComboBox<>();
        label_medioPagoRservacion = new javax.swing.JLabel();
        date_fechaCheckOut = new com.toedter.calendar.JDateChooser();
        label_fechaOut_reservacion = new javax.swing.JLabel();
        date_fechaCheckIn = new com.toedter.calendar.JDateChooser();
        label_Error = new javax.swing.JLabel();
        label_fechaIn_Reservacion = new javax.swing.JLabel();
        botones = new javax.swing.JPanel();
        txt_costoTotal_Reservacion = new javax.swing.JTextField();
        btn_Cancelar = new javax.swing.JButton();
        btn_Continuar = new javax.swing.JButton();
        label_TotalR = new javax.swing.JLabel();
        Fondo = new javax.swing.JPanel();
        label_imgReservacion = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        label_title.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        label_title.setForeground(new java.awt.Color(70, 6, 6));
        label_title.setText("TIEMPO DE RESERVACION:");

        cmb_MedioPagoR.setBackground(new java.awt.Color(217, 217, 217));
        cmb_MedioPagoR.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cmb_MedioPagoR.setForeground(new java.awt.Color(0, 0, 0));
        cmb_MedioPagoR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Efectivo", "Tarjeta de credito", "Tarjeta de debito" }));
        cmb_MedioPagoR.setMaximumSize(new java.awt.Dimension(500, 32767));

        label_medioPagoRservacion.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        label_medioPagoRservacion.setForeground(new java.awt.Color(0, 0, 51));
        label_medioPagoRservacion.setText("Medio de pago:");

        date_fechaCheckOut.setBackground(new java.awt.Color(255, 255, 255));
        date_fechaCheckOut.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        date_fechaCheckOut.setForeground(new java.awt.Color(0, 0, 153));
        date_fechaCheckOut.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                date_fechaCheckOutPropertyChange(evt);
            }
        });

        label_fechaOut_reservacion.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        label_fechaOut_reservacion.setForeground(new java.awt.Color(0, 0, 51));
        label_fechaOut_reservacion.setText("Fecha de check-Out:");

        date_fechaCheckIn.setBackground(new java.awt.Color(255, 255, 255));
        date_fechaCheckIn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        date_fechaCheckIn.setForeground(new java.awt.Color(0, 0, 153));
        date_fechaCheckIn.setMaximumSize(new java.awt.Dimension(500, 50));

        label_Error.setForeground(new java.awt.Color(255, 51, 0));
        label_Error.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/error.png"))); // NOI18N
        label_Error.setText("¡Rellene todos los campos!");

        label_fechaIn_Reservacion.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        label_fechaIn_Reservacion.setForeground(new java.awt.Color(0, 0, 51));
        label_fechaIn_Reservacion.setText("Fecha de check-in:");

        botones.setBackground(new java.awt.Color(255, 255, 255));

        txt_costoTotal_Reservacion.setEditable(false);
        txt_costoTotal_Reservacion.setBackground(new java.awt.Color(255, 255, 204));
        txt_costoTotal_Reservacion.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txt_costoTotal_Reservacion.setForeground(new java.awt.Color(153, 0, 51));
        txt_costoTotal_Reservacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_costoTotal_Reservacion.setText("$0.000");

        btn_Cancelar.setBackground(new java.awt.Color(153, 51, 0));
        btn_Cancelar.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btn_Cancelar.setForeground(new java.awt.Color(0, 0, 0));
        btn_Cancelar.setText("Cancelar");

        btn_Continuar.setBackground(new java.awt.Color(0, 204, 0));
        btn_Continuar.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btn_Continuar.setForeground(new java.awt.Color(0, 0, 0));
        btn_Continuar.setText("Continuar");

        label_TotalR.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        label_TotalR.setForeground(new java.awt.Color(0, 0, 0));
        label_TotalR.setText("Costo :");

        javax.swing.GroupLayout botonesLayout = new javax.swing.GroupLayout(botones);
        botones.setLayout(botonesLayout);
        botonesLayout.setHorizontalGroup(
            botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_TotalR, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_costoTotal_Reservacion, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Continuar, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        botonesLayout.setVerticalGroup(
            botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonesLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(label_TotalR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_costoTotal_Reservacion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Continuar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Fondo.setBackground(new java.awt.Color(255, 255, 255));

        label_imgReservacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_imgReservacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_reservation.png"))); // NOI18N

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label_imgReservacion)
                .addContainerGap())
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(label_imgReservacion, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(date_fechaCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_fechaIn_Reservacion, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_Error, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(101, 101, 101)
                        .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label_title, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_medioPagoRservacion, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_MedioPagoR, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_fechaOut_reservacion, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(date_fechaCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(101, 101, 101)
                        .addComponent(botones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(label_title)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(label_Error, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(label_fechaIn_Reservacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(date_fechaCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(label_fechaOut_reservacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(date_fechaCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label_medioPagoRservacion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmb_MedioPagoR, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(botones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(76, 76, 76))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void date_fechaCheckOutPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_date_fechaCheckOutPropertyChange
        // Obtener las fechas seleccionadas en los JDateChooser como objetos Date
        Date fechaI = date_fechaCheckIn.getDate();
        Date fechaF = date_fechaCheckOut.getDate();

        if (fechaI != null && fechaF != null) {
            // Convertir los objetos Date a objetos LocalDate
            LocalDate localDate1 = fechaI.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate localDate2 = fechaF.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            // Calcular la cantidad de días entre las dos fechas
            long totalDias = ChronoUnit.DAYS.between(localDate1, localDate2);

            if (date_fechaCheckIn.getDate().before(date_fechaCheckOut.getDate())) {
                switch ((int) totalDias) {
                    case 1 -> txt_costoTotal_Reservacion.setText("$ 450.00");
                    case 2 -> {
                        pago = (int) totalDias * 440;
                        txt_costoTotal_Reservacion.setText("$ " + pago);    //$ 450.00
                    }
                    case 3 -> {
                        pago = (int) totalDias * 430;
                        txt_costoTotal_Reservacion.setText("$ " + pago);
                    }
                    case 4 -> {
                        pago = (int) totalDias * 420;
                        txt_costoTotal_Reservacion.setText("$ " + pago);
                    }
                    case 5 -> {
                        pago = (int) totalDias * 410;
                        txt_costoTotal_Reservacion.setText("$ " + pago);
                    }
                    default -> {
                        pago = (int) totalDias * 390;
                        txt_costoTotal_Reservacion.setText("$ " + pago);
                    }
                }

            }
        }
    }//GEN-LAST:event_date_fechaCheckOutPropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fondo;
    private javax.swing.JPanel botones;
    public javax.swing.JButton btn_Cancelar;
    public javax.swing.JButton btn_Continuar;
    public javax.swing.JComboBox<String> cmb_MedioPagoR;
    public com.toedter.calendar.JDateChooser date_fechaCheckIn;
    public com.toedter.calendar.JDateChooser date_fechaCheckOut;
    public javax.swing.JLabel label_Error;
    private javax.swing.JLabel label_TotalR;
    private javax.swing.JLabel label_fechaIn_Reservacion;
    private javax.swing.JLabel label_fechaOut_reservacion;
    private javax.swing.JLabel label_imgReservacion;
    private javax.swing.JLabel label_medioPagoRservacion;
    private javax.swing.JLabel label_title;
    public javax.swing.JTextField txt_costoTotal_Reservacion;
    // End of variables declaration//GEN-END:variables

    
}
