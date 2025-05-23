
package view;

import javax.swing.JOptionPane;

import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class VentanaTikect extends javax.swing.JFrame {

 private String nombre;  // Agrega este campo

    public VentanaTikect(String nombreUsuario) {
        this.nombre = nombreUsuario;
        initComponents();
         setLocationRelativeTo(this);
    }

  private void generarFactura(String tipoPlan) {
      // Detalles específicos de cada plan
    String detallesPlan = "";
    if(tipoPlan.equals("Normal Class")) {
        detallesPlan = "<ul style='list-style-type: none; padding-left: 0;'>"
                + "<li>+1 Artículo Personal (bolso)</li>"
                + "<li>+ Equipaje de mano</li>"
                + "<li style='color: red;'>X Equipaje de bodega</li>"
                + "<li style='color: red;'>X Selección de asiento</li>"
                + "<li style='color: red;'>X Check-in en aeropuerto</li>"
                + "<li style='color: red;'>X Rembolso</li>"
                + "</ul>";
    } else { // Mid Class
        detallesPlan = "<ul style='list-style-type: none; padding-left: 0;'>"
                + "<li>+1 Artículo Personal (bolso)</li>"
                + "<li>+ Equipaje de mano</li>"
                + "<li>+ Equipaje de bodega</li>"
                + "<li>+ Asiento económico incluido</li>"
                + "<li>+ Check-in en aeropuerto</li>"
                + "<li style='color: red;'>X Rembolso</li>"
                + "</ul>";
    }

    // Crear el contenido de la factura
    String factura = "<html><body style='width: 300px; padding: 10px;'>"
            + "<h2 style='text-align: center; color: #0066cc;'>AeroNex - Factura</h2>"
            + "<hr>"
            + "<p><b>Tipo de plan:</b> " + tipoPlan + "</p>"
            + "<p><b>Fecha:</b> " + new SimpleDateFormat("dd/MM/yyyy").format(new Date()) + "</p>"
            + "<p><b>Número de factura:</b> " + (int)(Math.random() * 10000) + "</p>"
            + "<hr>"
            + "<h4>Detalles del plan:</h4>"
            + detallesPlan
            + "<hr>"
            + "<h3 style='text-align: right;'>Total: $" 
            + (tipoPlan.equals("Normal Class") ? "150.000" : "250.000") + "</h3>"
            + "<p style='text-align: center; font-style: italic;'>Gracias por su compra</p>"
            + "</body></html>";

    // Mostrar la factura en un JOptionPane
    JOptionPane.showMessageDialog(this, factura, "Factura Generada", 
            JOptionPane.INFORMATION_MESSAGE);
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnNormal = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnMid = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 510));

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255)));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 510));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255)));
        jPanel2.setPreferredSize(new java.awt.Dimension(140, 250));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNormal.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        btnNormal.setText("get plan");
        btnNormal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255)));
        btnNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNormalActionPerformed(evt);
            }
        });
        jPanel2.add(btnNormal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 310, 80));

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel1.setText("Normal Class");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 150, -1));

        jLabel4.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jLabel4.setText("+1 Articulo Personal (bolso)");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 260, -1));

        jLabel5.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jLabel5.setText("+ Equipaje de mano");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 220, -1));

        jLabel6.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jLabel6.setText("X Equipaje de bodega");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 200, 30));

        jLabel7.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jLabel7.setText("X Rembolso");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 120, 20));

        jLabel8.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jLabel8.setText("X Seleccion de asiento");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 200, 30));

        jLabel9.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jLabel9.setText("X Check-in en aeropuerto");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 230, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 310, 410));

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255)));
        jPanel3.setPreferredSize(new java.awt.Dimension(140, 250));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMid.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        btnMid.setText("get plan");
        btnMid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255)));
        btnMid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMidActionPerformed(evt);
            }
        });
        jPanel3.add(btnMid, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 280, 80));

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel2.setText("Mid Class");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 110, -1));

        jLabel10.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jLabel10.setText("+1 Articulo Personal (bolso)");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 240, -1));

        jLabel12.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jLabel12.setText("+ Equipaje de mano");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 200, -1));

        jLabel14.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jLabel14.setText("+ Equipaje de bodega");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 240, -1));

        jLabel16.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jLabel16.setText("X Rembolso");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 110, -1));

        jLabel18.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jLabel18.setText("+ Check-in en aeropuerto");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel19.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jLabel19.setText("+ Asiento economico incluido");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 240, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 280, 410));

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("AeroNex venvenido selecciona el plan de preferencia");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 470, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Groupf.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 440, 150));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Groupf.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 460, 160));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 812, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMidActionPerformed
       generarFactura("Mid Class");
       VentanaInicio inicio = new VentanaInicio(nombre);
       inicio.setVisible(true);
       this.dispose();
       
    }//GEN-LAST:event_btnMidActionPerformed

    private void btnNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNormalActionPerformed
        
        generarFactura("Normal Class");
        VentanaInicio inicio = new VentanaInicio(nombre);
       inicio.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnNormalActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaTikect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaTikect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaTikect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaTikect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaTikect("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMid;
    private javax.swing.JButton btnNormal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
