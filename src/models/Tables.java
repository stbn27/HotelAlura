/*
 * Fecha de creacion: 11/04/2023 22:13:10
 * Version: v.0.1
 * Detalles: Comportamientos de las tablas
 */
package models;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 * @author Willy Stbn
 */
public class Tables extends DefaultTableCellRenderer {

//    @Override
//    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
//        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); 
//        if(table.getValueAt(row, column).toString().equals("Activo")){
//            setBackground(Color.red);
//            setForeground(Color.WHITE);
//        } 
//        
//        if(table.getValueAt(row, column).toString().equals("Mantenimiento")){
//            setBackground(Color.BLUE);
//            setForeground(Color.WHITE);
//        }
//       if(table.getValueAt(row, column).toString().equals("Inactivo")) {
//            setBackground(Color.WHITE);
//            setForeground(Color.BLACK);
//        }
//        return this;
//    }
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        switch (table.getValueAt(row, column).toString()) {
            case "Activo" -> {
                setBackground(Color.red);
                setForeground(Color.WHITE);
            }
            case "Mantenimiento" -> {
                setBackground(Color.BLUE);
                setForeground(Color.WHITE);
            }
            case "Inactivo" -> {
                setBackground(Color.WHITE);
                setForeground(Color.BLACK);
            }
            default -> {
                setBackground(Color.WHITE);
                setForeground(Color.BLACK);
            }
        }


        return this;
    }

}
