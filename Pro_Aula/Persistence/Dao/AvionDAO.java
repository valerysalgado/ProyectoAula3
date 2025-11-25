package Persistence.Dao;

import Dominio.Entidades.Avion;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class AvionDAO {

    private EntityManager em;
    private final EntityManagerFactory emf;

    public AvionDAO(EntityManager em) {
        this.em = em;
        this.emf = null;
    }

    public AvionDAO() {
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

    public void crear(Avion avion) {
        EntityManager entityManager = getEntityManager();
        EntityTransaction tx = null;
        boolean weCreatedManager = (em == null);
        
        try {
            tx = entityManager.getTransaction();
            tx.begin();
            entityManager.persist(avion);
            tx.commit();
        } catch (Exception e) {
            if (tx != null && tx.isActive()) {
                tx.rollback();
            }
            throw new RuntimeException("Error al crear avión", e);
        } finally {
            if (weCreatedManager && entityManager != null && entityManager.isOpen()) {
                entityManager.close();
            }
        }
    }

    public void actualizar(Avion avion) {
        EntityManager entityManager = getEntityManager();
        EntityTransaction tx = null;
        boolean weCreatedManager = (em == null);
        
        try {
            tx = entityManager.getTransaction();
            tx.begin();
            entityManager.merge(avion);
            tx.commit();
        } catch (Exception e) {
            if (tx != null && tx.isActive()) {
                tx.rollback();
            }
            throw new RuntimeException("Error al actualizar avión", e);
        } finally {
            if (weCreatedManager && entityManager != null && entityManager.isOpen()) {
                entityManager.close();
            }
        }
    }

    public void eliminar(Long idAvion) {
        EntityManager entityManager = getEntityManager();
        EntityTransaction tx = null;
        boolean weCreatedManager = (em == null);
        
        try {
            tx = entityManager.getTransaction();
            tx.begin();
            Avion avion = entityManager.find(Avion.class, idAvion);
            if (avion != null) {
                entityManager.remove(avion);
            }
            tx.commit();
        } catch (Exception e) {
            if (tx != null && tx.isActive()) {
                tx.rollback();
            }
            throw new RuntimeException("Error al eliminar avión", e);
        } finally {
            if (weCreatedManager && entityManager != null && entityManager.isOpen()) {
                entityManager.close();
            }
        }
    }

    // ✅ CORREGIDO: Método para buscar por int (compatibilidad)
    public Avion buscarPorId(int id) {
        return buscarPorId((long) id);
    }

    public Avion buscarPorId(Long id) {
        EntityManager entityManager = getEntityManager();
        try {
            return entityManager.find(Avion.class, id);
        } finally {
            if (em == null && entityManager != null && entityManager.isOpen()) {
                entityManager.close();
            }
        }
    }

    public Avion buscarPorMatricula(String matricula) {
        EntityManager entityManager = getEntityManager();
        try {
            TypedQuery<Avion> query = entityManager.createQuery(
                "SELECT a FROM Avion a WHERE a.matricula = :matricula", Avion.class);
            query.setParameter("matricula", matricula);
            List<Avion> resultados = query.getResultList();
            return resultados.isEmpty() ? null : resultados.get(0);
        } finally {
            if (em == null && entityManager != null && entityManager.isOpen()) {
                entityManager.close();
            }
        }
    }

    // ✅ MÉTODO FALTANTE: existeMatricula (para compatibilidad)
    public boolean existeMatricula(String matricula) {
        EntityManager entityManager = getEntityManager();
        try {
            TypedQuery<Long> query = entityManager.createQuery(
                "SELECT COUNT(a) FROM Avion a WHERE a.matricula = :matricula", Long.class);
            query.setParameter("matricula", matricula);
            return query.getSingleResult() > 0;
        } finally {
            if (em == null && entityManager != null && entityManager.isOpen()) {
                entityManager.close();
            }
        }
    }

    public List<Avion> listarTodos() {
        EntityManager entityManager = getEntityManager();
        try {
            TypedQuery<Avion> query = entityManager.createQuery("SELECT a FROM Avion a", Avion.class);
            return query.getResultList();
        } finally {
            if (em == null && entityManager != null && entityManager.isOpen()) {
                entityManager.close();
            }
        }
    }

    public List<Avion> buscarPorEstado(boolean activo) {
        EntityManager entityManager = getEntityManager();
        try {
            TypedQuery<Avion> query = entityManager.createQuery(
                "SELECT a FROM Avion a WHERE a.activo = :activo", Avion.class);
            query.setParameter("activo", activo);
            return query.getResultList();
        } finally {
            if (em == null && entityManager != null && entityManager.isOpen()) {
                entityManager.close();
            }
        }
    }
}