package vuelosapp;

import Tests.AdministradorDaoTest;

/**
 *
 * @author valer
 */
public class Principal {
    public static void main (String[] args){
//        AdministradorDaoTest.guardarAdministradorEnBDNoDebeGenerarError();
        AdministradorDaoTest.buscarAdministradorEnBDDebeMostrarElNombre();
    }
}
