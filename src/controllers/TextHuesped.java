/*
 * Fecha de creacion: 17/04/2023 12:17:18
 * Version: v.0.1
 * Detalles: 
 */
package controllers;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import main.DatosHuesped;

/**
 * @author Willy Stbn
 */
public class TextHuesped implements MouseListener {

    private DatosHuesped datos;

    public TextHuesped(DatosHuesped datos) {
        this.datos = datos;

        this.datos.txt_nombreReservacion.addMouseListener(this);
        this.datos.txt_apellidoReservacion1.addMouseListener(this);
        this.datos.txt_telefono.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        if (datos.txt_nombreReservacion == e.getSource()) {
            String nombre = datos.txt_nombreReservacion.getText().trim();
            String apellido = datos.txt_apellidoReservacion1.getText().trim();
            String telefono = datos.txt_telefono.getText().trim();
            String campo = "Campo obligatorio";
            boolean n = nombre.equals("") || nombre.equals(campo) || nombre.equals("Ingrese el nombre del huesped");
            boolean a = apellido.equals("") || apellido.equals(campo) || apellido.equals("Ingrese los apellidos del huesped");
            boolean t = telefono.equals("") || telefono.equals(campo) || telefono.equals("Ingrese el télefono del huesped");

            if (n) {
                datos.txt_nombreReservacion.setText("");
                datos.txt_nombreReservacion.setForeground(Color.BLACK);
            } else {
                datos.txt_nombreReservacion.setForeground(Color.BLACK);
            }
            if (a) {
                datos.txt_apellidoReservacion1.setText("Ingrese los apellidos del huesped");
                datos.txt_apellidoReservacion1.setForeground(Color.GRAY);
            } else {
                datos.txt_apellidoReservacion1.setForeground(Color.BLACK);
            }
            if (t) {
                datos.txt_telefono.setText("Ingrese el télefono del huesped");
                datos.txt_telefono.setForeground(Color.GRAY);
            } else {
                datos.txt_telefono.setForeground(Color.BLACK);
            }
        } else if (datos.txt_apellidoReservacion1 == e.getSource()) {
            String nombre = datos.txt_nombreReservacion.getText().trim();
            String apellido = datos.txt_apellidoReservacion1.getText().trim();
            String telefono = datos.txt_telefono.getText().trim();
            String campo = "Campo obligatorio";
            boolean n = nombre.equals("") || nombre.equals(campo) || nombre.equals("Ingrese el nombre del huesped");
            boolean a = apellido.equals("") || apellido.equals(campo) || apellido.equals("Ingrese los apellidos del huesped");
            boolean t = telefono.equals("") || telefono.equals(campo) || telefono.equals("Ingrese el télefono del huesped");

            if (n) {
                datos.txt_nombreReservacion.setText("Ingrese el nombre del huesped");
                datos.txt_nombreReservacion.setForeground(Color.GRAY);
            } else {
                datos.txt_nombreReservacion.setForeground(Color.BLACK);
            }
            if (a) {
                datos.txt_apellidoReservacion1.setText("");
                datos.txt_apellidoReservacion1.setForeground(Color.BLACK);
            } else {
                datos.txt_apellidoReservacion1.setForeground(Color.BLACK);
            }
            if (t) {
                datos.txt_telefono.setText("Ingrese el télefono del huesped");
                datos.txt_telefono.setForeground(Color.GRAY);
            } else {
                datos.txt_telefono.setForeground(Color.BLACK);
            }
        } else if (datos.txt_telefono == e.getSource()) {
            String nombre = datos.txt_nombreReservacion.getText().trim();
            String apellido = datos.txt_apellidoReservacion1.getText().trim();
            String telefono = datos.txt_telefono.getText().trim();

            boolean n = nombre.equals("") || nombre.equals("campo") || nombre.equals("Ingrese el nombre del huesped");
            boolean a = apellido.equals("") || apellido.equals("campo") || apellido.equals("Ingrese los apellidos del huesped");
            boolean t = telefono.equals("") || telefono.equals("campo") || telefono.equals("Ingrese el télefono del huesped");

            if (n) {
                datos.txt_nombreReservacion.setText("Ingrese el nombre del huesped");
                datos.txt_nombreReservacion.setForeground(Color.GRAY);
            } else {
                datos.txt_nombreReservacion.setForeground(Color.BLACK);
            }
            if (a) {
                datos.txt_apellidoReservacion1.setText("Ingrese los apellidos del huesped");
                datos.txt_apellidoReservacion1.setForeground(Color.GRAY);
            } else {
                datos.txt_apellidoReservacion1.setForeground(Color.BLACK);
            }
            if (t) {
                datos.txt_telefono.setText("");
                datos.txt_telefono.setForeground(Color.BLACK);
            } else {
                datos.txt_telefono.setForeground(Color.BLACK);
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

}
