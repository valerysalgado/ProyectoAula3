
package Persistence.Dao;

/**
 *
 * @author Valery Salgado
 */
import Dominio.Entidades.Administrador;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;
import javax.persistence.EntityManager;

public class AdministradorDAO {

    private EntityManager em;

    public AdministradorDAO(EntityManager em) {
        this.em = em;
    }

    public void crear(Administrador administrador) {
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            em.persist(administrador);
            tx.commit();
        } catch (Exception e) {
            if (tx.isActive()) tx.rollback();
            throw e;
        }
    }

    public Administrador buscarPorId(int id) {
        return em.find(Administrador.class, id);
    }

    public List<Administrador> listarTodos() {
        TypedQuery<Administrador> query = em.createQuery("SELECT a FROM Administrador a", Administrador.class);
        return query.getResultList();
    }

    public void actualizar(Administrador administrador) {
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            em.merge(administrador);
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
            Administrador administrador = em.find(Administrador.class, id);
            if (administrador != null) {
                em.remove(administrador);
            }
            tx.commit();
        } catch (Exception e) {
            if (tx.isActive()) tx.rollback();
            throw e;
        }
    }
}
