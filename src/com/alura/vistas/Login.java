/*
 * Fecha de creacion: 07/04/2023 09:22:19
 * Version: v.0.1
 * Detalles: 
 */
package com.alura.vistas;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.SQLException;
import com.alura.models.Usuarios;
import com.alura.models.UsuariosDao;

/**
 * @author Willy Stbn
 */
public class Login extends javax.swing.JFrame {

    Usuarios is = new Usuarios();
    UsuariosDao isDao = new UsuariosDao();

    public static String nombreUser = "";
    public static String rol = "";

    public Login() {
        initComponents();

        this.setSize(800, 550);
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        label_datosIncorrectos.setVisible(false);
        label_Camposvacios.setVisible(false);

    }
    
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/ico.png"));
        return retValue;
    }

    private void validar() {

        String user = txt_user.getText().trim();
        String pass = txt_pass.getText().trim();
        int check = 0;

        //Verificacion de campos
        if (user.equals("")) {
            label_usuario.setForeground(Color.red);
            label_Camposvacios.setVisible(true);
            check++;
        } else {
            label_usuario.setForeground(Color.GREEN);
        }
        if (pass.equals("")) {
            label_pass.setForeground(Color.red);
            label_Camposvacios.setVisible(true);
            check++;
        } else {
            label_pass.setForeground(Color.GREEN);
        }
        if (check == 0) {
            try {
                is = isDao.login(user, pass);
                if (is.getUsuario() != null || is.getPass() != null) {
                    nombreUser = is.getNombre();
                    rol = is.getRol();
                    DashBord sis = new DashBord();
                    sis.setVisible(true);
                    System.out.println("Ventana principal Abierta.");
                    dispose();
                } else {
                    label_datosIncorrectos.setVisible(true);
                    txt_pass.setText("");
                    txt_user.setText("");
                    label_Camposvacios.setVisible(false);
                }
            } catch (SQLException ex) {
                System.err.println("Error al enviar datos de verificacion.\n" + ex);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        label_usuario = new javax.swing.JLabel();
        label_pass = new javax.swing.JLabel();
        label_Camposvacios = new javax.swing.JLabel();
        label_datosIncorrectos = new javax.swing.JLabel();
        txt_user = new javax.swing.JTextField();
        txt_pass = new javax.swing.JPasswordField();
        btn_inicioSesion = new javax.swing.JButton();
        label_fondoE = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("INICIO");
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 255, 0));
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/label_Wallpaper.png"))); // NOI18N
        jLabel1.setText("Demo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 516, 550));

        jPanel1.setBackground(new java.awt.Color(0, 255, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_usuario.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        label_usuario.setForeground(new java.awt.Color(204, 204, 204));
        label_usuario.setText("Usuario:");
        jPanel2.add(label_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 80, -1));

        label_pass.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        label_pass.setForeground(new java.awt.Color(204, 204, 204));
        label_pass.setText("Contraseña:");
        jPanel2.add(label_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        label_Camposvacios.setForeground(new java.awt.Color(255, 51, 0));
        label_Camposvacios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/danger 1.png"))); // NOI18N
        label_Camposvacios.setText("¡Rellene todos los campos!");
        jPanel2.add(label_Camposvacios, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 210, 20));

        label_datosIncorrectos.setForeground(new java.awt.Color(255, 51, 0));
        label_datosIncorrectos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/error.png"))); // NOI18N
        label_datosIncorrectos.setText("¡Datos de acceso incorrectos!");
        jPanel2.add(label_datosIncorrectos, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 210, -1));

        txt_user.setBackground(new java.awt.Color(5, 25, 51));
        txt_user.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        txt_user.setForeground(new java.awt.Color(255, 255, 255));
        txt_user.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_user.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        txt_user.setMargin(new java.awt.Insets(2, 20, 2, 6));
        txt_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_userMouseClicked(evt);
            }
        });
        jPanel2.add(txt_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 250, 30));

        txt_pass.setBackground(new java.awt.Color(5, 25, 51));
        txt_pass.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        txt_pass.setForeground(new java.awt.Color(255, 255, 255));
        txt_pass.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_pass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        txt_pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_passMouseClicked(evt);
            }
        });
        jPanel2.add(txt_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 250, 30));

        btn_inicioSesion.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btn_inicioSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ico_login.png"))); // NOI18N
        btn_inicioSesion.setText("Iniciar sesion");
        btn_inicioSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inicioSesionActionPerformed(evt);
            }
        });
        jPanel2.add(btn_inicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 180, 40));

        label_fondoE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/panel_Info.png"))); // NOI18N
        jPanel2.add(label_fondoE, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 550));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 285, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_inicioSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inicioSesionActionPerformed
        validar();
    }//GEN-LAST:event_btn_inicioSesionActionPerformed

    private void txt_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_userMouseClicked
        label_Camposvacios.setVisible(false);
        label_datosIncorrectos.setVisible(false);
    }//GEN-LAST:event_txt_userMouseClicked

    private void txt_passMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_passMouseClicked
        label_Camposvacios.setVisible(false);
        label_datosIncorrectos.setVisible(false);
    }//GEN-LAST:event_txt_passMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        }

        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_inicioSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel label_Camposvacios;
    private javax.swing.JLabel label_datosIncorrectos;
    private javax.swing.JLabel label_fondoE;
    private javax.swing.JLabel label_pass;
    private javax.swing.JLabel label_usuario;
    private javax.swing.JPasswordField txt_pass;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables
}
