/*
 * Fecha de creacion: 16/04/2023 23:16:00
 * Version: v.0.1
 * Detalles: 
 */

package com.alura.models;

import java.util.Date;

/**
 * @author Willy Stbn
 */

public class Habitacion {
    
    private int id;
    private int NoHabitacion;
    private Date inicio;
    private Date fin;
    private String MedioPago;
    private String estado;
    private int piso;
    private int Id_Huesped;
    private double costo;
    private String NoReservacion;

    public Habitacion() {
        
    }

    public Habitacion(int id, int NoHabitacion, Date inicio, Date fin, String MedioPago, String estado, int piso, int Id_Huesped, double costo, String NoReservacion) {
        this.id = id;
        this.NoHabitacion = NoHabitacion;
        this.inicio = inicio;
        this.fin = fin;
        this.MedioPago = MedioPago;
        this.estado = estado;
        this.piso = piso;
        this.Id_Huesped = Id_Huesped;
        this.costo = costo;
        this.NoReservacion = NoReservacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNoHabitacion() {
        return NoHabitacion;
    }

    public void setNoHabitacion(int NoHabitacion) {
        this.NoHabitacion = NoHabitacion;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }

    public String getMedioPago() {
        return MedioPago;
    }

    public void setMedioPago(String MedioPago) {
        this.MedioPago = MedioPago;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public int getId_Huesped() {
        return Id_Huesped;
    }

    public void setId_Huesped(int Id_Huesped) {
        this.Id_Huesped = Id_Huesped;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getNoReservacion() {
        return NoReservacion;
    }

    public void setNoReservacion(String NoReservacion) {
        this.NoReservacion = NoReservacion;
    }
    
    
    
}
