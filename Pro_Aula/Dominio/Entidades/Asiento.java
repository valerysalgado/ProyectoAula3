/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio.Entidades;

/**
 *
 * @author valer
 */
class Asiento {
    private String numeroAsiento;
    private String clase;
    private boolean disponible;

    public Asiento(String numeroAsiento, String clase, boolean disponible) {
        this.numeroAsiento = numeroAsiento;
        this.clase = clase;
        this.disponible = disponible;
    }

    public String getNumeroAsiento() {
        return numeroAsiento;
    }

    public String getClase() {
        return clase;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setNumeroAsiento(String numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    
    
}
