/*
 * Fecha de creacion: 07/04/2023 21:05:06
 * Version: v.0.1
 * Detalles: 
 */
package com.alura.models;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

/**
 * @author Willy Stbn
 */
public class UsuariosDao {

    ConexionBD cn = new ConexionBD();
    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    //Consultar usuario login
    public Usuarios login(String user, String pass) throws SQLException {

        Usuarios is = new Usuarios();
        String sql = "SELECT * FROM usuarios  WHERE usuario=? AND pass=?";

        try {
            con = cn.getConexion();

            pst = con.prepareStatement(sql);
            pst.setString(1, user);
            pst.setString(2, pass);

            rs = pst.executeQuery();

            if (rs.next()) {
                is.setId(rs.getInt("id"));
                is.setNombre(rs.getString("nombre"));
                is.setCorreo(rs.getString("correo"));
                is.setTelefono(rs.getBigDecimal("telefono").toBigInteger());
                is.setUsuario(rs.getString("usuario"));
                is.setPass(rs.getString("pass"));
                is.setRol(rs.getString("rol"));
                is.setRegistrado_por(rs.getString("registrado_por"));

            }

        } catch (SQLException e) {
            System.out.println("Clase: Usuarios DAO\n");
            System.err.println("¡Error al buscar usuario en la base da datos!.\n" + e);
        } finally {
            con.close();
            pst.close();
        }
        return is;

    }

    //Agregar usuario
    public boolean AgregarUsuario(Map<Integer, String> datos) {

        String instruccionSQL = "INSERT INTO usuarios (nombre, correo, telefono, usuario, pass,rol, registrado_por) "
                + "VALUES (?,?,?,?,?,?,?)";

        try {
            con = cn.getConexion();
            pst = con.prepareStatement(instruccionSQL);
            pst.setString(1, datos.get(1));
            pst.setString(2, datos.get(2));
            pst.setBigDecimal(3, new BigDecimal(datos.get(3)));
            pst.setString(4, datos.get(4));
            pst.setString(5, datos.get(5));
            pst.setString(6, datos.get(6));
            pst.setString(7, datos.get(7));
            
            pst.execute();
            
            return true;
        } catch (SQLException e) {
            System.out.println("Clase: usuariosDao");
            System.err.println("Error al insertar datos de usuario.\n" + e);
            return false;
        }
    }

}
