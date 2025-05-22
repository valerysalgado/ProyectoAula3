package Persistence.Dao;

import Dominio.Entidades.Reserva;
import Dominio.Entidades.Reserva.EstadoReserva;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class ReservaDAO {

    public static List<Reserva> listarTodos() {
       ReservaDAO dao = new ReservaDAO(); // Puedes pasar null porque no usas el parámetro
    return dao.obtenerTodas();
    }
    
    private final EntityManagerFactory emf;
    
    public ReservaDAO() {
    this.emf = Persistence.createEntityManagerFactory("ConfigDB");
    }
    
    public void crear(Reserva reserva) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(reserva);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            ex.printStackTrace();
        } finally {
            em.close();
        }
    }
    
    public void actualizar(Reserva reserva) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(reserva);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            ex.printStackTrace();
        } finally {
            em.close();
        }
    }
    
    public void eliminar(int idReserva) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            Reserva reserva = em.find(Reserva.class, idReserva);
            if (reserva != null) {
                em.remove(reserva);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            ex.printStackTrace();
        } finally {
            em.close();
        }
    }
    
    public Reserva obtenerPorId(int idReserva) {
        EntityManager em = emf.createEntityManager();
        try {
            return em.find(Reserva.class, idReserva);
        } finally {
            em.close();
        }
    }
    
    public List<Reserva> obtenerTodas() {
        EntityManager em = emf.createEntityManager();
        try {
            TypedQuery<Reserva> query = em.createQuery(
                "SELECT r FROM Reserva r", Reserva.class);
            return query.getResultList();
        } finally {
            em.close();
        }
    }
    
    public List<Reserva> obtenerPorPasajero(int idPasajero) {
        EntityManager em = emf.createEntityManager();
        try {
            TypedQuery<Reserva> query = em.createQuery(
                "SELECT r FROM Reserva r WHERE r.pasajero.idPasajero = :idPasajero", 
                Reserva.class);
            query.setParameter("idPasajero", idPasajero);
            return query.getResultList();
        } finally {
            em.close();
        }
    }
    
    public List<Reserva> obtenerPorEstado(String estado) {
        EntityManager em = emf.createEntityManager();
        try {
            TypedQuery<Reserva> query = em.createQuery(
                "SELECT r FROM Reserva r WHERE r.estado = :estado", 
                Reserva.class);
            query.setParameter("estado", estado);
            return query.getResultList();
        } finally {
            em.close();
        }
    }
    
    public void cambiarEstado(int idReserva, EstadoReserva  nuevoEstado) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            Reserva reserva = em.find(Reserva.class, idReserva);
            if (reserva != null) {
                reserva.setEstado(nuevoEstado);
                em.merge(reserva);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            ex.printStackTrace();
        } finally {
            em.close();
        }
    }
    
    
}