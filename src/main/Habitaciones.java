/*
 * Fecha de creacion: 15/04/2023 23:02:02
 * Version: v.0.1
 * Detalles: 
 */
package main;

import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import models.Datos;
import models.Habitacion;
import models.HabitacionDao;
import models.HuepedDao;
import models.Tables;

/**
 *
 * @author Willy Stbn
 */
public final class Habitaciones extends javax.swing.JPanel {

    HabitacionDao habDao = new HabitacionDao();
    DefaultTableModel modelo = new DefaultTableModel();
    HuepedDao hueDao = new HuepedDao();

    public static int idHabitacion = 0;

    public Habitaciones() {
        initComponents();

        this.setSize(600, 460);
        ListarHabitaciones();
        TotalEstado();
        this.OpcionModificar.setEnabled(false);
        this.label_Error.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OpcionesTabla = new javax.swing.JPopupMenu();
        OpcionModificar = new javax.swing.JMenuItem();
        EndMantenimiento = new javax.swing.JMenuItem();
        opcionMantenimiento = new javax.swing.JMenuItem();
        opcion_AbrirPDF = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_Habitacion = new javax.swing.JTable();
        txt_BuscarHabitacion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        Disponibles = new javax.swing.JLabel();
        Uso = new javax.swing.JLabel();
        Mantenimiento = new javax.swing.JLabel();
        label_Error = new javax.swing.JLabel();

        OpcionModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar.png"))); // NOI18N
        OpcionModificar.setText("Modificar");
        OpcionesTabla.add(OpcionModificar);

        EndMantenimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/clear.png"))); // NOI18N
        EndMantenimiento.setText("Finalizar Mantenimiento");
        EndMantenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EndMantenimientoActionPerformed(evt);
            }
        });
        OpcionesTabla.add(EndMantenimiento);

        opcionMantenimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Apagado.png"))); // NOI18N
        opcionMantenimiento.setText("Dar Mantenimiento");
        opcionMantenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionMantenimientoActionPerformed(evt);
            }
        });
        OpcionesTabla.add(opcionMantenimiento);

        opcion_AbrirPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pdf.png"))); // NOI18N
        opcion_AbrirPDF.setText("Ver comprobante");
        opcion_AbrirPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion_AbrirPDFActionPerformed(evt);
            }
        });
        OpcionesTabla.add(opcion_AbrirPDF);

        setBackground(new java.awt.Color(83, 32, 112));

        tabla_Habitacion.setBackground(new java.awt.Color(83, 32, 112));
        tabla_Habitacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "No. Habitacion", "Estado", "Piso", "No. Reservacion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_Habitacion.setComponentPopupMenu(OpcionesTabla);
        tabla_Habitacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_HabitacionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_Habitacion);
        if (tabla_Habitacion.getColumnModel().getColumnCount() > 0) {
            tabla_Habitacion.getColumnModel().getColumn(0).setResizable(false);
            tabla_Habitacion.getColumnModel().getColumn(0).setPreferredWidth(30);
            tabla_Habitacion.getColumnModel().getColumn(1).setPreferredWidth(50);
            tabla_Habitacion.getColumnModel().getColumn(2).setResizable(false);
            tabla_Habitacion.getColumnModel().getColumn(2).setPreferredWidth(100);
            tabla_Habitacion.getColumnModel().getColumn(3).setPreferredWidth(50);
            tabla_Habitacion.getColumnModel().getColumn(4).setPreferredWidth(50);
        }

        txt_BuscarHabitacion.setEditable(false);
        txt_BuscarHabitacion.setBackground(new java.awt.Color(83, 32, 112));
        txt_BuscarHabitacion.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        txt_BuscarHabitacion.setForeground(new java.awt.Color(255, 255, 255));
        txt_BuscarHabitacion.setText("Ingrese una habitacion para buscar");
        txt_BuscarHabitacion.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txt_BuscarHabitacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_BuscarHabitacionMouseClicked(evt);
            }
        });
        txt_BuscarHabitacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_BuscarHabitacionKeyReleased(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hotel.png"))); // NOI18N

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(0, 153, 153));

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(0, 204, 51));

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(255, 51, 51));

        Disponibles.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        Disponibles.setForeground(new java.awt.Color(255, 255, 255));
        Disponibles.setText("000 - Disponibles");

        Uso.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        Uso.setForeground(new java.awt.Color(255, 255, 255));
        Uso.setText("000 - Uso");

        Mantenimiento.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        Mantenimiento.setForeground(new java.awt.Color(255, 255, 255));
        Mantenimiento.setText("000 - Mentenimineto");

        label_Error.setForeground(new java.awt.Color(255, 255, 255));
        label_Error.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_Error.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/danger 1.png"))); // NOI18N
        label_Error.setText("Seleccione una fila de la tabla.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Disponibles, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(label_Error, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Mantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Uso, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_BuscarHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE))
                        .addGap(25, 25, 25))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_BuscarHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(42, 42, 42)
                        .addComponent(label_Error)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Disponibles))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Uso))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Mantenimiento))
                        .addGap(52, 52, 52)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                .addGap(36, 36, 36))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_BuscarHabitacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_BuscarHabitacionMouseClicked
        this.txt_BuscarHabitacion.setText("");
        label_Error.setVisible(false);
        idHabitacion = 0;
    }//GEN-LAST:event_txt_BuscarHabitacionMouseClicked

    private void txt_BuscarHabitacionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_BuscarHabitacionKeyReleased
        LimpiarTabla();
        ListarHabitaciones();
        idHabitacion = 0;
    }//GEN-LAST:event_txt_BuscarHabitacionKeyReleased

    private void tabla_HabitacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_HabitacionMouseClicked
        this.txt_BuscarHabitacion.setText("Ingrese una habitacion para buscar");
        int fila = tabla_Habitacion.rowAtPoint(evt.getPoint());
        String estado = tabla_Habitacion.getValueAt(fila, 2).toString();
        //System.out.println(estado);
        switch (estado) {
            case "Activo" -> {
                this.OpcionModificar.setEnabled(true);
                this.OpcionModificar.setVisible(true);
                this.EndMantenimiento.setEnabled(false);
                this.EndMantenimiento.setVisible(false);
                this.opcionMantenimiento.setVisible(false);
                this.opcionMantenimiento.setEnabled(false);
                this.opcion_AbrirPDF.setVisible(true);
                this.opcion_AbrirPDF.setEnabled(true);

                idHabitacion = Integer.parseInt(tabla_Habitacion.getValueAt(fila, 0).toString());
            }
            case "Mantenimiento" -> {
                this.EndMantenimiento.setEnabled(true);
                this.EndMantenimiento.setVisible(true);
                this.opcionMantenimiento.setVisible(false);
                this.opcionMantenimiento.setEnabled(false);
                this.OpcionModificar.setVisible(false);
                this.opcion_AbrirPDF.setVisible(false);
                this.opcion_AbrirPDF.setEnabled(false);
                idHabitacion = Integer.parseInt(tabla_Habitacion.getValueAt(fila, 0).toString());
            }
            default -> {
                idHabitacion = Integer.parseInt(tabla_Habitacion.getValueAt(fila, 0).toString());
                this.OpcionModificar.setEnabled(false);
                this.OpcionModificar.setVisible(false);
                this.EndMantenimiento.setEnabled(false);
                this.EndMantenimiento.setVisible(false);
                this.opcionMantenimiento.setVisible(true);
                this.opcionMantenimiento.setEnabled(true);
                this.opcion_AbrirPDF.setVisible(false);
                this.opcion_AbrirPDF.setEnabled(false);
            }
        }

    }//GEN-LAST:event_tabla_HabitacionMouseClicked

    private void EndMantenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EndMantenimientoActionPerformed
        if (idHabitacion != 0) {
            label_Error.setVisible(false);
            habDao.modificarEstadoHabitacion("Inactivo", idHabitacion);
            LimpiarTabla();
            ListarHabitaciones();
            idHabitacion = 0;
        } else {
            label_Error.setVisible(true);
        }
    }//GEN-LAST:event_EndMantenimientoActionPerformed

    private void opcionMantenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionMantenimientoActionPerformed
        if (idHabitacion != 0) {
            label_Error.setVisible(false);
            habDao.modificarEstadoHabitacion("Mantenimiento", idHabitacion);
            LimpiarTabla();
            ListarHabitaciones();
            idHabitacion = 0;
        } else {
            label_Error.setVisible(true);
        }
    }//GEN-LAST:event_opcionMantenimientoActionPerformed

    private void opcion_AbrirPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion_AbrirPDFActionPerformed
        if (idHabitacion != 0) {
            File file = new File("src/pdf/reservacion-" + Datos.id_Huesped + ".pdf");
            try {
                Desktop.getDesktop().open(file);
            } catch (IOException e) {
                System.err.println("¡¡Error al abrir el archivo!!\n");
                JOptionPane.showMessageDialog(null, "¡No se encontro el archivo de la venta!");
            }
        } else {
            label_Error.setVisible(true);
        }
    }//GEN-LAST:event_opcion_AbrirPDFActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Disponibles;
    public javax.swing.JMenuItem EndMantenimiento;
    private javax.swing.JLabel Mantenimiento;
    public javax.swing.JMenuItem OpcionModificar;
    private javax.swing.JPopupMenu OpcionesTabla;
    private javax.swing.JLabel Uso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    public javax.swing.JLabel label_Error;
    public javax.swing.JMenuItem opcionMantenimiento;
    private javax.swing.JMenuItem opcion_AbrirPDF;
    private javax.swing.JTable tabla_Habitacion;
    public javax.swing.JTextField txt_BuscarHabitacion;
    // End of variables declaration//GEN-END:variables

    public void ListarHabitaciones() {
        Tables color = new Tables();
        tabla_Habitacion.setDefaultRenderer(tabla_Habitacion.getColumnClass(0), color);

        List<Habitacion> listarHabitacion = habDao.ListasHabitacion(txt_BuscarHabitacion.getText().trim());
        modelo = (DefaultTableModel) tabla_Habitacion.getModel();
        Object[] ob = new Object[6];

        for (int i = 0; i < listarHabitacion.size(); i++) {

            ob[0] = listarHabitacion.get(i).getId();
            ob[1] = listarHabitacion.get(i).getNoHabitacion();
            ob[2] = listarHabitacion.get(i).getEstado();
            ob[3] = listarHabitacion.get(i).getPiso();
            ob[4] = listarHabitacion.get(i).getNoReservacion();

            modelo.addRow(ob);
        }

        tabla_Habitacion.setModel(modelo);
        JTableHeader header = tabla_Habitacion.getTableHeader();
        header.setOpaque(false);
        header.setBackground(Color.blue);
        header.setForeground(Color.RED);
        header.setFont(new java.awt.Font("Roboto Medium", 0, 12));
    }

    public void TotalEstado() {
        Map<String, Integer> total = habDao.Total();
        this.Disponibles.setText(total.get("Inactivo") + " -- Disponibles");
        this.Mantenimiento.setText(total.get("Mantenimiento") + " -- Mantenimiento");
        this.Uso.setText(total.get("Activo") + " -- Ocupadas");
    }

    public void LimpiarTabla() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i -= 1;
        }
    }

}
