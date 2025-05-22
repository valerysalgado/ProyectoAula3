package Dominio.Entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author valer
 */
@Entity
@Table(name = "vuelo")
public class Vuelo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idVuelo;

    @Column(length = 50, nullable = false)
    private String numeroVuelo;

    @Column(length = 100, nullable = false)
    private String origen;

    @Column(length = 100, nullable = false)
    private String destino;

   @Temporal(TemporalType.DATE)
    private Date fechaSalida;

    @Temporal(TemporalType.DATE)
    private Date fechaLlegada;

    @OneToMany(mappedBy = "vuelo", cascade = javax.persistence.CascadeType.ALL)
    private List<Asiento> asientos = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "idAvion", nullable = false)
    private Avion avion;

    public Vuelo() {
    }

    public Vuelo(String numeroVuelo, String origen, String destino, Date fechaSalida, Date fechaLlegada) {
        this.numeroVuelo = numeroVuelo;
        this.origen = origen;
        this.destino = destino;
        this.fechaSalida = fechaSalida;
        this.fechaLlegada = fechaLlegada;
    }

    // Getters y Setters
    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public int getIdVuelo() {
        return idVuelo;
    }

    public void setIdVuelo(int idVuelo) {
        this.idVuelo = idVuelo;
    }

    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(String numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }
     public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
    
   
    public void setFechaLlegada(Date fechaLlegada) {
    if (this.fechaSalida != null && fechaLlegada.before(this.fechaSalida)) {
        throw new IllegalArgumentException("La fecha de llegada debe ser posterior a la de salida");
    }
    this.fechaLlegada = fechaLlegada;
}
    public Date getFechaLlegada() {
    return fechaLlegada;
}

    public List<Asiento> getAsientos() {
        return asientos;
    }

    public void setAsientos(List<Asiento> asientos) {
        this.asientos = asientos;
    }

    // Métodos para manejar la relación con Asientos
    public void agregarAsiento(Asiento asiento) {
        asientos.add(asiento);
        asiento.setVuelo(this);
    }

    public void removerAsiento(Asiento asiento) {
        asientos.remove(asiento);
        asiento.setVuelo(null);
    }

    public boolean estaDisponible() {
    Date ahora = new Date();
    return ahora.before(this.fechaSalida);
}

public boolean estaEnVuelo() {
    Date ahora = new Date();
    return ahora.after(this.fechaSalida) && ahora.before(this.fechaLlegada);
}
@Override
public String toString() {
    return idVuelo + " - " + origen + " a " + destino;
}


  
}
