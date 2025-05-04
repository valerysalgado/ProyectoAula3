/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio.Entidades;

import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * @author valer
 */
class Reserva {

    private int idReserva;
    private String estado;
    private LocalDateTime fechaReserva;
    private Vuelo vuelo;
    private Pasajero pasajero;
    private List<Asiento> asientosAsignados;
    private Pago pago;

    public Reserva(int idReserva, String estado, LocalDateTime fechaReserva, Vuelo vuelo, Pasajero pasajero, List<Asiento> asientosAsignados, Pago pago) {
        this.idReserva = idReserva;
        this.estado = estado;
        this.fechaReserva = fechaReserva;
        this.vuelo = vuelo;
        this.pasajero = pasajero;
        this.asientosAsignados = asientosAsignados;
        this.pago = pago;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public String getEstado() {
        return estado;
    }

    public LocalDateTime getFechaReserva() {
        return fechaReserva;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public List<Asiento> getAsientosAsignados() {
        return asientosAsignados;
    }

    public Pago getPago() {
        return pago;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setFechaReserva(LocalDateTime fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public void setAsientosAsignados(List<Asiento> asientosAsignados) {
        this.asientosAsignados = asientosAsignados;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }
}
