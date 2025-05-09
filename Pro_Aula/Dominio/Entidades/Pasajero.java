package Dominio.Entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name = "pasajero")
public class Pasajero implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;
    @Column(length = 150, nullable = false)
    private String nombre;
    @Column(length = 150, nullable = false)
    private String apellido;
    @Column(length = 150, nullable = false)
    private String correo;
    @Column(length = 15)
    private String telefono;
    @Column(length = 150, nullable = false)
    private String identificacion;
    private String rol;

    public Pasajero() {
    }

    public Pasajero(String nombre, String apellido, String correo, String telefono, String identificacion, String rol) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
        this.identificacion = identificacion;
        this.rol = rol;
    }
    
    public Pasajero(int idUsuario, String nombre, String apellido, String correo, String telefono, String identificacion, String rol) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
        this.identificacion = identificacion;
        this.rol = rol;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public String getnombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
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

    public void setApellido(String apellido) {
        this.apellido = apellido;
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
