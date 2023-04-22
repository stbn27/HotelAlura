/*
 * Fecha de creacion: 07/04/2023 21:01:06
 * Version: v.0.1
 * Detalles: 
 */

package com.alura.models;

import java.math.BigInteger;

/**
 * @author Willy Stbn
 */

public class Usuarios {
    
    private int id;
    private String nombre;
    private String correo;
    private BigInteger telefono;
    private String usuario;
    private String pass;
    private String rol;
    private String registrado_por;

    public Usuarios() {
        
    }

    public Usuarios(int id, String nombre, String correo, BigInteger telefono, String usuario, String pass, String rol, String registrado_por) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.usuario = usuario;
        this.pass = pass;
        this.rol = rol;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public BigInteger getTelefono() {
        return telefono;
    }

    public void setTelefono(BigInteger telefono) {
        this.telefono = telefono;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getRegistrado_por() {
        return registrado_por;
    }

    public void setRegistrado_por(String registrado_por) {
        this.registrado_por = registrado_por;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    
    
}
