
package Dominio.Entidades;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

/**
 *
 * @author valer
 */
public class Vuelo {
    private String idVuelos;
    private String origen;
    private String destino;
    private LocalDate fSalida;
    private LocalDate fVuelta;
    private int asientosDisponibles;
    private LocalTime hSalida;
    private LocalTime hLlegada;
    private List<Asiento> asientos;
  

    // Constructor
    public Vuelo(String idVuelos, String origen, String destino, LocalDate fSalida, LocalDate fVuelta,
                 int asientosDisponibles, LocalTime hSalida, LocalTime hLlegada) {
        this.idVuelos = idVuelos;
        this.origen = origen;
        this.destino = destino;
        this.fSalida = fSalida;
        this.fVuelta = fVuelta;
        this.asientosDisponibles = asientosDisponibles;
        this.hSalida = hSalida;
        this.hLlegada = hLlegada;
    }

    // Getters
    public String getIdVuelos() {
        return idVuelos;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public LocalDate getfSalida() {
        return fSalida;
    }

    public LocalDate getfVuelta() {
        return fVuelta;
    }

    public int getAsientosDisponibles() {
        return asientosDisponibles;
    }

    public LocalTime gethSalida() {
        return hSalida;
    }

    public LocalTime gethLlegada() {
        return hLlegada;
    }

    public List<Asiento> getAsientos() {
        return asientos;
    }

    // Setters
    public void setIdVuelos(String idVuelos) {
        this.idVuelos = idVuelos;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setfSalida(LocalDate fSalida) {
        this.fSalida = fSalida;
    }

    public void setfVuelta(LocalDate fVuelta) {
        this.fVuelta = fVuelta;
    }

    public void setAsientosDisponibles(int asientosDisponibles) {
        this.asientosDisponibles = asientosDisponibles;
    }

    public void sethSalida(LocalTime hSalida) {
        this.hSalida = hSalida;
    }

    public void sethLlegada(LocalTime hLlegada) {
        this.hLlegada = hLlegada;
    }

    public void setAsientos(List<Asiento> asientos) {
        this.asientos = asientos;
    }
}
