/*
 * Fecha de creacion: 15/04/2023 23:02:02
 * Version: v.0.1
 * Detalles: 
 */
package com.alura.vistas;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.alura.controllers.TextHuesped;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.alura.models.Datos;
import com.alura.models.Habitacion;
import com.alura.models.HabitacionDao;
import com.alura.models.HuepedDao;
import com.alura.models.Huesped;
import com.alura.models.Setting;
import com.alura.models.SettingDao;

/**
 *
 * @author Willy Stbn
 */
public class DatosHuesped extends javax.swing.JPanel {

    Setting s = new Setting();
    SettingDao sDao = new SettingDao();
    Huesped hue = new Huesped();
    HuepedDao hueDao = new HuepedDao();
    Habitacion hab = new Habitacion();
    HabitacionDao habDao = new HabitacionDao();

    public DatosHuesped() {
        initComponents();

        this.setSize(600, 450);

        this.label_Error.setVisible(false);

        this.txt_costoTotal_Reservacion.setText(Datos.pago);

        TextHuesped hover = new TextHuesped(this);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_title = new javax.swing.JLabel();
        label_Error = new javax.swing.JLabel();
        botones = new javax.swing.JPanel();
        txt_costoTotal_Reservacion = new javax.swing.JTextField();
        btnCancelarR = new javax.swing.JButton();
        btn_Reservar = new javax.swing.JButton();
        label_TotalR = new javax.swing.JLabel();
        btn_Regresar = new javax.swing.JButton();
        Fondo = new javax.swing.JPanel();
        InfoHuesped = new javax.swing.JPanel();
        label_Nombre = new javax.swing.JLabel();
        txt_nombreReservacion = new javax.swing.JTextField();
        txt_apellidoReservacion1 = new javax.swing.JTextField();
        label_apellidos = new javax.swing.JLabel();
        label_fechaNacimiento = new javax.swing.JLabel();
        date_fechaNacimiento = new com.toedter.calendar.JDateChooser();
        label_nacionalidad = new javax.swing.JLabel();
        cmb_nacionalidad = new javax.swing.JComboBox<>();
        label_telefono = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        label_imgReservacion = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        label_title.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        label_title.setForeground(new java.awt.Color(70, 6, 6));
        label_title.setText("Datos del huesped");

        label_Error.setForeground(new java.awt.Color(255, 51, 0));
        label_Error.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_Error.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/danger 1.png"))); // NOI18N
        label_Error.setText("¡Rellene todos los campos!");

        botones.setBackground(new java.awt.Color(255, 255, 255));

        txt_costoTotal_Reservacion.setEditable(false);
        txt_costoTotal_Reservacion.setBackground(new java.awt.Color(255, 255, 204));
        txt_costoTotal_Reservacion.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txt_costoTotal_Reservacion.setForeground(new java.awt.Color(153, 0, 51));
        txt_costoTotal_Reservacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_costoTotal_Reservacion.setText("$0.000");

        btnCancelarR.setBackground(new java.awt.Color(153, 51, 0));
        btnCancelarR.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnCancelarR.setForeground(new java.awt.Color(0, 0, 0));
        btnCancelarR.setText("Cancelar");

        btn_Reservar.setBackground(new java.awt.Color(0, 204, 0));
        btn_Reservar.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btn_Reservar.setForeground(new java.awt.Color(0, 0, 0));
        btn_Reservar.setText("Reservar");

        label_TotalR.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        label_TotalR.setForeground(new java.awt.Color(0, 0, 0));
        label_TotalR.setText("Costo :");

        btn_Regresar.setBackground(new java.awt.Color(0, 102, 102));
        btn_Regresar.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btn_Regresar.setForeground(new java.awt.Color(0, 0, 0));
        btn_Regresar.setText("Regresar");

        javax.swing.GroupLayout botonesLayout = new javax.swing.GroupLayout(botones);
        botones.setLayout(botonesLayout);
        botonesLayout.setHorizontalGroup(
            botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonesLayout.createSequentialGroup()
                .addGroup(botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(botonesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_TotalR, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_costoTotal_Reservacion, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(botonesLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCancelarR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_Reservar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        botonesLayout.setVerticalGroup(
            botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonesLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(label_TotalR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_costoTotal_Reservacion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Reservar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelarR, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        Fondo.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 203, Short.MAX_VALUE)
        );

        InfoHuesped.setBackground(new java.awt.Color(255, 255, 255));

        label_Nombre.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        label_Nombre.setForeground(new java.awt.Color(0, 0, 51));
        label_Nombre.setText("Nombre(s):");

        txt_nombreReservacion.setBackground(new java.awt.Color(255, 255, 255));
        txt_nombreReservacion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_nombreReservacion.setForeground(new java.awt.Color(153, 153, 153));
        txt_nombreReservacion.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_nombreReservacion.setText("Ingrese el nombre del huesped");
        txt_nombreReservacion.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 0, 102)));

        txt_apellidoReservacion1.setBackground(new java.awt.Color(255, 255, 255));
        txt_apellidoReservacion1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_apellidoReservacion1.setForeground(new java.awt.Color(153, 153, 153));
        txt_apellidoReservacion1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_apellidoReservacion1.setText("Ingrese los apellidos del huesped");
        txt_apellidoReservacion1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 0, 102)));

        label_apellidos.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        label_apellidos.setForeground(new java.awt.Color(0, 0, 51));
        label_apellidos.setText("Apellidos:");

        label_fechaNacimiento.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        label_fechaNacimiento.setForeground(new java.awt.Color(0, 0, 51));
        label_fechaNacimiento.setText("Fecha de nacimiento:");

        date_fechaNacimiento.setBackground(new java.awt.Color(255, 255, 255));
        date_fechaNacimiento.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        date_fechaNacimiento.setForeground(new java.awt.Color(153, 153, 153));

        label_nacionalidad.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        label_nacionalidad.setForeground(new java.awt.Color(0, 0, 51));
        label_nacionalidad.setText("Nacionalidad:");

        cmb_nacionalidad.setBackground(new java.awt.Color(255, 255, 255));
        cmb_nacionalidad.setEditable(true);
        cmb_nacionalidad.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        cmb_nacionalidad.setForeground(new java.awt.Color(153, 153, 153));
        cmb_nacionalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "afgano", "albanés", "Argelino", "Andorrano", "Angola", "Antigua o Barbudan", "Argentina", "armenio", "Australiano", "austriaco", "Azerbaiyano, azerí", "Bahameño", "Bahrein", "bengalí", "Barbados", "Bielorruso", "Belga", "Beliceño", "Beninés, Beninois", "Butanés", "boliviano", "Bosnio o herzegovinio", "Motswana, Botswana", "brasileño", "Bruneián", "Bulgarian", "Burkinabé", "birmano", "Burundiano", "Cabo Verde", "Camboyano", "camerunés", "canadiense", "Centroafricano", "Chadiano", "Chileno", "Chino", "colombianas", "Comoras, comorenses", "congoleña", "congoleña", "Costa Rica", "Marfileño", "croata", "Cubano", "Chipriota", "Checo", "danés", "Djibouti", "Dominicanas", "Dominicanas", "Timorense", "ecuatoriano", "Egipcio", "salvadoreño", "Ecuatoguineano, ecuatoguineano", "Eritreo", "Estonia", "etíope", "Fijian", "Finnish", "Francés", "Gabonés", "Gambiano", "georgiano", "Alemán", "ghanés", "Gibraltar", "Griego, helénico", "Granada", "guatemalteco", "Guineano", "Bissau-Guineano", "Guyana", "danza del África Occidental, danza afro haitiana,", "hondureña", "Húngaro, Magyar", "islandés", "indio", "Indonesian", "Iraní, persa", "iraquí", "irlandés", "israelí", "Italiano", "Marfileño", "jamaicano", "Japonés", "Jordano", "Kazajo, kazajo", "Keniano", "I-Kiribati", "Norcoreano", "Surcoreano", "Kuwaití", "Kirguistán, Kirguistán, Kirgiz, Kirguizistán", "Lao, laosiano", "Letón, Lettish", "libanés", "Basotho", "Liberiano", "Libio", "Liechtenstein", "lituano", "Luxemburgo, luxemburgués", "macedonio", "madagascarí", "Malawiano", "Malasio", "Maldivas", "Maliense, Malinés", "maltés", "Islas Marshall", "Martiniquais, Martinica", "mauritano", "mauriciano", "Mexicano", "Micronesia", "Moldavo", "Monégasque, Monacan", "mongol", "montenegrino", "marroquí", "mozambiqueño", "namibio", "nauruana", "Nepalí, nepalí", "Holandés, neerlandés", "Nueva Zelanda, Nueva Zelanda, Zelanian", "nicaragüense", "Nigeriano", "Nigeriano", "Marianan del norte", "Norwegian", "omaní", "Paquistaní", "Palauan", "palestino", "panameño", "Papua Nueva Guinea, Papuan", "paraguayo", "peruano", "Filipino, filipino", "polaco", "Portuguese", "puertorriqueño", "Qatar", "rumano", "Ruso", "Ruandés", "Kittitian o Nevisian", "Saint Lucian", "San Vicente, Vicentino", "Samoano", "Sammarinese", "São Toméan", "Arabia Saudita, Arabia Saudita", "Senegal", "serbio", "Seychelles", "Sierra Leona", "Singapur, Singapur", "Slovak", "Esloveno, esloveno", "Solomon Island", "somalí", "sudafricano", "Sudán del sur", "Español", "de Sri Lanka", "sudanés", "surinamés", "Swazi", "Swedish", "suizo", "Sirio", "Tajikistani", "Tanzania", "Thai", "Timorense", "Togolés", "Tokelauan", "Tonga", "Trinidad y Tobago", "tunecino", "turco", "Turkmenistán", "tuvaluano", "Uganda", "ucranio", "Emirati, Emirian, Emiri", "Reino Unido, Británico", "Estados Unidos, EE. UU., Estadounidense", "uruguayo", "Uzbeko, uzbeko", "Ni-Vanuatu, Vanuatuán", "Vaticano", "venezolano", "vietnamita", "yemenita", "Zambia", "zimbabuo" }));

        label_telefono.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        label_telefono.setForeground(new java.awt.Color(0, 0, 51));
        label_telefono.setText("Telefono:");

        txt_telefono.setBackground(new java.awt.Color(255, 255, 255));
        txt_telefono.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_telefono.setForeground(new java.awt.Color(153, 153, 153));
        txt_telefono.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_telefono.setText("Ingrese el télefono del huesped");
        txt_telefono.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 0, 102)));

        javax.swing.GroupLayout InfoHuespedLayout = new javax.swing.GroupLayout(InfoHuesped);
        InfoHuesped.setLayout(InfoHuespedLayout);
        InfoHuespedLayout.setHorizontalGroup(
            InfoHuespedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfoHuespedLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InfoHuespedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label_fechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date_fechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_nacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_apellidoReservacion1)
                    .addComponent(txt_nombreReservacion)
                    .addComponent(label_Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                    .addComponent(label_apellidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_telefono)
                    .addComponent(cmb_nacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        InfoHuespedLayout.setVerticalGroup(
            InfoHuespedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfoHuespedLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(label_Nombre)
                .addGap(7, 7, 7)
                .addComponent(txt_nombreReservacion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label_apellidos)
                .addGap(7, 7, 7)
                .addComponent(txt_apellidoReservacion1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(label_fechaNacimiento)
                .addGap(4, 4, 4)
                .addComponent(date_fechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(label_nacionalidad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmb_nacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label_telefono)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        label_imgReservacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_imgReservacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_reservation.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addComponent(label_Error, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(InfoHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(label_title, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(label_imgReservacion)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_imgReservacion, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(botones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(label_title)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(label_Error, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(InfoHuesped, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(11, 11, 11)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fondo;
    private javax.swing.JPanel InfoHuesped;
    private javax.swing.JPanel botones;
    public javax.swing.JButton btnCancelarR;
    public javax.swing.JButton btn_Regresar;
    public javax.swing.JButton btn_Reservar;
    public javax.swing.JComboBox<String> cmb_nacionalidad;
    public com.toedter.calendar.JDateChooser date_fechaNacimiento;
    public javax.swing.JLabel label_Error;
    private javax.swing.JLabel label_Nombre;
    private javax.swing.JLabel label_TotalR;
    private javax.swing.JLabel label_apellidos;
    private javax.swing.JLabel label_fechaNacimiento;
    private javax.swing.JLabel label_imgReservacion;
    private javax.swing.JLabel label_nacionalidad;
    private javax.swing.JLabel label_telefono;
    private javax.swing.JLabel label_title;
    public javax.swing.JTextField txt_apellidoReservacion1;
    public javax.swing.JTextField txt_costoTotal_Reservacion;
    public javax.swing.JTextField txt_nombreReservacion;
    public javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables

    public void pdf() {
        try {
            int id = HuepedDao.idHuespedN;

            hue = hueDao.ConsultarHuesped(id);
            hab = habDao.ObtenerDatos(id);


            FileOutputStream archivo;
            File file = new File("src/pdf/reservacion-" + id + ".pdf");
            archivo = new FileOutputStream(file);

            Document doc = new Document();
            PdfWriter.getInstance(doc, archivo);
            doc.open();

            //Informacion de los encabezado de la tabla:
            Image img = Image.getInstance("src/img/logo.png");  //Imagen -> Logo
            //Estilo de letra
            Paragraph fecha = new Paragraph();
            Font negrita = new Font(Font.FontFamily.TIMES_ROMAN, 10, Font.BOLD, BaseColor.BLUE);
            fecha.add(Chunk.NEWLINE);
            Date date = new Date();
            fecha.add("Reservacion: " + id + "\n" + "Fecha: " + new SimpleDateFormat("dd-mm-yyyy").format(date) + "\n\n");

            //PDF para el archivo:
            PdfPTable Encabezado = new PdfPTable(4);
            Encabezado.setWidthPercentage(100);
            Encabezado.getDefaultCell().setBorder(0);

            float[] ColumnaEncabezado = new float[]{20f, 30f, 70f, 40f};
            Encabezado.setWidths(ColumnaEncabezado);
            Encabezado.setHorizontalAlignment(Element.ALIGN_LEFT);

            Encabezado.addCell(img);

            s = sDao.CargarInformacion();

            String nom = s.getNombre();
            String raz = s.getRazon();
            String tel = s.getTelefono();
            String corr = s.getCorreo();
            String ubi = s.getUbicacion();

            Encabezado.addCell("");
            Encabezado.addCell("Nombre: " + nom + "\nRazon social: " + raz + "\nTelefono: " + tel + "\nCorreo: " + corr + "\nUbicacion: " + ubi);
//            String contenidoCelda = "Clave: " + Clave + "\nNombre: " + nom + "\nTelefono: " + tel + "\nDirección: " + dir + "\nRazon social: " + raz;
//            PdfPCell celda = new PdfPCell(new Phrase(contenidoCelda, negrita));
//            Encabezado.addCell(celda);
            Encabezado.addCell(fecha);
            doc.add(Encabezado);

            //Información de los huesped en el documento:
            Paragraph clie = new Paragraph();
            clie.add(Chunk.NEWLINE);
            clie.add("Datos del huesped: \n\n");
            doc.add(clie);

            PdfPTable datosHuesped = new PdfPTable(5);
            datosHuesped.setWidthPercentage(100);
            datosHuesped.getDefaultCell().setBorder(0);
            float[] ColumnaClie = new float[]{20f, 40f, 20f, 30, 20};
            datosHuesped.setWidths(ColumnaClie);
            datosHuesped.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell cl1 = new PdfPCell(new Phrase("id", negrita));
            PdfPCell cl2 = new PdfPCell(new Phrase("NOMBRE", negrita));
            PdfPCell cl3 = new PdfPCell(new Phrase("TELEFONO", negrita));
            PdfPCell cl4 = new PdfPCell(new Phrase("Nacionalidad", negrita));
            PdfPCell cl5 = new PdfPCell(new Phrase("F. nacimiento", negrita));
            cl1.setBorder(0);
            cl2.setBorder(0);
            cl3.setBorder(0);
            cl4.setBorder(0);
            cl5.setBorder(0);
            datosHuesped.addCell(cl1);
            datosHuesped.addCell(cl2);
            datosHuesped.addCell(cl3);
            datosHuesped.addCell(cl4);
            datosHuesped.addCell(cl5);

            datosHuesped.addCell(String.valueOf(id));
            datosHuesped.addCell(hue.getNombre());
            datosHuesped.addCell(hue.getTelefono());
            datosHuesped.addCell(hue.getNacionalidad());
            datosHuesped.addCell(hue.getNacionalidad());
            doc.add(datosHuesped);

            //Información de la habitacion en el documento:
            Paragraph infoHabitacion = new Paragraph();
            infoHabitacion.add(Chunk.NEWLINE);
            infoHabitacion.add("Datos de la Habitacion: \n\n");
            doc.add(infoHabitacion);

            PdfPTable tablaPro = new PdfPTable(5);
            tablaPro.setWidthPercentage(100);
            tablaPro.getDefaultCell().setBorder(0);
            float[] ColumnaPro = new float[]{20f, 20f, 50f, 50, 20};
            tablaPro.setWidths(ColumnaPro);
            tablaPro.setHorizontalAlignment(Element.ALIGN_CENTER);

            PdfPCell hab1 = new PdfPCell(new Phrase("No. Habitación", negrita));
            PdfPCell hab2 = new PdfPCell(new Phrase("Piso", negrita));
            PdfPCell hab3 = new PdfPCell(new Phrase("Fecha de ingreso", negrita));
            PdfPCell hab4 = new PdfPCell(new Phrase("Fecha de salida", negrita));
            PdfPCell hab5 = new PdfPCell(new Phrase("Medio pago", negrita));

            hab1.setBorder(0);
            hab2.setBorder(0);
            hab3.setBorder(0);
            hab4.setBorder(0);
            hab5.setBorder(0);

            hab1.setBackgroundColor(BaseColor.DARK_GRAY);
            hab2.setBackgroundColor(BaseColor.DARK_GRAY);
            hab3.setBackgroundColor(BaseColor.DARK_GRAY);
            hab4.setBackgroundColor(BaseColor.DARK_GRAY);
            hab5.setBackgroundColor(BaseColor.DARK_GRAY);

            tablaPro.addCell(hab1);
            tablaPro.addCell(hab2);
            tablaPro.addCell(hab3);
            tablaPro.addCell(hab4);
            tablaPro.addCell(hab5);

            tablaPro.addCell(String.valueOf(hab.getNoHabitacion()));
            tablaPro.addCell(hab.getPiso() + "");
            tablaPro.addCell(hab.getInicio() + "");
            tablaPro.addCell(hab.getFin() + "");
            tablaPro.addCell(hab.getMedioPago());

            doc.add(tablaPro);

            //Informacion del total a pagar:
            Paragraph pago = new Paragraph();
            pago.add(Chunk.NEWLINE);
            pago.add("\nTotal a pagar: $" + String.format("%.2f", hab.getCosto()));
            pago.setAlignment(Element.ALIGN_RIGHT);
            doc.add(pago);

            //Firma:
            Paragraph firma = new Paragraph();
            firma.add(Chunk.NEWLINE);
            firma.add("\nCancelación y Firma:\n\n\n");
            firma.add("_____________________________");
            firma.setAlignment(Element.ALIGN_CENTER);
            doc.add(firma);

            //Agradecimiento:
            Paragraph mensaje = new Paragraph();
            mensaje.add(Chunk.NEWLINE);
            mensaje.add("\n****************** ¡¡Gracias por tu confianza!! ****************");
            mensaje.setAlignment(Element.ALIGN_CENTER);
            doc.add(mensaje);

            doc.close();
            archivo.close();
            Desktop.getDesktop().open(file);
        } catch (FileNotFoundException e) {
            System.err.println("Error al crear el pdf o abrir.\n" + e);
        } catch (DocumentException | IOException ex) {
            System.err.println("Error al generarl PDF\n" + ex);
        }
    }

}
