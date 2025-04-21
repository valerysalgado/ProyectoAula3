/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio.Entidades;

class Pasajero {
    private int idUsuario;
    private String nombre;
    private String correo;
    private String telefono;
    private String identificacion;
    private String rol;

    public Pasajero(int idUsuario, String nombre, String correo, String telefono, String identificacion, String rol) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.identificacion = identificacion;
        this.rol = rol;
    }
    
   
    public int getIdUsuario() { 
        return idUsuario; 
    }
    public String getNombre() {
        return nombre; 
    }
    public String getCorreo() {
        return correo; 
    }
    public String getTelefono() {
        return telefono; 
    }
    public String getIdentificacion() {
        return identificacion; 
    }
    public String getRol() {
        return rol; 
    }

    // Setters
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre; 
    }
    public void setCorreo(String correo) { 
        this.correo = correo;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono; 
    }
    public void setIdentificacion(String identificacion) { 
        this.identificacion = identificacion; 
    }
    public void setRol(String rol) {
        this.rol = rol; 
    }
}