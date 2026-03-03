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

      @ManyToOne
   @JoinColumn(name = "id_pasajero", referencedColumnName = "idUsuario")
    private Pasajero pasajero;
   
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idAsiento") 
    private Asiento asiento;

    @ManyToOne(optional = false)
    @JoinColumn(name = "idVuelo") 
    private Vuelo vuelo;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fechaReserva")
    private Date fechaReserva;

    @Enumerated(EnumType.STRING)
    @Column(name = "estado")
    private EstadoReserva estado;

    @Column(name = "codgoReserva", length = 20, unique = true) // ← "codgoReserva" (sin 'i')
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
        this.codigoReserva = generarCodigoReserva();
    }

    public Reserva(Pasajero pasajero, Asiento asiento, Vuelo vuelo) {
        this();
        this.pasajero = pasajero;
        this.asiento = asiento;
        this.vuelo = vuelo;
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

    // Getters y setters (se mantienen igual)...
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

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public EstadoReserva getEstado() {
        return estado;
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

    public void setEstado(EstadoReserva estado) {
        this.estado = estado;
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
        return "Reserva{" +
                "idReserva=" + idReserva +
                ", pasajero=" + (pasajero != null ? pasajero.getnombre() : "null") +
                ", vuelo=" + (vuelo != null ? vuelo.getNumeroVuelo() : "null") +
                ", asiento=" + (asiento != null ? asiento.getNumero() : "null") +
                ", fechaReserva=" + fechaReserva +
                ", estado=" + estado +
                '}';
    }
}