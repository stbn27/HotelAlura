/*
 * Fecha de creacion: 17/04/2023 13:26:13
 * Version: v.0.1
 * Detalles: 
 */
package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Willy Stbn
 */
public class HuepedDao {

    ConexionBD con = new ConexionBD();
    Connection cn;
    PreparedStatement pst;
    ResultSet rs;
    
    public static int idHuespedN = 0;

    //Guardar reservacion.
    public int Reservar(Huesped r) {

        String instruccionSql = "INSERT INTO huesped (nombre, apellido, telefono, nacimiento, nacionalidad) VALUES (?,?,?,?,?)";
        cn = con.getConexion();
        int id = 0;

        try {
            //pst = cn.prepareStatement(instruccionSql);
            pst = cn.prepareStatement(instruccionSql, Statement.RETURN_GENERATED_KEYS);
            pst.setString(1, r.getNombre());
            pst.setString(2, r.getApellido());
            pst.setString(3, r.getTelefono());
            pst.setDate(4, new java.sql.Date(r.getNacimiento().getTime()));
            pst.setString(5, r.getNacionalidad());

            pst.execute();
            rs = pst.getGeneratedKeys();
            if (rs.next()) {
                id = rs.getInt(1);
                return id;
            }

            pst.close();
            cn.close();
        } catch (SQLException e) {
            System.out.println("Clase: Huesped DAO");
            System.err.println("Error al insertar Valores en HuespedDAO\n" + e);
        }
        idHuespedN = id;
        return id;
    }

    public List ListasHuespedes(String buscar) {

        String instruccionSQL = "SELECT * FROM huesped";
        String buscarSQL = "SELECT * FROM huesped WHERE nombre LIKE '%" + buscar + "%' OR apellido = '%" + buscar + "%'";
        List<Huesped> ListaHuespedes = new ArrayList<>();

        try {

            cn = con.getConexion();
            if (buscar.equalsIgnoreCase("Realizar una busqueda") || buscar.equalsIgnoreCase("")) {
                pst = cn.prepareStatement(instruccionSQL);
                rs = pst.executeQuery();
            } else {
                pst = cn.prepareStatement(buscarSQL);
                rs = pst.executeQuery();
            }

            while (rs.next()) {
                Huesped huesped = new Huesped();

                huesped.setId(rs.getInt("id"));
                huesped.setNombre(rs.getString("nombre"));
                huesped.setApellido(rs.getString("Apellido"));
                huesped.setTelefono(rs.getString("telefono"));
                huesped.setNacimiento(rs.getDate("nacimiento"));
                huesped.setNacionalidad(rs.getString("nacionalidad"));

                ListaHuespedes.add(huesped);
            }
        } catch (SQLException e) {
            System.out.println("Clase: HuespedDao");
            System.err.println("Error al consultar la lista huespedes de la base de datos.\n" + e);
        } finally {
            try {
                pst.close();
                cn.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexion");
            }
        }
        return ListaHuespedes;
    }

    public boolean modificarEstadoHabitacion(String estado, int id_Huesped) {
        String intruccionSQL= "UPDATE habitacion SET estado = ?, noReservacion = 0 WHERE id_huesped = ?";
        try {
            cn = con.getConexion();
            pst = cn.prepareStatement(intruccionSQL);
            pst.setString(1, estado);
            pst.setInt(2, id_Huesped);
            pst.execute();
            
            return true;
        } catch (SQLException e) {
            System.out.println("Error clase: HuespedDao");
            System.err.println("Error al modificar estado de la habitacion\n" + e);
            return false;
        } finally{
            try {
                pst.close();
                cn.close();
            } catch (SQLException e) {
                System.err.println("Error al cerrar conexion con la base de datos.");
            }
        }
    }

    public boolean EliminarHuesped(int id) {
        
        String instruccionSQL = "DELETE FROM huesped WHERE id = ?";
        try {
            cn = con.getConexion();
            pst = cn.prepareStatement(instruccionSQL);
            pst.setInt(1, id);
            pst.execute();
            return true;

        } catch (SQLException e) {
            System.out.println("Error clase: HabitacionDao -> EliminarHuesped");
            System.err.println("Error al eliminar huesped\n" + e);
            return false;
        } finally{
            try {
                pst.close();
                cn.close();
            } catch (SQLException e) {
                System.err.println("Error al cerrar conexion");
            }
        }
    }
    
    public int IdHuesped(int id) {
        String intruccionSQL = "SELECT id_huesped FROM habitacion WHERE id = ?";
        int id_huesped = 0;
        try {
            cn = con.getConexion();
            pst = cn.prepareStatement(intruccionSQL);
            pst.setInt(1, id);
            rs = pst.executeQuery();
            
            if(rs.next()){
                id_huesped =rs.getInt("id_huesped");
            }
        } catch (SQLException e) {
            System.out.println("Error clase HuespedDao -> IdHuesped");
            System.err.println("Error al consultar ide del huesped.\n" + e);
        } finally{
            try {
                 pst.close();
            cn.close();
            } catch (SQLException e) {
                System.err.println("Error al cerrar conexcion con la base de datos.");
            }           
        }
        return id_huesped;
    }
    
    public Huesped ConsultarHuesped(int id){
        String instruccionSQL = "SELECT * FROM huesped WHERE id = ?";
        Huesped hue = new Huesped();
        try {
            cn = con.getConexion();
            pst = cn.prepareStatement(instruccionSQL);
            pst.setInt(1, id);
            rs = pst.executeQuery();
            if(rs.next()){
                hue.setId(rs.getInt("id"));
                hue.setNombre(rs.getString("nombre"));
                hue.setApellido(rs.getString("apellido"));
                hue.setNacionalidad(rs.getString("nacionalidad"));
                hue.setNacimiento(rs.getDate("nacimiento"));
                hue.setTelefono(rs.getString("telefono"));
                
            }
        } catch (SQLException e) {
            System.out.println("Error clase HuespedDao -> ConsultarHuesped");
            System.err.println("Error al consultar informacion del huesped con id: " + id);
            System.err.println(e.toString());
        } finally{
            try {
                pst.close();
                cn.close();
            } catch (SQLException e) {
                System.err.println("Error al cerrar conexion con la base de datos.");
            }
        }
        return hue;
    }
    
    public boolean ActualizarInfoHuesped(Huesped hue){
        String SQL = "UPDATE huesped SET nombre = ?, apellido = ?, nacimiento = ?, nacionalidad = ?, telefono = ? WHERE id = ?";
        try {
            cn = con.getConexion();
            pst = cn.prepareStatement(SQL);
            pst.setString(1, hue.getNombre());
            pst.setString(2, hue.getApellido());
            pst.setDate(3, new java.sql.Date(hue.getNacimiento().getTime()));
            pst.setString(4, hue.getNacionalidad());
            pst.setString(5, hue.getTelefono());
            pst.setInt(6, hue.getId());
            pst.execute();
            return true;
        } catch (SQLException e) {
            System.out.println("Error clase: HuespedDao -> ActualizarInfoHuesped");
            System.err.println("Error al actualizar informacion del huesped.\n" + e);
            return false;
        } finally{
            try {
                pst.close();
                cn.close();
            } catch (SQLException e) {
                System.err.println("Error al cerra conexion con la base de datos.");
            }
        }
    }
}
