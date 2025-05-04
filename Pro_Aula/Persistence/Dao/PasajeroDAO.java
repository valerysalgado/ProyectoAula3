
package Persistence.Dao;

/**
 *
 * @author Valery Salgado
 */
import Dominio.Entidades.Pasajero;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;
import javax.persistence.EntityManager;

public class PasajeroDAO {

    private EntityManager em;

    public PasajeroDAO(EntityManager em) {
        this.em = em;
    }

    public void crear(Pasajero pasajero) {
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            em.persist(pasajero);
            tx.commit();
        } catch (Exception e) {
            if (tx.isActive()) tx.rollback();
            throw e;
        }
    }

    public Pasajero buscarPorId(int id) {
        return em.find(Pasajero.class, id);
    }

    public List<Pasajero> listarTodos() {
        TypedQuery<Pasajero> query = em.createQuery("SELECT a FROM Pasajero a", Pasajero.class);
        return query.getResultList();
    }

    public void actualizar(Pasajero Pasajero) {
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            em.merge(Pasajero);
            tx.commit();
        } catch (Exception e) {
            if (tx.isActive()) tx.rollback();
            throw e;
        }
    }

    public void eliminar(int id) {
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            Pasajero Pasajero = em.find(Pasajero.class, id);
            if (Pasajero != null) {
                em.remove(Pasajero);
            }
            tx.commit();
        } catch (Exception e) {
            if (tx.isActive()) tx.rollback();
            throw e;
        }
    }
}