/*
 * Fecha de creacion: 18/04/2023 13:13:04
 * Version: v.0.1
 * Detalles: 
 */
package main;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import models.Datos;
import models.Habitacion;
import models.HabitacionDao;
import models.HuepedDao;
import models.Huesped;

/**
 *
 * @author Willy Stbn
 */
public final class ActualizarInformacion extends javax.swing.JFrame {

    Huesped hue = new Huesped();
    HuepedDao hueDao = new HuepedDao();
    Habitacion hab = new Habitacion();
    HabitacionDao habDao = new HabitacionDao();
    int pago = 0;

    public ActualizarInformacion() {
        initComponents();

        this.setTitle("Modificar informacion del huesped: ");
        this.setLocationRelativeTo(null);
        this.label_Error.setVisible(false);

        //ValidarTiempo();
        LlenarCampos();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/ico.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        label_title = new javax.swing.JLabel();
        label_Nombre = new javax.swing.JLabel();
        txt_nombreReservacion = new javax.swing.JTextField();
        label_apellidos = new javax.swing.JLabel();
        txt_apellidoReservacion1 = new javax.swing.JTextField();
        label_fechaNacimiento = new javax.swing.JLabel();
        date_fechaNacimiento = new com.toedter.calendar.JDateChooser();
        label_nacionalidad = new javax.swing.JLabel();
        cmb_nacionalidad = new javax.swing.JComboBox<>();
        label_telefono = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        txt_habitacion = new javax.swing.JTextField();
        label_fechaIn_Reservacion = new javax.swing.JLabel();
        date_fechaCheckIn = new com.toedter.calendar.JDateChooser();
        label_fechaOut_reservacion = new javax.swing.JLabel();
        date_fechaCheckOut = new com.toedter.calendar.JDateChooser();
        label_medioPagoRservacion = new javax.swing.JLabel();
        cmb_MedioPagoR = new javax.swing.JComboBox<>();
        label_Error = new javax.swing.JLabel();
        btn_guardarR = new javax.swing.JButton();
        txt_costoTotal_Reservacion = new javax.swing.JTextField();
        btn_Cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/banner_img.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        label_title.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        label_title.setForeground(new java.awt.Color(70, 6, 6));
        label_title.setText("INFORMACIÓN DEL HUESPED:");

        label_Nombre.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        label_Nombre.setForeground(new java.awt.Color(0, 0, 51));
        label_Nombre.setText("Nombre(s):");

        txt_nombreReservacion.setBackground(new java.awt.Color(255, 255, 255));
        txt_nombreReservacion.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        txt_nombreReservacion.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_nombreReservacion.setText("Nombre de usuario");
        txt_nombreReservacion.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 51)));

        label_apellidos.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        label_apellidos.setForeground(new java.awt.Color(0, 0, 51));
        label_apellidos.setText("Apellidos:");

        txt_apellidoReservacion1.setBackground(new java.awt.Color(255, 255, 255));
        txt_apellidoReservacion1.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        txt_apellidoReservacion1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_apellidoReservacion1.setText("Apellido de usuario");
        txt_apellidoReservacion1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 51)));

        label_fechaNacimiento.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        label_fechaNacimiento.setForeground(new java.awt.Color(0, 0, 51));
        label_fechaNacimiento.setText("Fecha de nacimiento:");

        date_fechaNacimiento.setBackground(new java.awt.Color(217, 217, 217));
        date_fechaNacimiento.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        date_fechaNacimiento.setForeground(new java.awt.Color(0, 0, 0));

        label_nacionalidad.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        label_nacionalidad.setForeground(new java.awt.Color(0, 0, 51));
        label_nacionalidad.setText("Nacionalidad:");

        cmb_nacionalidad.setBackground(new java.awt.Color(217, 217, 217));
        cmb_nacionalidad.setEditable(true);
        cmb_nacionalidad.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        cmb_nacionalidad.setForeground(new java.awt.Color(0, 0, 0));
        cmb_nacionalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "afgano", "albanés", "Argelino", "Andorrano", "Angola", "Antigua o Barbudan", "Argentina", "armenio", "Australiano", "austriaco", "Azerbaiyano, azerí", "Bahameño", "Bahrein", "bengalí", "Barbados", "Bielorruso", "Belga", "Beliceño", "Beninés, Beninois", "Butanés", "boliviano", "Bosnio o herzegovinio", "Motswana, Botswana", "brasileño", "Bruneián", "Bulgarian", "Burkinabé", "birmano", "Burundiano", "Cabo Verde", "Camboyano", "camerunés", "canadiense", "Centroafricano", "Chadiano", "Chileno", "Chino", "colombianas", "Comoras, comorenses", "congoleña", "congoleña", "Costa Rica", "Marfileño", "croata", "Cubano", "Chipriota", "Checo", "danés", "Djibouti", "Dominicanas", "Dominicanas", "Timorense", "ecuatoriano", "Egipcio", "salvadoreño", "Ecuatoguineano, ecuatoguineano", "Eritreo", "Estonia", "etíope", "Fijian", "Finnish", "Francés", "Gabonés", "Gambiano", "georgiano", "Alemán", "ghanés", "Gibraltar", "Griego, helénico", "Granada", "guatemalteco", "Guineano", "Bissau-Guineano", "Guyana", "danza del África Occidental, danza afro haitiana,", "hondureña", "Húngaro, Magyar", "islandés", "indio", "Indonesian", "Iraní, persa", "iraquí", "irlandés", "israelí", "Italiano", "Marfileño", "jamaicano", "Japonés", "Jordano", "Kazajo, kazajo", "Keniano", "I-Kiribati", "Norcoreano", "Surcoreano", "Kuwaití", "Kirguistán, Kirguistán, Kirgiz, Kirguizistán", "Lao, laosiano", "Letón, Lettish", "libanés", "Basotho", "Liberiano", "Libio", "Liechtenstein", "lituano", "Luxemburgo, luxemburgués", "macedonio", "madagascarí", "Malawiano", "Malasio", "Maldivas", "Maliense, Malinés", "maltés", "Islas Marshall", "Martiniquais, Martinica", "mauritano", "mauriciano", "Mexicano", "Micronesia", "Moldavo", "Monégasque, Monacan", "mongol", "montenegrino", "marroquí", "mozambiqueño", "namibio", "nauruana", "Nepalí, nepalí", "Holandés, neerlandés", "Nueva Zelanda, Nueva Zelanda, Zelanian", "nicaragüense", "Nigeriano", "Nigeriano", "Marianan del norte", "Norwegian", "omaní", "Paquistaní", "Palauan", "palestino", "panameño", "Papua Nueva Guinea, Papuan", "paraguayo", "peruano", "Filipino, filipino", "polaco", "Portuguese", "puertorriqueño", "Qatar", "rumano", "Ruso", "Ruandés", "Kittitian o Nevisian", "Saint Lucian", "San Vicente, Vicentino", "Samoano", "Sammarinese", "São Toméan", "Arabia Saudita, Arabia Saudita", "Senegal", "serbio", "Seychelles", "Sierra Leona", "Singapur, Singapur", "Slovak", "Esloveno, esloveno", "Solomon Island", "somalí", "sudafricano", "Sudán del sur", "Español", "de Sri Lanka", "sudanés", "surinamés", "Swazi", "Swedish", "suizo", "Sirio", "Tajikistani", "Tanzania", "Thai", "Timorense", "Togolés", "Tokelauan", "Tonga", "Trinidad y Tobago", "tunecino", "turco", "Turkmenistán", "tuvaluano", "Uganda", "ucranio", "Emirati, Emirian, Emiri", "Reino Unido, Británico", "Estados Unidos, EE. UU., Estadounidense", "uruguayo", "Uzbeko, uzbeko", "Ni-Vanuatu, Vanuatuán", "Vaticano", "venezolano", "vietnamita", "yemenita", "Zambia", "zimbabuo" }));

        label_telefono.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        label_telefono.setForeground(new java.awt.Color(0, 0, 51));
        label_telefono.setText("Telefono:");

        txt_telefono.setBackground(new java.awt.Color(255, 255, 255));
        txt_telefono.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        txt_telefono.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_telefono.setText("000-000-000");
        txt_telefono.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 51)));

        txt_habitacion.setEditable(false);
        txt_habitacion.setBackground(new java.awt.Color(255, 255, 255));
        txt_habitacion.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        txt_habitacion.setForeground(new java.awt.Color(102, 204, 0));
        txt_habitacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_habitacion.setText("000");
        txt_habitacion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Habitacion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Medium", 0, 12), new java.awt.Color(153, 51, 0))); // NOI18N

        label_fechaIn_Reservacion.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        label_fechaIn_Reservacion.setForeground(new java.awt.Color(0, 0, 51));
        label_fechaIn_Reservacion.setText("Fecha de check-in:");

        date_fechaCheckIn.setBackground(new java.awt.Color(217, 217, 217));
        date_fechaCheckIn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        date_fechaCheckIn.setForeground(new java.awt.Color(0, 255, 0));

        label_fechaOut_reservacion.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        label_fechaOut_reservacion.setForeground(new java.awt.Color(0, 0, 51));
        label_fechaOut_reservacion.setText("Fecha de check-in:");

        date_fechaCheckOut.setBackground(new java.awt.Color(217, 217, 217));
        date_fechaCheckOut.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        date_fechaCheckOut.setForeground(new java.awt.Color(0, 255, 0));
        date_fechaCheckOut.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                date_fechaCheckOutPropertyChange(evt);
            }
        });

        label_medioPagoRservacion.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        label_medioPagoRservacion.setForeground(new java.awt.Color(0, 0, 51));
        label_medioPagoRservacion.setText("Medio de pago:");

        cmb_MedioPagoR.setBackground(new java.awt.Color(217, 217, 217));
        cmb_MedioPagoR.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cmb_MedioPagoR.setForeground(new java.awt.Color(0, 0, 0));
        cmb_MedioPagoR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Efectivo", "Tarjeta de credito", "Tarjeta de debito" }));

        label_Error.setForeground(new java.awt.Color(255, 51, 0));
        label_Error.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/danger 1.png"))); // NOI18N
        label_Error.setText("¡Rellene todos los campos!");

        btn_guardarR.setBackground(new java.awt.Color(0, 153, 0));
        btn_guardarR.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        btn_guardarR.setForeground(new java.awt.Color(0, 0, 0));
        btn_guardarR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/disquete.png"))); // NOI18N
        btn_guardarR.setText("Actualizar");
        btn_guardarR.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(102, 204, 0), null, null));
        btn_guardarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarRActionPerformed(evt);
            }
        });

        txt_costoTotal_Reservacion.setBackground(new java.awt.Color(255, 255, 255));
        txt_costoTotal_Reservacion.setFont(new java.awt.Font("Roboto Medium", 1, 12)); // NOI18N
        txt_costoTotal_Reservacion.setForeground(new java.awt.Color(0, 0, 153));
        txt_costoTotal_Reservacion.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_costoTotal_Reservacion.setText("$ 0.00");
        txt_costoTotal_Reservacion.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(null), "Total: ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Medium", 0, 12), new java.awt.Color(204, 0, 0))); // NOI18N

        btn_Cancelar.setBackground(new java.awt.Color(153, 51, 0));
        btn_Cancelar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btn_Cancelar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Cancelar.setText("Cancelar");
        btn_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label_title, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label_Error, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(label_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(162, 162, 162)
                                .addComponent(label_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_nombreReservacion, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_fechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(date_fechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_nacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_habitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_apellidoReservacion1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(label_fechaIn_Reservacion, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(date_fechaCheckIn, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                                .addComponent(label_fechaOut_reservacion, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(date_fechaCheckOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(label_medioPagoRservacion, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(cmb_MedioPagoR, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(16, 16, 16)))
                                    .addComponent(txt_costoTotal_Reservacion, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_telefono, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmb_nacionalidad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addComponent(btn_Cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_guardarR, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_title)
                    .addComponent(label_Error, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_Nombre)
                    .addComponent(label_apellidos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nombreReservacion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_apellidoReservacion1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label_fechaNacimiento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(date_fechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(label_nacionalidad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmb_nacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(label_telefono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label_fechaIn_Reservacion)
                        .addGap(3, 3, 3)
                        .addComponent(date_fechaCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(label_fechaOut_reservacion)
                        .addGap(3, 3, 3)
                        .addComponent(date_fechaCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(label_medioPagoRservacion)
                        .addGap(13, 13, 13)
                        .addComponent(cmb_MedioPagoR, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_costoTotal_Reservacion, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_Cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_guardarR, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)))
                    .addComponent(txt_habitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_guardarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarRActionPerformed
        if (ValidarCamposHuesped() && ValidarCamposHabitacion()) {
            label_Error.setVisible(false);
            String nombre = txt_nombreReservacion.getText();
            String apellido = txt_apellidoReservacion1.getText();
            String telefono = txt_telefono.getText();
            Date nacimiento = date_fechaNacimiento.getDate();
            Date inicio = date_fechaCheckIn.getDate();
            Date fin = date_fechaCheckOut.getDate();
            int habitacion = Integer.parseInt(txt_habitacion.getText());
            String medioPago = cmb_MedioPagoR.getSelectedItem().toString();
            String nacionalidad = cmb_nacionalidad.getSelectedItem().toString();
            int idHuesped = Datos.id_Huesped;
            double costo = Double.parseDouble(txt_costoTotal_Reservacion.getText().substring(2, txt_costoTotal_Reservacion.getText().length()));

            hab.setCosto(costo);
            hab.setNoHabitacion(habitacion);
            hab.setFin(fin);
            hab.setInicio(inicio);
            hab.setMedioPago(medioPago);

            hue.setId(idHuesped);
            hue.setApellido(apellido);
            hue.setNacimiento(nacimiento);
            hue.setNacionalidad(nacionalidad);
            hue.setNombre(nombre);
            hue.setTelefono(telefono);

            if (hueDao.ActualizarInfoHuesped(hue) && habDao.ActualizarInfoHabitacion(hab)) {
                label_Error.setVisible(false);
                JOptionPane.showMessageDialog(null, "Huesped modificado con exito.");
                Datos.id_Huesped = 0;
                dispose();
            } else {
                label_Error.setText("Error al modificar Huesped");
                label_Error.setVisible(true);
            }

        } else {
            label_Error.setText("Rellene todo los campos!!");
            label_Error.setVisible(true);
        }
    }//GEN-LAST:event_btn_guardarRActionPerformed

    private void btn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelarActionPerformed
        Datos.id_Huesped = 0;
        dispose();
    }//GEN-LAST:event_btn_CancelarActionPerformed

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
                    case 1 ->
                        txt_costoTotal_Reservacion.setText("$ 450.00");
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
            java.util.logging.Logger.getLogger(ActualizarInformacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new ActualizarInformacion().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Cancelar;
    private javax.swing.JButton btn_guardarR;
    private javax.swing.JComboBox<String> cmb_MedioPagoR;
    private javax.swing.JComboBox<String> cmb_nacionalidad;
    private com.toedter.calendar.JDateChooser date_fechaCheckIn;
    private com.toedter.calendar.JDateChooser date_fechaCheckOut;
    private com.toedter.calendar.JDateChooser date_fechaNacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_Error;
    private javax.swing.JLabel label_Nombre;
    private javax.swing.JLabel label_apellidos;
    private javax.swing.JLabel label_fechaIn_Reservacion;
    private javax.swing.JLabel label_fechaNacimiento;
    private javax.swing.JLabel label_fechaOut_reservacion;
    private javax.swing.JLabel label_medioPagoRservacion;
    private javax.swing.JLabel label_nacionalidad;
    private javax.swing.JLabel label_telefono;
    private javax.swing.JLabel label_title;
    private javax.swing.JTextField txt_apellidoReservacion1;
    private javax.swing.JTextField txt_costoTotal_Reservacion;
    private javax.swing.JTextField txt_habitacion;
    private javax.swing.JTextField txt_nombreReservacion;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables

    private void ValidarTiempo() {
        date_fechaCheckIn.setMinSelectableDate(new Date());
        date_fechaCheckIn.setDate(new Date());

        Calendar diaMinimo = Calendar.getInstance();
        diaMinimo.add(Calendar.DAY_OF_MONTH, 1);
        date_fechaCheckOut.setMinSelectableDate(diaMinimo.getTime());
        date_fechaCheckOut.setDate(diaMinimo.getTime());

        Calendar fechaDefault = Calendar.getInstance();
        fechaDefault.set(2000, fechaDefault.JANUARY, 1);
        date_fechaNacimiento.setMaxSelectableDate(new Date());
        date_fechaNacimiento.setDate(fechaDefault.getTime());
    }

    public void LlenarCampos() {
        int id_Huesped = Datos.id_Huesped;
        System.out.println("Ventana actrualizar: " + id_Huesped);
        hue = hueDao.ConsultarHuesped(id_Huesped);
        hab = habDao.ObtenerDatos(id_Huesped);

        txt_nombreReservacion.setText(hue.getNombre());
        txt_apellidoReservacion1.setText(hue.getApellido());
        txt_telefono.setText(hue.getTelefono());
        cmb_nacionalidad.setSelectedItem(hue.getNacionalidad());
        date_fechaNacimiento.setDate(hue.getNacimiento());

        txt_habitacion.setText(hab.getNoHabitacion() + "");
        date_fechaCheckIn.setDate(hab.getInicio());
        date_fechaCheckOut.setDate(hab.getFin());
        txt_costoTotal_Reservacion.setText(hab.getCosto() + "");
    }

    private boolean ValidarCamposHuesped() {
        String nombre = txt_nombreReservacion.getText().trim();
        String apellido = txt_apellidoReservacion1.getText().trim();
        String telefono = txt_telefono.getText().trim();

        String campo = "Campo obligatorio";
        int check = 0;

        boolean n = nombre.equals("") || nombre.equals("campo") || nombre.equals("Ingrese el nombre del huesped");
        boolean a = apellido.equals("") || apellido.equals("campo") || apellido.equals("Ingrese los apellidos del huesped");
        boolean t = telefono.equals("") || telefono.equals("campo") || telefono.equals("Ingrese el télefono del huesped");

        if (n) {
            txt_nombreReservacion.setText(campo);
            txt_nombreReservacion.setForeground(Color.red);
            check++;
        } else {
            txt_nombreReservacion.setForeground(Color.BLACK);
        }
        if (a) {
            txt_apellidoReservacion1.setText(campo);
            txt_apellidoReservacion1.setForeground(Color.red);
            check++;
        } else {
            txt_apellidoReservacion1.setForeground(Color.BLACK);
        }
        if (t) {
            txt_telefono.setText(campo);
            txt_telefono.setForeground(Color.red);
            check++;
        } else {
            txt_telefono.setForeground(Color.BLACK);
        }

        if (check == 0) {
            label_Error.setVisible(false);
            return true;
        } else {
            label_Error.setText("Rellene todos los campos");
            label_Error.setVisible(true);
            return false;
        }

    }

    private boolean ValidarCamposHabitacion() {

        int check = 0;

        Date fechaIn = date_fechaCheckIn.getDate();
        Date fechaOut = date_fechaCheckOut.getDate();

        if (fechaIn.before(fechaOut)) {
            label_Error.setVisible(false);
            date_fechaCheckIn.setForeground(Color.green);
            date_fechaCheckOut.setForeground(Color.green);
        } else {
            label_Error.setText("¡Error en la feha de Reservacion!.");
            label_Error.setVisible(true);
            check++;
        }

        return check == 0;

    }

}
