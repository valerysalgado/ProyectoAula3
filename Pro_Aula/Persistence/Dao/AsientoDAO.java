package Persistence.Dao;

import Dominio.Entidades.Asiento;
import Dominio.Entidades.Avion;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class AsientoDAO {

    private EntityManager em;
    private final EntityManagerFactory emf;

    public AsientoDAO(EntityManager em) {
        this.em = em;
        this.emf = null;
    }

    public AsientoDAO() {
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

    public void crear(Asiento asiento) {
        EntityManager entityManager = getEntityManager();
        EntityTransaction tx = null;
        boolean weCreatedManager = (em == null);
        
        try {
            tx = entityManager.getTransaction();
            tx.begin();
            entityManager.persist(asiento);
            tx.commit();
        } catch (Exception e) {
            if (tx != null && tx.isActive()) {
                tx.rollback();
            }
            throw new RuntimeException("Error al crear asiento", e);
        } finally {
            if (weCreatedManager && entityManager != null && entityManager.isOpen()) {
                entityManager.close();
            }
        }
    }

    public void actualizar(Asiento asiento) {
        EntityManager entityManager = getEntityManager();
        EntityTransaction tx = null;
        boolean weCreatedManager = (em == null);
        
        try {
            tx = entityManager.getTransaction();
            tx.begin();
            entityManager.merge(asiento);
            tx.commit();
        } catch (Exception e) {
            if (tx != null && tx.isActive()) {
                tx.rollback();
            }
            throw new RuntimeException("Error al actualizar asiento", e);
        } finally {
            if (weCreatedManager && entityManager != null && entityManager.isOpen()) {
                entityManager.close();
            }
        }
    }

    public void eliminar(Long idAsiento) {
        EntityManager entityManager = getEntityManager();
        EntityTransaction tx = null;
        boolean weCreatedManager = (em == null);
        
        try {
            tx = entityManager.getTransaction();
            tx.begin();
            Asiento asiento = entityManager.find(Asiento.class, idAsiento);
            if (asiento != null) {
                entityManager.remove(asiento);
            }
            tx.commit();
        } catch (Exception e) {
            if (tx != null && tx.isActive()) {
                tx.rollback();
            }
            throw new RuntimeException("Error al eliminar asiento", e);
        } finally {
            if (weCreatedManager && entityManager != null && entityManager.isOpen()) {
                entityManager.close();
            }
        }
    }

    public Asiento buscarPorId(Long id) {
        EntityManager entityManager = getEntityManager();
        try {
            return entityManager.find(Asiento.class, id);
        } finally {
            if (em == null && entityManager != null && entityManager.isOpen()) {
                entityManager.close();
            }
        }
    }

    // ✅ MÉTODO FALTANTE: obtenerAsientosDisponibles (para compatibilidad)
    public List<Asiento> obtenerAsientosDisponibles() {
        return buscarPorDisponibilidad(true);
    }

    // ✅ MÉTODO FALTANTE: obtenerPorAvion (para compatibilidad)
    public List<Asiento> obtenerPorAvion(Avion avion) {
        EntityManager entityManager = getEntityManager();
        try {
            TypedQuery<Asiento> query = entityManager.createQuery(
                "SELECT a FROM Asiento a WHERE a.avion = :avion", Asiento.class);
            query.setParameter("avion", avion);
            return query.getResultList();
        } finally {
            if (em == null && entityManager != null && entityManager.isOpen()) {
                entityManager.close();
            }
        }
    }

    // ✅ MÉTODO FALTANTE: obtenerUltimoAsientoPorAvionYClase (para compatibilidad)
    public Asiento obtenerUltimoAsientoPorAvionYClase(long idAvion, String clase) {
        EntityManager entityManager = getEntityManager();
        try {
            TypedQuery<Asiento> query = entityManager.createQuery(
                "SELECT a FROM Asiento a WHERE a.avion.id = :idAvion AND a.clase = :clase ORDER BY a.numeroAsiento DESC",
                Asiento.class);
            query.setParameter("idAvion", idAvion);
            query.setParameter("clase", clase);
            query.setMaxResults(1);
            List<Asiento> resultados = query.getResultList();
            return resultados.isEmpty() ? null : resultados.get(0);
        } finally {
            if (em == null && entityManager != null && entityManager.isOpen()) {
                entityManager.close();
            }
        }
    }

    public List<Asiento> listarTodos() {
        EntityManager entityManager = getEntityManager();
        try {
            TypedQuery<Asiento> query = entityManager.createQuery("SELECT a FROM Asiento a", Asiento.class);
            return query.getResultList();
        } finally {
            if (em == null && entityManager != null && entityManager.isOpen()) {
                entityManager.close();
            }
        }
    }

    public List<Asiento> buscarPorDisponibilidad(boolean disponible) {
        EntityManager entityManager = getEntityManager();
        try {
            TypedQuery<Asiento> query = entityManager.createQuery(
                "SELECT a FROM Asiento a WHERE a.disponible = :disponible", Asiento.class);
            query.setParameter("disponible", disponible);
            return query.getResultList();
        } finally {
            if (em == null && entityManager != null && entityManager.isOpen()) {
                entityManager.close();
            }
        }
    }

    public List<Asiento> buscarPorVuelo(Long idVuelo) {
        EntityManager entityManager = getEntityManager();
        try {
            TypedQuery<Asiento> query = entityManager.createQuery(
                "SELECT a FROM Asiento a WHERE a.vuelo.id = :idVuelo", Asiento.class);
            query.setParameter("idVuelo", idVuelo);
            return query.getResultList();
        } finally {
            if (em == null && entityManager != null && entityManager.isOpen()) {
                entityManager.close();
            }
        }
    }
}