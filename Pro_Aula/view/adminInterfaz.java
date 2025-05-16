package view;

import Dominio.Entidades.Administrador;
import Dominio.Entidades.Avion;
import Dominio.Entidades.Pasajero;
import Dominio.Entidades.Reserva;
import Dominio.Entidades.Vuelo;
import Persistence.Dao.AdministradorDAO;
import Persistence.Dao.AvionDAO;
import Persistence.Dao.PasajeroDAO;
import Persistence.Dao.ReservaDAO;
import Persistence.Dao.VueloDAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class adminInterfaz extends javax.swing.JFrame {

    private EntityManager em;
    private PasajeroDAO pasajeroDAO = null;
    private DefaultTableModel modeloTabla;
    private AvionDAO avionDAO = null;
    private VueloDAO vueloDAO = new VueloDAO(em);
    private AdministradorDAO administradorDAO = new AdministradorDAO(em);

    public adminInterfaz() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ConfigDB");
        this.em = emf.createEntityManager();
        pasajeroDAO = new PasajeroDAO(this.em);
        avionDAO = new AvionDAO(this.em);
        vueloDAO = new VueloDAO(em);
        administradorDAO = new AdministradorDAO(em);

        initComponents();
        initTabla();
        inittablaaviones();
        ajustarColumnas();
        inittablaaviones();
        initjTableReservas();
        initjTableVuelos();
        cargarTodosPasajeros();
        cargarTodosAviones();
        cargarReservasEnTabla();
        cargarAvionesEnCombo();
        listarVuelosAction();
        cargarCiudadesEnCombos();
        initTablaAdministradores();
        listarAdministradores();
        ajustarColumnasAdmin();
        inicializarComboRolesAdministrador();
        ajustarColumnasAdmin();

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
        jPanel8 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
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
        jButton13 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableReservas = new javax.swing.JTable();
        jPanel16 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        botonguardar = new javax.swing.JButton();
        botonedit = new javax.swing.JButton();
        botonelimi = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        tablavuelos = new javax.swing.JTable();
        jLabel33 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtNumeroVuelo = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        dateChooserLlegada = new com.toedter.calendar.JDateChooser();
        dateChooserSalida = new com.toedter.calendar.JDateChooser();
        comboorigen = new javax.swing.JComboBox<>();
        comboDestino = new javax.swing.JComboBox<>();
        comboAvion = new javax.swing.JComboBox<>();
        jLabel38 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaadministrador = new javax.swing.JTable();
        botonagregar2 = new javax.swing.JButton();
        botoneditar2 = new javax.swing.JButton();
        botonlistar2 = new javax.swing.JButton();
        botoneliminar3 = new javax.swing.JButton();
        txtnombre1 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        comborol2 = new javax.swing.JComboBox<>();
        jLabel40 = new javax.swing.JLabel();
        txttelefono1 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        txtbuscar1 = new javax.swing.JTextField();
        botonbuscar2 = new javax.swing.JButton();

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
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
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
        jPanel7.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 130, -1));

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
        jPanel8.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 90, 30));

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
        jPanel9.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 110, 50));

        jPanel14.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 174, 50));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel14.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 4, -1));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setMinimumSize(new java.awt.Dimension(174, 50));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });
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

        jPanel14.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 278, 170, 50));

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setMinimumSize(new java.awt.Dimension(174, 50));
        jPanel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel15MouseClicked(evt);
            }
        });
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 153, 255));
        jLabel12.setText("VUELOS");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel15.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 100, 30));

        jPanel14.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 170, 48));

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

        jPanel3.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 670, 140));

        botonagregar.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        botonagregar.setForeground(new java.awt.Color(102, 153, 255));
        botonagregar.setText("Registrar");
        botonagregar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 153, 255), new java.awt.Color(102, 153, 255)));
        botonagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonagregarActionPerformed(evt);
            }
        });
        jPanel3.add(botonagregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 80, 30));

        botoneditar.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        botoneditar.setForeground(new java.awt.Color(102, 153, 255));
        botoneditar.setText("Editar");
        botoneditar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 153, 255), new java.awt.Color(102, 153, 255)));
        botoneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoneditarActionPerformed(evt);
            }
        });
        jPanel3.add(botoneditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 80, 30));

        botonlistar.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        botonlistar.setForeground(new java.awt.Color(102, 153, 255));
        botonlistar.setText("Listar");
        botonlistar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 153, 255), new java.awt.Color(102, 153, 255)));
        botonlistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonlistarActionPerformed(evt);
            }
        });
        jPanel3.add(botonlistar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, 80, 30));

        botonbuscar.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        botonbuscar.setForeground(new java.awt.Color(102, 153, 255));
        botonbuscar.setText("Buscar");
        botonbuscar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 153, 255), new java.awt.Color(102, 153, 255)));
        botonbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonbuscarActionPerformed(evt);
            }
        });
        jPanel3.add(botonbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 80, 20));

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
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

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

        txtbuscar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 153, 255), new java.awt.Color(102, 153, 255)));
        txtbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscarActionPerformed(evt);
            }
        });
        jPanel3.add(txtbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 110, -1));

        botoneliminar1.setBackground(new java.awt.Color(255, 51, 51));
        botoneliminar1.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        botoneliminar1.setText("Eliminar");
        botoneliminar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 153, 255), new java.awt.Color(102, 153, 255)));
        botoneliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoneliminar1ActionPerformed(evt);
            }
        });
        jPanel3.add(botoneliminar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 350, 80, 30));

        jLabel29.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jLabel29.setText("Correo:");
        jPanel3.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, -1, -1));
        jPanel3.add(jScrollBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 238, 670, 90));

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

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 660, 190));

        jLabel26.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel26.setText("Ingrese los siguientes datos:");
        jPanel4.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        capmatricula.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 153, 255), new java.awt.Color(102, 153, 255)));
        jPanel4.add(capmatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 130, -1));

        jLabel27.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jLabel27.setText("Matricula:");
        jPanel4.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel28.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jLabel28.setText("Capacidad de pasajeros:");
        jPanel4.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        capcapacidad.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 153, 255), new java.awt.Color(102, 153, 255)));
        jPanel4.add(capcapacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 60, -1));

        jLabel32.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jLabel32.setText("Estado de avion:");
        jPanel4.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, -1, -1));

        comborol1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EN TIERRA", "EN AIRE", "EN MANTENIMIENTO", "INACTIVO" }));
        comborol1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 153, 255), new java.awt.Color(102, 153, 255)));
        comborol1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comborol1ActionPerformed(evt);
            }
        });
        jPanel4.add(comborol1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 110, -1));

        txtbuscarAvion.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 153, 255), new java.awt.Color(102, 153, 255)));
        txtbuscarAvion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscarAvionActionPerformed(evt);
            }
        });
        jPanel4.add(txtbuscarAvion, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 110, 20));

        botonbuscar1.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        botonbuscar1.setForeground(new java.awt.Color(102, 153, 255));
        botonbuscar1.setText("Buscar");
        botonbuscar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 153, 255), new java.awt.Color(102, 153, 255)));
        botonbuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonbuscar1ActionPerformed(evt);
            }
        });
        jPanel4.add(botonbuscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, 80, 30));

        botonagregar1.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        botonagregar1.setForeground(new java.awt.Color(102, 153, 255));
        botonagregar1.setText("Registrar");
        botonagregar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 153, 255), new java.awt.Color(102, 153, 255)));
        botonagregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonagregar1ActionPerformed(evt);
            }
        });
        jPanel4.add(botonagregar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 80, 30));

        botoneditar1.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        botoneditar1.setForeground(new java.awt.Color(102, 153, 255));
        botoneditar1.setText("Editar");
        botoneditar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 153, 255), new java.awt.Color(102, 153, 255)));
        botoneditar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoneditar1ActionPerformed(evt);
            }
        });
        jPanel4.add(botoneditar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, 80, 30));

        botonlistar1.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        botonlistar1.setForeground(new java.awt.Color(102, 153, 255));
        botonlistar1.setText("Listar");
        botonlistar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 153, 255), new java.awt.Color(102, 153, 255)));
        botonlistar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonlistar1ActionPerformed(evt);
            }
        });
        jPanel4.add(botonlistar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, 80, 30));

        botoneliminar2.setBackground(new java.awt.Color(255, 51, 51));
        botoneliminar2.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        botoneliminar2.setText("Eliminar");
        botoneliminar2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 153, 255), new java.awt.Color(102, 153, 255)));
        botoneliminar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoneliminar2ActionPerformed(evt);
            }
        });
        jPanel4.add(botoneliminar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, 80, 30));

        jLabel16.setBackground(new java.awt.Color(102, 153, 255));
        jLabel16.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 153, 255));
        jLabel16.setText("Aviones registrados");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 240, -1));

        jLabel30.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jLabel30.setText("Ingrese Id o matricula para buscar un avion:");
        jPanel4.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, -1, -1));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, -1, -1));

        TabPanelPrincipal.addTab("AVIONES", jPanel4);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setBackground(new java.awt.Color(102, 153, 255));
        jLabel13.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 153, 255));
        jLabel13.setText("Reservas registradas");
        jPanel11.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 240, -1));

        jButton13.setBackground(new java.awt.Color(153, 153, 153));
        jButton13.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        jButton13.setText("Cancelar");
        jButton13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(102, 153, 255)));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, 90, 30));

        jButton3.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(102, 153, 255));
        jButton3.setText("Listar");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 153, 255), new java.awt.Color(102, 153, 255)));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 80, 30));

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));

        jTableReservas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTableReservas);

        jPanel11.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 670, 250));

        TabPanelPrincipal.addTab("RESERVAS", jPanel11);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setBackground(new java.awt.Color(102, 153, 255));
        jLabel24.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(102, 153, 255));
        jLabel24.setText("Vuelos registrados");
        jPanel16.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 220, -1));

        botonguardar.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        botonguardar.setForeground(new java.awt.Color(102, 153, 255));
        botonguardar.setText("Agregar");
        botonguardar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 153, 255), new java.awt.Color(102, 153, 255)));
        botonguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonguardarActionPerformed(evt);
            }
        });
        jPanel16.add(botonguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 80, 30));

        botonedit.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        botonedit.setForeground(new java.awt.Color(102, 153, 255));
        botonedit.setText("Editar");
        botonedit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 153, 255), new java.awt.Color(102, 153, 255)));
        botonedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoneditActionPerformed(evt);
            }
        });
        jPanel16.add(botonedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 80, 30));

        botonelimi.setBackground(new java.awt.Color(255, 51, 51));
        botonelimi.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        botonelimi.setText("Eliminar");
        botonelimi.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(102, 153, 255)));
        botonelimi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonelimiActionPerformed(evt);
            }
        });
        jPanel16.add(botonelimi, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, 80, 30));

        jScrollPane7.setBackground(new java.awt.Color(204, 204, 204));

        tablavuelos.setModel(new javax.swing.table.DefaultTableModel(
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
        tablavuelos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablavuelosMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tablavuelos);

        jPanel16.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 660, 170));

        jLabel33.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel33.setText("Ingrese los siguientes datos:");
        jPanel16.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel23.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jLabel23.setText("Numero de vuelo:");
        jPanel16.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        txtNumeroVuelo.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 153, 255), new java.awt.Color(102, 153, 255)));
        jPanel16.add(txtNumeroVuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 90, -1));

        jLabel34.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jLabel34.setText("Origen:");
        jPanel16.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, -1, -1));

        jLabel35.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jLabel35.setText("Destino:");
        jPanel16.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, -1, -1));

        jLabel36.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jLabel36.setText("Fecha de salida:");
        jPanel16.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel37.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jLabel37.setText("Seleccione un avion: ");
        jPanel16.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, -1, -1));

        dateChooserLlegada.setBackground(new java.awt.Color(102, 153, 255));
        dateChooserLlegada.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 153, 255), new java.awt.Color(102, 153, 255)));
        jPanel16.add(dateChooserLlegada, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 100, -1));

        dateChooserSalida.setBackground(new java.awt.Color(102, 153, 255));
        dateChooserSalida.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 153, 255), new java.awt.Color(102, 153, 255)));
        jPanel16.add(dateChooserSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 100, -1));

        comboorigen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ORIGEN", "CARTAGENA", "BOGOTA", "MEDELLIN", " " }));
        comboorigen.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 153, 255), new java.awt.Color(102, 153, 255)));
        comboorigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboorigenActionPerformed(evt);
            }
        });
        jPanel16.add(comboorigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 120, 20));

        comboDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DESTINO", "CARTAGENA", "BOGOTA", "MEDELLIN", " " }));
        comboDestino.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 153, 255), new java.awt.Color(102, 153, 255)));
        jPanel16.add(comboDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 120, 20));

        comboAvion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboAvion.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 153, 255), new java.awt.Color(102, 153, 255)));
        comboAvion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboAvionMouseClicked(evt);
            }
        });
        jPanel16.add(comboAvion, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, -1, -1));

        jLabel38.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jLabel38.setText("Fecha de llegada:");
        jPanel16.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, -1, -1));

        TabPanelPrincipal.addTab("VUELOS", jPanel16);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setBackground(new java.awt.Color(102, 153, 255));
        jLabel31.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(102, 153, 255));
        jLabel31.setText("Administradores registrados");
        jPanel17.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 340, -1));

        tablaadministrador.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaadministrador);

        jPanel17.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 610, 180));

        botonagregar2.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        botonagregar2.setForeground(new java.awt.Color(102, 153, 255));
        botonagregar2.setText("Registrar");
        botonagregar2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 153, 255), new java.awt.Color(102, 153, 255)));
        botonagregar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonagregar2ActionPerformed(evt);
            }
        });
        jPanel17.add(botonagregar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 80, 30));

        botoneditar2.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        botoneditar2.setForeground(new java.awt.Color(102, 153, 255));
        botoneditar2.setText("Editar");
        botoneditar2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 153, 255), new java.awt.Color(102, 153, 255)));
        botoneditar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoneditar2ActionPerformed(evt);
            }
        });
        jPanel17.add(botoneditar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, 80, 30));

        botonlistar2.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        botonlistar2.setForeground(new java.awt.Color(102, 153, 255));
        botonlistar2.setText("Listar");
        botonlistar2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 153, 255), new java.awt.Color(102, 153, 255)));
        botonlistar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonlistar2ActionPerformed(evt);
            }
        });
        jPanel17.add(botonlistar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, 80, 30));

        botoneliminar3.setBackground(new java.awt.Color(255, 51, 51));
        botoneliminar3.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        botoneliminar3.setText("Eliminar");
        botoneliminar3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 153, 255), new java.awt.Color(102, 153, 255)));
        botoneliminar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoneliminar3ActionPerformed(evt);
            }
        });
        jPanel17.add(botoneliminar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, 80, 30));

        txtnombre1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 153, 255), new java.awt.Color(102, 153, 255)));
        jPanel17.add(txtnombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 130, -1));

        jLabel39.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jLabel39.setText("Nombre:");
        jPanel17.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        comborol2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PASAJERO", "ADMINISTRADOR", " " }));
        comborol2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 153, 255), new java.awt.Color(102, 153, 255)));
        comborol2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comborol2ActionPerformed(evt);
            }
        });
        jPanel17.add(comborol2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 130, -1));

        jLabel40.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jLabel40.setText("Rol:");
        jPanel17.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, -1, -1));

        txttelefono1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 153, 255), new java.awt.Color(102, 153, 255)));
        jPanel17.add(txttelefono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 110, -1));

        jLabel41.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jLabel41.setText("Telefono:");
        jPanel17.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, -1, -1));

        jLabel42.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jLabel42.setText("Ingrese Id para buscar administrador:");
        jPanel17.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        txtbuscar1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 153, 255), new java.awt.Color(102, 153, 255)));
        txtbuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscar1ActionPerformed(evt);
            }
        });
        jPanel17.add(txtbuscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 90, -1));

        botonbuscar2.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        botonbuscar2.setForeground(new java.awt.Color(102, 153, 255));
        botonbuscar2.setText("Buscar");
        botonbuscar2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 153, 255), new java.awt.Color(102, 153, 255)));
        botonbuscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonbuscar2ActionPerformed(evt);
            }
        });
        jPanel17.add(botonbuscar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 80, 20));

        TabPanelPrincipal.addTab("ADMINISTRADORES", jPanel17);

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
        TabPanelPrincipal.setSelectedIndex(1);  
    }//GEN-LAST:event_jPanel7MouseClicked

    private void jPanel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseClicked
        TabPanelPrincipal.setSelectedIndex(3);      
    }//GEN-LAST:event_jPanel9MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        TabPanelPrincipal.setSelectedIndex(3);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        TabPanelPrincipal.setSelectedIndex(5);      
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        TabPanelPrincipal.setSelectedIndex(4);      
    }//GEN-LAST:event_jLabel12MouseClicked

    private void botonelimiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonelimiActionPerformed

        int filaSeleccionada = tablavuelos.getSelectedRow();
        if (filaSeleccionada >= 0) {
            int idVuelo = (int) tablavuelos.getValueAt(filaSeleccionada, 0);

         
            int confirmar = JOptionPane.showConfirmDialog(this,
                    "¿Está seguro de eliminar este vuelo?", "Confirmar",
                    JOptionPane.YES_NO_OPTION);

            if (confirmar == JOptionPane.YES_OPTION) {
                try {
                    vueloDAO.eliminarVuelo(idVuelo);
                    actualizarTablaVuelos(); 
                    JOptionPane.showMessageDialog(this, "Vuelo eliminado correctamente");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this,
                            "Error al eliminar: " + e.getMessage(),
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this,
                    "Seleccione un vuelo para eliminar",
                    "Advertencia", JOptionPane.WARNING_MESSAGE);

        }
        limpiarCamposVuelo();

    }//GEN-LAST:event_botonelimiActionPerformed

    private void botoneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoneditActionPerformed
        try {
         
            int filaSeleccionada = tablavuelos.getSelectedRow();
            if (filaSeleccionada < 0) {
                JOptionPane.showMessageDialog(this,
                        "Por favor seleccione un vuelo de la tabla",
                        "Error",
                        JOptionPane.WARNING_MESSAGE);
                return;
            }

   
            DefaultTableModel modelo = (DefaultTableModel) tablavuelos.getModel();
            int idVuelo = (int) modelo.getValueAt(filaSeleccionada, 0);

            if (txtNumeroVuelo.getText().trim().isEmpty()
                    || comboorigen.getSelectedIndex() <= 0
                    || comboDestino.getSelectedIndex() <= 0
                    || dateChooserSalida.getDate() == null
                    || dateChooserLlegada.getDate() == null) {

                JOptionPane.showMessageDialog(this,
                        "Complete todos los campos obligatorios",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (dateChooserSalida.getDate().after(dateChooserLlegada.getDate())) {
                JOptionPane.showMessageDialog(this,
                        "La fecha de salida no puede ser posterior a la de llegada",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (comboorigen.getSelectedItem().equals(comboDestino.getSelectedItem())) {
                JOptionPane.showMessageDialog(this,
                        "El origen y destino no pueden ser iguales",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }

         
            int confirmacion = JOptionPane.showConfirmDialog(
                    this,
                    "¿Está seguro que desea actualizar este vuelo?",
                    "Confirmar edición",
                    JOptionPane.YES_NO_OPTION);

            if (confirmacion != JOptionPane.YES_OPTION) {
                return;
            }

            Vuelo vueloActualizado = new VueloDAO(em).buscarPorId(idVuelo);
            if (vueloActualizado == null) {
                throw new Exception("Vuelo no encontrado");
            }

           
            vueloActualizado.setNumeroVuelo(txtNumeroVuelo.getText().trim());
            vueloActualizado.setOrigen(comboorigen.getSelectedItem().toString());
            vueloActualizado.setDestino(comboDestino.getSelectedItem().toString());
            vueloActualizado.setFechaSalida(dateChooserSalida.getDate());
            vueloActualizado.setFechaLlegada(dateChooserLlegada.getDate());

            if (comboAvion.getSelectedIndex() > 0) {
                String avionSeleccionado = comboAvion.getSelectedItem().toString();
                int idAvion = Integer.parseInt(avionSeleccionado.split(" - ")[0]);
                Avion avion = new AvionDAO(em).buscarPorId(idAvion);
                vueloActualizado.setAvion(avion);
            } else {
                vueloActualizado.setAvion(null);
            }


            new VueloDAO(em).actualizar(vueloActualizado);

         
            listarVuelosAction();
            limpiarFormularioVuelo();

            JOptionPane.showMessageDialog(this,
                    "Vuelo actualizado correctamente",
                    "Éxito",
                    JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Error al actualizar vuelo: " + e.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
      
    }//GEN-LAST:event_botoneditActionPerformed

    private void botonguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonguardarActionPerformed
        try {
           
            if (txtNumeroVuelo.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ingrese el número de vuelo", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (comboorigen.getSelectedIndex() <= 0) {
                JOptionPane.showMessageDialog(this, "Seleccione un origen válido", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (comboDestino.getSelectedIndex() <= 0) {
                JOptionPane.showMessageDialog(this, "Seleccione un destino válido", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (dateChooserSalida.getDate() == null) {
                JOptionPane.showMessageDialog(this, "Seleccione fecha de salida", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (dateChooserLlegada.getDate() == null) {
                JOptionPane.showMessageDialog(this, "Seleccione fecha de llegada", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (dateChooserSalida.getDate().after(dateChooserLlegada.getDate())) {
                JOptionPane.showMessageDialog(this,
                        "La fecha de salida no puede ser posterior a la de llegada",
                        "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            String numeroVuelo = txtNumeroVuelo.getText();
            if (vueloDAO.existeNumeroVuelo(numeroVuelo)) {
              

                JOptionPane.showMessageDialog(this,
                        "Ya existe un vuelo con ese número.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (comboorigen.getSelectedItem().equals(comboDestino.getSelectedItem())) {
                JOptionPane.showMessageDialog(this,
                        "El origen y destino no pueden ser iguales",
                        "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Vuelo nuevoVuelo = new Vuelo();
            nuevoVuelo.setNumeroVuelo(txtNumeroVuelo.getText().trim());
            nuevoVuelo.setOrigen(comboorigen.getSelectedItem().toString());
            nuevoVuelo.setDestino(comboDestino.getSelectedItem().toString());
            nuevoVuelo.setFechaSalida(dateChooserSalida.getDate());
            nuevoVuelo.setFechaLlegada(dateChooserLlegada.getDate());

      
            if (comboAvion.getSelectedIndex() > 0) {
                String avionSeleccionado = comboAvion.getSelectedItem().toString();
                int idAvion = Integer.parseInt(avionSeleccionado.split(" - ")[0]);
                Avion avion = new AvionDAO(em).buscarPorId(idAvion);
                nuevoVuelo.setAvion(avion);
            }

            
            new VueloDAO(em).crear(nuevoVuelo);

            limpiarFormularioVuelo();
            listarVuelosAction();

            JOptionPane.showMessageDialog(this,
                    "Vuelo registrado exitosamente",
                    "Éxito", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Error al registrar vuelo: " + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_botonguardarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            
            List<Reserva> reservas = ReservaDAO.listarTodos();

            DefaultTableModel modelo = (DefaultTableModel) jTableReservas.getModel();
            modelo.setRowCount(0);

            for (Reserva r : reservas) {
                String nombrePasajero = r.getPasajero() != null ? r.getPasajero().getnombre() : "N/A";
                String numeroVuelo = r.getVuelo() != null ? r.getVuelo().getNumeroVuelo() : "N/A";
                String estado = r.getEstado() != null ? r.getEstado().toString() : "Sin estado";

                modelo.addRow(new Object[]{
                    r.getIdReserva(),
                    r.getCodigoReserva(),
                    nombrePasajero,
                    numeroVuelo,
                    estado,
                    r.getTotalPagado()
                });
            }

            ajustarAnchoColumnasReservas();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Error al cargar reservas: " + e.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    private void cancelarReservaAction(java.awt.event.ActionEvent evt) {
        int filaSeleccionada = jTableReservas.getSelectedRow();

        if (filaSeleccionada < 0) {
            JOptionPane.showMessageDialog(this,
                    "Por favor seleccione una reserva de la tabla",
                    "Error",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }


        DefaultTableModel modelo = (DefaultTableModel) jTableReservas.getModel();
        int idReserva = (int) modelo.getValueAt(filaSeleccionada, 0);

     
        int confirmacion = JOptionPane.showConfirmDialog(
                this,
                "¿Está seguro que desea cancelar esta reserva?",
                "Confirmar cancelación",
                JOptionPane.YES_NO_OPTION);

        if (confirmacion != JOptionPane.YES_OPTION) {
            return;
        }

       
        try {

            ReservaDAO reservaDAO = new ReservaDAO(null);
            reservaDAO.cambiarEstado(idReserva, Reserva.EstadoReserva.CANCELADA);

            listarReservasAction(null);

            JOptionPane.showMessageDialog(this,
                    "Reserva cancelada correctamente",
                    "Éxito",
                    JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Error al cancelar reserva: " + e.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void botoneliminar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoneliminar2ActionPerformed

        int filaSeleccionada = tablaaviones.getSelectedRow();
        if (filaSeleccionada < 0) {
            JOptionPane.showMessageDialog(this,
                    "Por favor seleccione un avión de la tabla",
                    "Error",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        
        DefaultTableModel modelo = (DefaultTableModel) tablaaviones.getModel();
        long idAvion = (long) modelo.getValueAt(filaSeleccionada, 0); 

        int confirmacion = JOptionPane.showConfirmDialog(
                this,
                "¿Está seguro que desea eliminar este avión?",
                "Confirmar eliminación",
                JOptionPane.YES_NO_OPTION);

        if (confirmacion != JOptionPane.YES_OPTION) {
            return;
        }

     
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();

         
            Avion avion = em.find(Avion.class, idAvion);
            if (avion != null) {
                em.remove(avion);
                tx.commit();

           
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

    private void botonlistar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonlistar1ActionPerformed

        try {

            List<Avion> aviones = avionDAO.listarTodos();

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

            ajustarAnchoColumnasAviones();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Error al cargar aviones: " + e.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    private void ajustarAnchoColumnasAviones() {
        tablaaviones.setAutoResizeMode(tablaaviones.AUTO_RESIZE_OFF);

        tablaaviones.getColumnModel().getColumn(0).setPreferredWidth(50);
        tablaaviones.getColumnModel().getColumn(1).setPreferredWidth(120);
        tablaaviones.getColumnModel().getColumn(2).setPreferredWidth(80);
        tablaaviones.getColumnModel().getColumn(3).setPreferredWidth(150);

    }//GEN-LAST:event_botonlistar1ActionPerformed

    private void botoneditar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoneditar1ActionPerformed

        try {

            if (tablaaviones.getSelectedRow() < 0) {
                JOptionPane.showMessageDialog(this, "Seleccione un avión", "Error", JOptionPane.WARNING_MESSAGE);
                return;
            }

            if (!validarCamposAvion()) {
                return;
            }

            DefaultTableModel modelo = (DefaultTableModel) tablaaviones.getModel();
            long idAvion = ((Number) modelo.getValueAt(tablaaviones.getSelectedRow(), 0)).longValue();

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

                    avion.setMatricula(capmatricula.getText().toUpperCase()); // Forzar mayúsculas
                    avion.setCapacidadPasajeros(Integer.parseInt(capcapacidad.getText()));
                    avion.setEstado(comborol1.getSelectedItem().toString());

                    em.merge(avion);
                    tx.commit();

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

    private void botonagregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonagregar1ActionPerformed

        if (!validarCamposAvion()) {
            return;
        }

        String matricula = capmatricula.getText().trim();
        int capacidad = Integer.parseInt(capcapacidad.getText());
        String estado = comborol1.getSelectedItem().toString();

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

    private void botonbuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonbuscar1ActionPerformed

        String busqueda = txtbuscarAvion.getText().trim();

        if (busqueda.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese un ID o matrícula para buscar", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            Avion avion;

            if (busqueda.matches("\\d+")) {
                int id = Integer.parseInt(busqueda);
                avion = avionDAO.buscarPorId(id);
            } else {
                avion = avionDAO.buscarPorMatricula(busqueda.toUpperCase());
            }

            if (avion != null) {

                DefaultTableModel modelo = (DefaultTableModel) tablaaviones.getModel();
                modelo.setRowCount(0);
                modelo.addRow(new Object[]{
                    avion.getIdAvion(),
                    avion.getMatricula(),
                    avion.getCapacidadPasajeros(),
                    avion.getEstado()
                });

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

    private void txtbuscarAvionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscarAvionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbuscarAvionActionPerformed

    private void comborol1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comborol1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comborol1ActionPerformed

    private void tablaavionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaavionesMouseClicked
        int fila = tablaaviones.getSelectedRow();
        if (fila >= 0) {
            DefaultTableModel modelo = (DefaultTableModel) tablaaviones.getModel();
            capmatricula.setText(modelo.getValueAt(fila, 1).toString());
            capcapacidad.setText(modelo.getValueAt(fila, 2).toString());
            comborol1.setSelectedItem(modelo.getValueAt(fila, 3).toString());
        }
    }//GEN-LAST:event_tablaavionesMouseClicked

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
        }
    }//GEN-LAST:event_botoneliminar1ActionPerformed

    private void txtbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbuscarActionPerformed

    private void comborolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comborolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comborolActionPerformed

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

    private void botonlistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonlistarActionPerformed
        try {

            List<Pasajero> pasajeros = pasajeroDAO.listarTodos();

            DefaultTableModel modelo = (DefaultTableModel) tablapasajero.getModel();
            modelo.setRowCount(0);

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

            ajustarAnchoColumnas();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Error al cargar pasajeros: " + e.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }

    }

    private void ajustarAnchoColumnas() {
        tablapasajero.setAutoResizeMode(tablapasajero.AUTO_RESIZE_OFF);

        tablapasajero.getColumnModel().getColumn(0).setPreferredWidth(50);  // ID
        tablapasajero.getColumnModel().getColumn(1).setPreferredWidth(100); // Nombre
        tablapasajero.getColumnModel().getColumn(2).setPreferredWidth(100); // Apellido
        tablapasajero.getColumnModel().getColumn(3).setPreferredWidth(150); // Correo
        tablapasajero.getColumnModel().getColumn(4).setPreferredWidth(80);  // Teléfono
        tablapasajero.getColumnModel().getColumn(5).setPreferredWidth(100); // Identificación
        tablapasajero.getColumnModel().getColumn(6).setPreferredWidth(120); // Rol
    }//GEN-LAST:event_botonlistarActionPerformed

    private void botoneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoneditarActionPerformed

        int fila = tablapasajero.getSelectedRow();
        if (fila < 0) {
            JOptionPane.showMessageDialog(this, "Seleccione un pasajero");
            return;
        }
        if (!txttelefono.getText().matches("\\d{7,10}")) {
            JOptionPane.showMessageDialog(this, "Teléfono debe tener 7 a 10 dígitos", "Error", JOptionPane.ERROR_MESSAGE);
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
        limpiarCampos();
    }//GEN-LAST:event_botoneditarActionPerformed

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

    private void tablapasajeroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablapasajeroMouseClicked

        int filaVista = tablapasajero.getSelectedRow();
        if (filaVista >= 0) {

            int filaModelo = tablapasajero.convertRowIndexToModel(filaVista);
            TableModel modelo = tablapasajero.getModel();

            Object id = modelo.getValueAt(filaModelo, 0);
            Object nombre = modelo.getValueAt(filaModelo, 1);
            Object apellido = modelo.getValueAt(filaModelo, 2);
            Object identificacion = modelo.getValueAt(filaModelo, 3);
            Object telefono = modelo.getValueAt(filaModelo, 4);
            Object correo = modelo.getValueAt(filaModelo, 5);
            Object rol = modelo.getValueAt(filaModelo, 6);

            txtnombre.setText(nombre != null ? nombre.toString() : "");
            txtapellido.setText(apellido != null ? apellido.toString() : "");
            txtidentificacion.setText(identificacion != null ? identificacion.toString() : "");
            txttelefono.setText(telefono != null ? telefono.toString() : "");
            txtcorreo.setText(correo != null ? correo.toString() : "");
            comborol.setSelectedItem(rol != null ? rol.toString() : "");

        }
    }//GEN-LAST:event_tablapasajeroMouseClicked

    private void comboAvionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboAvionMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_comboAvionMouseClicked

    private void tablavuelosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablavuelosMouseClicked
        int filaVista = tablavuelos.getSelectedRow();
        if (filaVista >= 0) {

            int filaModelo = tablavuelos.convertRowIndexToModel(filaVista);
            DefaultTableModel modelo = (DefaultTableModel) tablavuelos.getModel();

            try {

                String numeroVuelo = modelo.getValueAt(filaModelo, 1).toString();
                String origen = modelo.getValueAt(filaModelo, 2).toString();
                String destino = modelo.getValueAt(filaModelo, 3).toString();

                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

                String fechaSalidaString = modelo.getValueAt(filaModelo, 4).toString();
                String fechaLlegadaString = modelo.getValueAt(filaModelo, 5).toString();

                Date fechaSalida = sdf.parse(fechaSalidaString);
                Date fechaLlegada = sdf.parse(fechaLlegadaString);

                String matriculaAvion = modelo.getValueAt(filaModelo, 6).toString();

                txtNumeroVuelo.setText(numeroVuelo);
                comboorigen.setSelectedItem(origen);
                comboDestino.setSelectedItem(destino);
                dateChooserSalida.setDate(fechaSalida);
                dateChooserLlegada.setDate(fechaLlegada);

                for (int i = 0; i < comboAvion.getItemCount(); i++) {
                    if (comboAvion.getItemAt(i).toString().contains(matriculaAvion)) {
                        comboAvion.setSelectedIndex(i);
                        break;
                    }
                }

            } catch (ParseException e) {
                JOptionPane.showMessageDialog(this,
                        "Error al parsear fechas: " + e.getMessage(),
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }


    }//GEN-LAST:event_tablavuelosMouseClicked

    private void comboorigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboorigenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboorigenActionPerformed

    private void botonagregar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonagregar2ActionPerformed

        try {

            if (txtnombre1.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ingrese el nombre del administrador", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (txttelefono1.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ingrese el teléfono", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (!txttelefono1.getText().matches("\\d{7,15}")) {
                JOptionPane.showMessageDialog(this,
                        "Teléfono debe contener solo números (7-15 dígitos)",
                        "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (!txttelefono.getText().matches("\\d{7,10}")) {
                JOptionPane.showMessageDialog(this, "Teléfono debe tener 7 a 10 dígitos", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (!txtidentificacion.getText().matches("\\d+")) {
                JOptionPane.showMessageDialog(this, "Identificación debe contener solo números", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String rolSeleccionado = comborol2.getSelectedItem().toString();
            if (comborol2.getSelectedIndex() <= 0
                    || (!rolSeleccionado.equals("ADMINISTRADOR 1") && !rolSeleccionado.equals("ADMINISTRADOR 2"))) {
                JOptionPane.showMessageDialog(this,
                        "Seleccione un rol válido (ADMINISTRADOR 1 o ADMINISTRADOR 2)",
                        "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Administrador nuevoAdmin = new Administrador();
            nuevoAdmin.setNombre(txtnombre1.getText().trim());
            nuevoAdmin.setTelefono(txttelefono1.getText().trim());
            nuevoAdmin.setRol(rolSeleccionado);

            administradorDAO.crear(nuevoAdmin);

            limpiarCamposAdministrador();
            listarAdministradores();

            JOptionPane.showMessageDialog(this,
                    "Administrador registrado exitosamente",
                    "Éxito", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Error al registrar administrador: " + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }

    }//GEN-LAST:event_botonagregar2ActionPerformed

    private void botoneditar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoneditar2ActionPerformed

        try {

            int filaSeleccionada = tablaadministrador.getSelectedRow();
            if (filaSeleccionada < 0) {
                JOptionPane.showMessageDialog(this,
                        "Por favor seleccione un administrador de la tabla",
                        "Error",
                        JOptionPane.WARNING_MESSAGE);
                return;
            }

            DefaultTableModel modelo = (DefaultTableModel) tablaadministrador.getModel();
            int idAdmin = (int) modelo.getValueAt(filaSeleccionada, 0);

            if (txtnombre1.getText().trim().isEmpty()
                    || txttelefono1.getText().trim().isEmpty()
                    || comborol2.getSelectedIndex() <= 0) {

                JOptionPane.showMessageDialog(this,
                        "Complete todos los campos obligatorios",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (!txttelefono1.getText().matches("\\d{7,15}")) {
                JOptionPane.showMessageDialog(this,
                        "Teléfono debe contener solo números (7-15 dígitos)",
                        "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (!txtidentificacion.getText().matches("\\d+")) {
                JOptionPane.showMessageDialog(this, "Identificación debe contener solo números", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            int confirmacion = JOptionPane.showConfirmDialog(
                    this,
                    "¿Está seguro que desea actualizar este administrador?",
                    "Confirmar edición",
                    JOptionPane.YES_NO_OPTION);

            if (confirmacion != JOptionPane.YES_OPTION) {
                return;
            }

            Administrador adminActualizado = administradorDAO.buscarPorId(idAdmin);
            if (adminActualizado == null) {
                throw new Exception("Administrador no encontrado");
            }

            adminActualizado.setNombre(txtnombre1.getText().trim());
            adminActualizado.setTelefono(txttelefono1.getText().trim());
            adminActualizado.setRol(comborol2.getSelectedItem().toString());

            administradorDAO.actualizar(adminActualizado);

            listarAdministradores();
            limpiarCamposAdministrador();

            JOptionPane.showMessageDialog(this,
                    "Administrador actualizado correctamente",
                    "Éxito",
                    JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Error al actualizar administrador: " + e.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }

    }//GEN-LAST:event_botoneditar2ActionPerformed

    private void botonlistar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonlistar2ActionPerformed

        try {

            List<Administrador> administradores = administradorDAO.listarTodos();

            DefaultTableModel modelo = (DefaultTableModel) tablaadministrador.getModel();
            modelo.setRowCount(0);

            for (Administrador admin : administradores) {
                modelo.addRow(new Object[]{
                    admin.getId(),
                    admin.getNombre(),
                    admin.getTelefono(),
                    admin.getRol()
                });
            }

            ajustarColumnasAdmin();

            JOptionPane.showMessageDialog(this,
                    "Listado de administradores actualizado",
                    "Información",
                    JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Error al cargar administradores: " + e.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }

    }//GEN-LAST:event_botonlistar2ActionPerformed

    private void botoneliminar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoneliminar3ActionPerformed

        try {
            int filaSeleccionada = tablaadministrador.getSelectedRow();
            if (filaSeleccionada < 0) {
                JOptionPane.showMessageDialog(this,
                        "Por favor seleccione un administrador de la tabla",
                        "Error",
                        JOptionPane.WARNING_MESSAGE);
                return;
            }

            DefaultTableModel modelo = (DefaultTableModel) tablaadministrador.getModel();
            int idAdmin = (int) modelo.getValueAt(filaSeleccionada, 0);

            int confirmacion = JOptionPane.showConfirmDialog(
                    this,
                    "¿Está seguro que desea eliminar este administrador?",
                    "Confirmar eliminación",
                    JOptionPane.YES_NO_OPTION);

            if (confirmacion != JOptionPane.YES_OPTION) {
                return;
            }

            administradorDAO.eliminar(idAdmin);

            listarAdministradores();
            limpiarCamposAdministrador();

            JOptionPane.showMessageDialog(this,
                    "Administrador eliminado correctamente",
                    "Éxito",
                    JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Error al eliminar administrador: " + e.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }

    }//GEN-LAST:event_botoneliminar3ActionPerformed

    private void comborol2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comborol2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comborol2ActionPerformed

    private void txtbuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbuscar1ActionPerformed

    private void botonbuscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonbuscar2ActionPerformed

        String idStr = txtbuscar1.getText().trim();

        if (idStr.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Ingrese un ID para buscar",
                    "Error",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {

            int idAdmin = Integer.parseInt(idStr);

            Administrador admin = administradorDAO.buscarPorId(idAdmin);

            if (admin != null) {

                DefaultTableModel modelo = (DefaultTableModel) tablaadministrador.getModel();
                modelo.setRowCount(0);
                modelo.addRow(new Object[]{
                    admin.getId(),
                    admin.getNombre(),
                    admin.getTelefono(),
                    admin.getRol()
                });

                txtnombre1.setText(admin.getNombre());
                txttelefono1.setText(admin.getTelefono());
                comborol2.setSelectedItem(admin.getRol());

                ajustarColumnasAdmin();
            } else {
                JOptionPane.showMessageDialog(this,
                        "No se encontró un administrador con ID: " + idAdmin,
                        "No encontrado",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,
                    "ID inválido. Debe ser un número entero",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Error en la búsqueda: " + e.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_botonbuscar2ActionPerformed

    private void jPanel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel15MouseClicked
        TabPanelPrincipal.setSelectedIndex(4);        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel15MouseClicked

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        TabPanelPrincipal.setSelectedIndex(5);        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
  new VentanaInicio().setVisible(true);
    }//GEN-LAST:event_jLabel7MouseClicked

    public static void main(String args[]) {
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
    private javax.swing.JButton botonagregar2;
    public javax.swing.JButton botonbuscar;
    public javax.swing.JButton botonbuscar1;
    public javax.swing.JButton botonbuscar2;
    private javax.swing.JButton botonedit;
    private javax.swing.JButton botoneditar;
    private javax.swing.JButton botoneditar1;
    private javax.swing.JButton botoneditar2;
    private javax.swing.JButton botonelimi;
    private javax.swing.JButton botoneliminar1;
    private javax.swing.JButton botoneliminar2;
    private javax.swing.JButton botoneliminar3;
    private javax.swing.JButton botonguardar;
    private javax.swing.JButton botonlistar;
    private javax.swing.JButton botonlistar1;
    private javax.swing.JButton botonlistar2;
    private javax.swing.JTextField capcapacidad;
    private javax.swing.JTextField capmatricula;
    private javax.swing.JComboBox<String> comboAvion;
    private javax.swing.JComboBox<String> comboDestino;
    private javax.swing.JComboBox<String> comboorigen;
    private javax.swing.JComboBox<String> comborol;
    private javax.swing.JComboBox<String> comborol1;
    private javax.swing.JComboBox<String> comborol2;
    private com.toedter.calendar.JDateChooser dateChooserLlegada;
    private com.toedter.calendar.JDateChooser dateChooserSalida;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableReservas;
    private javax.swing.JTable tablaadministrador;
    private javax.swing.JTable tablaaviones;
    public javax.swing.JTable tablapasajero;
    private javax.swing.JTable tablavuelos;
    private javax.swing.JTextField txtNumeroVuelo;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtbuscar1;
    private javax.swing.JTextField txtbuscarAvion;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtidentificacion;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtnombre1;
    private javax.swing.JTextField txttelefono;
    private javax.swing.JTextField txttelefono1;
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
        modeloTabla.setRowCount(0);

        for (Pasajero p : pasajeros) {
            modeloTabla.addRow(new Object[]{
                p.getIdUsuario(),
                p.getnombre(),
                p.getApellido(),
                p.getIdentificacion(),
                p.getTelefono(),
                p.getCorreo(),
                p.getRol()
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
            return true;
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

    private void listarReservasAction(Object object) {
        ReservaDAO reservaDAO = new ReservaDAO(null);
        List<Reserva> reservas = reservaDAO.obtenerTodas();
        cargarReservasEnTabla();
    }

    private void initjTableReservas() {
        String[] columnas = {"ID", "Pasajero", "Vuelo", "Fecha Reserva", "Estado"};
        DefaultTableModel modelo = new DefaultTableModel(null, columnas);
        jTableReservas.setModel(modelo);
    }

    private void listarReservasAction() {
        ReservaDAO reservaDAO = new ReservaDAO(null);
        List<Reserva> reservas = reservaDAO.obtenerTodas();
        cargarReservasEnTabla();
    }

    private void cargarReservasEnTabla() {

        ReservaDAO reservaDAO = new ReservaDAO(null); // Deberías usar un EntityManager válido
        List<Reserva> reservas = reservaDAO.obtenerTodas();

        DefaultTableModel modelo = (DefaultTableModel) jTableReservas.getModel();
        modelo.setRowCount(0);

        for (Reserva r : reservas) {
            Object[] fila = {
                r.getIdReserva(),
                r.getPasajero() != null ? r.getPasajero().getnombre() : "Sin pasajero", // Corregí getnombre() a getNombre()
                r.getVuelo() != null ? r.getVuelo().getNumeroVuelo() : "Sin vuelo",
                r.getFechaReserva(),
                r.getEstado()
            };
            modelo.addRow(fila);
        }

        ajustarAnchoColumnasReservas();
    }

    private void ajustarAnchoColumnasReservas() {
        if (jTableReservas == null) {
            return;
        }

        jTableReservas.setAutoResizeMode(jTableReservas.AUTO_RESIZE_OFF);

        int[] anchos = {50, 150, 100, 120, 100};

        for (int i = 0; i < anchos.length; i++) {
            if (i < jTableReservas.getColumnModel().getColumnCount()) {
                jTableReservas.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }
        }

        jTableReservas.revalidate();
        jTableReservas.repaint();
    }

    private void cargarVuelosEnTabla(List<Vuelo> vuelos) {
        DefaultTableModel modelo = (DefaultTableModel) tablavuelos.getModel();
        modelo.setRowCount(0);

        for (Vuelo v : vuelos) {
            Object[] fila = {
                v.getIdVuelo(),
                v.getNumeroVuelo(),
                v.getOrigen(),
                v.getDestino(),
                v.getFechaSalida(),
                v.getFechaLlegada()
            };
            modelo.addRow(fila);
        }

        ajustarAnchoColumnasVuelos();
    }

    private void ajustarAnchoColumnasVuelos() {
        tablavuelos.setAutoResizeMode(tablavuelos.AUTO_RESIZE_OFF);

        tablavuelos.getColumnModel().getColumn(0).setPreferredWidth(50);   // ID Vuelo
        tablavuelos.getColumnModel().getColumn(1).setPreferredWidth(100);  // Número Vuelo
        tablavuelos.getColumnModel().getColumn(2).setPreferredWidth(100);  // Origen
        tablavuelos.getColumnModel().getColumn(3).setPreferredWidth(100);  // Destino
        tablavuelos.getColumnModel().getColumn(4).setPreferredWidth(120);  // Fecha Salida
        tablavuelos.getColumnModel().getColumn(5).setPreferredWidth(120);  // Fecha Llegada
        tablavuelos.getColumnModel().getColumn(6).setPreferredWidth(100);  // Avión

        tablavuelos.revalidate();
        tablavuelos.repaint();
    }

    private void initjTableVuelos() {
        String[] columnas = {"ID Vuelo", "Número Vuelo", "Origen", "Destino", "Fecha Salida", "Fecha Llegada", "Avión"};
        DefaultTableModel modelo = new DefaultTableModel(null, columnas) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tablavuelos.setModel(modelo);
        ajustarAnchoColumnasVuelos();
    }

    private void limpiarFormularioVuelo() {
        txtNumeroVuelo.setText("");
        comboorigen.setSelectedIndex(0);
        comboDestino.setSelectedIndex(0);
        dateChooserSalida.setDate(null);
        dateChooserLlegada.setDate(null);
        comboAvion.setSelectedIndex(0);
        txtNumeroVuelo.requestFocus();
    }

    private void cargarAvionesEnCombo() {
        comboAvion.removeAllItems();
        comboAvion.addItem("-- Seleccione avión --");

        try {
            List<Avion> aviones = new AvionDAO(em).listarTodos();
            for (Avion avion : aviones) {
                comboAvion.addItem(avion.getIdAvion() + " - " + avion.getMatricula());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Error al cargar aviones: " + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void cargarCiudadesEnCombos() {
        comboorigen.removeAllItems();
        comboDestino.removeAllItems();

        comboorigen.addItem("-- Seleccione origen --");
        comboDestino.addItem("-- Seleccione destino --");

        String[] ciudades = {"CARTAGENA", "BOGOTA", "MEDELLIN", "CALI", "BARRANQUILLA"};
        for (String ciudad : ciudades) {
            comboorigen.addItem(ciudad);
            comboDestino.addItem(ciudad);
        }
    }

    private void listarVuelosAction() {
        try {
            DefaultTableModel modelo = (DefaultTableModel) tablavuelos.getModel();
            modelo.setRowCount(0);

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

            List<Vuelo> vuelos = new VueloDAO(em).listarTodos();
            for (Vuelo v : vuelos) {
                modelo.addRow(new Object[]{
                    v.getIdVuelo(),
                    v.getNumeroVuelo(),
                    v.getOrigen(),
                    v.getDestino(),
                    sdf.format(v.getFechaSalida()),
                    sdf.format(v.getFechaLlegada()),
                    v.getAvion() != null ? v.getAvion().getMatricula() : "No asignado"
                });
            }

            ajustarAnchoColumnasVuelos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Error al cargar vuelos: " + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void actualizarTablaVuelos() {
        DefaultTableModel modelo = (DefaultTableModel) tablavuelos.getModel();
        modelo.setRowCount(0); // Limpiar tabla

        List<Vuelo> vuelos = vueloDAO.obtenerTodos();
        for (Vuelo v : vuelos) {
            modelo.addRow(new Object[]{
                v.getIdVuelo(),
                v.getNumeroVuelo(),
                v.getOrigen(),
                v.getDestino(),
                v.getFechaSalida(),
                v.getFechaLlegada(),
                v.getAvion() != null ? v.getAvion().getMatricula() : ""
            });
        }
    }

    private void limpiarCamposVuelo() {
        txtNumeroVuelo.setText("");

    }

    public void listarAdministradores() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ConfigDB");
        EntityManager em = emf.createEntityManager();

        try {
            DefaultTableModel modelo = (DefaultTableModel) tablaadministrador.getModel();
            modelo.setRowCount(0); // Limpiar tabla

            AdministradorDAO adminDAO = new AdministradorDAO(em);
            List<Administrador> administradores = adminDAO.listarTodos();

            for (Administrador admin : administradores) {
                modelo.addRow(new Object[]{
                    admin.getId(),
                    admin.getNombre(),
                    admin.getTelefono(),
                    admin.getRol()
                });
                ajustarColumnasAdmin();
            }

            ajustarColumnasAdmin();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Error al cargar administradores: " + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            em.close();
            emf.close();
        }
    }

    private void initTablaAdministradores() {

        DefaultTableModel modelo = new DefaultTableModel(
                new Object[]{"ID", "Nombre", "Teléfono", "Rol"}, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };
        tablaadministrador.setModel(modelo);

        tablaadministrador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int fila = tablaadministrador.getSelectedRow();
                if (fila >= 0) {
                    txtnombre1.setText(tablaadministrador.getValueAt(fila, 1).toString());
                    txttelefono1.setText(tablaadministrador.getValueAt(fila, 2).toString());
                    comborol2.setSelectedItem(tablaadministrador.getValueAt(fila, 3).toString());
                }

            }
        });
    }

    private boolean existeAdministrador(String nombre) {
        try {
            Query query = em.createQuery("SELECT COUNT(a) FROM Administrador a WHERE a.nombre = :nombre");
            query.setParameter("nombre", nombre);
            Long count = (Long) query.getSingleResult();
            return count > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    private void limpiarCamposAdministrador() {
        txtnombre.setText("");
        txttelefono.setText("");
        comborol2.setSelectedIndex(0);
        txtnombre.requestFocus();

    }

    private void ajustarColumnasAdmin() {

        tablaadministrador.getColumnModel().getColumn(0).setPreferredWidth(150);
        tablaadministrador.getColumnModel().getColumn(1).setPreferredWidth(150);
        tablaadministrador.getColumnModel().getColumn(2).setPreferredWidth(150);
        tablaadministrador.getColumnModel().getColumn(3).setPreferredWidth(160);

        tablaadministrador.setAutoResizeMode(tablapasajero.AUTO_RESIZE_OFF);

        tablaadministrador.revalidate();
        tablaadministrador.repaint();
    }

    private void inicializarComboRolesAdministrador() {
        comborol2.removeAllItems(); // Limpiar items existentes
        comborol2.addItem("-- Seleccione rol --");
        comborol2.addItem("ADMINISTRADOR 1");
        comborol2.addItem("ADMINISTRADOR 2");
    }

    public class Validador {

        public static boolean esEmailValido(String email) {
            return email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
        }

        public static boolean esTelefonoValido(String telefono) {
            return telefono.matches("^[0-9]{7,15}$");
        }

    }
}
