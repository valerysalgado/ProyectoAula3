package Dominio.Entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "administrador")
public class Administrador implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(length = 150, nullable = false)
    private String nombre;
    
    @Column(length = 15)
    private String telefono;
    
    private String rol;

    public Administrador() {
    }
     
    public Administrador(String nombre, String telefono, String rol) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.rol = rol;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    // Métodos de compatibilidad (opcionales)
    public Integer getIdAdministrador() {
        return id;
    }

    public void setIdAdministrador(Integer idAdministrador) {
        this.id = idAdministrador;
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