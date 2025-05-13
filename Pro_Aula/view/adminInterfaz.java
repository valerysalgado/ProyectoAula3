package view;

import Dominio.Entidades.Avion;
import Dominio.Entidades.Pasajero;
import Persistence.Dao.AvionDAO;
import Persistence.Dao.PasajeroDAO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.hibernate.exception.ConstraintViolationException;

public class adminInterfaz extends javax.swing.JFrame {

    private EntityManager em;
    private PasajeroDAO pasajeroDAO = null;
    private DefaultTableModel modeloTabla;
    private AvionDAO avionDAO = null;

    public adminInterfaz() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ConfigDB");
        this.em = emf.createEntityManager();
        pasajeroDAO = new PasajeroDAO(this.em);
        avionDAO = new AvionDAO(this.em);

        initComponents();
        initTabla();
        inittablaaviones();
        ajustarColumnas();
        inittablaaviones();
        cargarTodosPasajeros();
        cargarTodosAviones();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        TabPanelPrincipal = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablapasajero = new javax.swing.JTable();
        botonagregar = new javax.swing.JButton();
        botoneditar = new javax.swing.JButton();
        botonlistar = new javax.swing.JButton();
        botonbuscar = new javax.swing.JButton();
        txtapellido = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtcorreo = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        txtidentificacion = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        comborol = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        txtbuscar = new javax.swing.JTextField();
        botoneliminar1 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaaviones = new javax.swing.JTable();
        jLabel26 = new javax.swing.JLabel();
        capmatricula = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        capcapacidad = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        comborol1 = new javax.swing.JComboBox<>();
        txtbuscarAvion = new javax.swing.JTextField();
        botonbuscar1 = new javax.swing.JButton();
        botonagregar1 = new javax.swing.JButton();
        botoneditar1 = new javax.swing.JButton();
        botonlistar1 = new javax.swing.JButton();
        botoneliminar2 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel11 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel12 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 510));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("AeroNex");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 130, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI Emoji", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("←");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 60));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel14.setBackground(new java.awt.Color(102, 153, 255));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setForeground(new java.awt.Color(102, 153, 255));
        jPanel7.setMinimumSize(new java.awt.Dimension(174, 50));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
        });
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(102, 153, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 153, 255));
        jLabel3.setText("PASAJEROS");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel7.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 14, 104, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\valer\\Downloads\\users-02.png")); // NOI18N
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 52, 39));

        jPanel14.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 50));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setMinimumSize(new java.awt.Dimension(174, 50));
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel8MouseClicked(evt);
            }
        });
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 153, 255));
        jLabel2.setText("AVIONES");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel8.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 80, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\valer\\Downloads\\Flight.png")); // NOI18N
        jPanel8.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, -1));

        jPanel14.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 174, 50));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel9MouseClicked(evt);
            }
        });
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 153, 255));
        jLabel4.setText("RESERVAS");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel9.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 90, 50));

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\valer\\Downloads\\calendar (1) (2).png")); // NOI18N
        jPanel9.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 10, 40, -1));

        jPanel14.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 174, 50));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel14.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 4, -1));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setMinimumSize(new java.awt.Dimension(174, 50));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 153, 255));
        jLabel8.setText("ADMINISTRADORES");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 160, 30));

        jPanel14.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 170, 48));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setMinimumSize(new java.awt.Dimension(174, 50));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 153, 255));
        jLabel23.setText("PLANES");
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });
        jPanel13.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 90, 30));

        jLabel24.setIcon(new javax.swing.ImageIcon("C:\\Users\\valer\\Downloads\\ticket (2).png")); // NOI18N
        jPanel13.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        jPanel14.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 170, 50));

        jPanel5.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 170, 450));

        TabPanelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        TabPanelPrincipal.setForeground(new java.awt.Color(102, 153, 255));
        TabPanelPrincipal.setMaximumSize(new java.awt.Dimension(800, 510));
        TabPanelPrincipal.setMinimumSize(new java.awt.Dimension(800, 510));
        TabPanelPrincipal.setPreferredSize(new java.awt.Dimension(800, 510));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(102, 153, 255));
        jLabel6.setFont(new java.awt.Font("Nirmala UI", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 153, 255));
        jLabel6.setText("BIENVENIDO ADMINISTADOR");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 520, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\valer\\Downloads\\iloveimg-resized\\gerente.png")); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, -1, -1));

        TabPanelPrincipal.addTab("INICIO", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setBackground(new java.awt.Color(102, 153, 255));
        jLabel15.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 153, 255));
        jLabel15.setText("Pasajeros registrados");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 260, -1));

        jScrollPane5.setBackground(new java.awt.Color(204, 204, 204));

        tablapasajero.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablapasajero.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tablapasajero.setSelectionForeground(new java.awt.Color(102, 153, 255));
        tablapasajero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablapasajeroMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tablapasajero);

        jPanel3.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 670, 180));

        botonagregar.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        botonagregar.setForeground(new java.awt.Color(102, 153, 255));
        botonagregar.setText("Registrar");
        botonagregar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 153, 255), new java.awt.Color(102, 153, 255)));
        botonagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonagregarActionPerformed(evt);
            }
        });
        jPanel3.add(botonagregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 80, 30));

        botoneditar.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        botoneditar.setForeground(new java.awt.Color(102, 153, 255));
        botoneditar.setText("Editar");
        botoneditar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 153, 255), new java.awt.Color(102, 153, 255)));
        botoneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoneditarActionPerformed(evt);
            }
        });
        jPanel3.add(botoneditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 80, 30));

        botonlistar.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        botonlistar.setForeground(new java.awt.Color(102, 153, 255));
        botonlistar.setText("Listar");
        botonlistar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 153, 255), new java.awt.Color(102, 153, 255)));
        botonlistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonlistarActionPerformed(evt);
            }
        });
        jPanel3.add(botonlistar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 80, 30));

        botonbuscar.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        botonbuscar.setForeground(new java.awt.Color(102, 153, 255));
        botonbuscar.setText("Buscar");
        botonbuscar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 153, 255), new java.awt.Color(102, 153, 255)));
        botonbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonbuscarActionPerformed(evt);
            }
        });
        jPanel3.add(botonbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 170, 80, 30));

        txtapellido.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 153, 255), new java.awt.Color(102, 153, 255)));
        jPanel3.add(txtapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 130, -1));

        jLabel17.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel17.setText("Ingrese los siguientes datos:");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        jLabel18.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jLabel18.setText("Nombre:");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabel19.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jLabel19.setText("Apellido:");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        jLabel20.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jLabel20.setText("Ingrese Id para buscar pasajero:");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, -1, -1));

        jLabel21.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jLabel21.setText("Telefono:");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, -1, -1));

        jLabel22.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jLabel22.setText("Rol:");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, -1, -1));

        txtcorreo.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 153, 255), new java.awt.Color(102, 153, 255)));
        jPanel3.add(txtcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, 130, -1));

        txttelefono.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 153, 255), new java.awt.Color(102, 153, 255)));
        jPanel3.add(txttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 110, -1));

        txtidentificacion.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 153, 255), new java.awt.Color(102, 153, 255)));
        jPanel3.add(txtidentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 110, -1));

        txtnombre.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 153, 255), new java.awt.Color(102, 153, 255)));
        jPanel3.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 130, -1));

        comborol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PASAJERO", "ADMINISTRADOR", " " }));
        comborol.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 153, 255), new java.awt.Color(102, 153, 255)));
        comborol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comborolActionPerformed(evt);
            }
        });
        jPanel3.add(comborol, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, 130, -1));

        jLabel25.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jLabel25.setText("Identificación:");
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, -1, -1));

        txtbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscarActionPerformed(evt);
            }
        });
        jPanel3.add(txtbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, 110, -1));

        botoneliminar1.setBackground(new java.awt.Color(255, 51, 51));
        botoneliminar1.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        botoneliminar1.setText("Eliminar");
        botoneliminar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 153, 255), new java.awt.Color(102, 153, 255)));
        botoneliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoneliminar1ActionPerformed(evt);
            }
        });
        jPanel3.add(botoneliminar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 80, 30));

        jLabel29.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jLabel29.setText("Correo:");
        jPanel3.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, -1, -1));
        jPanel3.add(jScrollBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 238, 670, 150));

        TabPanelPrincipal.addTab("PASAJEROS", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setBackground(new java.awt.Color(102, 153, 255));

        tablaaviones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaaviones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaavionesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaaviones);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 660, 170));

        jLabel26.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel26.setText("Ingrese los siguientes datos:");
        jPanel4.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        capmatricula.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 153, 255), new java.awt.Color(102, 153, 255)));
        jPanel4.add(capmatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 130, -1));

        jLabel27.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jLabel27.setText("Matricula:");
        jPanel4.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel28.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jLabel28.setText("Capacidad de pasajeros:");
        jPanel4.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, -1, -1));

        capcapacidad.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 153, 255), new java.awt.Color(102, 153, 255)));
        jPanel4.add(capcapacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 60, -1));

        jLabel32.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jLabel32.setText("Estado de avion:");
        jPanel4.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, -1, -1));

        comborol1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EN TIERRA", "EN AIRE", "EN MANTENIMIENTO", "INACTIVO" }));
        comborol1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 153, 255), new java.awt.Color(102, 153, 255)));
        comborol1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comborol1ActionPerformed(evt);
            }
        });
        jPanel4.add(comborol1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, 110, -1));

        txtbuscarAvion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscarAvionActionPerformed(evt);
            }
        });
        jPanel4.add(txtbuscarAvion, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 110, 20));

        botonbuscar1.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        botonbuscar1.setForeground(new java.awt.Color(102, 153, 255));
        botonbuscar1.setText("Buscar");
        botonbuscar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 153, 255), new java.awt.Color(102, 153, 255)));
        botonbuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonbuscar1ActionPerformed(evt);
            }
        });
        jPanel4.add(botonbuscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, 80, 30));

        botonagregar1.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        botonagregar1.setForeground(new java.awt.Color(102, 153, 255));
        botonagregar1.setText("Registrar");
        botonagregar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 153, 255), new java.awt.Color(102, 153, 255)));
        botonagregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonagregar1ActionPerformed(evt);
            }
        });
        jPanel4.add(botonagregar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 80, 30));

        botoneditar1.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        botoneditar1.setForeground(new java.awt.Color(102, 153, 255));
        botoneditar1.setText("Editar");
        botoneditar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 153, 255), new java.awt.Color(102, 153, 255)));
        botoneditar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoneditar1ActionPerformed(evt);
            }
        });
        jPanel4.add(botoneditar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 80, 30));

        botonlistar1.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        botonlistar1.setForeground(new java.awt.Color(102, 153, 255));
        botonlistar1.setText("Listar");
        botonlistar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 153, 255), new java.awt.Color(102, 153, 255)));
        botonlistar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonlistar1ActionPerformed(evt);
            }
        });
        jPanel4.add(botonlistar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 80, 30));

        botoneliminar2.setBackground(new java.awt.Color(255, 51, 51));
        botoneliminar2.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        botoneliminar2.setText("Eliminar");
        botoneliminar2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 153, 255), new java.awt.Color(102, 153, 255)));
        botoneliminar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoneliminar2ActionPerformed(evt);
            }
        });
        jPanel4.add(botoneliminar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 80, 30));

        jLabel16.setBackground(new java.awt.Color(102, 153, 255));
        jLabel16.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 153, 255));
        jLabel16.setText("Aviones registrados");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 240, -1));

        jLabel30.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jLabel30.setText("Ingrese Id o matricula para buscar un avion:");
        jPanel4.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, -1, -1));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, -1, -1));

        TabPanelPrincipal.addTab("AVIONES", jPanel4);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setBackground(new java.awt.Color(102, 153, 255));
        jLabel13.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 153, 255));
        jLabel13.setText("Reservas registradas");
        jPanel11.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 240, -1));

        jButton11.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        jButton11.setForeground(new java.awt.Color(102, 153, 255));
        jButton11.setText("Agregar");
        jButton11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(102, 153, 255)));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 150, 30));

        jButton12.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        jButton12.setForeground(new java.awt.Color(102, 153, 255));
        jButton12.setText("Editar");
        jButton12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(102, 153, 255)));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 150, 30));

        jButton13.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        jButton13.setForeground(new java.awt.Color(102, 153, 255));
        jButton13.setText("Eliminar");
        jButton13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(102, 153, 255)));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 150, 30));

        jButton3.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(102, 153, 255));
        jButton3.setText("Listar");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(102, 153, 255)));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 150, 30));

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jPanel11.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 650, 150));

        TabPanelPrincipal.addTab("RESERVAS", jPanel11);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        jLabel14.setBackground(new java.awt.Color(102, 153, 255));
        jLabel14.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 153, 255));
        jLabel14.setText("Pasajeros registrados");

        jButton14.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        jButton14.setForeground(new java.awt.Color(102, 153, 255));
        jButton14.setText("Agregar");
        jButton14.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(102, 153, 255)));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        jButton15.setForeground(new java.awt.Color(102, 153, 255));
        jButton15.setText("Editar");
        jButton15.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(102, 153, 255)));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        jButton16.setForeground(new java.awt.Color(102, 153, 255));
        jButton16.setText("Eliminar");
        jButton16.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(102, 153, 255)));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(102, 153, 255));
        jButton4.setText("Listar");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(102, 153, 255)));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jScrollPane4.setBackground(new java.awt.Color(204, 204, 204));

        jTable4.setBackground(new java.awt.Color(204, 204, 204));
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel12Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel12Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(20, 20, 20)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 475, Short.MAX_VALUE)
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel12Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel14)
                    .addGap(8, 8, 8)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel12Layout.createSequentialGroup()
                            .addGap(60, 60, 60)
                            .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        TabPanelPrincipal.addTab("ADMINISTRADORES", jPanel12);

        jPanel5.add(TabPanelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 730, 450));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseClicked
        TabPanelPrincipal.setSelectedIndex(2);
    }//GEN-LAST:event_jPanel8MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        TabPanelPrincipal.setSelectedIndex(2);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        TabPanelPrincipal.setSelectedIndex(1);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
        TabPanelPrincipal.setSelectedIndex(1);   // TODO add your handling code here:
    }//GEN-LAST:event_jPanel7MouseClicked

    private void jPanel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseClicked
        TabPanelPrincipal.setSelectedIndex(3);        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel9MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        TabPanelPrincipal.setSelectedIndex(3);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void botonagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonagregarActionPerformed

        if (!validarCampos()) {
            return;
        }

        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();

            Pasajero nuevo = new Pasajero();
            nuevo.setNombre(txtnombre.getText());
            nuevo.setApellido(txtapellido.getText());
            nuevo.setIdentificacion(txtidentificacion.getText());
            nuevo.setTelefono(txttelefono.getText());

            nuevo.setCorreo(txtcorreo.getText());
            nuevo.setRol(comborol.getSelectedItem().toString());

            em.persist(nuevo);

            tx.commit();

            cargarTodosPasajeros();
            limpiarCampos();
            JOptionPane.showMessageDialog(this, "Pasajero registrado exitosamente");
        } catch (Exception e) {
            if (tx.isActive()) {
                tx.rollback();
            }
            JOptionPane.showMessageDialog(this,
                    "Error al registrar: " + e.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
        limpiarCampos();
    }//GEN-LAST:event_botonagregarActionPerformed

    private void botoneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoneditarActionPerformed

        int fila = tablapasajero.getSelectedRow();
        if (fila < 0) {
            JOptionPane.showMessageDialog(this, "Seleccione un pasajero");
            return;
        }

        int id = (int) modeloTabla.getValueAt(fila, 0);
        Pasajero actualizado = pasajeroDAO.buscarPorId(id);

        actualizado.setNombre(txtnombre.getText());
        actualizado.setApellido(txtapellido.getText());
        actualizado.setCorreo(txtcorreo.getText());
        actualizado.setTelefono(txttelefono.getText());
        actualizado.setIdentificacion(txtidentificacion.getText());

        actualizado.setRol(comborol.getSelectedItem().toString());

        pasajeroDAO.actualizar(actualizado);
        cargarTodosPasajeros();
        JOptionPane.showMessageDialog(this, "Pasajero actualizado");
        limpiarCampos();// TODO add your handling code here:
    }//GEN-LAST:event_botoneditarActionPerformed

    private void botonlistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonlistarActionPerformed
        try {
            // 1. Obtener todos los pasajeros desde el DAO
            List<Pasajero> pasajeros = pasajeroDAO.listarTodos();

            // 2. Obtener el modelo de la tabla
            DefaultTableModel modelo = (DefaultTableModel) tablapasajero.getModel();
            modelo.setRowCount(0); // Limpiar tabla existente

            // 3. Llenar la tabla con los datos
            for (Pasajero p : pasajeros) {
                modelo.addRow(new Object[]{
                    p.getIdUsuario(),
                    p.getnombre(),
                    p.getApellido(),
                    p.getCorreo(),
                    p.getTelefono(),
                    p.getIdentificacion(),
                    p.getRol()
                });
            }

            // 4. Ajustar el ancho de columnas (opcional)
            ajustarAnchoColumnas();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Error al cargar pasajeros: " + e.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }

    }

// Método auxiliar para ajustar columnas (opcional)
    private void ajustarAnchoColumnas() {
        tablapasajero.setAutoResizeMode(tablapasajero.AUTO_RESIZE_OFF);

        // Ajustes personalizados (en píxeles)
        tablapasajero.getColumnModel().getColumn(0).setPreferredWidth(50);  // ID
        tablapasajero.getColumnModel().getColumn(1).setPreferredWidth(100); // Nombre
        tablapasajero.getColumnModel().getColumn(2).setPreferredWidth(100); // Apellido
        tablapasajero.getColumnModel().getColumn(3).setPreferredWidth(150); // Correo
        tablapasajero.getColumnModel().getColumn(4).setPreferredWidth(80);  // Teléfono
        tablapasajero.getColumnModel().getColumn(5).setPreferredWidth(100); // Identificación
        tablapasajero.getColumnModel().getColumn(6).setPreferredWidth(120); // Rol

    }//GEN-LAST:event_botonlistarActionPerformed

    private void botonbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonbuscarActionPerformed
        String idStr = txtbuscar.getText();

        if (idStr.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un ID.");
            return;
        }
        try {
            int id = Integer.parseInt(idStr);
            Pasajero p = pasajeroDAO.buscarPorId(id);
            if (p != null) {
                cargarPasajerosEnTabla(List.of(p));
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró el pasajero con ID: " + id);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "ID inválido. Ingrese un número.");

        }
        limpiarCampos();
    }//GEN-LAST:event_botonbuscarActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel23MouseClicked

    private void comborolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comborolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comborolActionPerformed

    private void txtbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbuscarActionPerformed

    private void botoneliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoneliminar1ActionPerformed
        int fila = tablapasajero.getSelectedRow();
        if (fila < 0) {
            JOptionPane.showMessageDialog(this, "Seleccione un pasajero");
            return;
        }

        int confirmacion = JOptionPane.showConfirmDialog(
                this,
                "¿Está seguro de eliminar este pasajero?",
                "Confirmar eliminación",
                JOptionPane.YES_NO_OPTION);

        if (confirmacion == JOptionPane.YES_OPTION) {
            int id = (int) modeloTabla.getValueAt(fila, 0);
            pasajeroDAO.eliminar(id);
            cargarTodosPasajeros();
            limpiarCampos();
            JOptionPane.showMessageDialog(this, "Pasajero eliminado");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_botoneliminar1ActionPerformed

    private void comborol1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comborol1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comborol1ActionPerformed

    private void txtbuscarAvionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscarAvionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbuscarAvionActionPerformed

    private void botonbuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonbuscar1ActionPerformed
                                     
    String busqueda = txtbuscarAvion.getText().trim();
    
    if (busqueda.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Ingrese un ID o matrícula para buscar", "Error", JOptionPane.WARNING_MESSAGE);
        return;
    }

    try {
        Avion avion;
        
        // Búsqueda flexible (ID numérico o matrícula)
        if (busqueda.matches("\\d+")) {  // Si es solo números (ID)
            int id = Integer.parseInt(busqueda);
            avion = avionDAO.buscarPorId(id);
        } else {  // Si no es numérico (matrícula)
            avion = avionDAO.buscarPorMatricula(busqueda.toUpperCase()); // Convertir a mayúsculas
        }

        if (avion != null) {
            // Mostrar resultados
            DefaultTableModel modelo = (DefaultTableModel) tablaaviones.getModel();
            modelo.setRowCount(0);
            modelo.addRow(new Object[]{
                avion.getIdAvion(),
                avion.getMatricula(),
                avion.getCapacidadPasajeros(),
                avion.getEstado()
            });
            
            // Rellenar campos de edición
            capmatricula.setText(avion.getMatricula());
            capcapacidad.setText(String.valueOf(avion.getCapacidadPasajeros()));
            comborol1.setSelectedItem(avion.getEstado());
            
        } else {
            JOptionPane.showMessageDialog(this, 
                "No se encontró un avión con: " + busqueda, 
                "No encontrado", 
                JOptionPane.INFORMATION_MESSAGE);
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, 
            "Error en la búsqueda: " + e.getMessage(), 
            "Error", 
            JOptionPane.ERROR_MESSAGE);
    }


    }//GEN-LAST:event_botonbuscar1ActionPerformed

    private void botonagregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonagregar1ActionPerformed

        // Validar campos primero
        if (!validarCamposAvion()) {
            return;
        }

        String matricula = capmatricula.getText().trim();
        int capacidad = Integer.parseInt(capcapacidad.getText());
        String estado = comborol1.getSelectedItem().toString();

        // Verificar si la matrícula ya existe
        if (avionExiste(matricula)) {
            JOptionPane.showMessageDialog(this,
                    "Error: La matrícula " + matricula + " ya está registrada",
                    "Matrícula duplicada",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();

            Avion nuevoAvion = new Avion();
            nuevoAvion.setMatricula(matricula);
            nuevoAvion.setCapacidadPasajeros(capacidad);
            nuevoAvion.setEstado(estado);

            em.persist(nuevoAvion);
            tx.commit();

            JOptionPane.showMessageDialog(this, "Avión registrado exitosamente");
            cargarTodosAviones();
            limpiarCamposAvion();
        } catch (Exception e) {
            if (tx != null && tx.isActive()) {
                tx.rollback();
            }
            manejarErrorRegistro(e);
        }

    }//GEN-LAST:event_botonagregar1ActionPerformed

    private void botoneditar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoneditar1ActionPerformed

        try {
            // Validar selección
            if (tablaaviones.getSelectedRow() < 0) {
                JOptionPane.showMessageDialog(this, "Seleccione un avión", "Error", JOptionPane.WARNING_MESSAGE);
                return;
            }

            // Validar campos
            if (!validarCamposAvion()) {
                return;
            }

            // Obtener ID (manejo seguro de tipos)
            DefaultTableModel modelo = (DefaultTableModel) tablaaviones.getModel();
            long idAvion = ((Number) modelo.getValueAt(tablaaviones.getSelectedRow(), 0)).longValue();

            // Confirmar edición
            int confirmacion = JOptionPane.showConfirmDialog(
                    this,
                    "¿Actualizar este avión?",
                    "Confirmar",
                    JOptionPane.YES_NO_OPTION);

            if (confirmacion == JOptionPane.YES_OPTION) {
                EntityTransaction tx = em.getTransaction();
                try {
                    tx.begin();

                    Avion avion = em.find(Avion.class, idAvion);
                    if (avion == null) {
                        throw new Exception("Avión no encontrado");
                    }

                    // Actualizar datos
                    avion.setMatricula(capmatricula.getText().toUpperCase()); // Forzar mayúsculas
                    avion.setCapacidadPasajeros(Integer.parseInt(capcapacidad.getText()));
                    avion.setEstado(comborol1.getSelectedItem().toString());

                    em.merge(avion);
                    tx.commit();

                    // Actualizar UI
                    cargarTodosAviones();
                    limpiarCamposAvion();
                    JOptionPane.showMessageDialog(this, "Avión actualizado");
                } catch (Exception e) {
                    if (tx != null && tx.isActive()) {
                        tx.rollback();
                    }
                    throw e;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Error al actualizar: " + e.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_botoneditar1ActionPerformed

    private void botonlistar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonlistar1ActionPerformed

        try {
            // 1. Obtener todos los aviones desde el DAO
            List<Avion> aviones = avionDAO.listarTodos();

            // 2. Obtener el modelo de la tabla
            DefaultTableModel modelo = (DefaultTableModel) tablaaviones.getModel();
            modelo.setRowCount(0); // Limpiar tabla existente

            // 3. Llenar la tabla con los datos
            for (Avion a : aviones) {
                modelo.addRow(new Object[]{
                    a.getIdAvion(),
                    a.getMatricula(),
                    a.getCapacidadPasajeros(),
                    a.getEstado()
                });
            }

            // 4. Ajustar el ancho de columnas (opcional)
            ajustarAnchoColumnasAviones();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Error al cargar aviones: " + e.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

// Método auxiliar para ajustar columnas de aviones
    private void ajustarAnchoColumnasAviones() {
        tablaaviones.setAutoResizeMode(tablaaviones.AUTO_RESIZE_OFF);

        // Ajustes personalizados (en píxeles)
        tablaaviones.getColumnModel().getColumn(0).setPreferredWidth(50);   // ID
        tablaaviones.getColumnModel().getColumn(1).setPreferredWidth(120);  // Matrícula
        tablaaviones.getColumnModel().getColumn(2).setPreferredWidth(80);   // Capacidad
        tablaaviones.getColumnModel().getColumn(3).setPreferredWidth(150);  // Estado


    }//GEN-LAST:event_botonlistar1ActionPerformed

    private void botoneliminar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoneliminar2ActionPerformed

        int filaSeleccionada = tablaaviones.getSelectedRow();
        if (filaSeleccionada < 0) {
            JOptionPane.showMessageDialog(this,
                    "Por favor seleccione un avión de la tabla",
                    "Error",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        // 2. Obtener el ID del avión a eliminar
        DefaultTableModel modelo = (DefaultTableModel) tablaaviones.getModel();
        long idAvion = (long) modelo.getValueAt(filaSeleccionada, 0); // Columna 0 es el ID

        // 3. Confirmar eliminación
        int confirmacion = JOptionPane.showConfirmDialog(
                this,
                "¿Está seguro que desea eliminar este avión?",
                "Confirmar eliminación",
                JOptionPane.YES_NO_OPTION);

        if (confirmacion != JOptionPane.YES_OPTION) {
            return;
        }

        // 4. Proceso de eliminación
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();

            // Buscar y eliminar el avión
            Avion avion = em.find(Avion.class, idAvion);
            if (avion != null) {
                em.remove(avion);
                tx.commit();

                // Actualizar interfaz
                cargarTodosAviones();
                limpiarCamposAvion();
                JOptionPane.showMessageDialog(this,
                        "Avión eliminado correctamente",
                        "Éxito",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this,
                        "El avión seleccionado no existe en la base de datos",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            if (tx != null && tx.isActive()) {
                tx.rollback();
            }
            JOptionPane.showMessageDialog(this,
                    "Error al eliminar avión: " + e.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_botoneliminar2ActionPerformed

    private void tablaavionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaavionesMouseClicked
        int fila = tablaaviones.getSelectedRow();
        if (fila >= 0) {
            DefaultTableModel modelo = (DefaultTableModel) tablaaviones.getModel();
            capmatricula.setText(modelo.getValueAt(fila, 1).toString());
            capcapacidad.setText(modelo.getValueAt(fila, 2).toString());
            comborol1.setSelectedItem(modelo.getValueAt(fila, 3).toString());
        }
    }//GEN-LAST:event_tablaavionesMouseClicked

    private void tablapasajeroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablapasajeroMouseClicked

        int filaVista = tablapasajero.getSelectedRow();
        if (filaVista >= 0) {
            // Convertir el índice de la fila de la vista al modelo
            int filaModelo = tablapasajero.convertRowIndexToModel(filaVista);
            TableModel modelo = tablapasajero.getModel();

            // Obtener los valores de cada columna por su índice en el modelo
            Object id = modelo.getValueAt(filaModelo, 0);
            Object nombre = modelo.getValueAt(filaModelo, 1);         // Columna 1: Nombre
            Object apellido = modelo.getValueAt(filaModelo, 2);       // Columna 2: Apellido
            Object identificacion = modelo.getValueAt(filaModelo, 3); // Columna 3: Identificación
            Object telefono = modelo.getValueAt(filaModelo, 4);       // Columna 4: Teléfono
            Object correo = modelo.getValueAt(filaModelo, 5);         // Columna 5: Correo
            Object rol = modelo.getValueAt(filaModelo, 6);            // Columna 6: Rol

            // Establecer los valores en los campos de texto
            txtnombre.setText(nombre != null ? nombre.toString() : "");
            txtapellido.setText(apellido != null ? apellido.toString() : "");
            txtidentificacion.setText(identificacion != null ? identificacion.toString() : "");
            txttelefono.setText(telefono != null ? telefono.toString() : "");
            txtcorreo.setText(correo != null ? correo.toString() : "");
            comborol.setSelectedItem(rol != null ? rol.toString() : "");

        }
    }//GEN-LAST:event_tablapasajeroMouseClicked

    public static void main(String args[]) {


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new adminInterfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane TabPanelPrincipal;
    private javax.swing.JButton botonagregar;
    private javax.swing.JButton botonagregar1;
    public javax.swing.JButton botonbuscar;
    public javax.swing.JButton botonbuscar1;
    private javax.swing.JButton botoneditar;
    private javax.swing.JButton botoneditar1;
    private javax.swing.JButton botoneliminar1;
    private javax.swing.JButton botoneliminar2;
    private javax.swing.JButton botonlistar;
    private javax.swing.JButton botonlistar1;
    private javax.swing.JTextField capcapacidad;
    private javax.swing.JTextField capmatricula;
    private javax.swing.JComboBox<String> comborol;
    private javax.swing.JComboBox<String> comborol1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable tablaaviones;
    public javax.swing.JTable tablapasajero;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtbuscarAvion;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtidentificacion;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables

    private void cargarTodosPasajeros() {
        List<Pasajero> lista = pasajeroDAO.listarTodos();
        cargarPasajerosEnTabla(lista);
    }

    private void cargarTodosAviones() {
        List<Avion> lista = avionDAO.listarTodos();
        cargarAvionesEnTabla(lista);
    }

    private void cargarPasajerosEnTabla(List<Pasajero> pasajeros) {
        modeloTabla.setRowCount(0); // Limpiar tabla

        for (Pasajero p : pasajeros) {
            modeloTabla.addRow(new Object[]{
                p.getIdUsuario(), // Columna 0: ID
                p.getnombre(), // Columna 1: Nombre
                p.getApellido(), // Columna 2: Apellido
                p.getIdentificacion(),// Columna 3: Identificación
                p.getTelefono(), // Columna 4: Teléfono
                p.getCorreo(), // Columna 5: Correo
                p.getRol() // Columna 6: Rol
            });
        }
    }

    private void cargarAvionesEnTabla(List<Avion> aviones) {
        DefaultTableModel modelo = (DefaultTableModel) tablaaviones.getModel();
        modelo.setRowCount(0);

        for (Avion a : aviones) {
            modelo.addRow(new Object[]{
                a.getIdAvion(),
                a.getMatricula(),
                a.getCapacidadPasajeros(),
                a.getEstado()
            });
        }
    }

    private void limpiarCampos() {
        txtnombre.setText("");
        txtapellido.setText("");
        txtidentificacion.setText("");
        txttelefono.setText("");
        txtcorreo.setText("");
        comborol.setSelectedIndex(0);
        txtnombre.requestFocus();
    }

    private void limpiarCamposAvion() {
        capmatricula.setText("");
        capcapacidad.setText("");
        comborol1.setSelectedIndex(0);
    }

    private boolean validarCampos() {
        StringBuilder errores = new StringBuilder();

        if (txtnombre.getText().trim().isEmpty()) {
            errores.append("- El nombre es obligatorio\n");
        }

        if (txtapellido.getText().trim().isEmpty()) {
            errores.append("- El apellido es obligatorio\n");
        }

        if (txtidentificacion.getText().trim().isEmpty()) {
            errores.append("- La identificación es obligatoria\n");
        }

        String correo = txtcorreo.getText().trim();
        if (!correo.isEmpty() && !correo.matches("^[\\w-.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
            errores.append("- El correo electrónico no es válido\n");
        }

        String telefono = txttelefono.getText().trim();
        if (!telefono.isEmpty() && !telefono.matches("^[0-9]{7,15}$")) {
            errores.append("- El teléfono debe contener solo números (7-15 dígitos)\n");
        }

        if (errores.length() > 0) {
            JOptionPane.showMessageDialog(this,
                    "Por favor corrija los siguientes errores:\n" + errores.toString(),
                    "Validación", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        return true;
    }

    private boolean validarCamposAvion() {
        if (!capmatricula.getText().matches("^[A-Z]{2,3}-\\d{3,4}$")) {
            JOptionPane.showMessageDialog(this,
                    "Formato de matrícula inválido. Use: ABC-1234",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Validar capacidad
        try {
            int capacidad = Integer.parseInt(capcapacidad.getText());
            if (capacidad <= 0 || capacidad > 500) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,
                    "Capacidad debe ser entre 1-500",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true;
    }

    private void initTabla() {
        modeloTabla = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        modeloTabla.addColumn("ID");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Apellido");
        modeloTabla.addColumn("Identificación");
        modeloTabla.addColumn("Teléfono");
        modeloTabla.addColumn("Correo");
        modeloTabla.addColumn("Rol");

        tablapasajero.setModel(modeloTabla);
    }

    private void inittablaaviones() {
        try {
            DefaultTableModel modelo = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };

            modelo.addColumn("ID");
            modelo.addColumn("Matrícula");
            modelo.addColumn("Capacidad");
            modelo.addColumn("Estado");

            if (tablaaviones != null) {
                tablaaviones.setModel(modelo);

                tablaaviones.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        tablaavionesMouseClicked(evt);
                    }
                });
            } else {
                System.err.println("Error: jTable2 es null");
            }
        } catch (Exception e) {
            System.err.println("Error al inicializar tabla de aviones:");
            e.printStackTrace();
            JOptionPane.showMessageDialog(this,
                    "Error al inicializar la tabla de aviones: " + e.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }

    }

    private void configurarValidacionesEnTiempo() {
        capmatricula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                char c = evt.getKeyChar();
                if (!(Character.isUpperCase(c) || Character.isDigit(c) || c == '-')) {
                    evt.consume();
                }

                if (capmatricula.getText().length() >= 8) {
                    evt.consume();
                }

                SwingUtilities.invokeLater(() -> {
                    String text = capmatricula.getText().toUpperCase();
                    if (text.length() == 3 && !text.contains("-")) {
                        text += "-";
                        capmatricula.setText(text);
                    }
                    capmatricula.setText(text);
                });
            }
        });

        capcapacidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                char c = evt.getKeyChar();
                if (!Character.isDigit(c)) {
                    evt.consume();
                }

                if (capcapacidad.getText().length() >= 3) {
                    evt.consume();
                }
            }
        });

        comborol1.setModel(new DefaultComboBoxModel<>(Avion.getOpcionesEstado()));
        comborol1.setSelectedItem("EN TIERRA");
    }

    private boolean avionExiste(String matricula) {
        try {
            return avionDAO.existeMatricula(matricula);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Error al verificar matrícula: " + e.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            return true; // Asumir que existe para prevenir duplicados
        }
    }

    private void manejarErrorRegistro(Exception e) {
        String mensaje = "Error al registrar avión: ";

        if (e.getCause() != null && e.getCause().getMessage().contains("Duplicate entry")) {
            mensaje += "La matrícula ya existe en el sistema";
        } else {
            mensaje += e.getMessage();
        }

        JOptionPane.showMessageDialog(this,
                mensaje,
                "Error",
                JOptionPane.ERROR_MESSAGE);
    }

    private void ajustarColumnas() {

        tablapasajero.getColumnModel().getColumn(0).setPreferredWidth(50);
        tablapasajero.getColumnModel().getColumn(1).setPreferredWidth(120);
        tablapasajero.getColumnModel().getColumn(2).setPreferredWidth(80);
        tablapasajero.getColumnModel().getColumn(3).setPreferredWidth(150);
        tablapasajero.getColumnModel().getColumn(4).setPreferredWidth(120);
        tablapasajero.getColumnModel().getColumn(5).setPreferredWidth(150);
        tablapasajero.getColumnModel().getColumn(6).setPreferredWidth(150);

        tablapasajero.setAutoResizeMode(tablapasajero.AUTO_RESIZE_OFF);

        tablapasajero.revalidate();
        tablapasajero.repaint();
    }

}
