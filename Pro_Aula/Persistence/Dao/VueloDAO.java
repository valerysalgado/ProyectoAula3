package Persistence.Dao;

import Dominio.Entidades.Vuelo;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class VueloDAO {

    private EntityManager em;
    private final EntityManagerFactory emf;

    public VueloDAO(EntityManager em) {
        this.em = em;
        this.emf = null;
    }

    public VueloDAO() {
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

    // Métodos CRUD básicos
    public void crear(Vuelo vuelo) {
        EntityManager entityManager = getEntityManager();
        EntityTransaction tx = null;
        boolean weCreatedManager = (em == null);
        
        try {
            tx = entityManager.getTransaction();
            tx.begin();
            entityManager.persist(vuelo);
            tx.commit();
        } catch (Exception e) {
            if (tx != null && tx.isActive()) {
                tx.rollback();
            }
            throw new RuntimeException("Error al crear vuelo", e);
        } finally {
            if (weCreatedManager && entityManager != null && entityManager.isOpen()) {
                entityManager.close();
            }
        }
    }

    public void actualizar(Vuelo vuelo) {
        EntityManager entityManager = getEntityManager();
        EntityTransaction tx = null;
        boolean weCreatedManager = (em == null);
        
        try {
            tx = entityManager.getTransaction();
            tx.begin();
            entityManager.merge(vuelo);
            tx.commit();
        } catch (Exception e) {
            if (tx != null && tx.isActive()) {
                tx.rollback();
            }
            throw new RuntimeException("Error al actualizar vuelo", e);
        } finally {
            if (weCreatedManager && entityManager != null && entityManager.isOpen()) {
                entityManager.close();
            }
        }
    }

    public void eliminar(Integer idVuelo) {
        EntityManager entityManager = getEntityManager();
        EntityTransaction tx = null;
        boolean weCreatedManager = (em == null);
        
        try {
            tx = entityManager.getTransaction();
            tx.begin();
            Vuelo vuelo = entityManager.find(Vuelo.class, idVuelo);
            if (vuelo != null) {
                entityManager.remove(vuelo);
            }
            tx.commit();
        } catch (Exception e) {
            if (tx != null && tx.isActive()) {
                tx.rollback();
            }
            throw new RuntimeException("Error al eliminar vuelo", e);
        } finally {
            if (weCreatedManager && entityManager != null && entityManager.isOpen()) {
                entityManager.close();
            }
        }
    }

    // ✅ MÉTODO FALTANTE: eliminarVuelo (para compatibilidad)
    public void eliminarVuelo(int idVuelo) {
        eliminar(idVuelo);
    }

    public Vuelo buscarPorId(Integer id) {
        EntityManager entityManager = getEntityManager();
        try {
            return entityManager.find(Vuelo.class, id);
        } finally {
            if (em == null && entityManager != null && entityManager.isOpen()) {
                entityManager.close();
            }
        }
    }

    // ✅ MÉTODO FALTANTE: obtenerTodos (para compatibilidad)
    public List<Vuelo> obtenerTodos() {
        return listarTodos();
    }

    public List<Vuelo> listarTodos() {
        EntityManager entityManager = getEntityManager();
        try {
            TypedQuery<Vuelo> query = entityManager.createQuery("SELECT v FROM Vuelo v", Vuelo.class);
            return query.getResultList();
        } finally {
            if (em == null && entityManager != null && entityManager.isOpen()) {
                entityManager.close();
            }
        }
    }

    // ✅ MÉTODO FALTANTE: existeNumeroVuelo (para compatibilidad)
    public boolean existeNumeroVuelo(String numeroVuelo) {
        EntityManager entityManager = getEntityManager();
        try {
            TypedQuery<Long> query = entityManager.createQuery(
                "SELECT COUNT(v) FROM Vuelo v WHERE v.numeroVuelo = :numeroVuelo", Long.class);
            query.setParameter("numeroVuelo", numeroVuelo);
            return query.getSingleResult() > 0;
        } finally {
            if (em == null && entityManager != null && entityManager.isOpen()) {
                entityManager.close();
            }
        }
    }

    public List<Vuelo> buscarPorOrigen(String origen) {
        EntityManager entityManager = getEntityManager();
        try {
            TypedQuery<Vuelo> query = entityManager.createQuery(
                "SELECT v FROM Vuelo v WHERE v.origen = :origen", Vuelo.class);
            query.setParameter("origen", origen);
            return query.getResultList();
        } finally {
            if (em == null && entityManager != null && entityManager.isOpen()) {
                entityManager.close();
            }
        }
    }

    public List<Vuelo> buscarPorDestino(String destino) {
        EntityManager entityManager = getEntityManager();
        try {
            TypedQuery<Vuelo> query = entityManager.createQuery(
                "SELECT v FROM Vuelo v WHERE v.destino = :destino", Vuelo.class);
            query.setParameter("destino", destino);
            return query.getResultList();
        } finally {
            if (em == null && entityManager != null && entityManager.isOpen()) {
                entityManager.close();
            }
        }
    }

    public List<Vuelo> buscarPorOrigenYDestino(String origen, String destino) {
        EntityManager entityManager = getEntityManager();
        try {
            TypedQuery<Vuelo> query = entityManager.createQuery(
                "SELECT v FROM Vuelo v WHERE v.origen = :origen AND v.destino = :destino", Vuelo.class);
            query.setParameter("origen", origen);
            query.setParameter("destino", destino);
            return query.getResultList();
        } finally {
            if (em == null && entityManager != null && entityManager.isOpen()) {
                entityManager.close();
            }
        }
    }

    public Vuelo buscarPorNumeroVuelo(String numeroVuelo) {
        EntityManager entityManager = getEntityManager();
        try {
            TypedQuery<Vuelo> query = entityManager.createQuery(
                "SELECT v FROM Vuelo v WHERE v.numeroVuelo = :numeroVuelo", Vuelo.class);
            query.setParameter("numeroVuelo", numeroVuelo);
            List<Vuelo> resultados = query.getResultList();
            return resultados.isEmpty() ? null : resultados.get(0);
        } finally {
            if (em == null && entityManager != null && entityManager.isOpen()) {
                entityManager.close();
            }
        }
    }
}