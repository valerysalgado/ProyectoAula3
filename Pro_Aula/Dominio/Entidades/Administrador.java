package Dominio.Entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



/**
 *
 * @author valer
 */
@Entity
@Table(name = "administrador")
public class Administrador implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int id;
    @Column(length = 150, nullable = false)
     private String nombre;
    @Column(length = 15)
     private String telefono;
     private String rol;
     //private List<usurio> usuarios;

    public Administrador() {
    }
     
     
   public Administrador(String nombre, String telefono, String rol) {
    this.nombre = nombre;
    this.telefono = telefono;
    this.rol = rol;
}


    public void setIdAdministrador(int idAdministrador) {
        this.id = idAdministrador;
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
        return id;
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
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override 
    public String toString() {
        return "Rol\n" + "-------------------------\n" + 
            "ID: " + id + "\n" + 
            "Nombre: " + nombre + "\n" + 
            "Telefono: " + telefono + "\n" + 
            "Rol: " + rol + "\n";
    }

    
}

               
