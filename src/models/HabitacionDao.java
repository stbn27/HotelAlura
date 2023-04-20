/*
 * Fecha de creacion: 17/04/2023 00:01:17
 * Version: v.0.1
 * Detalles: 
 */
package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Willy Stbn
 */
public class HabitacionDao {

    ConexionBD con = new ConexionBD();
    Connection cn;
    PreparedStatement pst;
    ResultSet rs;

    public boolean InsertarInformacion(Habitacion h) {

        String instruccionSQL = "UPDATE habitacion SET piso = ?,  inicio = ?,  fin = ?, medioPago = ?, estado = ?, costo = ?, id_huesped = ?, noReservacion = ? WHERE noHabitacion = ?";

        try {
            cn = con.getConexion();
            pst = cn.prepareStatement(instruccionSQL);

            pst.setInt(1, h.getPiso());
            pst.setDate(2, new java.sql.Date(h.getInicio().getTime()));
            pst.setDate(3, new java.sql.Date(h.getFin().getTime()));
            pst.setString(4, h.getMedioPago());
            pst.setString(5, h.getEstado());
            pst.setDouble(6, h.getCosto());
            pst.setInt(7, h.getId_Huesped());
            pst.setString(8, h.getNoReservacion());
            pst.setInt(9, h.getNoHabitacion());

            pst.execute();

            pst.close();
            cn.close();
            return true;
        } catch (SQLException e) {
            System.err.println("¡Error al insertar datos en la base de datos!\n" + e);
            return false;
        }
    }

    public Habitacion ObtenerDatos(int idHuesped) {

        Habitacion hab = new Habitacion();
        String intruccionSQL = "SELECT * FROM habitacion WHERE id_huesped=?";

        try {
            cn = con.getConexion();
            pst = cn.prepareStatement(intruccionSQL);
            pst.setInt(1, idHuesped);
            rs = pst.executeQuery();

            while (rs.next()) {
                hab.setId(rs.getInt("id"));
                hab.setId_Huesped(rs.getInt("id_huesped"));
                hab.setPiso(rs.getInt("piso"));
                hab.setInicio(rs.getDate("inicio"));
                hab.setFin(rs.getDate("fin"));
                hab.setMedioPago(rs.getString("medioPago"));
                hab.setCosto(rs.getDouble("costo"));
                hab.setEstado(rs.getString("estado"));
                hab.setNoHabitacion(rs.getInt("noHabitacion"));
                hab.setNoReservacion(rs.getString("noReservacion"));

            }

        } catch (SQLException e) {
            System.out.println("Clase: HabitacionDao");
            System.err.println("Error al consultar informacion de la habitacion.\n" + e.toString());
        } finally {
            try {
                pst.close();
                cn.close();
            } catch (SQLException e) {
                System.err.println("Error al cerra conexecion!!");
            }
        }
        return hab;
    }

    public Habitacion Color(int habitacion) {
        Habitacion hab = new Habitacion();

        String sql = " SELECT estado FROM habitacion WHERE noHabitacion = ?";
        try {
            cn = con.getConexion();
            pst = cn.prepareStatement(sql);
            pst.setInt(1, habitacion);
            rs = pst.executeQuery();
            if (rs.next()) {
                hab.setEstado(rs.getString("estado"));
            }
        } catch (SQLException e) {
            System.out.println("Error clase: HabiatacionesDao -> Color");
            System.err.println("Erro al consultar estado de habitacion.\n" + e);
        } finally {
            try {
                pst.close();
                cn.close();
            } catch (SQLException e) {
                System.err.println("Error al cerrar conexion con la base de datos.");
            }
        }
        return hab;
    }

    public List ListasHabitacion(String buscar) {

        String instruccionSQL = "SELECT * FROM habitacion";
        String buscarSQL = "SELECT * FROM habitacion WHERE noHabitacion LIKE '%" + buscar + "%' OR noReservacion LIKE '%" + buscar + "%' OR estado LIKE '%" + buscar +"%'";
        List<Habitacion> listaHabitacion = new ArrayList<>();

        try {

            cn = con.getConexion();
            if (buscar.equalsIgnoreCase("Ingrese una habitacion para buscar") || buscar.equalsIgnoreCase("")) {
                pst = cn.prepareStatement(instruccionSQL);
                rs = pst.executeQuery();
            } else {
                pst = cn.prepareStatement(buscarSQL);
                rs = pst.executeQuery();
            }

            while (rs.next()) {
                Habitacion hab = new Habitacion();

                hab.setId(rs.getInt("id"));
                hab.setNoHabitacion(rs.getInt("noHabitacion"));
                hab.setCosto(rs.getDouble("costo"));
                hab.setEstado(rs.getString("estado"));
                hab.setPiso(rs.getInt("piso"));
                hab.setId_Huesped(rs.getInt("id_huesped"));
                hab.setMedioPago(rs.getString("medioPago"));

                if (rs.getString("noReservacion").equals("0")) {
                    hab.setNoReservacion("--------");
                } else {
                    hab.setNoReservacion(rs.getString("noReservacion"));
                }

                java.sql.Date fechaInicio = rs.getDate("inicio");
                if (fechaInicio == null || fechaInicio.toString().equals("0000-00-00")) {
                    fechaInicio = new java.sql.Date(System.currentTimeMillis());
                }
                hab.setInicio(fechaInicio);

                java.sql.Date fechaFin = rs.getDate("fin");
                if (fechaFin == null || fechaFin.toString().equals("0000-00-00")) {
                    fechaFin = new java.sql.Date(System.currentTimeMillis());
                }
                hab.setFin(fechaFin);

                listaHabitacion.add(hab);
            }

        } catch (SQLException e) {
            System.out.println("Clase: HabitacionDao");
            System.err.println("Error al consultar la lista de habitaciones de la base de datos.\n" + e);
        } finally {
            try {
                pst.close();
                cn.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexion");
            }
        }
        return listaHabitacion;
    }

    public Map<String, Integer> Total() {
        Map<String, Integer> recuento = new HashMap<>();
        String instruccionSql = "SELECT COUNT(*) AS total_registros, "
                + "SUM(CASE WHEN estado = 'Activo' THEN 1 ELSE 0 END) AS total_activos, "
                + "SUM(CASE WHEN estado = 'Inactivo' THEN 1 ELSE 0 END) AS total_inactivos, "
                + "SUM(CASE WHEN estado = 'Mantenimiento' THEN 1 ELSE 0 END) AS total_mantenimiento "
                + "FROM habitacion";

        try {
            cn = con.getConexion();
            pst = cn.prepareStatement(instruccionSql);
            rs = pst.executeQuery();
            if (rs.next()) {
                recuento.put("Activo", rs.getInt("total_activos"));
                recuento.put("Inactivo", rs.getInt("total_inactivos"));
                recuento.put("Mantenimiento", rs.getInt("total_mantenimiento"));
            }
        } catch (SQLException e) {
            System.out.println("Error clase: HabitacionDao");
            System.err.println("No se pudo consultar el valor de cada estado.\n" + e);
        }finally{
            try {
                pst.close();
                cn.close();
            } catch (SQLException e) {
                System.err.println("Error al cerra conexion con la base de datos.");
            }
        }
        return recuento;
    }
    
    public int consultarHabitacion(int id){
        String instruccionSQl = "SELECT noHabitacion FROM habitacion WHERE id_huesped =?";
        int habitacion = 0;
        try {
            cn = con .getConexion();
            pst = cn.prepareStatement(instruccionSQl);
            pst.setInt(1, id);
            rs = pst.executeQuery();
            if(rs.next()){
                habitacion = rs.getInt("noHabitacion");
            }
        } catch (SQLException e) {
            System.out.println("Error clase HabitacionDao -> Consultar número de habitacion.");
            System.err.println("Error al consultar numero de habitacion.\n" + e);
        }finally{
            try {
                pst.close();
                cn.close();
            } catch (SQLException e) {
                System.err.println("Error al cerrar la conexion con la base de datos.");
            }
        }
        return habitacion;
    }
    
    public boolean modificarEstadoHabitacion(String estado, int id) {
        String intruccionSQL= "UPDATE habitacion SET estado = ?, noReservacion = 0 WHERE id = ?";
        try {
            cn = con.getConexion();
            pst = cn.prepareStatement(intruccionSQL);
            pst.setString(1, estado);
            pst.setInt(2, id);
            pst.execute();
            
            return true;
        } catch (SQLException e) {
            System.out.println("Error clase: HabitacionDAo -> ModificarEstadoHabitacion");
            System.err.println("Error al modificar estado de la habitacion\n" + e);
            return false;
        } finally{
            try {
                pst.close();
                cn.close();
            } catch (SQLException e) {
                System.err.println("Error al cerrar la conexion con la base de datos.");
            }
        }
    }
    
    public boolean  ActualizarInfoHabitacion(Habitacion hab){
        String instruccionSQL = "UPDATE habitacion SET inicio = ?, fin = ?, costo = ? WHERE noHabitacion = ?";
        try {
            cn = con.getConexion();
            pst = cn.prepareStatement(instruccionSQL);
            pst.setDate(1, new java.sql.Date(hab.getInicio().getTime()));
            pst.setDate(2, new java.sql.Date(hab.getFin().getTime()));
            pst.setDouble(3, hab.getCosto());
            pst.setInt(4, hab.getId());
            pst.execute();
            return true;
        } catch (SQLException e) {
            System.out.println("Erro clase HabitacionDao ->ActualizarInfoHabitacion.");
            System.err.println("Error al modifcar informacion del huesped.\n"+ e);
            return false;
        } finally{
            try {
                pst.close();
                cn.close();
            } catch (SQLException e) {
                System.err.println("Error al cerra conexion con la base datos.");
            }
        }
    }
   
}
