package Dominio.Entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name = "pasajero")
public class Pasajero implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;
    @Column(length = 150, nullable = false)
    private String nombre;
    @Column(length = 150, nullable = false)
    private String apellido;
    @Column(length = 150, nullable = false)
    private String identificacion;
    @Column(length = 15)
    private String telefono;
    @Column(length = 150, nullable = false)
    private String correo;
    
    
    private String rol;

    public Pasajero() {
    }

    public Pasajero(String nombre, String apellido, String identificacion, String telefono, String correo, String rol) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
        this.telefono = telefono;
        this.correo = correo;
        this.rol = rol;
    }
    
    public Pasajero(Long idUsuario, String nombre, String apellido, String identificacion, String telefono, String correo, String rol) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = identificacion;
        this.telefono = telefono;
        this.identificacion = correo;
        this.rol = rol;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public String getnombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
 public String getIdentificacion() {
        return identificacion;
    }
    

    public String getTelefono() {
        return telefono;
    }
public String getCorreo() {
        return correo;
    }
   

    public String getRol() {
        return rol;
    }

    // Setters
    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

     public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

   
public void setCorreo(String correo) {
        this.correo = correo;
    }
    public void setRol(String rol) {
        this.rol = rol;
    }

    public void setId(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
