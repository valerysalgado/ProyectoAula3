
package controller;

import Model.Pasajero;
import com.mysql.jdbc.Connection;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import  java.sql.DriverManager;


public class ControladorLogin {
 
    private ArrayList<Pasajero>listaPersona;

    public ControladorLogin() {
        listaPersona = new ArrayList<> ();
    }
    public Pasajero buscarPersona(String nombreUser){
        for (int i = 0 ; i <listaPersona.size();i++){
            Pasajero persona = listaPersona.get(i);
            if (persona != null){
                if(persona.getNombreUser().equals(nombreUser)){
                    return persona;
                }
                
            }
        }
        
        return null;
    }
    
    public boolean agregarPersona(Pasajero persona){
        Pasajero aux = buscarPersona(persona.getNombreUser());
        
        if (aux == null){
            listaPersona.add(persona);
            return true ;
        }
       return false; 
    }
    
     Connection con ;
     
     public Connection conector(){
         
     
      try { 
          Class.forName("com.mysql.jdbc.Driver");
          con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/proaula_vuelos_bd","root","");
          JOptionPane.showMessageDialog(null , "conectado");
     
      } catch (Exception e) { 
          
      JOptionPane.showMessageDialog(null, "Ocurrio un error .\n porfavor comunicarse con el administrador" + e);
      
      } return con;
     
      }
     
    
  
}
