package Dominio.Entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author valer
 */
@Entity
@Table(name = "asientos")
public class Asiento implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAsiento;
    
    @Column(length = 10, nullable = false)
    private String numero;
    
    @Column(length = 20, nullable = false)
    private String clase;
    
    @Column(nullable = false)
    private boolean disponible;
    
    @ManyToOne
    @JoinColumn(name = "idVuelo")
    private Vuelo vuelo;

    public Asiento() {
    }

    public Asiento(String numero, String clase, boolean disponible) {
        this.numero = numero;
        this.clase = clase;
        this.disponible = disponible;
    }

    // Getters y Setters
    public int getIdAsiento() {
        return idAsiento;
    }

    public void setIdAsiento(int idAsiento) {
        this.idAsiento = idAsiento;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    @Override
    public String toString() {
        return "Asiento\n" + "-------------------------\n" + 
            "ID: " + idAsiento + "\n" + 
            "Número: " + numero + "\n" + 
            "Clase: " + clase + "\n" + 
            "Disponible: " + (disponible ? "Sí" : "No") + "\n" +
            "Vuelo ID: " + (vuelo != null ? vuelo.getIdVuelo() : "N/A") + "\n";
    }

}