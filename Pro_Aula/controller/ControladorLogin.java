
package controller;

import Model.Pasajero;
import java.util.ArrayList;


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
    
    
    
  
}
