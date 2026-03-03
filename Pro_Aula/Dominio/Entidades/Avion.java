package Dominio.Entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;

@Entity
@Table(name = "aviones")
public class Avion implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idAvion")
    private long idAvion;

    @Column(name = "matricula", length = 20, nullable = false, unique = true)
    private String matricula;
    @Column(name = "capacidad_pasajeros", nullable = false)
    private int capacidadPasajeros;
    @Column(name = "disponible", nullable = false)
    private boolean disponible;
    @Column(name = "estado", length = 20)
    private String estado;
    @OneToMany(mappedBy = "avion")
    private List<Vuelo> vuelos = new ArrayList<>();
    @OneToMany(mappedBy = "avion", fetch = FetchType.LAZY) // ← Usa LAZY
    private List<Asiento> asientos;

    public Avion() {
        this.disponible = true;
        this.estado = "En tierra";
    }

    public Avion(String matricula, int capacidadPasajeros) {
        this.matricula = matricula;
        this.capacidadPasajeros = capacidadPasajeros;
        this.disponible = true;
        this.estado = "EN TIERRA";
    }

    public long getIdAvion() {
        return idAvion;
    }

    public void setIdAvion(long idAvion) {
        this.idAvion = idAvion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        if (!matricula.matches("^[A-Z]{2,3}-\\d{3,4}$")) {
            throw new IllegalArgumentException("Formato de matrícula inválido. Debe ser ABC-1234");
        }
        this.matricula = matricula;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        if (capacidadPasajeros <= 0 || capacidadPasajeros > 500) {
            throw new IllegalArgumentException("La capacidad debe estar entre 1 y 500");
        }
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void agregarVuelo(Vuelo vuelo) {
        vuelos.add(vuelo);
        vuelo.setAvion(this);
    }

    public static String[] getOpcionesEstado() {
        return new String[]{"EN TIERRA", "EN VUELO", "EN MANTENIMIENTO", "RETRASADO"};
    }
}
