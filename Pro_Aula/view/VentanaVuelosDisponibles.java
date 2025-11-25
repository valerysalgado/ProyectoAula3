
package view;

import Dominio.Entidades.*;
import Dominio.Entidades.Reserva.EstadoReserva;
import Persistence.Dao.ReservaDAO;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import controller.ControladorLogin;
import java.math.BigDecimal;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.util.Date;
import javax.persistence.EntityManager;
import view.VentanaTikect;
import java.text.SimpleDateFormat;


public class VentanaVuelosDisponibles extends javax.swing.JFrame {
    
    private ControladorLogin con = new ControladorLogin();
    private java.sql.Connection cn;
    private String nombreUsuario;
    private Vuelo vueloMostrado;
    private Pasajero pasajeroActual;
    private boolean ventanaAbierta = false; // Control para evitar duplicados

    private java.util.Date fechaIda;
    private java.util.Date fechaVuelta;
    
    
    public VentanaVuelosDisponibles(Pasajero pasajero, String nombreUsuario) {
        this.pasajeroActual = pasajero;
        this.nombreUsuario = nombreUsuario;
        
        
        this.cn = con.conector();
        initComponents();
        setLocationRelativeTo(this);
        
        
       cargarVuelosEnPantalla(); // Método para mostrar vuelos en los JLabels
       configurarBotonesReserva(); // Asignar acciones a los botones
    }
  

 


    // Método para simular la carga de vuelos (debes reemplazarlo con tu lógica real)
    private void cargarVuelosEnPantalla() {
        
        vueloMostrado = new Vuelo();
        vueloMostrado.setNumeroVuelo("AAA-001");
        vueloMostrado.setOrigen("Cartagena");
        vueloMostrado.setDestino("Medellin");
        
        
            
     

        // Mostrar datos en los JLabels
        FechaIDA.setText("Vuelo: " + vueloMostrado.getNumeroVuelo() + " | " + vueloMostrado.getOrigen() + " → " + vueloMostrado.getDestino());
        
        
        
    }
    
    // Método auxiliar para formatear fechas
   
    

    private void configurarBotonesReserva() {
      
            jButton1.addActionListener(e -> {
            if (vueloMostrado != null) {
                reservarVuelo(vueloMostrado);
            } else {
                JOptionPane.showMessageDialog(
                    this, 
                    "Error: No hay vuelo disponible.", 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE
                );
            }
        });
    
    }
private void reservarVuelo(Vuelo vuelo) {
    try {
        // Verificar que el pasajero tenga nombre
        String nombrePasajero = (pasajeroActual.getnombre() != null) ? pasajeroActual.getnombre() : "Invitado";
        
        // Crear mensaje de confirmación
        String mensaje = String.format(
            "¡Reserva exitosa!\n\n" +
            "Detalles:\n" +
            "Vuelo: %s\n" +
            "Ruta: %s → %s\n" +
            "Pasajero: %s",
            vuelo.getNumeroVuelo(),
            vuelo.getOrigen(),
            vuelo.getDestino(),
            nombrePasajero
        );
        
      
       
        
        // Redirigir
        VentanaTikect tikect = new VentanaTikect(nombreUsuario);
        tikect.setVisible(true);
        this.dispose();
        
    } catch (Exception ex) {
        // Solo para depuración
        
    }
}
    // Método para guardar una reserva en la BD
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        FechaIDA = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 510));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 510));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 510));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Reserva\n", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 153, 255))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jButton1.setText("Reservar");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 400, 36));

        FechaIDA.setText("-------------------------------------------------------------");
        FechaIDA.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.add(FechaIDA, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 320, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\OneDrive\\Documents\\IMAGENES\\ICON\\avion1.png")); // NOI18N
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, -10, 250, 100));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Vector 12.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -30, 330, 210));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 580, 150));

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("AeroNex");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 140, 50));

        jLabel4.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Reserva en tu Aereolinea de Confinaza");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 270, 30));

        btnRegresar.setBackground(new java.awt.Color(0, 51, 102));
        btnRegresar.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Chevron_Left_MD.png"))); // NOI18N
        btnRegresar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(102, 153, 255), null, null));
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 130, 50));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Reserva\n", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 153, 255))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setForeground(new java.awt.Color(51, 51, 51));
        jButton2.setText("Reservar");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 410, 40));

        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("FUERA DE SERVICIO");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 190, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\OneDrive\\Documents\\IMAGENES\\ICON\\avion1.png")); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 260, 100));

        jLabel8.setForeground(new java.awt.Color(204, 0, 0));
        jLabel8.setText("EN MANTENIMIENTO");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, -1, 20));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Vector 12.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 170));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 580, 170));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Signal, Wifi, Battery.png"))); // NOI18N
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 480, -1, 20));

        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\Image.png")); // NOI18N
        jLabel14.setText("jLabel14");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1900, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        VentanaInicio inicio = new VentanaInicio();
        inicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (vueloMostrado != null) {
            reservarVuelo(vueloMostrado);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    JOptionPane.showMessageDialog(null, "FUERA DE SERVICIO . ELIJA OTRA OPCION DISPONIBLE  .");
      
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(VentanaVuelosDisponibles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaVuelosDisponibles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaVuelosDisponibles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaVuelosDisponibles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
 // Simulación: Pasajero por defecto (debes reemplazarlo con tu sistema de login)
        Pasajero pasajeroEjemplo = new Pasajero();
pasajeroEjemplo.setNombre("Invitado");
pasajeroEjemplo.setId(1);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaVuelosDisponibles(pasajeroEjemplo,"Invitado").setVisible(true);
            }
        });  
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FechaIDA;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
