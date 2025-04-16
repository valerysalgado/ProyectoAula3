
package controller;

import Model.Persona;
import java.util.ArrayList;


public class ControladorLogin {
 
    private ArrayList<Persona>listaPersona;

    public ControladorLogin() {
        listaPersona = new ArrayList<> ();
    }
    public Persona buscarPersona(String nombreUser){
        for (int i = 0 ; i <listaPersona.size();i++){
            Persona persona = listaPersona.get(i);
            if (persona != null){
                if(persona.getNombreUser().equals(nombreUser)){
                    return persona;
                }
                
            }
        }
        
        return null;
    }
    
    public boolean agregarPersona(Persona persona){
        Persona aux = buscarPersona(persona.getNombreUser());
        
        if (aux == null){
            listaPersona.add(persona);
            return true ;
        }
       return false; 
    }
    
    
    
  
}
