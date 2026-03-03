package Persistence.Dao;

import Dominio.Entidades.Reserva;
import Dominio.Entidades.Reserva.EstadoReserva;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class ReservaDAO {

    private final EntityManagerFactory emf;

    public ReservaDAO() {
        this.emf = Persistence.createEntityManagerFactory("ConfigDB");
    }

    public void crear(Reserva reserva) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = null;
        try {
            tx = em.getTransaction();
            tx.begin();
            em.persist(reserva);
            tx.commit();
        } catch (Exception e) {
            if (tx != null && tx.isActive()) {
                tx.rollback();
            }
            throw new RuntimeException("Error al crear reserva", e);
        } finally {
            em.close();
        }
    }

    public void actualizar(Reserva reserva) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = null;
        try {
            tx = em.getTransaction();
            tx.begin();
            em.merge(reserva);
            tx.commit();
        } catch (Exception ex) {
            if (tx != null && tx.isActive()) {
                tx.rollback();
            }
            throw new RuntimeException("Error al actualizar reserva", ex);
        } finally {
            em.close();
        }
    }

    public void eliminar(int idReserva) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = null;
        try {
            tx = em.getTransaction();
            tx.begin();
            Reserva reserva = em.find(Reserva.class, idReserva);
            if (reserva != null) {
                em.remove(reserva);
            }
            tx.commit();
        } catch (Exception ex) {
            if (tx != null && tx.isActive()) {
                tx.rollback();
            }
            throw new RuntimeException("Error al eliminar reserva", ex);
        } finally {
            em.close();
        }
    }

    public Reserva buscarPorId(int id) {
        EntityManager em = emf.createEntityManager();
        try {
            return em.find(Reserva.class, id);
        } finally {
            em.close();
        }
    }

    // ✅ MÉTODO FALTANTE: obtenerTodas (para compatibilidad)
    public List<Reserva> obtenerTodas() {
        return listarTodos();
    }

    public List<Reserva> listarTodos() {
        EntityManager em = emf.createEntityManager();
        try {
            TypedQuery<Reserva> query = em.createQuery("SELECT r FROM Reserva r", Reserva.class);
            return query.getResultList();
        } finally {
            em.close();
        }
    }

    public List<Reserva> buscarPorEstado(EstadoReserva estado) {
        EntityManager em = emf.createEntityManager();
        try {
            TypedQuery<Reserva> query = em.createQuery(
                "SELECT r FROM Reserva r WHERE r.estado = :estado", Reserva.class);
            query.setParameter("estado", estado);
            return query.getResultList();
        } finally {
            em.close();
        }
    }
}