package Dominio.Entidades;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.Formatter;
import java.util.Properties;
import javax.swing.JOptionPane;


public class ventanaVuelo extends javax.swing.JFrame {

    String barra = File.separator;
    String Ubicacion = System.getProperty("user.dir") + barra + "registros" + barra;

    public ventanaVuelo() {
        initComponents();
    }
    
    private void crear(){
        String archivo = capnumerodevuelo.getText() + ".txt";
        File crearubi = new File(Ubicacion);
        File crearArchivo = new File(Ubicacion + archivo);
        

if (capnumerodevuelo.getText().isEmpty() || caporigen.getText().isEmpty() || capdestino.getText().isEmpty()
    || capfechasalida.getText().isEmpty() || capfechavuelta.getText().isEmpty() || caphora.getText().isEmpty()) {
    JOptionPane.showMessageDialog(rootPane, "Por favor complete todos los campos");
    return;
}
            try{
                if(crearArchivo.exists()){
                    JOptionPane.showMessageDialog(rootPane, "El vuelo ya se encuentra registrado");
}else{
                    
                    crearubi.mkdirs();
                    Formatter crearformater= new Formatter(Ubicacion + archivo);
                        crearformater.format("%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\n\n%s", "Vuelo" + capid.getText()
                                ,"N°" + capnumerodevuelo.getText()
                                ,"ID: " + capid.getText()
                                ,"Origen: " + caporigen.getText()
                                ,"Destino: " + capdestino.getText()
                                ,"Fecha Ida: " + capfechasalida.getText()
                                ,"Fecha Vuelta: " + capfechavuelta.getText()
                                ,"Hora: " + caphora.getText());
                        
                        crearformater.close();
                        JOptionPane.showMessageDialog(rootPane, "Vuelo registrado exitosamente");            
                }
              
            }catch (Exception e){
                JOptionPane.showMessageDialog(rootPane, "El vuelo está presentanto problemas para registar");
                
                
            }
            
}
    private void mostrar() {
    File archivo = new File(Ubicacion + capnumerodevuelo.getText() + ".txt");

    if (capnumerodevuelo.getText().isEmpty()) {
        JOptionPane.showMessageDialog(rootPane, "Ingrese un ID válido");
        return;
    }

    if (!archivo.exists()) {
        JOptionPane.showMessageDialog(rootPane, "Ese Vuelo no ha sido registrado");
        return;
    }

    try (java.util.Scanner scanner = new java.util.Scanner(archivo)) {
        scanner.nextLine(); 
        
        capnumerodevuelo.setText(scanner.nextLine().replace("Numero de vuelo: ", ""));
        capid.setText(scanner.nextLine().replace("ID: ", ""));
        caporigen.setText(scanner.nextLine().replace("Origen: ", ""));
        capdestino.setText(scanner.nextLine().replace("Destino: ", ""));
        capfechasalida.setText(scanner.nextLine().replace("Fecha Ida: ", ""));
        capfechavuelta.setText(scanner.nextLine().replace("Fecha Vuelta: ", ""));
        caphora.setText(scanner.nextLine().replace("Hora: ", ""));
   
    } catch (Exception e) {
        JOptionPane.showMessageDialog(rootPane, "Error al leer el archivo del vuelo");
    }
}
    
    private void editar() {
    String numeroVuelo = capnumerodevuelo.getText();
    File direccion = new File(Ubicacion + numeroVuelo + ".txt");

    if (numeroVuelo.trim().isEmpty()) {
        JOptionPane.showMessageDialog(rootPane, "Ingrese el número de vuelo que desea editar");
        return;
    }

    if (!direccion.exists()) {
        JOptionPane.showMessageDialog(rootPane, "El vuelo no se encuentra registrado");
        return;
    }

    try {
        FileWriter escribir = new FileWriter(direccion);
        Formatter formatear = new Formatter(escribir);

        formatear.format("%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s",
                "Vuelo" + capid.getText(),
                "N°" + capnumerodevuelo.getText(),
                "ID: " + capid.getText(),
                "Origen: " + caporigen.getText(),
                "Destino: " + capdestino.getText(),
                "Fecha Ida: " + capfechasalida.getText(),
                "Fecha Vuelta: " + capfechavuelta.getText(),
                "Hora: " + caphora.getText());

        formatear.close();
        JOptionPane.showMessageDialog(rootPane, "Vuelo editado exitosamente");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(rootPane, "Error al editar el vuelo: " + e.getMessage());
    }
}

    
    private void eliminar() {
    String archivo = capnumerodevuelo.getText() + ".txt";
    File file = new File(Ubicacion + archivo);

    if (file.exists()) {
        if (file.delete()) {
            JOptionPane.showMessageDialog(rootPane, "Vuelo eliminado");
            limpiarCampos();
        } else {
            JOptionPane.showMessageDialog(rootPane, "No se pudo eliminar el vuelo");
        }
    } else {
        JOptionPane.showMessageDialog(rootPane, "El vuelo no existe");
    }
}



    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txid = new javax.swing.JLabel();
        txorigen = new javax.swing.JLabel();
        txdestino = new javax.swing.JLabel();
        txfechasalida = new javax.swing.JLabel();
        txfechavuelta = new javax.swing.JLabel();
        txhora = new javax.swing.JLabel();
        capid = new javax.swing.JTextField();
        caporigen = new javax.swing.JTextField();
        capdestino = new javax.swing.JTextField();
        capfechasalida = new javax.swing.JTextField();
        capfechavuelta = new javax.swing.JTextField();
        caphora = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnregistrar = new javax.swing.JButton();
        btnmostrar = new javax.swing.JButton();
        btneditar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        capnumerodevuelo = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Registrar Vuelo");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        txid.setText("ID");
        jPanel1.add(txid, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        txorigen.setText("Origen");
        jPanel1.add(txorigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        txdestino.setText("Destino");
        jPanel1.add(txdestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        txfechasalida.setText("Fsalida");
        jPanel1.add(txfechasalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, -1, -1));

        txfechavuelta.setText("Fvuelta");
        jPanel1.add(txfechavuelta, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, -1, -1));

        txhora.setText("Hora");
        jPanel1.add(txhora, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, -1, -1));
        jPanel1.add(capid, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 110, -1));
        jPanel1.add(caporigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 110, -1));
        jPanel1.add(capdestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 110, -1));
        jPanel1.add(capfechasalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 110, -1));
        jPanel1.add(capfechavuelta, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 110, -1));
        jPanel1.add(caphora, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 110, -1));

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, -1, -1));

        btnregistrar.setText("Registrar");
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnregistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 90, -1));

        btnmostrar.setText("mostrar");
        btnmostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmostrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnmostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        btneditar.setText("editar");
        btneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarActionPerformed(evt);
            }
        });
        jPanel1.add(btneditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, -1, -1));

        btneliminar.setText("eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, -1, -1));

        jLabel2.setText("Numero de vuelo");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));
        jPanel1.add(capnumerodevuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 120, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\valer\\Downloads\\vecteezy_aeroplane-airplane-icon-on-transparent-background_21286390 (2).png")); // NOI18N
        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 320, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 320, 280));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
crear();   
limpiarCampos();
                        // TODO add your handling code here:
    }//GEN-LAST:event_btnregistrarActionPerformed

    private void btnmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmostrarActionPerformed
mostrar();

    // TODO add your handling code here:
    }//GEN-LAST:event_btnmostrarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
limpiarCampos();        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
eliminar();        // TODO add your handling code here:
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarActionPerformed
editar();        // TODO add your handling code here:
    }//GEN-LAST:event_btneditarActionPerformed

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
            java.util.logging.Logger.getLogger(ventanaVuelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaVuelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaVuelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaVuelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaVuelo().setVisible(true);
            }
        });
    }
private void limpiarCampos() {
    capid.setText("");
    caporigen.setText("");
    capdestino.setText("");
    capfechasalida.setText("");
    capfechavuelta.setText("");
    caphora.setText("");
    
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btneditar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnmostrar;
    private javax.swing.JButton btnregistrar;
    private javax.swing.JTextField capdestino;
    private javax.swing.JTextField capfechasalida;
    private javax.swing.JTextField capfechavuelta;
    private javax.swing.JTextField caphora;
    private javax.swing.JTextField capid;
    private javax.swing.JTextField capnumerodevuelo;
    private javax.swing.JTextField caporigen;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txdestino;
    private javax.swing.JLabel txfechasalida;
    private javax.swing.JLabel txfechavuelta;
    private javax.swing.JLabel txhora;
    private javax.swing.JLabel txid;
    private javax.swing.JLabel txorigen;
    // End of variables declaration//GEN-END:variables
}
