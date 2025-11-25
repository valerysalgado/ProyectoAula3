package Persistence.Dao;

import Dominio.Entidades.Pasajero;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class PasajeroDAO {

    private EntityManager em;
    private final EntityManagerFactory emf;

    public PasajeroDAO(EntityManager em) {
        this.em = em;
        this.emf = null;
    }

    public PasajeroDAO() {
        this.emf = Persistence.createEntityManagerFactory("ConfigDB");
        this.em = null;
    }

    private EntityManager getEntityManager() {
        if (em != null) {
            return em;
        } else {
            return emf.createEntityManager();
        }
    }

    public void crear(Pasajero pasajero) {
        EntityManager entityManager = getEntityManager();
        EntityTransaction tx = null;
        boolean weCreatedManager = (em == null);
        
        try {
            tx = entityManager.getTransaction();
            tx.begin();
            entityManager.persist(pasajero);
            tx.commit();
        } catch (Exception e) {
            if (tx != null && tx.isActive()) {
                tx.rollback();
            }
            throw new RuntimeException("Error al crear pasajero", e);
        } finally {
            if (weCreatedManager && entityManager != null && entityManager.isOpen()) {
                entityManager.close();
            }
        }
    }

    public void actualizar(Pasajero pasajero) {
        EntityManager entityManager = getEntityManager();
        EntityTransaction tx = null;
        boolean weCreatedManager = (em == null);
        
        try {
            tx = entityManager.getTransaction();
            tx.begin();
            entityManager.merge(pasajero);
            tx.commit();
        } catch (Exception e) {
            if (tx != null && tx.isActive()) {
                tx.rollback();
            }
            throw new RuntimeException("Error al actualizar pasajero", e);
        } finally {
            if (weCreatedManager && entityManager != null && entityManager.isOpen()) {
                entityManager.close();
            }
        }
    }

    public void eliminar(Long idPasajero) {
        EntityManager entityManager = getEntityManager();
        EntityTransaction tx = null;
        boolean weCreatedManager = (em == null);
        
        try {
            tx = entityManager.getTransaction();
            tx.begin();
            Pasajero pasajero = entityManager.find(Pasajero.class, idPasajero);
            if (pasajero != null) {
                entityManager.remove(pasajero);
            }
            tx.commit();
        } catch (Exception e) {
            if (tx != null && tx.isActive()) {
                tx.rollback();
            }
            throw new RuntimeException("Error al eliminar pasajero", e);
        } finally {
            if (weCreatedManager && entityManager != null && entityManager.isOpen()) {
                entityManager.close();
            }
        }
    }

    public Pasajero buscarPorId(Long id) {
        EntityManager entityManager = getEntityManager();
        try {
            return entityManager.find(Pasajero.class, id);
        } finally {
            if (em == null && entityManager != null && entityManager.isOpen()) {
                entityManager.close();
            }
        }
    }

    public List<Pasajero> listarTodos() {
        EntityManager entityManager = getEntityManager();
        try {
            TypedQuery<Pasajero> query = entityManager.createQuery("SELECT p FROM Pasajero p", Pasajero.class);
            return query.getResultList();
        } finally {
            if (em == null && entityManager != null && entityManager.isOpen()) {
                entityManager.close();
            }
        }
    }

    public Pasajero buscarPorDocumento(String documento) {
        EntityManager entityManager = getEntityManager();
        try {
            TypedQuery<Pasajero> query = entityManager.createQuery(
                "SELECT p FROM Pasajero p WHERE p.documento = :documento", Pasajero.class);
            query.setParameter("documento", documento);
            List<Pasajero> resultados = query.getResultList();
            return resultados.isEmpty() ? null : resultados.get(0);
        } finally {
            if (em == null && entityManager != null && entityManager.isOpen()) {
                entityManager.close();
            }
        }
    }
}