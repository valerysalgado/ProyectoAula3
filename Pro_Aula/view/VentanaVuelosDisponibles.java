
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
import javax.persistence.EntityManager;
import view.VentanaTikect;


public class VentanaVuelosDisponibles extends javax.swing.JFrame {
    ControladorLogin con = new ControladorLogin();
    Connection cn = con.conector(); 
    
    
// Variables para almacenar los vuelos mostrados
    private Vuelo vueloMostrado;
   
    private Pasajero pasajeroActual; // Debes obtenerlo desde el login

    public VentanaVuelosDisponibles(Pasajero pasajero) {
        this.pasajeroActual = pasajero;
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
        jLabel1.setText("Vuelo: " + vueloMostrado.getNumeroVuelo() + " | " + vueloMostrado.getOrigen() + " → " + vueloMostrado.getDestino());
        
    }

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

    // Método para guardar una reserva en la BD
    private void reservarVuelo(Vuelo vuelo) {
        EntityManager em = null;
        try {
            
            Reserva nuevaReserva = new Reserva();
            
            nuevaReserva.setPasajero(this.pasajeroActual);
            nuevaReserva.setVuelo(vuelo);
            nuevaReserva.setOrigen(vuelo.getOrigen());
            nuevaReserva.setDestino(vuelo.getDestino());
            nuevaReserva.setTotalPagado(BigDecimal.valueOf(250000)); 
            nuevaReserva.setEstado(EstadoReserva.CONFIRMADA); // Asignar estado inicial
            // 2. Guardar en la BD usando tu ReservaDAO
            ReservaDAO reservaDAO = new ReservaDAO(); 
            reservaDAO.crear(nuevaReserva);

            
          
            
      
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(
                this,
                " Error al reservar: " + ex.getMessage(),
                "Error",
                JOptionPane.ERROR_MESSAGE
            );
            ex.printStackTrace();
        }
}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 510));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 510));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 510));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Reservar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 400, 36));

        jLabel1.setText("-------------------------------------------------------------");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 320, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 580, 130));

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("AeroNex");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 140, 50));

        jLabel4.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Reserva en tu Aereolinea de Confinaza");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 270, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        VentanaTikect tikect = new VentanaTikect();
       tikect.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
        pasajeroEjemplo.setIdUsuario(1); 

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaVuelosDisponibles(pasajeroEjemplo).setVisible(true);
            }
        });  
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
