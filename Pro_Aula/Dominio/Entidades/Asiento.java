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
    @JoinColumn(name = "id_avion")
    private Avion avion;

    private boolean ocupado;

    public Asiento() {
    }

    public Asiento(Vuelo vuelo1, String numero, String clase, boolean disponible) {
        this.numero = numero;
        this.clase = clase;
        this.disponible = disponible;
    }
// En Asiento.java
    private Vuelo vuelo;

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
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

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    @Override
    public String toString() {
        return "Asiento " + this.numero; // podés usar otra propiedad si querés
    }

    public boolean isOcupado() {
        return ocupado;
    }

}
