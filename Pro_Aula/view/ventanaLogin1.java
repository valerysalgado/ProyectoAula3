package view;

import Model.Pasajero;
import controller.ControladorLogin;
import javax.swing.JOptionPane;

public class ventanaLogin1 extends javax.swing.JFrame {

    ControladorLogin controlador;

    public ventanaLogin1() {
        initComponents();
        setLocationRelativeTo(this);
        this.controlador = new ControladorLogin();
        getRootPane().setDefaultButton(jButton1);

    }

    public ControladorLogin getControlador() {
        return controlador;
    }

    private void realizarLogin() {
        String user = txtUser.getText().trim();
        String contra = new String(txtPassword.getPassword());

        if (user.isEmpty() || contra.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe completar todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (contra.length() < 3) {
            JOptionPane.showMessageDialog(this, "La contraseña debe tener al menos 3 caracteres.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Pasajero aux = controlador.buscarPersona(user);

        if (aux != null) {
            if (aux.getContraseña().equals(contra)) {
                ventanaDatosRegistros ventana = new ventanaDatosRegistros(this, aux);
                ventana.setVisible(true);
                this.dispose();
                txtUser.setText("");
                txtPassword.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "La contraseña es incorrecta.");
                txtPassword.setText("");
            }
        } else {
            JOptionPane.showMessageDialog(this, "La persona no se encuentra registrada. " + " \n !Crea una Cuenta!");
            txtPassword.setText("");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtUser = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ROL = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jLabel2.setText("Password");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 60, -1));

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jLabel1.setText("User");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 40, -1));

        txtPassword.setBorder(null);
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        jPanel2.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 220, 30));

        jButton1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jButton1.setText("Enter");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 220, 30));

        jButton2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jButton2.setText("SingUp");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, 90, 30));

        txtUser.setBorder(null);
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        jPanel2.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 220, 30));

        jLabel3.setText("Need an acoount?");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, -1, -1));

        ROL.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        ROL.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuario", "Administrador" }));
        jPanel2.add(ROL, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 220, -1));

        jLabel4.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jLabel4.setText("Rol");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 40, 20));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 220, -1));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 220, 0));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 220, 10));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Chield_alt_fill.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 70, 50));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carga 100 x 100.gif"))); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 110, 110));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Group2.png"))); // NOI18N
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 180, 170));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Polygon 1.png"))); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 410));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/User_fill.png"))); // NOI18N
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 40, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LOGIN.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 210, 100));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Signal, Wifi, Battery.png"))); // NOI18N
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 80, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 350, 430));

        jLabel5.setFont(new java.awt.Font("Nirmala UI", 1, 70)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("AeroNex");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 290, 120));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Group.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 370, 270));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Groupf.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 550, 270));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Group2.png"))); // NOI18N
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 160, 150));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 802, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        VentanaRegistrarPersona ventana = new VentanaRegistrarPersona(this);
        ventana.setVisible(true);
        this.dispose();
        txtUser.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        realizarLogin();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        txtPassword.requestFocus(); // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        realizarLogin();// TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaLogin1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ROL;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables

}
