
package Model;
 
public class Persona {
 
  private String documento ;
  private String nombreUser ;
  private String contraseña ;
  private String email;
    public Persona( String documento, String nombreUser, String contraseña,String email) {
     
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