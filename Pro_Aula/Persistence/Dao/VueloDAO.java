package Persistence.Dao;

import Dominio.Entidades.Vuelo;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import javax.persistence.PersistenceException;
import java.util.List;

public class VueloDAO {

    private EntityManager em;

    public VueloDAO(EntityManager em) {
        this.em = em;
    }

public void crear(Vuelo vuelo) {
    EntityTransaction tx = em.getTransaction();
    try {
        tx.begin();
        em.persist(vuelo);
        tx.commit();
    } catch (Exception e) {
        if (tx.isActive()) {
            tx.rollback();
        }
        throw e;
    }
}

    public List<Vuelo> listarTodos() {
        TypedQuery<Vuelo> query = em.createQuery("SELECT v FROM Vuelo v", Vuelo.class);
        return query.getResultList();
    }

    public List<Vuelo> buscarPorOrigen(String origen) {
        TypedQuery<Vuelo> query = em.createQuery(
                "SELECT v FROM Vuelo v WHERE v.origen = :origen", Vuelo.class);
        query.setParameter("origen", origen);
        return query.getResultList();
    }

    public List<Vuelo> buscarPorDestino(String destino) {
        TypedQuery<Vuelo> query = em.createQuery(
                "SELECT v FROM Vuelo v WHERE v.destino = :destino", Vuelo.class);
        query.setParameter("destino", destino);
        return query.getResultList();
    }

    public void actualizar(Vuelo vuelo) {
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            em.merge(vuelo);
            tx.commit();
        } catch (Exception e) {
            if (tx.isActive()) {
                tx.rollback();
            }
            throw new RuntimeException("Error al actualizar vuelo", e);
        }
    }

 public void eliminarVuelo(int id) {
        em.getTransaction().begin();
        Vuelo vuelo = em.find(Vuelo.class, id);
        if (vuelo != null) {
            em.remove(vuelo);
        }
        em.getTransaction().commit();
    
    }

    public boolean existeNumeroVuelo(String numeroVuelo) {
        try {
            TypedQuery<Long> query = em.createQuery(
                    "SELECT COUNT(v) FROM Vuelo v WHERE v.numeroVuelo = :numeroVuelo", Long.class);
            query.setParameter("numeroVuelo", numeroVuelo);
            return query.getSingleResult() > 0;
        } catch (Exception e) {
            throw new PersistenceException("Error al verificar número de vuelo", e);
        }
    }

  public List<Vuelo> obtenerTodos() {
    try {
        TypedQuery<Vuelo> query = em.createQuery("SELECT v FROM Vuelo v", Vuelo.class);
        return query.getResultList();
    } catch (Exception e) {
        e.printStackTrace(); // o un logger
        return new ArrayList<>();
    }
}

    public Object listarVuelosActivos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
public Vuelo buscarPorId(Integer id) {  // Asegúrate que use Integer
    return em.find(Vuelo.class, id);
}

}
