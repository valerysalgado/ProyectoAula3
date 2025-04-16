
package Model;
 
public class Persona {
  private String nombre ;
  private String documento ;
  private String nombreUser ;
  private String contraseña ;
  private String email;
    public Persona(String nombre, String documento, String nombreUser, String contraseña,String email) {
        this.nombre = nombre;
        this.documento = documento;
        this.nombreUser = nombreUser;
        this.contraseña = contraseña;
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDocumento() {
        return documento;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }
    public String getNombreUser() {
        return nombreUser;
    }
    public void setNombreUser(String nombreUser) {
        this.nombreUser = nombreUser;
    }
    public String getContraseña() {
        return contraseña;
    }
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
  
  
    
}