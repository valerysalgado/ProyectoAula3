package Tests;
import Dominio.Entidades.Administrador;
import Persistence.Dao.AdministradorDAO;
import javax.persistence.Persistence;


/**
 *
 * @author Valery Salgado
 */
public class AdministradorDaoTest {

    public static void guardarAdministradorEnBDNoDebeGenerarError(){
        // Preperar los datos de prueba
        var admin = new Administrador("Valery Salgado", telefono, rol);
        admin.setId(7);
        admin.setRol("Admin");
        var emf = Persistence.createEntityManagerFactory("ConfigDB");
        var em = emf.createEntityManager();
        var adminDao = new AdministradorDAO(em);
        // Action: Ejecutar el metodo de la prueba
        adminDao.crear(admin);
        // Assert
        System.out.println("Admin guardado");
    }
    
    public static void buscarAdministradorEnBDDebeMostrarElNombre(){
        // Preperar los datos de prueba
        var adminId = 73;
        var emf = Persistence.createEntityManagerFactory("ConfigDB");
        var em = emf.createEntityManager();
        var adminDao = new AdministradorDAO(em);
        // Action: Ejecutar el metodo de la prueba
        var admin = adminDao.buscarPorId(adminId);
        // Assert
        if(admin == null ){
            System.out.println("El Administrador con ID "+adminId+" no existe");
            return;
        }
        System.out.println("NOMBRE: "+admin.getNombre());
    }
    
}
