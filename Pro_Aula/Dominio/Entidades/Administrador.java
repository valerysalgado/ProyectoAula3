package Dominio.Entidades;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author valer
 */
public class Administrador {
     private int idAdministrador;
     private String nombre;
     private String telefono;
     private String rol;
     //private List<usurio> usuarios;
     
     public Administrador(String nombre){
         this.idAdministrador = idAdministrador;
         this.nombre = nombre;
         this.rol = "Administrador";
     }

    public void setIdAdministrador(int idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public int getIdAdministrador() {
        return idAdministrador;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getRol() {
        return rol;
    }

    @Override 
    public String toString() {
        return "Rol\n" + "-------------------------\n" + 
            "ID: " + idAdministrador + "\n" + 
            "Nombre: " + nombre + "\n" + 
            "Telefono: " + telefono + "\n" + 
            "Rol: " + rol + "\n";
    }
}

               
