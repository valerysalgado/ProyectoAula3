/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio.Entidades;

/**
 *
 * @author valer
 */
class Destino {
    private String nombre;
    private String descripcion;
    private String ciudad;

    public Destino(String nombre, String descripcion, String ciudad) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.ciudad = ciudad;
    }
    

    public String getNombre() {
        return nombre; 
    }
    public String getDescripcion() {
        return descripcion; 
    }
    public String getCiudad() { 
        return ciudad; 
    }


    public void setNombre(String nombre) {
        this.nombre = nombre; 
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion; 
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}

