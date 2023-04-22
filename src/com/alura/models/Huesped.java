/*
 * Fecha de creacion: 16/04/2023 23:16:05
 * Version: v.0.1
 * Detalles: 
 */

package com.alura.models;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * @author Willy Stbn
 */

public class Huesped {
    
    private int id;
    private String nombre;
    private String apellido;
    private Date nacimiento;
    private String telefono;
    private String nacionalidad;

    public Huesped() {
        
    }

    public Huesped(int id, String nombre, String apellido, Date nacimiento, String telefono, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento = nacimiento;
        this.telefono = telefono;
        this.nacionalidad = nacionalidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getNacimiento() {
        
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
    
    


}
