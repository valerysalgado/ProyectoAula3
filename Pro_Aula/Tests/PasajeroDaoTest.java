package Tests;

import Dominio.Entidades.Pasajero;
import Persistence.Dao.PasajeroDAO;
import javax.persistence.Persistence;

/**
 *
 * @author Valery Salgado
 */
public class PasajeroDaoTest {

    public static void guardarPasajeroEnBDNoDebeGenerarError() {
        // Preperar los datos de prueba
        var pasajero = new Pasajero("Valery", "Salgado", "valery@gmail.com", "123456789", "ID123", "pasajero");
        pasajero.setNombre("Valery",
                "Salgado",
                "valery@example.com",
                "123456789",
                "ID123456",
                "pasajero");
        pasajero.setRol("pasajero");
        var emf = Persistence.createEntityManagerFactory("ConfigDB");
        var em = emf.createEntityManager();
        var pasajeroDao = new PasajeroDAO(em);
        // Action: Ejecutar el metodo de la prueba
        pasajeroDao.crear(pasajero);
        // Assert
        System.out.println("pasajero guardado");
    }

    public static void buscarPasajeroEnBDDebeMostrarElNombre() {
        // Preperar los datos de prueba
        var pasajeroId = 73;
        var emf = Persistence.createEntityManagerFactory("ConfigDB");
        var em = emf.createEntityManager();
        var pasajeroDao = new PasajeroDAO(em);
        // Action: Ejecutar el metodo de la prueba
        var pasajero = pasajeroDao.buscarPorId(pasajeroId);
        // Assert
        if (pasajero == null) {
            System.out.println("El Pasajero con ID " + pasajeroId + " no existe");
            return;
        }
        System.out.println("NOMBRE: " + pasajero.getNombre());
    }

}
