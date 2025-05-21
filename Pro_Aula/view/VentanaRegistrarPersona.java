package view;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import controller.ControladorLogin;
import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class VentanaRegistrarPersona extends javax.swing.JFrame {

    controller.ControladorLogin con = new ControladorLogin();
    Connection cn = con.conector();
    ventanaLogin1 ventana;

    private void LimpiarCampos() {

        txtDocumento.setText("");
        txtNombreUser.setText("");
        txtContraseña.setText("");
        txtEmail.setText("");
        txtapellido.setText("");
        Check.setSelected(false);
        btnRegistrar.setEnabled(false);
        txtDocumento.requestFocus();// Poner foco en el primer campo
        Roles.setSelectedIndex(0);// Volver a "Seleccionar"
    }

    public VentanaRegistrarPersona(ventanaLogin1 ventana) {
        initComponents();
        setPlaceholder(txtDocumento, "Ingrese su Telefono");
        setPlaceholder(txtNombreUser, "Ingrese su nombre");
        setPlaceholder(txtEmail, "Ingrese su correo");
        setPlaceholder(txtapellido, "Ingrese su apellido");
        setPlaceholder(txtContraseña, "Ingrese su contraseña");
        
        setLocationRelativeTo(this);
        this.ventana = ventana;
        txtDocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                char c = evt.getKeyChar();
                if (!Character.isDigit(c)) {
                    evt.consume(); // ignora la tecla si no es un número
                }
            }
        });

    }
    private void setPlaceholder(JTextField field, String placeholder) {
    field.setForeground(Color.GRAY);
    field.setText(placeholder);
    field.addFocusListener(new FocusAdapter() {
        @Override
        public void focusGained(FocusEvent e) {
            if (field.getText().equals(placeholder)) {
                field.setText("");
                field.setForeground(Color.BLACK);
            }
        }
        @Override
        public void focusLost(FocusEvent e) {
            if (field.getText().isEmpty()) {
                field.setForeground(Color.GRAY);
                field.setText(placeholder);
            }
        }
    });
    }
    private void Ingresar() {

        String tipodeUser = Roles.getSelectedItem().toString();
        String documento = txtDocumento.getText().trim();
        String nombreUser = txtNombreUser.getText().trim();
        String contraseña = txtContraseña.getText().trim();
        String apellido = txtapellido.getText().trim();
        String email = txtEmail.getText().trim();
        if (txtDocumento.getText().isEmpty() || txtNombreUser.getText().isEmpty() || txtContraseña.getText().isEmpty() || txtEmail.getText().isEmpty() || txtapellido.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "TODOS LOS CAMPOS SON OBLIGATORIOS.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (tipodeUser.equalsIgnoreCase("Seleccionar")) {

            JOptionPane.showMessageDialog(null, "DEBE SELECCIONAR UN USUARIO.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;

        }

        if (!Check.isSelected()) {
            JOptionPane.showMessageDialog(this, "DEBE ACEPTAR LOS TERMINOS Y LAS CONDICIONES.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
            JOptionPane.showMessageDialog(this, "CORREO ELECTRONICO INVALIDO.\n !EL CORREO DEBE CONTENER ESTOS CARACTERES MINIMOS @  Y .com !", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(!documento.matches("^[0-9]{7,10}$")){
            JOptionPane.showMessageDialog(this, "EL NUMERO DE TELEFONO DEBE CONTENER SOLO NUMEROS Y QUE SEAN MINIMO 10   ");
            return;
        }
        try {
            String consulta = "INSERT INTO `login`(nombre, apellido, emai, contraseña, rol) VALUES ('" + nombreUser + "','" + apellido + "','" + email + "','" + contraseña + "','" + tipodeUser + "')";
            PreparedStatement ps = (PreparedStatement) cn.prepareStatement(consulta);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "DATOS GUARDADOS CORRECTAMENTE .");
            txtNombreUser.getText();
            
            LimpiarCampos();
            
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "NO SE PUDO GUARDAR USUARIO ." + e);
            txtNombreUser.setText("");
        }


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        txtDocumento = new javax.swing.JTextField();
        txtNombreUser = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JTextField();
        btnVolver = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        Check = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        Roles = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        txtapellido = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 510));

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 510));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 510));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Telefono ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, 60, 20));

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre de Usuario ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 130, 20));

        jLabel4.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contraseña ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 80, 20));

        btnRegistrar.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, 200, 30));

        txtDocumento.setBackground(new java.awt.Color(102, 153, 255));
        txtDocumento.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        txtDocumento.setBorder(null);
        txtDocumento.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtDocumento.setVerifyInputWhenFocusTarget(false);
        txtDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocumentoActionPerformed(evt);
            }
        });
        jPanel1.add(txtDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 200, 20));

        txtNombreUser.setBackground(new java.awt.Color(102, 153, 255));
        txtNombreUser.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        txtNombreUser.setBorder(null);
        txtNombreUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreUserActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombreUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 200, 20));

        txtContraseña.setBackground(new java.awt.Color(102, 153, 255));
        txtContraseña.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        txtContraseña.setBorder(null);
        txtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseñaActionPerformed(evt);
            }
        });
        jPanel1.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, 200, 20));

        btnVolver.setBackground(new java.awt.Color(102, 153, 255));
        btnVolver.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Arrow_left_long.png"))); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255)));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Create new account ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, -10, 390, 60));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Email");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 40, 20));

        txtEmail.setBackground(new java.awt.Color(102, 153, 255));
        txtEmail.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        txtEmail.setBorder(null);
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, 200, 20));

        Check.setBackground(new java.awt.Color(102, 153, 255));
        Check.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        Check.setForeground(new java.awt.Color(255, 255, 255));
        Check.setText("Acepto todos los ");
        Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckActionPerformed(evt);
            }
        });
        jPanel1.add(Check, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, 130, 30));

        jButton1.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        jButton1.setText("Terminos");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 410, 90, 30));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 200, 10));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 200, 10));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, 200, 10));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, 200, 20));

        Roles.setBackground(new java.awt.Color(102, 153, 255));
        Roles.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        Roles.setForeground(new java.awt.Color(255, 255, 255));
        Roles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "user", "admin", " " }));
        jPanel1.add(Roles, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, 200, -1));

        jLabel12.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Apellido");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 100, -1));

        txtapellido.setBackground(new java.awt.Color(102, 153, 255));
        txtapellido.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        txtapellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255)));
        txtapellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapellidoActionPerformed(evt);
            }
        });
        jPanel1.add(txtapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 200, 20));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, 200, 20));

        jLabel11.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Rol");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, 70, -1));

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("AeroNex");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 90, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Saly-13.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 350, 500));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Frame 2257.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 360, 420));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Signal, Wifi, Battery.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, 80, 20));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
   
        Ingresar();

    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed

        ventana.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnVolverActionPerformed

    private void CheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckActionPerformed
        // TODO add your handling code here:
        if (Check.isSelected()) {
            btnRegistrar.setEnabled(true);  // Habilitar el botón si está seleccionado
        } else {
            btnRegistrar.setEnabled(false);  // Deshabilitar el botón si no está seleccionado
        }


    }//GEN-LAST:event_CheckActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        VentanaTerminos terminos = new VentanaTerminos();
        terminos.setVisible(true);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtNombreUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreUserActionPerformed
        txtContraseña.requestFocus(); // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreUserActionPerformed

    private void txtDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocumentoActionPerformed
        txtNombreUser.requestFocus(); // TODO add your handling code here:
    }//GEN-LAST:event_txtDocumentoActionPerformed

    private void txtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñaActionPerformed
        txtEmail.requestFocus();       // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseñaActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        Check.requestFocus();// TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapellidoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Check;
    private javax.swing.JComboBox<String> Roles;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombreUser;
    private javax.swing.JTextField txtapellido;
    // End of variables declaration//GEN-END:variables

}
