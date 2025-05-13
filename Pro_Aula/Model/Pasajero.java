
package Model;
 
public class Pasajero {
 
  private String identificacion ;
  private String nombreUser ;
  private String contraseña ;
  private String email;
    public Pasajero( String documento, String nombreUser, String contraseña,String email) {
     
        this.identificacion = documento;
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
  
    
    public String getDocumento() {
        return identificacion;
    }
    public void setDocumento(String documento) {
        this.identificacion = documento;
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