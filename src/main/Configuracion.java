/*
 * Fecha de creacion: 15/04/2023 23:02:02
 * Version: v.0.1
 * Detalles: 
 */
package main;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import models.Setting;
import models.SettingDao;

/**
 *
 * @author Willy Stbn
 */
public class Configuracion extends javax.swing.JPanel {

    Setting s = new Setting();
    SettingDao sDao = new SettingDao();
    public static String nombreHotel = "";

    public Configuracion() {
        initComponents();

        this.setSize(600, 460);
        ListarConfiguracion();
        limpiarCampos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_FooterHotel = new javax.swing.JLabel();
        label_NombreHotel = new javax.swing.JLabel();
        txt_NombreHotel = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        label_RazonHotel = new javax.swing.JLabel();
        txt_RazonHotel = new javax.swing.JTextField();
        label_TelefonoHotel = new javax.swing.JLabel();
        txt_TelefonoHotel = new javax.swing.JTextField();
        label_CorreoHotel = new javax.swing.JLabel();
        txt_CorreoHotel = new javax.swing.JTextField();
        label_UbicacionHotel = new javax.swing.JLabel();
        txt_UbicacionHotel = new javax.swing.JTextField();
        btn_ActualizarInformacion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_NuevoUsuario = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 0, 51));

        label_FooterHotel.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
        label_FooterHotel.setForeground(new java.awt.Color(255, 255, 0));
        label_FooterHotel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/danger 1.png"))); // NOI18N
        label_FooterHotel.setText("¡¡Esta informacion se imprimiera en el \ncomprobante del huesped!!");

        label_NombreHotel.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 12)); // NOI18N
        label_NombreHotel.setForeground(new java.awt.Color(51, 255, 255));
        label_NombreHotel.setText("Nombre del hotel:");

        txt_NombreHotel.setBackground(new java.awt.Color(51, 0, 51));
        txt_NombreHotel.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        txt_NombreHotel.setForeground(new java.awt.Color(255, 255, 255));
        txt_NombreHotel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_NombreHotel.setText("HOTEL ALURA");
        txt_NombreHotel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 153, 0)));

        jLabel5.setFont(new java.awt.Font("French Script MT", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 204, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Informacion del Hotel");

        label_RazonHotel.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 12)); // NOI18N
        label_RazonHotel.setForeground(new java.awt.Color(51, 255, 255));
        label_RazonHotel.setText("Razon Social:");

        txt_RazonHotel.setBackground(new java.awt.Color(51, 0, 51));
        txt_RazonHotel.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        txt_RazonHotel.setForeground(new java.awt.Color(255, 255, 255));
        txt_RazonHotel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_RazonHotel.setText("Hoteles Alura Company S.A. de C.V.");
        txt_RazonHotel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 153, 0)));

        label_TelefonoHotel.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 12)); // NOI18N
        label_TelefonoHotel.setForeground(new java.awt.Color(51, 255, 255));
        label_TelefonoHotel.setText("Telefono:");

        txt_TelefonoHotel.setBackground(new java.awt.Color(51, 0, 51));
        txt_TelefonoHotel.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        txt_TelefonoHotel.setForeground(new java.awt.Color(255, 255, 255));
        txt_TelefonoHotel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_TelefonoHotel.setText("32424234");
        txt_TelefonoHotel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 153, 0)));

        label_CorreoHotel.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 12)); // NOI18N
        label_CorreoHotel.setForeground(new java.awt.Color(51, 255, 255));
        label_CorreoHotel.setText("Correo:");

        txt_CorreoHotel.setBackground(new java.awt.Color(51, 0, 51));
        txt_CorreoHotel.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        txt_CorreoHotel.setForeground(new java.awt.Color(255, 255, 255));
        txt_CorreoHotel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_CorreoHotel.setText("hotelAlura@alura.com");
        txt_CorreoHotel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 153, 0)));

        label_UbicacionHotel.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 12)); // NOI18N
        label_UbicacionHotel.setForeground(new java.awt.Color(51, 255, 255));
        label_UbicacionHotel.setText("Ubicacion:");

        txt_UbicacionHotel.setBackground(new java.awt.Color(51, 0, 51));
        txt_UbicacionHotel.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 12)); // NOI18N
        txt_UbicacionHotel.setForeground(new java.awt.Color(255, 255, 255));
        txt_UbicacionHotel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_UbicacionHotel.setText("172, Me. de Deus - BA, 42600-000, Brasil");
        txt_UbicacionHotel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 153, 0)));

        btn_ActualizarInformacion.setBackground(new java.awt.Color(0, 204, 51));
        btn_ActualizarInformacion.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btn_ActualizarInformacion.setForeground(new java.awt.Color(0, 51, 204));
        btn_ActualizarInformacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar-texto.png"))); // NOI18N
        btn_ActualizarInformacion.setText("Actualizar Informacion");
        btn_ActualizarInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ActualizarInformacionActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo_IMGSetting.png"))); // NOI18N

        btn_NuevoUsuario.setBackground(new java.awt.Color(255, 255, 255));
        btn_NuevoUsuario.setForeground(new java.awt.Color(102, 0, 0));
        btn_NuevoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ico_nuevoUsuario.png"))); // NOI18N
        btn_NuevoUsuario.setText("Añadir usuario");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_FooterHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_UbicacionHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(label_NombreHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(180, 180, 180))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_CorreoHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label_CorreoHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_TelefonoHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label_TelefonoHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_RazonHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label_RazonHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_NombreHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)))
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(29, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btn_NuevoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_UbicacionHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_ActualizarInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(66, 66, 66))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label_NombreHotel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_NombreHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(label_RazonHotel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_RazonHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(label_TelefonoHotel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_TelefonoHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(label_CorreoHotel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_CorreoHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_UbicacionHotel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_UbicacionHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ActualizarInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_FooterHotel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_NuevoUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ActualizarInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ActualizarInformacionActionPerformed
        if (ValidarCamposSetting()) {
            sDao.ActualizarInformacion(DatosSetting());
            ListarConfiguracion();
            JOptionPane.showMessageDialog(null, "¡¡Modificacion exitoso!!");
            limpiarCampos();
        } else {
            JOptionPane.showMessageDialog(null, "¡Rellene todos los campos!");
        }
    }//GEN-LAST:event_btn_ActualizarInformacionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ActualizarInformacion;
    public javax.swing.JButton btn_NuevoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel label_CorreoHotel;
    private javax.swing.JLabel label_FooterHotel;
    private javax.swing.JLabel label_NombreHotel;
    private javax.swing.JLabel label_RazonHotel;
    private javax.swing.JLabel label_TelefonoHotel;
    private javax.swing.JLabel label_UbicacionHotel;
    private javax.swing.JTextField txt_CorreoHotel;
    private javax.swing.JTextField txt_NombreHotel;
    private javax.swing.JTextField txt_RazonHotel;
    private javax.swing.JTextField txt_TelefonoHotel;
    private javax.swing.JTextField txt_UbicacionHotel;
    // End of variables declaration//GEN-END:variables

    private void ListarConfiguracion() {
        s = sDao.CargarInformacion();

        txt_NombreHotel.setText(s.getNombre());
        txt_RazonHotel.setText(s.getRazon());
        txt_TelefonoHotel.setText(s.getTelefono());
        txt_CorreoHotel.setText(s.getCorreo());
        txt_UbicacionHotel.setText(s.getUbicacion());
        
        nombreHotel = s.getNombre();

    }
    
    private boolean ValidarCamposSetting() {

        int check = 0;

        String nombre = txt_NombreHotel.getText().trim();
        String razon = txt_RazonHotel.getText().trim();
        String telefono = txt_TelefonoHotel.getText().trim();
        String correo = txt_CorreoHotel.getText().trim();
        String ubicacion = txt_UbicacionHotel.getText().trim();

        if (nombre.equals("")) {
            label_NombreHotel.setForeground(Color.red);
            txt_NombreHotel.setBackground(Color.lightGray);
            check++;
        } else {
            label_NombreHotel.setForeground(Color.BLACK);
            txt_NombreHotel.setBackground(Color.GREEN);
        }
        if (razon.equals("")) {
            label_RazonHotel.setForeground(Color.red);
            txt_RazonHotel.setBackground(Color.lightGray);
            check++;
        } else {
            label_RazonHotel.setForeground(Color.BLACK);
            txt_RazonHotel.setBackground(Color.GREEN);
        }
        if (telefono.equals("")) {
            label_TelefonoHotel.setForeground(Color.red);
            txt_TelefonoHotel.setBackground(Color.lightGray);
            check++;
        } else {
            label_TelefonoHotel.setForeground(Color.BLACK);
            txt_TelefonoHotel.setBackground(Color.GREEN);
        }
        if (correo.equals("")) {
            label_CorreoHotel.setForeground(Color.red);
            txt_CorreoHotel.setBackground(Color.lightGray);
            check++;
        } else {
            label_CorreoHotel.setForeground(Color.BLACK);
            txt_CorreoHotel.setBackground(Color.GREEN);
        }
        if (ubicacion.equals("")) {
            label_UbicacionHotel.setForeground(Color.red);
            txt_UbicacionHotel.setBackground(Color.lightGray);
            check++;
        } else {
            label_UbicacionHotel.setForeground(Color.BLACK);
            txt_UbicacionHotel.setBackground(Color.GREEN);
        }

        return check == 0;

    }
    
    private Map<Integer, String> DatosSetting() {
        Map<Integer, String> envio = new HashMap<>();

        String nombre = txt_NombreHotel.getText().trim();
        String razon = txt_RazonHotel.getText().trim();
        String telefono = txt_TelefonoHotel.getText().trim();
        String correo = txt_CorreoHotel.getText().trim();
        String ubicacion = txt_UbicacionHotel.getText().trim();
        //String user = Login.nombreUser;

        /*
        1 - id
        2 - nombre
        3 - razon
        4 - telefono
        5 - correo
        6 - ubicacion
        7 - actualizado_por
         */
        if (ValidarCamposSetting()) {
            envio.put(1, "1");
            envio.put(2, nombre);
            envio.put(3, razon);
            envio.put(4, telefono);
            envio.put(5, correo);
            envio.put(6, ubicacion);
//            if (user.equals("")) {
//                envio.put(7, "Sistema");
//            } else {
//                envio.put(7, user);
//            }

        }

        return envio;
    }
    
    public void limpiarCampos(){
        Color color = new Color(51,0,51);
        Color color1 = new Color(51, 255, 255);
        this.txt_CorreoHotel.setBackground(color);
        this.txt_NombreHotel.setBackground(color);
        this.txt_RazonHotel.setBackground(color);
        this.txt_TelefonoHotel.setBackground(color);
        this.txt_UbicacionHotel.setBackground(color);
        
        this.label_CorreoHotel.setForeground(color1);
        this.label_NombreHotel.setForeground(color1);
        this.label_RazonHotel.setForeground(color1);
        this.label_TelefonoHotel.setForeground(color1);
        this.label_UbicacionHotel.setForeground(color1);
    }
}
