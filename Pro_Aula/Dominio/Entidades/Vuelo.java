package Dominio.Entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

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
    
    @Column(length = 50, nullable = false)
    private String fechaSalida;
    
    @Column(length = 50, nullable = false)
    private String fechaLlegada;
    
    @OneToMany(mappedBy = "vuelo", cascade = javax.persistence.CascadeType.ALL)
    private List<Asiento> asientos = new ArrayList<>();

    public Vuelo() {
    }

    public Vuelo(String numeroVuelo, String origen, String destino, String fechaSalida, String fechaLlegada) {
        this.numeroVuelo = numeroVuelo;
        this.origen = origen;
        this.destino = destino;
        this.fechaSalida = fechaSalida;
        this.fechaLlegada = fechaLlegada;
    }

    // Getters y Setters
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

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(String fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
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

    @Override
    public String toString() {
        return "Vuelo\n" + "-------------------------\n" + 
               "ID: " + idVuelo + "\n" + 
               "Número: " + numeroVuelo + "\n" + 
               "Origen: " + origen + "\n" + 
               "Destino: " + destino + "\n" + 
               "Salida: " + fechaSalida + "\n" + 
               "Llegada: " + fechaLlegada + "\n" +
               "Asientos: " + asientos.size() + "\n";
    }
}