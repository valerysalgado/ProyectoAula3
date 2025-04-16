
package view;

import Model.Persona;
import controller.ControladorLogin;
import javax.swing.JOptionPane;
import view.ventanaLogin1;
import view.ventanaLogin1;

public class VentanaRegistrarPersona extends javax.swing.JFrame {
    
    
    ventanaLogin1 ventana ;
    private void LimpiarCampos() {
    txtNombre.setText("");
    txtDocumento.setText("");
    txtNombreUser.setText("");
    txtContraseña.setText("");
    txtEmail.setText("");
    Check.setSelected(false);
    btnRegistrar.setEnabled(false);
}
    

    public VentanaRegistrarPersona(ventanaLogin1 ventana ) {
        initComponents();
        setLocationRelativeTo(this);
        this.ventana = ventana;
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        txtDocumento = new javax.swing.JTextField();
        txtNombreUser = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JTextField();
        btnVolver = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        Check = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 60, 20));

        jLabel2.setText("Telefono ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 80, 20));

        jLabel3.setText("Nombre de Usuario ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 130, 20));

        jLabel4.setText("Contraseña ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 80, 20));

        btnRegistrar.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 100, -1));

        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 190, -1));

        txtDocumento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtDocumento.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(txtDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 190, -1));

        txtNombreUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtNombreUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 190, -1));

        txtContraseña.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 190, -1));

        btnVolver.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel5.setText("Create new account ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 150, 30));

        jLabel6.setText("Email");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, -1, -1));

        txtEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 190, -1));

        Check.setText("Acepto todos los ");
        Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckActionPerformed(evt);
            }
        });
        jPanel1.add(Check, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 130, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("Terminos");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, 100, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        // TODO add your handling code here:
       
        if (txtNombre.getText().isEmpty() || txtDocumento.getText().isEmpty() || txtNombreUser.getText().isEmpty() || txtContraseña.getText().isEmpty()|| txtEmail.getText().isEmpty()) {
    
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
             return;
}
        
       if (!Check.isSelected()) {
        JOptionPane.showMessageDialog(this, "Debe aceptar los términos y condiciones.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    String email = txtEmail.getText().trim();
    if (!email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
        JOptionPane.showMessageDialog(this, "Correo electrónico inválido.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    String nombre = txtNombre.getText().trim();
        String documento = txtDocumento.getText().trim();
        String nombreUser = txtNombreUser.getText().trim();
        String contraseña = txtContraseña.getText().trim();
        
        
        Persona persona = new Persona(nombre,documento,nombreUser,contraseña,email);
        boolean respuesta = ventana.getControlador().agregarPersona(persona);
    
        if (respuesta) {
            
            JOptionPane.showMessageDialog(null, "se agrego la persona ");
            LimpiarCampos();
        }else{
            
            JOptionPane.showMessageDialog(this, "Ese nombre de usuario ya se encuentra registrado."
                     , "intentelo Nuevamente ", JOptionPane.ERROR_MESSAGE);
            
                txtNombreUser.setText("");
        }
      
        
                
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
       
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Check;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreUser;
    // End of variables declaration//GEN-END:variables

}