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
import javax.persistence.NoResultException;

public class PasajeroDAO {

    private EntityManager em;

    public PasajeroDAO(EntityManager em) {
        this.em = em;
    }

    public void crear(Pasajero pasajero) {
        if (!em.getTransaction().isActive()){
        EntityTransaction tx = em.getTransaction();
        try {
            if (tx.isActive()) {
                tx.begin();
                em.persist(pasajero);
                tx.commit();
            } else {

                em.persist(pasajero);
            }

        } catch (Exception e) {
            if (tx.isActive()&& !tx.getRollbackOnly()) {
                tx.rollback();
            }
            throw new RuntimeException("Error al crear pasajero", e);
        }
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
            if (tx.isActive()) {
                tx.rollback();
            }
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
            if (tx.isActive()) {
                tx.rollback();
            }
            throw e;
        }
    }
    public List<Pasajero> listarConFiltro(String filtro, int pagina, int registrosPorPagina) {
        String jpql = "SELECT p FROM Pasajero p WHERE " +
                     "(p.nombre LIKE :filtro OR p.apellido LIKE :filtro OR p.identificacion LIKE :filtro) " +
                     "ORDER BY p.apellido, p.nombre";
        
        return em.createQuery(jpql, Pasajero.class)
                .setParameter("filtro", "%" + filtro + "%")
                .setFirstResult((pagina - 1) * registrosPorPagina)
                .setMaxResults(registrosPorPagina)
                .getResultList();
    }
    
    public int contarPasajeros(String filtro) {
        String jpql = "SELECT COUNT(p) FROM Pasajero p WHERE " +
                     "(p.nombre LIKE :filtro OR p.apellido LIKE :filtro OR p.identificacion LIKE :filtro)";
        
        return ((Number) em.createQuery(jpql)
                         .setParameter("filtro", "%" + filtro + "%")
                         .getSingleResult()).intValue();
    }
    
}

