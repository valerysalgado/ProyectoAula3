
package Model;

import javax.swing.table.DefaultTableModel;
import java.util.List;
import java.util.ArrayList;

public class Vuelos {

 private String origen;
    private String destino;
    private String fechaIda;
    private String fechaVuelta;
    private String id;
    
public Vuelos(String origen, String destino, String fechaIda, String fechaVuelta, String id) {
        this.origen = origen;
        this.destino = destino;
        this.fechaIda = fechaIda;
        this.fechaVuelta = fechaVuelta;
        this.id = id;
    }
    
    public String getOrigen() { return origen; }
    public String getDestino() { return destino; }
    public String getFechaIda() { return fechaIda; }
    public String getFechaVuelta() { return fechaVuelta; }
    public String getId() { return id; }
    
}
