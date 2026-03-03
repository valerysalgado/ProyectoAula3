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
    private Long idAsiento;

    @Column(length = 10, nullable = false)
    private String numero;

    @Column(length = 20, nullable = false)
    private String clase;

    @Column(nullable = false)
    private boolean disponible;

    @ManyToOne
    @JoinColumn(name = "id_avion")
    private Avion avion;
    
    @ManyToOne
@JoinColumn(name = "id_vuelo")
private Vuelo vuelo;

    private boolean ocupado;

    public Asiento() {
    }

    public Asiento(Avion avion, String numero, String clase, boolean disponible) {
    this.avion = avion;
    this.numero = numero;
    this.clase = clase;
    this.disponible = disponible;
}


    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    // Getters y Setters
    public Long getIdAsiento() {
        return idAsiento;
    }

    public void setIdAsiento(Long idAsiento) {
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
    return numero + " - " + clase; // O lo que quieras mostrar
}


    public boolean isOcupado() {
        return ocupado;
    }

}
