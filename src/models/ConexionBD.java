/*
 * Fecha de creacion: 07/04/2023 20:38:37
 * Version: v.0.1
 * Detalles: 
 */

package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Willy Stbn
 */

public class ConexionBD {
    
    Connection con;
    
    public Connection getConexion(){
        
        String bd =  "jdbc:mysql://localhost:3306/hotelalura?serverTimezone=UTC";
        String user = "root";
        String pass = "";
        
        try {
            con = DriverManager.getConnection(bd,user,pass);
            return con;
        } catch (SQLException e) {
            System.out.println("Clase: Conexion");
            System.err.println("¡Error al conectar con la base de datos!");
            return null;
        }
    }
    
}
