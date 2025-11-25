package view;

import Dominio.Entidades.Pasajero;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;
import view.VentanaVuelosDisponibles;

public class VentanaInicio extends javax.swing.JFrame {

    private Pasajero persona;
    private Dominio.Entidades.Pasajero pasajero;
   private String nombre; 

    public VentanaInicio(String nombre) { 
        this.nombre = (nombre != null && !nombre.isEmpty()) ? nombre : "Invitado";
      
        initComponents();
        setLocationRelativeTo(null);
        configurarDateChoosers();
       

        java.time.LocalDateTime ahora = java.time.LocalDateTime.now();
        java.time.format.DateTimeFormatter formato = java.time.format.DateTimeFormatter.ofPattern(" HH:mm dd-MM-yyyy ");
        String fechaHoraActual = ahora.format(formato);
        txtFecha.setText(fechaHoraActual);
        
         // Mostrar el nombre del usuario
    lblUsuario.setText("!Bienvenido " +this.nombre + " a nuestra  agencia de vuelo ¡ " );
    lblUsuario.setFont(new java.awt.Font("Nirmala UI", 1, 20));
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        

    }
    
    
    public VentanaInicio() {
        this(""); // Valor por defecto
    }
private void configurarDateChoosers() {
    try {
        // Para jDateIDA
        if (jDateIDA != null) {
            // Método más seguro y compatible
            java.awt.Component[] components = jDateIDA.getComponents();
            for (java.awt.Component comp : components) {
                if (comp instanceof javax.swing.JTextField) {
                    ((javax.swing.JTextField) comp).setEditable(false);
                    break;
                }
            }
        }
        
        // Para jDateVUELTA
        if (jDateVUELTA != null) {
            java.awt.Component[] components = jDateVUELTA.getComponents();
            for (java.awt.Component comp : components) {
                if (comp instanceof javax.swing.JTextField) {
                    ((javax.swing.JTextField) comp).setEditable(false);
                    break;
                }
            }
        }
    } catch (Exception e) {
        System.out.println("Error configurando DateChoosers: " + e.getMessage());
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GRUPO1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jDateIDA = new com.toedter.calendar.JDateChooser();
        jDateVUELTA = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(700, 610));
        jPanel1.setPreferredSize(new java.awt.Dimension(840, 540));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cartagena", "Medellin", "Bogota" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255)));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 130, 40));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cartagena", "Medellin", "Bogota" }));
        jComboBox2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255)));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 130, 40));

        jButton2.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jButton2.setText("Buscar");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, 150, 70));

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 3, 12)); // NOI18N
        jLabel2.setText("Origen");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 50, -1));

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 3, 12)); // NOI18N
        jLabel3.setText("Destino");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 50, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carga 100 x 100.gif"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 110, 90));

        txtFecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });
        jPanel2.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, 150, -1));
        jPanel2.add(jDateIDA, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 140, 40));
        jPanel2.add(jDateVUELTA, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 140, 40));

        jLabel13.setFont(new java.awt.Font("Nirmala UI", 3, 12)); // NOI18N
        jLabel13.setText("Fecha vuelta");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 80, -1));

        jLabel11.setFont(new java.awt.Font("Nirmala UI", 3, 12)); // NOI18N
        jLabel11.setText("Fecha Ida");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 60, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Polygon 1.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, -80, -1, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 130, 10));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 130, -1));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 130, -1));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 140, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 720, 200));

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INICIO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 70));

        jLabel5.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("AeroNex");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 130, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Signal, Wifi, Battery.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, 90, 30));

        lblUsuario.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        lblUsuario.setText("-------------------------");
        jPanel1.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 500, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Polygon 1.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Polygon 1.png"))); // NOI18N
        jLabel8.setText("jLabel8");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Polygon 1.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Group.png"))); // NOI18N
        jLabel10.setText("jLabel10");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 290, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 830, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

                                              
    String origen = (String) jComboBox1.getSelectedItem();
    String destino = (String) jComboBox2.getSelectedItem();
     java.util.Date fechaIda = jDateIDA.getDate();
    java.util.Date fechaVuelta = jDateVUELTA.getDate();
    
    
    
    
      // Validar que la fecha de vuelta no sea anterior a la fecha de ida
    if (fechaVuelta.before(fechaIda)) {
        JOptionPane.showMessageDialog(
            this,
            "La fecha de vuelta no puede ser anterior a la fecha de ida.",
            "Fecha inválida",
            JOptionPane.WARNING_MESSAGE
        );
        return;
    }
    
    
     // Validar que la fecha de ida no sea anterior a hoy
    java.util.Date hoy = new java.util.Date();
    if (fechaIda.before(hoy)) {
        JOptionPane.showMessageDialog(
            this,
            "La fecha de ida no puede ser anterior al día de hoy.",
            "Fecha inválida",
            JOptionPane.WARNING_MESSAGE
        );
        return;
    }

    
     // Validar que se hayan seleccionado ambas fechas
    if (fechaIda == null || fechaVuelta == null) {
        JOptionPane.showMessageDialog(
            this,
            "Por favor seleccione ambas fechas (ida y vuelta).",
            "Fechas incompletas",
            JOptionPane.WARNING_MESSAGE
        );
        return;
    }

    
    // Validar la ruta (solo Cartagena → Medellín disponible)
    if ("Cartagena".equals(origen) && "Medellin".equals(destino)) {
        try {
            // Formatear las fechas para mostrar
            java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd/MM/yyyy");
            String fechaIdaStr = sdf.format(fechaIda);
            String fechaVueltaStr = sdf.format(fechaVuelta);
            
            System.out.println("Busqueda realizada:");
            System.out.println("Origen: " + origen);
            System.out.println("Destino: " + destino);
            System.out.println("Fecha Ida: " + fechaIdaStr);
            System.out.println("Fecha Vuelta: " + fechaVueltaStr);
            
            // Crear pasajero temporal
            Pasajero pasajero = new Pasajero();
            pasajero.setNombre(this.nombre);
            
            // Pasar las fechas a la siguiente ventana
            VentanaVuelosDisponibles disponible = new VentanaVuelosDisponibles(pasajero, this.nombre);
            disponible.setVisible(true);
            this.dispose();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, 
                "Error al abrir ventana: " + e.getMessage(), 
                "Error", 
                JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    } else {
        JOptionPane.showMessageDialog(
            this,
            "Solo disponemos de vuelos Cartagena → Medellín.",
            "Ruta no disponible",
            JOptionPane.WARNING_MESSAGE
        );
    }


    }//GEN-LAST:event_jButton2ActionPerformed
    
    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaInicio().setVisible(true);
            }
        });
}



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GRUPO1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private com.toedter.calendar.JDateChooser jDateIDA;
    private com.toedter.calendar.JDateChooser jDateVUELTA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtFecha;
    // End of variables declaration//GEN-END:variables

}