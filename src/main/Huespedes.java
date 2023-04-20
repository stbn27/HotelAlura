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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import models.Datos;
import models.HabitacionDao;
import models.HuepedDao;
import models.Huesped;
import models.Tables;

/**
 *
 * @author Willy Stbn
 */
public class Huespedes extends javax.swing.JPanel {

    private Piso1 piso1 = new Piso1();
    private Piso2 piso2 = new Piso2();
    private Piso3 piso3 = new Piso3();
    private Piso4 piso4 = new Piso4();
    private Piso5 piso5 = new Piso5();

    HabitacionDao habDao = new HabitacionDao();
    DefaultTableModel modelo = new DefaultTableModel();
    HuepedDao hueDao = new HuepedDao();

    public Huespedes() {
        initComponents();

        this.setSize(600, 460);

        txtId_Huesped.setVisible(false);

        ListarHuespedes();
        label_Error.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menu_Tabla = new javax.swing.JPopupMenu();
        opcion_Eliminar = new javax.swing.JMenuItem();
        opcion_Modificar = new javax.swing.JMenuItem();
        opcion_AbrirPDF = new javax.swing.JMenuItem();
        txt_BuscarHuesped = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_Huespedes = new javax.swing.JTable();
        txtId_Huesped = new javax.swing.JTextField();
        label_Error = new javax.swing.JLabel();

        opcion_Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Eliminar.png"))); // NOI18N
        opcion_Eliminar.setText("Eliminar");
        opcion_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion_EliminarActionPerformed(evt);
            }
        });
        Menu_Tabla.add(opcion_Eliminar);

        opcion_Modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar.png"))); // NOI18N
        opcion_Modificar.setText("Modificar");
        Menu_Tabla.add(opcion_Modificar);

        opcion_AbrirPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pdf.png"))); // NOI18N
        opcion_AbrirPDF.setText("Ver comprobante");
        opcion_AbrirPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion_AbrirPDFActionPerformed(evt);
            }
        });
        Menu_Tabla.add(opcion_AbrirPDF);

        setBackground(new java.awt.Color(102, 51, 0));

        txt_BuscarHuesped.setBackground(new java.awt.Color(102, 51, 0));
        txt_BuscarHuesped.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        txt_BuscarHuesped.setForeground(new java.awt.Color(255, 255, 255));
        txt_BuscarHuesped.setText("Realizar una busqueda");
        txt_BuscarHuesped.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txt_BuscarHuesped.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_BuscarHuespedMouseClicked(evt);
            }
        });
        txt_BuscarHuesped.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_BuscarHuespedKeyReleased(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/viajero.png"))); // NOI18N

        tabla_Huespedes.setAutoCreateRowSorter(true);
        tabla_Huespedes.setBackground(new java.awt.Color(102, 51, 0));
        tabla_Huespedes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Telefono", "Nacionalidad", "Habitacion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_Huespedes.setComponentPopupMenu(Menu_Tabla);
        tabla_Huespedes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_HuespedesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_Huespedes);
        if (tabla_Huespedes.getColumnModel().getColumnCount() > 0) {
            tabla_Huespedes.getColumnModel().getColumn(0).setPreferredWidth(30);
            tabla_Huespedes.getColumnModel().getColumn(1).setPreferredWidth(200);
            tabla_Huespedes.getColumnModel().getColumn(3).setPreferredWidth(50);
            tabla_Huespedes.getColumnModel().getColumn(4).setPreferredWidth(50);
        }

        label_Error.setForeground(new java.awt.Color(255, 255, 255));
        label_Error.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_Error.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/danger 1.png"))); // NOI18N
        label_Error.setText("Seleccione una fila de la tabla.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtId_Huesped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_BuscarHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 778, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label_Error, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_BuscarHuesped, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtId_Huesped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(label_Error)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                .addGap(146, 146, 146))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_BuscarHuespedKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_BuscarHuespedKeyReleased
        LimpiarTabla();
        ListarHuespedes();
    }//GEN-LAST:event_txt_BuscarHuespedKeyReleased

    private void txt_BuscarHuespedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_BuscarHuespedMouseClicked
        txt_BuscarHuesped.setText("");
        label_Error.setVisible(false);
    }//GEN-LAST:event_txt_BuscarHuespedMouseClicked

    private void opcion_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion_EliminarActionPerformed
        if (Datos.id_Huesped != 0) {

            int opcion = JOptionPane.showConfirmDialog(null, "Estas seguro de eliminar este huesped.\n"
                    + "La habitacion sera desocupada.");
            if (opcion == 0) {
                hueDao.EliminarHuesped(Datos.id_Huesped);
                hueDao.modificarEstadoHabitacion("Inactivo", Datos.id_Huesped);
                LimpiarTabla();
                ListarHuespedes();
                piso1.Color();
                piso2.Color();
                piso3.Color();
                piso4.Color();
                piso5.Color();

                txtId_Huesped.setText("");

            }
        } else {
            label_Error.setVisible(true);
        }
    }//GEN-LAST:event_opcion_EliminarActionPerformed

    private void tabla_HuespedesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_HuespedesMouseClicked
        int fila = tabla_Huespedes.rowAtPoint(evt.getPoint());

        txtId_Huesped.setText(tabla_Huespedes.getValueAt(fila, 0).toString());
        Datos.id_Huesped = Integer.parseInt(tabla_Huespedes.getValueAt(fila, 0).toString());
        txt_BuscarHuesped.setText("Realizar una busqueda");
        label_Error.setVisible(false);
    }//GEN-LAST:event_tabla_HuespedesMouseClicked

    private void opcion_AbrirPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion_AbrirPDFActionPerformed
        if (Datos.id_Huesped != 0) {

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
    private javax.swing.JPopupMenu Menu_Tabla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel label_Error;
    private javax.swing.JMenuItem opcion_AbrirPDF;
    private javax.swing.JMenuItem opcion_Eliminar;
    public javax.swing.JMenuItem opcion_Modificar;
    private javax.swing.JTable tabla_Huespedes;
    private javax.swing.JTextField txtId_Huesped;
    public javax.swing.JTextField txt_BuscarHuesped;
    // End of variables declaration//GEN-END:variables

    public void LimpiarTabla() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i -= 1;
        }
    }

    public void ListarHuespedes() {
        Tables color = new Tables();
        tabla_Huespedes.setDefaultRenderer(tabla_Huespedes.getColumnClass(0), color);

        List<Huesped> listarHuespedes = hueDao.ListasHuespedes(txt_BuscarHuesped.getText().trim());
        modelo = (DefaultTableModel) tabla_Huespedes.getModel();
        Object[] ob = new Object[5];

        for (int i = 0; i < listarHuespedes.size(); i++) {

            int noHabitacion = habDao.consultarHabitacion(listarHuespedes.get(i).getId());

            ob[0] = listarHuespedes.get(i).getId();
            ob[1] = listarHuespedes.get(i).getNombre() + " " + listarHuespedes.get(i).getApellido();
            ob[2] = listarHuespedes.get(i).getTelefono();
            ob[3] = listarHuespedes.get(i).getNacionalidad();
            ob[4] = String.valueOf(noHabitacion);

            modelo.addRow(ob);
        }

        tabla_Huespedes.setModel(modelo);
        JTableHeader header = tabla_Huespedes.getTableHeader();
        header.setOpaque(false);
        header.setBackground(Color.blue);
        header.setForeground(Color.RED);
        header.setFont(new java.awt.Font("Roboto Medium", 0, 12));
    }

}
