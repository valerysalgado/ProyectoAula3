package Dominio.Entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "reservas")
public class Reserva implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_reserva")
    private Integer idReserva;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idUsuario", referencedColumnName = "idUsuario", nullable = false)
    private Pasajero pasajero;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idAsiento", referencedColumnName = "idAsiento", nullable = false)
    private Asiento asiento;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idVuelo", referencedColumnName = "idVuelo", nullable = false)
    private Vuelo vuelo;

    @Column(length = 100, nullable = false)
    private String origen;

    @Column(length = 100, nullable = false)
    private String destino;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false, updatable = false)
    private Date fechaReserva;

    @Enumerated(EnumType.STRING)
    @Column(length = 20, nullable = false)
    private EstadoReserva estado;

    @Column(name = "total_pagado", precision = 10, scale = 2, nullable = false)
    private double totalPagado;

    @Column(length = 20, unique = true)
    private String codigoReserva;

    @Version
    private Long version;

  

 

    public enum EstadoReserva {
        PENDIENTE,
        CONFIRMADA,
        CANCELADA,
        COMPLETADA
    }

    public Reserva() {
        this.fechaReserva = new Date();
        this.estado = EstadoReserva.PENDIENTE;
        this.totalPagado = 0.0;
        this.codigoReserva = generarCodigoReserva();
    }

    public Reserva(Pasajero pasajero, Asiento asiento, Vuelo vuelo,
            String origen, String destino, double totalPagado) {
        this();
        this.pasajero = pasajero;
        this.asiento = asiento;
        this.vuelo = vuelo;
        this.origen = origen;
        this.destino = destino;
        this.totalPagado = totalPagado;
    }

    public void confirmar() {
        if (this.estado == EstadoReserva.PENDIENTE) {
            this.estado = EstadoReserva.CONFIRMADA;
        }
    }

    public void cancelar() {
        if (this.estado != EstadoReserva.COMPLETADA) {
            this.estado = EstadoReserva.CANCELADA;
        }
    }

    public void completar() {
        if (this.estado == EstadoReserva.CONFIRMADA) {
            this.estado = EstadoReserva.COMPLETADA;
        }
    }

    private String generarCodigoReserva() {
        return "RES-" + System.currentTimeMillis() + "-" + (int) (Math.random() * 1000);
    }

    public Integer getIdReserva() {
        return idReserva;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public Asiento getAsiento() {
        return asiento;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public EstadoReserva getEstado() {
        return estado;
    }

    public double getTotalPagado() {
        return totalPagado;
    }

    public String getCodigoReserva() {
        return codigoReserva;
    }

    public Long getVersion() {
        return version;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }


    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setEstado(EstadoReserva estado) {
        this.estado = estado;
    }

    public void setTotalPagado(double totalPagado) {
        this.totalPagado = totalPagado;
    }

    public void setCodigoReserva(String codigoReserva) {
        this.codigoReserva = codigoReserva;
    }
      public void setIdReserva(Integer idReserva) {
        this.idReserva = idReserva;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public void setAsiento(Asiento asiento) {
        this.asiento = asiento;
    }
    

    @Override
    public String toString() {
        return "Reserva{"
                + "idReserva=" + idReserva
                + ", pasajero=" + (pasajero != null ? pasajero.getnombre() : "null")
                + ", vuelo=" + (vuelo != null ? vuelo.getNumeroVuelo() : "null")
                + ", asiento=" + (asiento != null ? asiento.getNumero() : "null")
                + ", origen='" + origen + '\''
                + ", destino='" + destino + '\''
                + ", fechaReserva=" + fechaReserva
                + ", estado=" + estado
                + ", totalPagado=" + totalPagado
                + ", codigoReserva='" + codigoReserva + '\''
                + '}';
    }
}
