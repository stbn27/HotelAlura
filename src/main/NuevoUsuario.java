/*
 * Fecha de creacion: 07/04/2023 22:22:58
 * Version: v.0.1
 * Detalles: 
 */
package main;

import java.awt.Color;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import models.UsuariosDao;

/**
 *
 * @author Willy Stbn
 */
public class NuevoUsuario extends javax.swing.JFrame {

    public NuevoUsuario() {
        initComponents();

        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Registrar Nuevo Usuario");
        
        txt_registradoporNU.setText(Login.nombreUser);
        
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_banner = new javax.swing.JLabel();
        panel_1 = new javax.swing.JPanel();
        label_ico = new javax.swing.JLabel();
        label_NombreNU = new javax.swing.JLabel();
        label_UsuarioNU = new javax.swing.JLabel();
        label_PassNU = new javax.swing.JLabel();
        label_RegistradoNU = new javax.swing.JLabel();
        label_RolNU = new javax.swing.JLabel();
        txt_usuarioNU = new javax.swing.JTextField();
        txt_registradoporNU = new javax.swing.JTextField();
        txt_nombreNU = new javax.swing.JTextField();
        cmb_rolNU = new javax.swing.JComboBox<>();
        txt_passNU = new javax.swing.JPasswordField();
        btn_RegistrarUsuarioNU = new javax.swing.JButton();
        label_telefonoNU = new javax.swing.JLabel();
        txt_telefonoNU = new javax.swing.JTextField();
        label_CorreoNU = new javax.swing.JLabel();
        txt_CorreoNU = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registrar Usuario");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_banner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Baner_NU.png"))); // NOI18N
        getContentPane().add(label_banner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 110));

        panel_1.setBackground(new java.awt.Color(204, 255, 204));

        label_ico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ico_user.png"))); // NOI18N

        label_NombreNU.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 14)); // NOI18N
        label_NombreNU.setForeground(new java.awt.Color(0, 0, 0));
        label_NombreNU.setText("Nombre: ");

        label_UsuarioNU.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 14)); // NOI18N
        label_UsuarioNU.setForeground(new java.awt.Color(0, 0, 0));
        label_UsuarioNU.setText("Usuario:");

        label_PassNU.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 14)); // NOI18N
        label_PassNU.setForeground(new java.awt.Color(0, 0, 0));
        label_PassNU.setText("Contraseña:");

        label_RegistradoNU.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 14)); // NOI18N
        label_RegistradoNU.setForeground(new java.awt.Color(0, 0, 0));
        label_RegistradoNU.setText("Registrado por:");

        label_RolNU.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 14)); // NOI18N
        label_RolNU.setForeground(new java.awt.Color(0, 0, 0));
        label_RolNU.setText("Rol:");

        txt_usuarioNU.setBackground(new java.awt.Color(217, 217, 217));
        txt_usuarioNU.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        txt_usuarioNU.setForeground(new java.awt.Color(153, 51, 0));
        txt_usuarioNU.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt_registradoporNU.setEditable(false);
        txt_registradoporNU.setBackground(new java.awt.Color(217, 217, 217));
        txt_registradoporNU.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        txt_registradoporNU.setForeground(new java.awt.Color(153, 51, 0));
        txt_registradoporNU.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt_nombreNU.setBackground(new java.awt.Color(217, 217, 217));
        txt_nombreNU.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        txt_nombreNU.setForeground(new java.awt.Color(153, 51, 0));
        txt_nombreNU.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cmb_rolNU.setBackground(new java.awt.Color(217, 217, 217));
        cmb_rolNU.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 14)); // NOI18N
        cmb_rolNU.setForeground(new java.awt.Color(0, 0, 0));
        cmb_rolNU.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Trabajador" }));

        txt_passNU.setBackground(new java.awt.Color(217, 217, 217));
        txt_passNU.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txt_passNU.setForeground(new java.awt.Color(102, 51, 0));
        txt_passNU.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btn_RegistrarUsuarioNU.setBackground(new java.awt.Color(153, 204, 0));
        btn_RegistrarUsuarioNU.setFont(new java.awt.Font("MS UI Gothic", 1, 14)); // NOI18N
        btn_RegistrarUsuarioNU.setForeground(new java.awt.Color(0, 0, 0));
        btn_RegistrarUsuarioNU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_newUser.png"))); // NOI18N
        btn_RegistrarUsuarioNU.setText("Registrar Usuario");
        btn_RegistrarUsuarioNU.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(204, 102, 0)));
        btn_RegistrarUsuarioNU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistrarUsuarioNUActionPerformed(evt);
            }
        });

        label_telefonoNU.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 14)); // NOI18N
        label_telefonoNU.setForeground(new java.awt.Color(0, 0, 0));
        label_telefonoNU.setText("Telefono:");

        txt_telefonoNU.setBackground(new java.awt.Color(217, 217, 217));
        txt_telefonoNU.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        txt_telefonoNU.setForeground(new java.awt.Color(153, 51, 0));
        txt_telefonoNU.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        label_CorreoNU.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 14)); // NOI18N
        label_CorreoNU.setForeground(new java.awt.Color(0, 0, 0));
        label_CorreoNU.setText("Correo:");

        txt_CorreoNU.setBackground(new java.awt.Color(217, 217, 217));
        txt_CorreoNU.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        txt_CorreoNU.setForeground(new java.awt.Color(153, 51, 0));
        txt_CorreoNU.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout panel_1Layout = new javax.swing.GroupLayout(panel_1);
        panel_1.setLayout(panel_1Layout);
        panel_1Layout.setHorizontalGroup(
            panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(label_RegistradoNU, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_rolNU, 0, 192, Short.MAX_VALUE)
                            .addComponent(txt_registradoporNU))
                        .addComponent(label_RolNU, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(label_PassNU, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(label_UsuarioNU, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_usuarioNU, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                        .addComponent(txt_nombreNU)
                        .addComponent(txt_passNU))
                    .addComponent(label_NombreNU, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_1Layout.createSequentialGroup()
                        .addComponent(btn_RegistrarUsuarioNU, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_1Layout.createSequentialGroup()
                        .addComponent(label_ico, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_1Layout.createSequentialGroup()
                        .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_telefonoNU, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_telefonoNU, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61))
                    .addGroup(panel_1Layout.createSequentialGroup()
                        .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_CorreoNU, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_CorreoNU, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        panel_1Layout.setVerticalGroup(
            panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_1Layout.createSequentialGroup()
                .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_1Layout.createSequentialGroup()
                        .addContainerGap(30, Short.MAX_VALUE)
                        .addComponent(label_telefonoNU)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_telefonoNU, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label_NombreNU)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_nombreNU, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_1Layout.createSequentialGroup()
                        .addComponent(label_UsuarioNU)
                        .addGap(3, 3, 3)
                        .addComponent(txt_usuarioNU, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(label_PassNU)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_passNU, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label_RolNU)
                        .addGap(5, 5, 5)
                        .addComponent(cmb_rolNU, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(label_RegistradoNU)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_registradoporNU, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_1Layout.createSequentialGroup()
                        .addComponent(label_CorreoNU)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_CorreoNU, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label_ico, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_RegistrarUsuarioNU, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );

        getContentPane().add(panel_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 600, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_RegistrarUsuarioNUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarUsuarioNUActionPerformed

        VerificacionCampos();
        Map<Integer, String> envio = new HashMap<>();
        envio = Verificacion();

        if (envio.isEmpty()) {
            JOptionPane.showMessageDialog(null, "¡Rellene todos los campos!.");
        } else {
            //envio.forEach((k, p) -> System.out.println(k + " " + p));
            UsuariosDao guardar = new UsuariosDao();
            boolean estado = guardar.AgregarUsuario(envio);
            if(estado){
                txt_nombreNU.setBackground(Color.GREEN);
                txt_CorreoNU.setBackground(Color.GREEN);
                txt_passNU.setBackground(Color.GREEN);
                txt_registradoporNU.setBackground(Color.GREEN);
                txt_telefonoNU.setBackground(Color.GREEN);
                txt_usuarioNU.setBackground(Color.GREEN);
                cmb_rolNU.setBackground(Color.green);
                LimpiarCampos();
                JOptionPane.showMessageDialog(null, "¡¡Usuario registrado exitosamente!!");
                dispose();
            }
        }
    }//GEN-LAST:event_btn_RegistrarUsuarioNUActionPerformed

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
            java.util.logging.Logger.getLogger(NuevoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevoUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_RegistrarUsuarioNU;
    private javax.swing.JComboBox<String> cmb_rolNU;
    private javax.swing.JLabel label_CorreoNU;
    private javax.swing.JLabel label_NombreNU;
    private javax.swing.JLabel label_PassNU;
    private javax.swing.JLabel label_RegistradoNU;
    private javax.swing.JLabel label_RolNU;
    private javax.swing.JLabel label_UsuarioNU;
    private javax.swing.JLabel label_banner;
    private javax.swing.JLabel label_ico;
    private javax.swing.JLabel label_telefonoNU;
    private javax.swing.JPanel panel_1;
    private javax.swing.JTextField txt_CorreoNU;
    private javax.swing.JTextField txt_nombreNU;
    private javax.swing.JPasswordField txt_passNU;
    private javax.swing.JTextField txt_registradoporNU;
    private javax.swing.JTextField txt_telefonoNU;
    private javax.swing.JTextField txt_usuarioNU;
    // End of variables declaration//GEN-END:variables

    private Map<Integer, String> Verificacion() {
        String nombre = txt_nombreNU.getText().trim();
        String user = txt_usuarioNU.getText().trim();
        String pass = txt_passNU.getText().trim();
        String rol = cmb_rolNU.getSelectedItem().toString();
        String correo = txt_CorreoNU.getText().trim();

        Map<Integer, String> datos = new HashMap<>();

        if (VerificacionCampos()) {

            BigInteger telefono = new BigInteger(txt_telefonoNU.getText().trim());

            datos.put(1, nombre);
            datos.put(2, correo);
            datos.put(3, telefono.toString());
            datos.put(4, user);
            datos.put(5, pass);
            datos.put(6, rol);
            if (Login.nombreUser.equals("")) {
                datos.put(7, "Sistema");
            } else {
                datos.put(7, Login.nombreUser);
            }

        }
        return datos;
    }

    private boolean VerificacionCampos() {
        String nombre = txt_nombreNU.getText().trim();
        String user = txt_usuarioNU.getText().trim();
        String pass = txt_passNU.getText().trim();
        String telefono = txt_telefonoNU.getText().trim();
        String correo = txt_CorreoNU.getText().trim();

        int check = 0;

        //Verificacion de campos vacios
        if (nombre.equals("")) {
            label_NombreNU.setForeground(Color.red);
            check++;
        } else {
            label_NombreNU.setForeground(Color.green);
        }
        if (user.equals("")) {
            label_UsuarioNU.setForeground(Color.red);
            check++;
        } else {
            label_UsuarioNU.setForeground(Color.green);
        }
        if (pass.equals("")) {
            label_PassNU.setForeground(Color.red);
            check++;
        } else {
            label_PassNU.setForeground(Color.green);
        }
        if (correo.equals("")) {
            label_CorreoNU.setForeground(Color.red);
            check++;
        } else {
            label_CorreoNU.setForeground(Color.green);
        }
        if (telefono.equals("")) {
            label_telefonoNU.setForeground(Color.red);
            check++;
        } else {
            label_telefonoNU.setForeground(Color.green);
        }

        return check == 0;
    }
    
    private void LimpiarCampos(){
        txt_CorreoNU.setText("");
        txt_nombreNU.setText("");
        txt_passNU.setText("");
        txt_registradoporNU.setText("");
        txt_telefonoNU.setText("");
        txt_usuarioNU.setText("");
        cmb_rolNU.setSelectedIndex(0);
    }
}
