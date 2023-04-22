/*
 * Fecha de creacion: 15/04/2023 23:00:44
 * Version: v.0.1
 * Detalles: 
 */
package com.alura.controllers;

import com.alura.vistas.DatosHabitacion;
import com.alura.vistas.Habitaciones;
import com.alura.vistas.Configuracion;
import com.alura.vistas.Login;
import com.alura.vistas.Piso4;
import com.alura.vistas.Huespedes;
import com.alura.vistas.Piso5;
import com.alura.vistas.Piso1;
import com.alura.vistas.DatosHuesped;
import com.alura.vistas.Piso2;
import com.alura.vistas.Piso3;
import com.alura.vistas.DashBord;
import com.alura.vistas.ActualizarInformacion;
import com.alura.vistas.NuevoUsuario;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import com.alura.models.Datos;
import com.alura.models.Habitacion;
import com.alura.models.HabitacionDao;
import com.alura.models.HuepedDao;
import com.alura.models.Huesped;

/**
 * @author Willy Stbn
 */
public class Botones implements ActionListener, MouseListener {

    private DashBord dash;
    private Piso1 piso1;
    private Piso2 piso2 = new Piso2();
    private Piso3 piso3 = new Piso3();
    private Piso4 piso4 = new Piso4();
    private Piso5 piso5 = new Piso5();
    private Habitaciones habitacion = new Habitaciones();
    private HabitacionDao habDao = new HabitacionDao();
    private HuepedDao hueDao = new HuepedDao();
    private Habitacion hab = new Habitacion();
    private Huespedes huespedes = new Huespedes();
    private Huesped hue = new Huesped();
    private Configuracion config = new Configuracion();
    private DatosHabitacion datosHab;
    private DatosHuesped datosHue;

    private ActualizarInformacion update = new ActualizarInformacion();

    public Botones(DashBord dash, Piso1 piso, DatosHabitacion datos, DatosHuesped datosHue) {
        this.dash = dash;
        this.piso1 = piso;
        this.datosHab = datos;
        this.datosHue = datosHue;

        this.dash.btn_Piso1.addActionListener(this);
        this.dash.btn_Piso2.addActionListener(this);
        this.dash.btn_Piso3.addActionListener(this);
        this.dash.btn_Piso4.addActionListener(this);
        this.dash.btn_Piso5.addActionListener(this);

        this.habitacion.OpcionModificar.addActionListener(this);
        this.huespedes.opcion_Modificar.addActionListener(this);

        this.dash.btn_ReservacionP.addActionListener(this);
        this.dash.btn_HuespedesP.addActionListener(this);
        this.dash.btn_HabitacionesP.addActionListener(this);
        this.dash.btnConfiguracionP.addActionListener(this);

        this.datosHab.btn_Cancelar.addActionListener(this);
        this.datosHab.btn_Continuar.addActionListener(this);

        this.datosHue.btnCancelarR.addActionListener(this);
        this.datosHue.btn_Reservar.addActionListener(this);
        this.datosHue.btn_Regresar.addActionListener(this);

        this.config.btn_NuevoUsuario.addActionListener(this);

        this.piso1.labe_101.addMouseListener(this);
        this.piso1.label_102.addMouseListener(this);
        this.piso1.label_103.addMouseListener(this);
        this.piso1.label_104.addMouseListener(this);
        this.piso1.label_105.addMouseListener(this);
        this.piso1.label_106.addMouseListener(this);
        this.piso1.label_107.addMouseListener(this);
        this.piso1.label_108.addMouseListener(this);
        this.piso1.label_109.addMouseListener(this);

        this.piso2.label_101.addMouseListener(this);
        this.piso2.label_102.addMouseListener(this);
        this.piso2.label_103.addMouseListener(this);
        this.piso2.label_104.addMouseListener(this);
        this.piso2.label_105.addMouseListener(this);
        this.piso2.label_106.addMouseListener(this);
        this.piso2.label_107.addMouseListener(this);
        this.piso2.label_108.addMouseListener(this);
        this.piso2.label_109.addMouseListener(this);

        this.piso3.labe_101.addMouseListener(this);
        this.piso3.label_102.addMouseListener(this);
        this.piso3.label_103.addMouseListener(this);
        this.piso3.label_104.addMouseListener(this);
        this.piso3.label_105.addMouseListener(this);
        this.piso3.label_106.addMouseListener(this);
        this.piso3.label_107.addMouseListener(this);
        this.piso3.label_108.addMouseListener(this);
        this.piso3.label_109.addMouseListener(this);

        this.piso4.labe_101.addMouseListener(this);
        this.piso4.label_102.addMouseListener(this);
        this.piso4.label_103.addMouseListener(this);
        this.piso4.label_104.addMouseListener(this);
        this.piso4.label_105.addMouseListener(this);
        this.piso4.label_106.addMouseListener(this);
        this.piso4.label_107.addMouseListener(this);
        this.piso4.label_108.addMouseListener(this);
        this.piso4.label_109.addMouseListener(this);

        this.piso5.labe_101.addMouseListener(this);
        this.piso5.label_102.addMouseListener(this);
        this.piso5.label_103.addMouseListener(this);
        this.piso5.label104.addMouseListener(this);
        this.piso5.label_105.addMouseListener(this);
        this.piso5.label_106.addMouseListener(this);
        this.piso5.label_107.addMouseListener(this);
        this.piso5.label_108.addMouseListener(this);
        this.piso5.label_109.addMouseListener(this);

        AbrirPanel(piso1);
        ValidarTiempo();
        ActulizarColores();
        rol();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == dash.btn_Piso1) {
            dash.txtHabitacionNumero.setVisible(false);
            dash.txtHabitacionNumero.setText("Habitacion ---");
            AbrirPanel(piso1);
        } else if (e.getSource() == dash.btn_Piso2) {
            dash.txtHabitacionNumero.setVisible(false);
            dash.txtHabitacionNumero.setText("Habitacion ---");
            AbrirPanel(piso2);
        } else if (e.getSource() == dash.btn_Piso3) {
            dash.txtHabitacionNumero.setVisible(false);
            dash.txtHabitacionNumero.setText("Habitacion ---");
            AbrirPanel(piso3);
        } else if (e.getSource() == dash.btn_Piso4) {
            dash.txtHabitacionNumero.setVisible(false);
            dash.txtHabitacionNumero.setText("Habitacion ---");
            AbrirPanel(piso4);
        } else if (e.getSource() == dash.btn_Piso5) {
            dash.txtHabitacionNumero.setVisible(false);
            dash.txtHabitacionNumero.setText("Habitacion ---");
            AbrirPanel(piso5);
        } else if (e.getSource() == datosHab.btn_Cancelar) {    //Boton cancelar Habitacion
            dash.txtHabitacionNumero.setVisible(false);
            dash.txtHabitacionNumero.setText("Habitacion ---");
            LimpiarHabitacion();
            LimpiarHuesped();
            AbrirPanel(piso1);
            botonesActivado(true);
        } else if (e.getSource() == datosHab.btn_Continuar) {     //Botón continuar -> Habitacion
            if (ValidarCamposHabitacion()) {
                datosHab.label_Error.setVisible(false);
                AbrirPanel(datosHue);
                datosHue.txt_costoTotal_Reservacion.setText(Datos.pago);
            } else {
//                datosHab.label_Error.setText("Ocurrio un error");
//                datosHab.label_Error.setVisible(true);
            }

        } else if (datosHue.btnCancelarR == e.getSource()) {      //Boton cancelar Huesped
            dash.txtHabitacionNumero.setVisible(false);
            dash.txtHabitacionNumero.setText("Habitacion ---");
            LimpiarHuesped();
            LimpiarHabitacion();
            AbrirPanel(piso1);
            botonesActivado(true);
        } else if (e.getSource() == datosHue.btn_Regresar) {
            AbrirPanel(datosHab);
        } else if (e.getSource() == dash.btn_ReservacionP) { //boton reservar:
            botonesActivado(true);
            botonesVisible(true);
            huespedes.txt_BuscarHuesped.setText("Realizar una busqueda");
            AbrirPanel(piso1);

            dash.panel_Datos.setBackground(new Color(153, 153, 153));
        } else if (e.getSource() == dash.btn_HabitacionesP) {   //Boton Habitaciones Principal
            botonesActivado(false);
            botonesVisible(false);
            AbrirPanel(habitacion);
            dash.panel_Datos.setBackground(new Color(83, 32, 112));
            habitacion.TotalEstado();
            habitacion.LimpiarTabla();
            habitacion.ListarHabitaciones();
            habitacion.label_Error.setVisible(false);
            Datos.id_Huesped = 0;
            Habitaciones.idHabitacion = 0;
            habitacion.txt_BuscarHabitacion.setText("Ingrese una habitacion para buscar");
        } else if (e.getSource() == dash.btn_HuespedesP) {      //Boton huespedes principal
            botonesActivado(false);
            botonesVisible(false);
            AbrirPanel(huespedes);

            huespedes.LimpiarTabla();
            huespedes.ListarHuespedes();
            dash.panel_Datos.setBackground(new Color(102, 51, 0));
            huespedes.label_Error.setVisible(false);
            Datos.id_Huesped = 0;
            Habitaciones.idHabitacion = 0;

        } else if (e.getSource() == dash.btnConfiguracionP) {       //Bton ConfiguracionP
            botonesActivado(false);
            botonesVisible(false);
            AbrirPanel(config);
            dash.panel_Datos.setBackground(new Color(51, 0, 51));
            config.limpiarCampos();

        } else if (e.getSource() == datosHue.btn_Reservar) {      //Boton realizar reservacion

            if (ValidarCamposHuesped()) {
                datosHue.label_Error.setVisible(false);

                //Datos huesped:
                String nombre = datosHue.txt_nombreReservacion.getText();
                String apellido = datosHue.txt_apellidoReservacion1.getText();
                String telefono = datosHue.txt_telefono.getText();
                String nacionalidad = datosHue.cmb_nacionalidad.getSelectedItem().toString();
                Date nacimiento = datosHue.date_fechaNacimiento.getDate();

                hue.setNombre(nombre);
                hue.setApellido(apellido);
                hue.setTelefono(telefono);
                hue.setNacimiento(nacimiento);
                hue.setNacionalidad(nacionalidad);

                int id_huesped = hueDao.Reservar(hue);
                HuepedDao.idHuespedN = id_huesped;

                //Datos de la habitacion:
                int NoHabitacion = Integer.parseInt(Datos.habitacion);
                Date inicio = Datos.inicio;
                Date fin = Datos.fin;
                String MedioPago = Datos.Mpago;
                String estado = "Activo";
                int piso = Integer.parseInt(Datos.habitacion.substring(0, 1));
                double costo = Double.parseDouble(datosHue.txt_costoTotal_Reservacion.getText().substring(1, datosHue.txt_costoTotal_Reservacion.getText().length()));
                String NoReservacion = NoHabitacion + telefono.substring(0, 3);

                hab.setId_Huesped(id_huesped);
                hab.setCosto(costo);
                hab.setEstado(estado);
                hab.setInicio(inicio);
                hab.setMedioPago(MedioPago);
                hab.setNoHabitacion(NoHabitacion);
                hab.setFin(fin);
                hab.setPiso(piso);
                hab.setNoReservacion(NoReservacion);

                if (habDao.InsertarInformacion(hab)) {
                    JOptionPane.showMessageDialog(null, "Habitacion reservada correctamente.");

                    LimpiarHabitacion();
                    LimpiarHuesped();
                    datosHue.pdf();
                    AbrirPanel(piso1);
                    ActulizarColores();
                    botonesActivado(true);
                    botonesVisible(true);
                }
            }
        } else if (e.getSource() == habitacion.OpcionModificar) {
//            System.out.println(Habitaciones.idHabitacion + "Habitacion");
//            System.out.println(Datos.id_Huesped + " Huesped");
            update.addWindowListener(new WindowAdapter() {
                @Override
                public void windowOpened(WindowEvent e) {
                    dash.setEnabled(false);
                }

                @Override
                public void windowClosed(WindowEvent e) {
                    dash.setEnabled(true);
                    dash.toFront();
                }
            });
            if (Habitaciones.idHabitacion != 0) {
                habitacion.label_Error.setVisible(false);
                Datos.id_Huesped = hueDao.IdHuesped(Habitaciones.idHabitacion);
                int idHu = Datos.id_Huesped;
                if (idHu != 0) {
                    update.setVisible(true);
                    update.LlenarCampos();
                    //System.out.println("Ventana Modificar Informacion  abierta.");
                }
            } else {
                habitacion.label_Error.setVisible(true);
            }
            ActulizarColores();
        } else if (e.getSource() == habitacion.opcionMantenimiento) {
            ActulizarColores();
        } else if (e.getSource() == habitacion.EndMantenimiento) {
            ActulizarColores();
        } else if (e.getSource() == huespedes.opcion_Modificar) {
            update.addWindowListener(new WindowAdapter() {
                @Override
                public void windowOpened(WindowEvent e) {
                    dash.setEnabled(false);
                }

                @Override
                public void windowClosed(WindowEvent e) {
                    dash.setEnabled(true);
                    dash.toFront();
                }
            });
            if (Datos.id_Huesped != 0) {
                huespedes.label_Error.setVisible(false);
                update.setVisible(true);
                update.LlenarCampos();
            } else {
                huespedes.label_Error.setVisible(true);
            }
        } else if (config.btn_NuevoUsuario == e.getSource()) {
            NuevoUsuario nuevoUsuario = new NuevoUsuario();
            nuevoUsuario.addWindowListener(new WindowAdapter() {
                @Override
                public void windowOpened(WindowEvent e) {
                    dash.setEnabled(false);
                }

                @Override
                public void windowClosed(WindowEvent e) {
                    dash.setEnabled(true);
                    dash.toFront();
                }
            });

            nuevoUsuario.setVisible(true);
            System.out.println("Ventana Añadir Usuario abierta.");
        }
    }

    public void ActulizarColores() {
        piso1.Color();
        piso2.Color();
        piso3.Color();
        piso4.Color();
        piso5.Color();
    }

    private void AbrirPanel(JPanel panel) {

        //Iniciar Ventana nueva venta por defecto:
        dash.contenedor.removeAll();
        dash.contenedor.setLayout(new BorderLayout());
        dash.contenedor.add(panel, BorderLayout.CENTER);

        // Agrega un ComponentListener al contenedor_Panel
        dash.contenedor.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent evt) {
                // Obtiene el tamaño del contenedor_Panel
                Dimension size = dash.contenedor.getSize();
                // Ajusta el tamaño del JPanel contenido
                panel.setSize(size);
                panel.revalidate();
                panel.repaint();
            }
        });

        panel.setSize(600, 460);
        panel.setLocation(0, 0);
        dash.contenedor.revalidate();
        dash.contenedor.repaint();

        ActulizarColores();
        dash.txtHabitacionNumero.setVisible(false);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        if (e.getSource() == piso1.labe_101) {
            hab = habDao.Color(101);
            String estado = hab.getEstado();
            switch (estado) {
                case "Activo" ->
                    JOptionPane.showMessageDialog(null, "Habitacion ocupada");
                case "Inactivo" -> {
                    AbrirPanel(datosHab);
                    dash.txtHabitacionNumero.setText("Habitacion 101");
                    dash.txtHabitacionNumero.setVisible(true);
                    botonesActivado(false);
                }
                case "Mantenimiento" ->
                    JOptionPane.showMessageDialog(null, "Habitacion en mantenimiento");
                default -> {
                }
            }
        } else if (e.getSource() == piso1.label_102) {

            hab = habDao.Color(102);
            String estado = hab.getEstado();
            switch (estado) {
                case "Activo" ->
                    JOptionPane.showMessageDialog(null, "Habitacion ocupada");
                case "Inactivo" -> {
                    AbrirPanel(datosHab);
                    dash.txtHabitacionNumero.setText("Habitacion 102");
                    dash.txtHabitacionNumero.setVisible(true);
                    botonesActivado(false);
                }
                case "Mantenimiento" ->
                    JOptionPane.showMessageDialog(null, "Habitacion en mantenimiento");
                default -> {
                }
            }

        } else if (e.getSource() == piso1.label_103) {

            hab = habDao.Color(103);
            String estado = hab.getEstado();
            switch (estado) {
                case "Activo" ->
                    JOptionPane.showMessageDialog(null, "Habitacion ocupada");
                case "Inactivo" -> {
                    dash.txtHabitacionNumero.setText("Habitacion 103");
                    dash.txtHabitacionNumero.setVisible(true);
                    AbrirPanel(datosHab);
                    botonesActivado(false);
                }
                case "Mantenimiento" ->
                    JOptionPane.showMessageDialog(null, "Habitacion en mantenimiento");
                default -> {
                }
            }

        } else if (e.getSource() == piso1.label_104) {

            hab = habDao.Color(104);
            String estado = hab.getEstado();
            switch (estado) {
                case "Activo" ->
                    JOptionPane.showMessageDialog(null, "Habitacion ocupada");
                case "Inactivo" -> {
                    dash.txtHabitacionNumero.setText("Habitacion 104");
                    dash.txtHabitacionNumero.setVisible(true);
                    AbrirPanel(datosHab);
                    botonesActivado(false);
                }
                case "Mantenimiento" ->
                    JOptionPane.showMessageDialog(null, "Habitacion en mantenimiento");
                default -> {
                }
            }

        } else if (e.getSource() == piso1.label_105) {

            hab = habDao.Color(105);
            String estado = hab.getEstado();
            switch (estado) {
                case "Activo" ->
                    JOptionPane.showMessageDialog(null, "Habitacion ocupada");
                case "Inactivo" -> {
                    dash.txtHabitacionNumero.setText("Habitacion 105");
                    dash.txtHabitacionNumero.setVisible(true);
                    AbrirPanel(datosHab);
                    botonesActivado(false);
                }
                case "Mantenimiento" ->
                    JOptionPane.showMessageDialog(null, "Habitacion en mantenimiento");
                default -> {
                }
            }

        } else if (e.getSource() == piso1.label_106) {

            hab = habDao.Color(106);
            String estado = hab.getEstado();
            switch (estado) {
                case "Activo" ->
                    JOptionPane.showMessageDialog(null, "Habitacion ocupada");
                case "Inactivo" -> {
                    dash.txtHabitacionNumero.setText("Habitacion 106");
                    dash.txtHabitacionNumero.setVisible(true);
                    AbrirPanel(datosHab);
                    botonesActivado(false);
                }
                case "Mantenimiento" ->
                    JOptionPane.showMessageDialog(null, "Habitacion en mantenimiento");
                default -> {
                }
            }

        } else if (e.getSource() == piso1.label_107) {

            hab = habDao.Color(107);
            String estado = hab.getEstado();
            switch (estado) {
                case "Activo" ->
                    JOptionPane.showMessageDialog(null, "Habitacion ocupada");
                case "Inactivo" -> {
                    dash.txtHabitacionNumero.setText("Habitacion 107");
                    dash.txtHabitacionNumero.setVisible(true);
                    AbrirPanel(datosHab);
                    botonesActivado(false);
                }
                case "Mantenimiento" ->
                    JOptionPane.showMessageDialog(null, "Habitacion en mantenimiento");
                default -> {
                }
            }

        } else if (e.getSource() == piso1.label_108) {

            hab = habDao.Color(108);
            String estado = hab.getEstado();
            switch (estado) {
                case "Activo" ->
                    JOptionPane.showMessageDialog(null, "Habitacion ocupada");
                case "Inactivo" -> {
                    dash.txtHabitacionNumero.setText("Habitacion 108");
                    dash.txtHabitacionNumero.setVisible(true);
                    AbrirPanel(datosHab);
                    botonesActivado(false);
                }
                case "Mantenimiento" ->
                    JOptionPane.showMessageDialog(null, "Habitacion en mantenimiento");
                default -> {
                }
            }

        } else if (e.getSource() == piso1.label_109) {

            hab = habDao.Color(109);
            String estado = hab.getEstado();
            switch (estado) {
                case "Activo" ->
                    JOptionPane.showMessageDialog(null, "Habitacion ocupada");
                case "Inactivo" -> {
                    dash.txtHabitacionNumero.setText("Habitacion 109");
                    dash.txtHabitacionNumero.setVisible(true);
                    AbrirPanel(datosHab);
                    botonesActivado(false);
                }
                case "Mantenimiento" ->
                    JOptionPane.showMessageDialog(null, "Habitacion en mantenimiento");
                default -> {
                }
            }

        } else if (e.getSource() == piso2.label_101) {

            hab = habDao.Color(201);
            String estado = hab.getEstado();
            switch (estado) {
                case "Activo" ->
                    JOptionPane.showMessageDialog(null, "Habitacion ocupada");
                case "Inactivo" -> {
                    AbrirPanel(datosHab);
                    dash.txtHabitacionNumero.setText("Habitacion 201");
                    dash.txtHabitacionNumero.setVisible(true);
                    dash.txtHabitacionNumero.setVisible(true);
                    botonesActivado(false);
                }
                case "Mantenimiento" ->
                    JOptionPane.showMessageDialog(null, "Habitacion en mantenimiento");
                default -> {
                }
            }

        } else if (e.getSource() == piso2.label_102) {

            hab = habDao.Color(202);
            String estado = hab.getEstado();
            switch (estado) {
                case "Activo" ->
                    JOptionPane.showMessageDialog(null, "Habitacion ocupada");
                case "Inactivo" -> {
                    AbrirPanel(datosHab);
                    dash.txtHabitacionNumero.setText("Habitacion 202");
                    dash.txtHabitacionNumero.setVisible(true);
                    botonesActivado(false);
                }
                case "Mantenimiento" ->
                    JOptionPane.showMessageDialog(null, "Habitacion en mantenimiento");
                default -> {
                }
            }

        } else if (e.getSource() == piso2.label_103) {

            hab = habDao.Color(203);
            String estado = hab.getEstado();
            switch (estado) {
                case "Activo" ->
                    JOptionPane.showMessageDialog(null, "Habitacion ocupada");
                case "Inactivo" -> {
                    dash.txtHabitacionNumero.setText("Habitacion 203");
                    dash.txtHabitacionNumero.setVisible(true);
                    AbrirPanel(datosHab);
                    botonesActivado(false);
                }
                case "Mantenimiento" ->
                    JOptionPane.showMessageDialog(null, "Habitacion en mantenimiento");
                default -> {
                }
            }

        } else if (e.getSource() == piso2.label_104) {

            hab = habDao.Color(204);
            String estado = hab.getEstado();
            switch (estado) {
                case "Activo" ->
                    JOptionPane.showMessageDialog(null, "Habitacion ocupada");
                case "Inactivo" -> {
                    dash.txtHabitacionNumero.setText("Habitacion 204");
                    dash.txtHabitacionNumero.setVisible(true);
                    AbrirPanel(datosHab);
                    botonesActivado(false);
                }
                case "Mantenimiento" ->
                    JOptionPane.showMessageDialog(null, "Habitacion en mantenimiento");
                default -> {
                }
            }

        } else if (e.getSource() == piso2.label_105) {

            hab = habDao.Color(205);
            String estado = hab.getEstado();
            switch (estado) {
                case "Activo" ->
                    JOptionPane.showMessageDialog(null, "Habitacion ocupada");
                case "Inactivo" -> {
                    dash.txtHabitacionNumero.setText("Habitacion 205");
                    dash.txtHabitacionNumero.setVisible(true);
                    AbrirPanel(datosHab);
                    botonesActivado(false);
                }
                case "Mantenimiento" ->
                    JOptionPane.showMessageDialog(null, "Habitacion en mantenimiento");
                default -> {
                }
            }

        } else if (e.getSource() == piso2.label_106) {

            hab = habDao.Color(206);
            String estado = hab.getEstado();
            switch (estado) {
                case "Activo" ->
                    JOptionPane.showMessageDialog(null, "Habitacion ocupada");
                case "Inactivo" -> {
                    dash.txtHabitacionNumero.setText("Habitacion 206");
                    dash.txtHabitacionNumero.setVisible(true);
                    AbrirPanel(datosHab);
                    botonesActivado(false);
                }
                case "Mantenimiento" ->
                    JOptionPane.showMessageDialog(null, "Habitacion en mantenimiento");
                default -> {
                }
            }

        } else if (e.getSource() == piso2.label_107) {

            hab = habDao.Color(207);
            String estado = hab.getEstado();
            switch (estado) {
                case "Activo" ->
                    JOptionPane.showMessageDialog(null, "Habitacion ocupada");
                case "Inactivo" -> {
                    dash.txtHabitacionNumero.setText("Habitacion 207");
                    dash.txtHabitacionNumero.setVisible(true);
                    AbrirPanel(datosHab);
                    botonesActivado(false);
                }
                case "Mantenimiento" ->
                    JOptionPane.showMessageDialog(null, "Habitacion en mantenimiento");
                default -> {
                }
            }

        } else if (e.getSource() == piso2.label_108) {

            hab = habDao.Color(208);
            String estado = hab.getEstado();
            switch (estado) {
                case "Activo" ->
                    JOptionPane.showMessageDialog(null, "Habitacion ocupada");
                case "Inactivo" -> {
                    dash.txtHabitacionNumero.setText("Habitacion 208");
                    dash.txtHabitacionNumero.setVisible(true);
                    AbrirPanel(datosHab);
                    botonesActivado(false);
                }
                case "Mantenimiento" ->
                    JOptionPane.showMessageDialog(null, "Habitacion en mantenimiento");
                default -> {
                }
            }

        } else if (e.getSource() == piso2.label_109) {

            hab = habDao.Color(209);
            String estado = hab.getEstado();
            switch (estado) {
                case "Activo" ->
                    JOptionPane.showMessageDialog(null, "Habitacion ocupada");
                case "Inactivo" -> {
                    dash.txtHabitacionNumero.setText("Habitacion 209");
                    dash.txtHabitacionNumero.setVisible(true);
                    AbrirPanel(datosHab);
                    botonesActivado(false);
                }
                case "Mantenimiento" ->
                    JOptionPane.showMessageDialog(null, "Habitacion en mantenimiento");
                default -> {
                }
            }

        } else if (e.getSource() == piso3.labe_101) {

            hab = habDao.Color(301);
            String estado = hab.getEstado();
            switch (estado) {
                case "Activo" ->
                    JOptionPane.showMessageDialog(null, "Habitacion ocupada");
                case "Inactivo" -> {
                    AbrirPanel(datosHab);
                    dash.txtHabitacionNumero.setText("Habitacion 301");
                    dash.txtHabitacionNumero.setVisible(true);
                    dash.txtHabitacionNumero.setVisible(true);
                    botonesActivado(false);
                }
                case "Mantenimiento" ->
                    JOptionPane.showMessageDialog(null, "Habitacion en mantenimiento");
                default -> {
                }
            }

        } else if (e.getSource() == piso3.label_102) {

            hab = habDao.Color(302);
            String estado = hab.getEstado();
            switch (estado) {
                case "Activo" ->
                    JOptionPane.showMessageDialog(null, "Habitacion ocupada");
                case "Inactivo" -> {
                    AbrirPanel(datosHab);
                    dash.txtHabitacionNumero.setText("Habitacion 302");
                    dash.txtHabitacionNumero.setVisible(true);
                    botonesActivado(false);
                }
                case "Mantenimiento" ->
                    JOptionPane.showMessageDialog(null, "Habitacion en mantenimiento");
                default -> {
                }
            }

        } else if (e.getSource() == piso3.label_103) {

            hab = habDao.Color(302);
            String estado = hab.getEstado();
            switch (estado) {
                case "Activo" ->
                    JOptionPane.showMessageDialog(null, "Habitacion ocupada");
                case "Inactivo" -> {
                    dash.txtHabitacionNumero.setText("Habitacion 303");
                    dash.txtHabitacionNumero.setVisible(true);
                    AbrirPanel(datosHab);
                    botonesActivado(false);
                }
                case "Mantenimiento" ->
                    JOptionPane.showMessageDialog(null, "Habitacion en mantenimiento");
                default -> {
                }
            }

        } else if (e.getSource() == piso3.label_104) {

            hab = habDao.Color(304);
            String estado = hab.getEstado();
            switch (estado) {
                case "Activo" ->
                    JOptionPane.showMessageDialog(null, "Habitacion ocupada");
                case "Inactivo" -> {
                    dash.txtHabitacionNumero.setText("Habitacion 304");
                    dash.txtHabitacionNumero.setVisible(true);
                    AbrirPanel(datosHab);
                    botonesActivado(false);
                }
                case "Mantenimiento" ->
                    JOptionPane.showMessageDialog(null, "Habitacion en mantenimiento");
                default -> {
                }
            }

        } else if (e.getSource() == piso3.label_105) {

            hab = habDao.Color(305);
            String estado = hab.getEstado();
            switch (estado) {
                case "Activo" ->
                    JOptionPane.showMessageDialog(null, "Habitacion ocupada");
                case "Inactivo" -> {
                    dash.txtHabitacionNumero.setText("Habitacion 305");
                    dash.txtHabitacionNumero.setVisible(true);
                    AbrirPanel(datosHab);
                    botonesActivado(false);
                }
                case "Mantenimiento" ->
                    JOptionPane.showMessageDialog(null, "Habitacion en mantenimiento");
                default -> {
                }
            }

        } else if (e.getSource() == piso3.label_106) {

            hab = habDao.Color(306);
            String estado = hab.getEstado();
            switch (estado) {
                case "Activo" ->
                    JOptionPane.showMessageDialog(null, "Habitacion ocupada");
                case "Inactivo" -> {
                    dash.txtHabitacionNumero.setText("Habitacion 306");
                    dash.txtHabitacionNumero.setVisible(true);
                    AbrirPanel(datosHab);
                    botonesActivado(false);
                }
                case "Mantenimiento" ->
                    JOptionPane.showMessageDialog(null, "Habitacion en mantenimiento");
                default -> {
                }
            }

        } else if (e.getSource() == piso3.label_107) {

            hab = habDao.Color(307);
            String estado = hab.getEstado();
            switch (estado) {
                case "Activo" ->
                    JOptionPane.showMessageDialog(null, "Habitacion ocupada");
                case "Inactivo" -> {
                    dash.txtHabitacionNumero.setText("Habitacion 307");
                    dash.txtHabitacionNumero.setVisible(true);
                    AbrirPanel(datosHab);
                    botonesActivado(false);
                }
                case "Mantenimiento" ->
                    JOptionPane.showMessageDialog(null, "Habitacion en mantenimiento");
                default -> {
                }
            }

        } else if (e.getSource() == piso3.label_108) {

            hab = habDao.Color(308);
            String estado = hab.getEstado();
            switch (estado) {
                case "Activo" ->
                    JOptionPane.showMessageDialog(null, "Habitacion ocupada");
                case "Inactivo" -> {
                    dash.txtHabitacionNumero.setText("Habitacion 308");
                    dash.txtHabitacionNumero.setVisible(true);
                    AbrirPanel(datosHab);
                    botonesActivado(false);
                }
                case "Mantenimiento" ->
                    JOptionPane.showMessageDialog(null, "Habitacion en mantenimiento");
                default -> {
                }
            }

        } else if (e.getSource() == piso3.label_109) {

            hab = habDao.Color(309);
            String estado = hab.getEstado();
            switch (estado) {
                case "Activo" ->
                    JOptionPane.showMessageDialog(null, "Habitacion ocupada");
                case "Inactivo" -> {
                    dash.txtHabitacionNumero.setText("Habitacion 309");
                    dash.txtHabitacionNumero.setVisible(true);
                    AbrirPanel(datosHab);
                    botonesActivado(false);
                }
                case "Mantenimiento" ->
                    JOptionPane.showMessageDialog(null, "Habitacion en mantenimiento");
                default -> {
                }
            }

        } else if (e.getSource() == piso4.labe_101) {

            hab = habDao.Color(401);
            String estado = hab.getEstado();
            switch (estado) {
                case "Activo" ->
                    JOptionPane.showMessageDialog(null, "Habitacion ocupada");
                case "Inactivo" -> {
                    AbrirPanel(datosHab);
                    dash.txtHabitacionNumero.setText("Habitacion 401");
                    dash.txtHabitacionNumero.setVisible(true);
                    dash.txtHabitacionNumero.setVisible(true);
                    botonesActivado(false);
                }
                case "Mantenimiento" ->
                    JOptionPane.showMessageDialog(null, "Habitacion en mantenimiento");
                default -> {
                }
            }

        } else if (e.getSource() == piso4.label_102) {

            hab = habDao.Color(402);
            String estado = hab.getEstado();
            switch (estado) {
                case "Activo" ->
                    JOptionPane.showMessageDialog(null, "Habitacion ocupada");
                case "Inactivo" -> {
                    AbrirPanel(datosHab);
                    dash.txtHabitacionNumero.setText("Habitacion 402");
                    dash.txtHabitacionNumero.setVisible(true);
                    botonesActivado(false);
                }
                case "Mantenimiento" ->
                    JOptionPane.showMessageDialog(null, "Habitacion en mantenimiento");
                default -> {
                }
            }

        } else if (e.getSource() == piso4.label_103) {
            hab = habDao.Color(403);
            String estado = hab.getEstado();
            switch (estado) {
                case "Activo" ->
                    JOptionPane.showMessageDialog(null, "Habitacion ocupada");
                case "Inactivo" -> {
                    dash.txtHabitacionNumero.setText("Habitacion 403");
                    dash.txtHabitacionNumero.setVisible(true);
                    AbrirPanel(datosHab);
                    botonesActivado(false);
                }
                case "Mantenimiento" ->
                    JOptionPane.showMessageDialog(null, "Habitacion en mantenimiento");
                default -> {
                }
            }

        } else if (e.getSource() == piso4.label_104) {

            hab = habDao.Color(404);
            String estado = hab.getEstado();
            switch (estado) {
                case "Activo" ->
                    JOptionPane.showMessageDialog(null, "Habitacion ocupada");
                case "Inactivo" -> {
                    dash.txtHabitacionNumero.setText("Habitacion 404");
                    dash.txtHabitacionNumero.setVisible(true);
                    AbrirPanel(datosHab);
                    botonesActivado(false);
                }
                case "Mantenimiento" ->
                    JOptionPane.showMessageDialog(null, "Habitacion en mantenimiento");
                default -> {
                }
            }

        } else if (e.getSource() == piso4.label_105) {

            hab = habDao.Color(405);
            String estado = hab.getEstado();
            switch (estado) {
                case "Activo" ->
                    JOptionPane.showMessageDialog(null, "Habitacion ocupada");
                case "Inactivo" -> {
                    dash.txtHabitacionNumero.setText("Habitacion 405");
                    dash.txtHabitacionNumero.setVisible(true);
                    AbrirPanel(datosHab);
                    botonesActivado(false);
                }
                case "Mantenimiento" ->
                    JOptionPane.showMessageDialog(null, "Habitacion en mantenimiento");
                default -> {
                }
            }

        } else if (e.getSource() == piso4.label_106) {

            hab = habDao.Color(406);
            String estado = hab.getEstado();
            switch (estado) {
                case "Activo" ->
                    JOptionPane.showMessageDialog(null, "Habitacion ocupada");
                case "Inactivo" -> {
                    dash.txtHabitacionNumero.setText("Habitacion 406");
                    dash.txtHabitacionNumero.setVisible(true);
                    AbrirPanel(datosHab);
                    botonesActivado(false);
                }
                case "Mantenimiento" ->
                    JOptionPane.showMessageDialog(null, "Habitacion en mantenimiento");
                default -> {
                }
            }

        } else if (e.getSource() == piso4.label_107) {

            hab = habDao.Color(407);
            String estado = hab.getEstado();
            switch (estado) {
                case "Activo" ->
                    JOptionPane.showMessageDialog(null, "Habitacion ocupada");
                case "Inactivo" -> {
                    dash.txtHabitacionNumero.setText("Habitacion 407");
                    dash.txtHabitacionNumero.setVisible(true);
                    AbrirPanel(datosHab);
                    botonesActivado(false);
                }
                case "Mantenimiento" ->
                    JOptionPane.showMessageDialog(null, "Habitacion en mantenimiento");
                default -> {
                }
            }

        } else if (e.getSource() == piso4.label_108) {

            hab = habDao.Color(408);
            String estado = hab.getEstado();
            switch (estado) {
                case "Activo" ->
                    JOptionPane.showMessageDialog(null, "Habitacion ocupada");
                case "Inactivo" -> {
                    dash.txtHabitacionNumero.setText("Habitacion 408");
                    dash.txtHabitacionNumero.setVisible(true);
                    AbrirPanel(datosHab);
                    botonesActivado(false);
                }
                case "Mantenimiento" ->
                    JOptionPane.showMessageDialog(null, "Habitacion en mantenimiento");
                default -> {
                }
            }

        } else if (e.getSource() == piso4.label_109) {

            hab = habDao.Color(409);
            String estado = hab.getEstado();
            switch (estado) {
                case "Activo" ->
                    JOptionPane.showMessageDialog(null, "Habitacion ocupada");
                case "Inactivo" -> {
                    dash.txtHabitacionNumero.setText("Habitacion 409");
                    dash.txtHabitacionNumero.setVisible(true);
                    AbrirPanel(datosHab);
                    botonesActivado(false);
                }
                case "Mantenimiento" ->
                    JOptionPane.showMessageDialog(null, "Habitacion en mantenimiento");
                default -> {
                }
            }
        } else if (e.getSource() == piso5.labe_101) {

            hab = habDao.Color(501);
            String estado = hab.getEstado();
            switch (estado) {
                case "Activo" ->
                    JOptionPane.showMessageDialog(null, "Habitacion ocupada");
                case "Inactivo" -> {
                    AbrirPanel(datosHab);
                    dash.txtHabitacionNumero.setText("Habitacion 501");
                    dash.txtHabitacionNumero.setVisible(true);
                    dash.txtHabitacionNumero.setVisible(true);
                    botonesActivado(false);
                }
                case "Mantenimiento" ->
                    JOptionPane.showMessageDialog(null, "Habitacion en mantenimiento");
                default -> {
                }
            }

        } else if (e.getSource() == piso5.label_102) {

            hab = habDao.Color(502);
            String estado = hab.getEstado();
            switch (estado) {
                case "Activo" ->
                    JOptionPane.showMessageDialog(null, "Habitacion ocupada");
                case "Inactivo" -> {
                    AbrirPanel(datosHab);
                    dash.txtHabitacionNumero.setText("Habitacion 502");
                    dash.txtHabitacionNumero.setVisible(true);
                    botonesActivado(false);
                }
                case "Mantenimiento" ->
                    JOptionPane.showMessageDialog(null, "Habitacion en mantenimiento");
                default -> {
                }
            }

        } else if (e.getSource() == piso5.label_103) {

            hab = habDao.Color(503);
            String estado = hab.getEstado();
            switch (estado) {
                case "Activo" ->
                    JOptionPane.showMessageDialog(null, "Habitacion ocupada");
                case "Inactivo" -> {
                    dash.txtHabitacionNumero.setText("Habitacion 503");
                    dash.txtHabitacionNumero.setVisible(true);
                    AbrirPanel(datosHab);
                    botonesActivado(false);
                }
                case "Mantenimiento" ->
                    JOptionPane.showMessageDialog(null, "Habitacion en mantenimiento");
                default -> {
                }
            }
        } else if (e.getSource() == piso5.label104) {

            hab = habDao.Color(504);
            String estado = hab.getEstado();
            switch (estado) {
                case "Activo" ->
                    JOptionPane.showMessageDialog(null, "Habitacion ocupada");
                case "Inactivo" -> {
                    dash.txtHabitacionNumero.setText("Habitacion 504");
                    dash.txtHabitacionNumero.setVisible(true);
                    AbrirPanel(datosHab);
                    botonesActivado(false);
                }
                case "Mantenimiento" ->
                    JOptionPane.showMessageDialog(null, "Habitacion en mantenimiento");
                default -> {
                }
            }
        } else if (e.getSource() == piso5.label_105) {

            hab = habDao.Color(505);
            String estado = hab.getEstado();
            switch (estado) {
                case "Activo" ->
                    JOptionPane.showMessageDialog(null, "Habitacion ocupada");
                case "Inactivo" -> {
                    dash.txtHabitacionNumero.setText("Habitacion 505");
                    dash.txtHabitacionNumero.setVisible(true);
                    AbrirPanel(datosHab);
                    botonesActivado(false);
                }
                case "Mantenimiento" ->
                    JOptionPane.showMessageDialog(null, "Habitacion en mantenimiento");
                default -> {
                }
            }
        } else if (e.getSource() == piso5.label_106) {

            hab = habDao.Color(506);
            String estado = hab.getEstado();
            switch (estado) {
                case "Activo" ->
                    JOptionPane.showMessageDialog(null, "Habitacion ocupada");
                case "Inactivo" -> {
                    dash.txtHabitacionNumero.setText("Habitacion 506");
                    dash.txtHabitacionNumero.setVisible(true);
                    AbrirPanel(datosHab);
                    botonesActivado(false);
                }
                case "Mantenimiento" ->
                    JOptionPane.showMessageDialog(null, "Habitacion en mantenimiento");
                default -> {
                }
            }
        } else if (e.getSource() == piso5.label_107) {
            dash.txtHabitacionNumero.setText("Habitacion 507");
            dash.txtHabitacionNumero.setVisible(true);
            AbrirPanel(datosHab);
            botonesActivado(false);
            hab = habDao.Color(507);
            String estado = hab.getEstado();
            switch (estado) {
                case "Activo" ->
                    JOptionPane.showMessageDialog(null, "Habitacion ocupada");
                case "Inactivo" -> {
                    dash.txtHabitacionNumero.setText("Habitacion 507");
                    dash.txtHabitacionNumero.setVisible(true);
                    AbrirPanel(datosHab);
                    botonesActivado(false);
                }
                case "Mantenimiento" ->
                    JOptionPane.showMessageDialog(null, "Habitacion en mantenimiento");
                default -> {
                }
            }
        } else if (e.getSource() == piso5.label_108) {

            hab = habDao.Color(508);
            String estado = hab.getEstado();
            switch (estado) {
                case "Activo" ->
                    JOptionPane.showMessageDialog(null, "Habitacion ocupada");
                case "Inactivo" -> {
                    dash.txtHabitacionNumero.setText("Habitacion 508");
                    dash.txtHabitacionNumero.setVisible(true);
                    AbrirPanel(datosHab);
                    botonesActivado(false);
                }
                case "Mantenimiento" ->
                    JOptionPane.showMessageDialog(null, "Habitacion en mantenimiento");
                default -> {
                }
            }
        } else if (e.getSource() == piso5.label_109) {

            hab = habDao.Color(509);
            String estado = hab.getEstado();
            switch (estado) {
                case "Activo" ->
                    JOptionPane.showMessageDialog(null, "Habitacion ocupada");
                case "Inactivo" -> {
                    dash.txtHabitacionNumero.setText("Habitacion 509");
                    dash.txtHabitacionNumero.setVisible(true);
                    AbrirPanel(datosHab);
                    botonesActivado(false);
                }
                case "Mantenimiento" ->
                    JOptionPane.showMessageDialog(null, "Habitacion en mantenimiento");
                default -> {
                }
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    private void botonesActivado(boolean estado) {
        dash.btn_Piso1.setEnabled(estado);
        dash.btn_Piso2.setEnabled(estado);
        dash.btn_Piso3.setEnabled(estado);
        dash.btn_Piso4.setEnabled(estado);
        dash.btn_Piso5.setEnabled(estado);
    }

    private void botonesVisible(boolean visible) {
        dash.btn_Piso1.setVisible(visible);
        dash.btn_Piso2.setVisible(visible);
        dash.btn_Piso3.setVisible(visible);
        dash.btn_Piso4.setVisible(visible);
        dash.btn_Piso5.setVisible(visible);
    }

    private void LimpiarHabitacion() {

        datosHab.txt_costoTotal_Reservacion.setText("");
        datosHab.date_fechaCheckIn.setDate(new Date());

        Calendar diaMinimo = Calendar.getInstance();
        diaMinimo.add(Calendar.DAY_OF_MONTH, 1);
        datosHab.date_fechaCheckOut.setDate(diaMinimo.getTime());
    }

    private void LimpiarHuesped() {
        datosHue.txt_telefono.setForeground(Color.gray);
        datosHue.txt_apellidoReservacion1.setForeground(Color.gray);
        datosHue.txt_nombreReservacion.setForeground(Color.gray);
        datosHue.txt_telefono.setText("Ingrese el télefono del huesped");
        datosHue.txt_apellidoReservacion1.setText("Ingrese los apellidos del huesped");
        datosHue.txt_nombreReservacion.setText("Ingrese el nombre del huesped");
        datosHue.txt_costoTotal_Reservacion.setText("");
        datosHue.cmb_nacionalidad.setSelectedIndex(10);
        datosHue.label_Error.setVisible(false);
        datosHue.date_fechaNacimiento.setDate(new Date());
    }

    private void ValidarTiempo() {
        datosHab.date_fechaCheckIn.setMinSelectableDate(new Date());
        datosHab.date_fechaCheckIn.setDate(new Date());

        Calendar diaMinimo = Calendar.getInstance();
        diaMinimo.add(Calendar.DAY_OF_MONTH, 1);
        datosHab.date_fechaCheckOut.setMinSelectableDate(diaMinimo.getTime());
        datosHab.date_fechaCheckOut.setDate(diaMinimo.getTime());

        Calendar fechaDefault = Calendar.getInstance();
        fechaDefault.set(2000, fechaDefault.JANUARY, 1);
        datosHue.date_fechaNacimiento.setMaxSelectableDate(new Date());
        datosHue.date_fechaNacimiento.setDate(fechaDefault.getTime());
    }

    private boolean ValidarCamposHabitacion() {

        int check = 0;

        Date fechaIn = datosHab.date_fechaCheckIn.getDate();
        Date fechaOut = datosHab.date_fechaCheckOut.getDate();

        if (fechaIn.before(fechaOut)) {
            datosHab.label_Error.setVisible(false);
            datosHab.date_fechaCheckIn.setForeground(Color.green);
            datosHab.date_fechaCheckOut.setForeground(Color.green);
        } else {
            datosHab.label_Error.setText("¡Error en la feha de Reservacion!.");
            datosHab.label_Error.setVisible(true);
            check++;
        }

        if (check == 0) {
            Datos.habitacion = dash.txtHabitacionNumero.getText().substring(11, 14);
            Datos.inicio = datosHab.date_fechaCheckIn.getDate();
            Datos.fin = datosHab.date_fechaCheckOut.getDate();
            Datos.Mpago = datosHab.cmb_MedioPagoR.getSelectedItem().toString();
            Datos.pago = datosHab.txt_costoTotal_Reservacion.getText().trim();
            return true;
        } else {
            return false;
        }

    }

    private boolean ValidarCamposHuesped() {
        String nombre = datosHue.txt_nombreReservacion.getText().trim();
        String apellido = datosHue.txt_apellidoReservacion1.getText().trim();
        String telefono = datosHue.txt_telefono.getText().trim();

        String campo = "Campo obligatorio";
        int check = 0;

        boolean n = nombre.equals("") || nombre.equals("campo") || nombre.equals("Ingrese el nombre del huesped");
        boolean a = apellido.equals("") || apellido.equals("campo") || apellido.equals("Ingrese los apellidos del huesped");
        boolean t = telefono.equals("") || telefono.equals("campo") || telefono.equals("Ingrese el télefono del huesped");

        if (n) {
            datosHue.txt_nombreReservacion.setText(campo);
            datosHue.txt_nombreReservacion.setForeground(Color.red);
            check++;
        } else {
            datosHue.txt_nombreReservacion.setForeground(Color.BLACK);
        }
        if (a) {
            datosHue.txt_apellidoReservacion1.setText(campo);
            datosHue.txt_apellidoReservacion1.setForeground(Color.red);
            check++;
        } else {
            datosHue.txt_apellidoReservacion1.setForeground(Color.BLACK);
        }
        if (t) {
            datosHue.txt_telefono.setText(campo);
            datosHue.txt_telefono.setForeground(Color.red);
            check++;
        } else {
            datosHue.txt_telefono.setForeground(Color.BLACK);
        }

        if (check == 0) {
            datosHue.label_Error.setVisible(false);
            return true;
        } else {
            datosHue.label_Error.setText("Rellene todos los campos");
            datosHue.label_Error.setVisible(true);
            return false;
        }

    }

    private void rol() {
        String rol = Login.rol;
        if (rol.equals("Trabajador")) {
            dash.btnConfiguracionP.setEnabled(false);
            dash.btnConfiguracionP.setVisible(false);
        } else if (rol.equals("Administrador")) {
            dash.btnConfiguracionP.setEnabled(true);
            dash.btnConfiguracionP.setVisible(true);
        } else {
            dash.btnConfiguracionP.setEnabled(false);
            dash.btnConfiguracionP.setVisible(false);
        }
    }
}
