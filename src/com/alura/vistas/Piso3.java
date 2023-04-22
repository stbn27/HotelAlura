/*
 * Fecha de creacion: 15/04/2023 23:02:02
 * Version: v.0.1
 * Detalles: 
 */
package com.alura.vistas;

import com.alura.controllers.Piso3Controller;
import java.awt.Color;
import com.alura.models.Habitacion;
import com.alura.models.HabitacionDao;

/**
 *
 * @author Willy Stbn
 */
public class Piso3 extends javax.swing.JPanel {

    Habitacion hab = new Habitacion();
    HabitacionDao habDao = new HabitacionDao();
    
    public Piso3() {
        initComponents();
        
        Piso3Controller hover = new Piso3Controller(this);
        
        this.setSize(600, 460);
        this.Color();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Habitacion101 = new javax.swing.JPanel();
        labe_101 = new javax.swing.JLabel();
        Habitacion102 = new javax.swing.JPanel();
        label_102 = new javax.swing.JLabel();
        Habitacion103 = new javax.swing.JPanel();
        label_103 = new javax.swing.JLabel();
        Habitacion104 = new javax.swing.JPanel();
        label_104 = new javax.swing.JLabel();
        Habitacion105 = new javax.swing.JPanel();
        label_105 = new javax.swing.JLabel();
        Habitacion106 = new javax.swing.JPanel();
        label_106 = new javax.swing.JLabel();
        Habitacion107 = new javax.swing.JPanel();
        label_107 = new javax.swing.JLabel();
        Habitacion108 = new javax.swing.JPanel();
        label_108 = new javax.swing.JLabel();
        Habitacion109 = new javax.swing.JPanel();
        label_109 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 153));

        Habitacion101.setBackground(new java.awt.Color(0, 153, 0));
        Habitacion101.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));

        labe_101.setFont(new java.awt.Font("Roboto Black", 0, 13)); // NOI18N
        labe_101.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labe_101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/recamara.png"))); // NOI18N
        labe_101.setText("HABITACION 301");
        labe_101.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labe_101.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout Habitacion101Layout = new javax.swing.GroupLayout(Habitacion101);
        Habitacion101.setLayout(Habitacion101Layout);
        Habitacion101Layout.setHorizontalGroup(
            Habitacion101Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labe_101, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Habitacion101Layout.setVerticalGroup(
            Habitacion101Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labe_101, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Habitacion102.setBackground(new java.awt.Color(0, 153, 0));
        Habitacion102.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));

        label_102.setFont(new java.awt.Font("Roboto Black", 0, 13)); // NOI18N
        label_102.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_102.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/recamara.png"))); // NOI18N
        label_102.setText("HABITACION 302");
        label_102.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label_102.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout Habitacion102Layout = new javax.swing.GroupLayout(Habitacion102);
        Habitacion102.setLayout(Habitacion102Layout);
        Habitacion102Layout.setHorizontalGroup(
            Habitacion102Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_102, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
        );
        Habitacion102Layout.setVerticalGroup(
            Habitacion102Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_102, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
        );

        Habitacion103.setBackground(new java.awt.Color(0, 153, 0));
        Habitacion103.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));

        label_103.setFont(new java.awt.Font("Roboto Black", 0, 13)); // NOI18N
        label_103.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_103.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/recamara.png"))); // NOI18N
        label_103.setText("HABITACION 303");
        label_103.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label_103.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout Habitacion103Layout = new javax.swing.GroupLayout(Habitacion103);
        Habitacion103.setLayout(Habitacion103Layout);
        Habitacion103Layout.setHorizontalGroup(
            Habitacion103Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_103, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
        );
        Habitacion103Layout.setVerticalGroup(
            Habitacion103Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_103, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
        );

        Habitacion104.setBackground(new java.awt.Color(0, 153, 0));
        Habitacion104.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));

        label_104.setFont(new java.awt.Font("Roboto Black", 0, 13)); // NOI18N
        label_104.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_104.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/recamara.png"))); // NOI18N
        label_104.setText("HABITACION 304");
        label_104.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label_104.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout Habitacion104Layout = new javax.swing.GroupLayout(Habitacion104);
        Habitacion104.setLayout(Habitacion104Layout);
        Habitacion104Layout.setHorizontalGroup(
            Habitacion104Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_104, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
        );
        Habitacion104Layout.setVerticalGroup(
            Habitacion104Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_104, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Habitacion105.setBackground(new java.awt.Color(102, 51, 0));
        Habitacion105.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));

        label_105.setFont(new java.awt.Font("Roboto Black", 0, 13)); // NOI18N
        label_105.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_105.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/recamara.png"))); // NOI18N
        label_105.setText("HABITACION 305");
        label_105.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label_105.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout Habitacion105Layout = new javax.swing.GroupLayout(Habitacion105);
        Habitacion105.setLayout(Habitacion105Layout);
        Habitacion105Layout.setHorizontalGroup(
            Habitacion105Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_105, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
        );
        Habitacion105Layout.setVerticalGroup(
            Habitacion105Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_105, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Habitacion106.setBackground(new java.awt.Color(0, 153, 0));
        Habitacion106.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));

        label_106.setFont(new java.awt.Font("Roboto Black", 0, 13)); // NOI18N
        label_106.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_106.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/recamara.png"))); // NOI18N
        label_106.setText("HABITACION 306");
        label_106.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label_106.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout Habitacion106Layout = new javax.swing.GroupLayout(Habitacion106);
        Habitacion106.setLayout(Habitacion106Layout);
        Habitacion106Layout.setHorizontalGroup(
            Habitacion106Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_106, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
        );
        Habitacion106Layout.setVerticalGroup(
            Habitacion106Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_106, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
        );

        Habitacion107.setBackground(new java.awt.Color(0, 153, 0));
        Habitacion107.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));

        label_107.setFont(new java.awt.Font("Roboto Black", 0, 13)); // NOI18N
        label_107.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_107.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/recamara.png"))); // NOI18N
        label_107.setText("HABITACION 307");
        label_107.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label_107.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout Habitacion107Layout = new javax.swing.GroupLayout(Habitacion107);
        Habitacion107.setLayout(Habitacion107Layout);
        Habitacion107Layout.setHorizontalGroup(
            Habitacion107Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_107, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
        );
        Habitacion107Layout.setVerticalGroup(
            Habitacion107Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_107, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
        );

        Habitacion108.setBackground(new java.awt.Color(0, 102, 102));
        Habitacion108.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));

        label_108.setFont(new java.awt.Font("Roboto Black", 0, 13)); // NOI18N
        label_108.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_108.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/recamara.png"))); // NOI18N
        label_108.setText("HABITACION 308");
        label_108.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label_108.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout Habitacion108Layout = new javax.swing.GroupLayout(Habitacion108);
        Habitacion108.setLayout(Habitacion108Layout);
        Habitacion108Layout.setHorizontalGroup(
            Habitacion108Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_108, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
        );
        Habitacion108Layout.setVerticalGroup(
            Habitacion108Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_108, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
        );

        Habitacion109.setBackground(new java.awt.Color(0, 153, 0));
        Habitacion109.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));

        label_109.setFont(new java.awt.Font("Roboto Black", 0, 13)); // NOI18N
        label_109.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_109.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/recamara.png"))); // NOI18N
        label_109.setText("HABITACION 309");
        label_109.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label_109.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout Habitacion109Layout = new javax.swing.GroupLayout(Habitacion109);
        Habitacion109.setLayout(Habitacion109Layout);
        Habitacion109Layout.setHorizontalGroup(
            Habitacion109Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_109, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
        );
        Habitacion109Layout.setVerticalGroup(
            Habitacion109Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_109, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Habitacion101, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Habitacion104, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Habitacion107, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Habitacion102, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Habitacion105, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Habitacion108, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Habitacion103, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Habitacion106, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Habitacion109, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Habitacion103, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Habitacion102, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Habitacion101, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Habitacion106, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Habitacion105, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Habitacion104, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Habitacion107, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(Habitacion108, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(Habitacion109, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(84, 84, 84))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel Habitacion101;
    public javax.swing.JPanel Habitacion102;
    public javax.swing.JPanel Habitacion103;
    public javax.swing.JPanel Habitacion104;
    public javax.swing.JPanel Habitacion105;
    public javax.swing.JPanel Habitacion106;
    public javax.swing.JPanel Habitacion107;
    public javax.swing.JPanel Habitacion108;
    public javax.swing.JPanel Habitacion109;
    public javax.swing.JLabel labe_101;
    public javax.swing.JLabel label_102;
    public javax.swing.JLabel label_103;
    public javax.swing.JLabel label_104;
    public javax.swing.JLabel label_105;
    public javax.swing.JLabel label_106;
    public javax.swing.JLabel label_107;
    public javax.swing.JLabel label_108;
    public javax.swing.JLabel label_109;
    // End of variables declaration//GEN-END:variables

    public void Color(){
        Color verdeOscuro = new Color(0,153,0);
        Color rojoOscuro = new Color(102,51,0);
        Color azulOscuro = new Color(0,102,102);
        
        hab = habDao.Color(301);
        switch (hab.getEstado()) {
            case "Activo" -> this.Habitacion101.setBackground(rojoOscuro);
            case "Inactivo" -> this.Habitacion101.setBackground(verdeOscuro);
            case "Mantenimiento" -> this.Habitacion101.setBackground(azulOscuro);
            default -> {
            }
        }
        
        hab = habDao.Color(302);
        switch (hab.getEstado()) {
            case "Activo" -> this.Habitacion102.setBackground(rojoOscuro);
            case "Inactivo" -> this.Habitacion102.setBackground(verdeOscuro);
            case "Mantenimiento" -> this.Habitacion102.setBackground(azulOscuro);
            default -> {
            }
        }
        
        hab = habDao.Color(303);
        switch (hab.getEstado()) {
            case "Activo" -> this.Habitacion103.setBackground(rojoOscuro);
            case "Inactivo" -> this.Habitacion103.setBackground(verdeOscuro);
            case "Mantenimiento" -> this.Habitacion103.setBackground(azulOscuro);
            default -> {
            }
        }
        
        hab = habDao.Color(304);
        switch (hab.getEstado()) {
            case "Activo" -> this.Habitacion104.setBackground(rojoOscuro);
            case "Inactivo" -> this.Habitacion104.setBackground(verdeOscuro);
            case "Mantenimiento" -> this.Habitacion104.setBackground(azulOscuro);
            default -> {
            }
        }
        
        hab = habDao.Color(305);
        switch (hab.getEstado()) {
            case "Activo" -> this.Habitacion105.setBackground(rojoOscuro);
            case "Inactivo" -> this.Habitacion105.setBackground(verdeOscuro);
            case "Mantenimiento" -> this.Habitacion105.setBackground(azulOscuro);
            default -> {
            }
        }
        
        hab = habDao.Color(306);
        switch (hab.getEstado()) {
            case "Activo" -> this.Habitacion106.setBackground(rojoOscuro);
            case "Inactivo" -> this.Habitacion106.setBackground(verdeOscuro);
            case "Mantenimiento" -> this.Habitacion106.setBackground(azulOscuro);
            default -> {
            }
        }
        
        hab = habDao.Color(307);
        switch (hab.getEstado()) {
            case "Activo" -> this.Habitacion107.setBackground(rojoOscuro);
            case "Inactivo" -> this.Habitacion107.setBackground(verdeOscuro);
            case "Mantenimiento" -> this.Habitacion107.setBackground(azulOscuro);
            default -> {
            }
        }
        hab = habDao.Color(308);
        switch (hab.getEstado()) {
            case "Activo" -> this.Habitacion108.setBackground(rojoOscuro);
            case "Inactivo" -> this.Habitacion108.setBackground(verdeOscuro);
            case "Mantenimiento" -> this.Habitacion108.setBackground(azulOscuro);
            default -> {
            }
        }
        
        hab = habDao.Color(309);
        switch (hab.getEstado()) {
            case "Activo" -> this.Habitacion109.setBackground(rojoOscuro);
            case "Inactivo" -> this.Habitacion109.setBackground(verdeOscuro);
            case "Mantenimiento" -> this.Habitacion109.setBackground(azulOscuro);
            default -> {
            }
        }
    }
}
