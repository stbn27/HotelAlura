/*
 * Fecha de creacion: 09/04/2023 10:47:27
 * Version: v.0.1
 * Detalles: 
 */

package com.alura.models;

/**
 * @author Willy Stbn
 */

public class Setting {
    
    private int id;
    private String nombre;
    private String razon;
    private String telefono;
    private String correo;
    private String ubicacion;
    private String registrado_por;

    public Setting() {
        
    }

    public Setting(int id, String nombre, String razon, String telefono, String correo, String ubicacion, String registrado_por) {
        this.id = id;
        this.nombre = nombre;
        this.razon = razon;
        this.telefono = telefono;
        this.correo = correo;
        this.ubicacion = ubicacion;
        this.registrado_por = registrado_por;
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

    public String getRazon() {
        return razon;
    }

    public void setRazon(String razon) {
        this.razon = razon;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getRegistrado_por() {
        return registrado_por;
    }

    public void setRegistrado_por(String registrado_por) {
        this.registrado_por = registrado_por;
    }
    
    
}
