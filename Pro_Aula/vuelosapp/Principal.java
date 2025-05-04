package vuelosapp;

import Tests.AdministradorDaoTest;
import Tests.PasajeroDaoTest;
import static Tests.PasajeroDaoTest.guardarPasajeroEnBDNoDebeGenerarError;

/**
 *
 * @author valer
 */
public class Principal {

    public static void main (String[] args) {
        //AdministradorDaoTest.guardarAdministradorEnBDNoDebeGenerarError();
       // AdministradorDaoTest.buscarAdministradorEnBDDebeMostrarElNombre();
        PasajeroDaoTest.guardarPasajeroEnBDNoDebeGenerarError();
    }
}
