/*
 * Fecha de creacion: 09/04/2023 10:40:20
 * Version: v.0.1
 * Detalles: 
 */

package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

/**
 * @author Willy Stbn
 */

public class SettingDao {
    
    ConexionBD con = new ConexionBD();
    Connection cn;
    PreparedStatement pst;
    ResultSet rs;
    
    public Setting CargarInformacion(){
        
        String instruccionSQL = "SELECT * FROM setting";
        Setting datos = new Setting();
        
        try {
            cn = con.getConexion();
            pst = cn.prepareStatement(instruccionSQL);
            rs = pst.executeQuery();
            
            while(rs.next()){
                datos.setId(rs.getInt("id"));
                datos.setNombre(rs.getString("nombre"));
                datos.setRazon(rs.getString("razon"));
                datos.setTelefono(rs.getString("telefono"));
                datos.setCorreo(rs.getString("correo"));
                datos.setUbicacion(rs.getString("ubicacion"));
                datos.setRegistrado_por(rs.getString("actualizado_por"));
                
            }
            
        } catch (SQLException e) {
            System.out.println("Clase: Setting Dao\n");
            System.err.println("Error al actualizar informacion de la base de datos.\n" + e);
        } finally {
            try {
                pst.close();
                cn.close();
            } catch (SQLException ex) {
                System.err.println("Error al cerrar la conexion con la base datos");
            }
        }
        return datos;
    }
    
    public boolean ActualizarInformacion(Map<Integer, String> datos){
        
        String intruccionSQL = "UPDATE setting set nombre =?, razon=?, telefono=?, correo=?, ubicacion=? WHERE id = ?";
        /*
        1 - id
        2 - nombre
        3 - razon
        4 - telefono
        5 - correo
        6 - ubicacion
        7 - actualizado_por
        */
        try {
            cn = con.getConexion();
            pst = cn.prepareStatement(intruccionSQL);
            pst.setString(1, datos.get(2));
            pst.setString(2, datos.get(3));
            pst.setString(3, datos.get(4));
            pst.setString(4, datos.get(5));
            pst.setString(5, datos.get(6));
            //pst.setString(6, datos.get(7));
            pst.setInt(6, Integer.parseInt(datos.get(1)));
            
            pst.execute();
            return true;
            
        } catch (SQLException e) {
            System.out.println("Clase: Setting Dao");
            System.err.println("Error a actualizar informacion del hotel." + e);
            return false;
        } finally{
            try {
                pst.close();
                cn.close();
            } catch (SQLException e) {
                System.err.println("Error al cerrar conexion con la base de datos.\n" + e);
            }
        }
        
        
    }
    
}
