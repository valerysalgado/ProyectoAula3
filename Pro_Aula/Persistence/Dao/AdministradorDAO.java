package Persistence.Dao;

import Dominio.Entidades.Administrador;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class AdministradorDAO {

    private EntityManager em;
    private final EntityManagerFactory emf;

    public AdministradorDAO(EntityManager em) {
        this.em = em;
        this.emf = null;
    }

    public AdministradorDAO() {
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

    public void crear(Administrador administrador) {
        EntityManager entityManager = getEntityManager();
        EntityTransaction tx = null;
        boolean weCreatedManager = (em == null);
        
        try {
            tx = entityManager.getTransaction();
            tx.begin();
            entityManager.persist(administrador);
            tx.commit();
        } catch (Exception e) {
            if (tx != null && tx.isActive()) {
                tx.rollback();
            }
            throw new RuntimeException("Error al crear administrador", e);
        } finally {
            if (weCreatedManager && entityManager != null && entityManager.isOpen()) {
                entityManager.close();
            }
        }
    }

    public void actualizar(Administrador administrador) {
        EntityManager entityManager = getEntityManager();
        EntityTransaction tx = null;
        boolean weCreatedManager = (em == null);
        
        try {
            tx = entityManager.getTransaction();
            tx.begin();
            entityManager.merge(administrador);
            tx.commit();
        } catch (Exception e) {
            if (tx != null && tx.isActive()) {
                tx.rollback();
            }
            throw new RuntimeException("Error al actualizar administrador", e);
        } finally {
            if (weCreatedManager && entityManager != null && entityManager.isOpen()) {
                entityManager.close();
            }
        }
    }

    // ✅ CORREGIDO: Solo un método eliminar que usa Integer
    public void eliminar(Integer idAdministrador) {
        EntityManager entityManager = getEntityManager();
        EntityTransaction tx = null;
        boolean weCreatedManager = (em == null);
        
        try {
            tx = entityManager.getTransaction();
            tx.begin();
            Administrador administrador = entityManager.find(Administrador.class, idAdministrador);
            if (administrador != null) {
                entityManager.remove(administrador);
            }
            tx.commit();
        } catch (Exception e) {
            if (tx != null && tx.isActive()) {
                tx.rollback();
            }
            throw new RuntimeException("Error al eliminar administrador", e);
        } finally {
            if (weCreatedManager && entityManager != null && entityManager.isOpen()) {
                entityManager.close();
            }
        }
    }

    // ✅ CORREGIDO: Solo un método buscarPorId que usa Integer
    public Administrador buscarPorId(Integer id) {
        EntityManager entityManager = getEntityManager();
        try {
            return entityManager.find(Administrador.class, id);
        } finally {
            if (em == null && entityManager != null && entityManager.isOpen()) {
                entityManager.close();
            }
        }
    }

    public Administrador buscarPorNombre(String nombre) {
        EntityManager entityManager = getEntityManager();
        try {
            TypedQuery<Administrador> query = entityManager.createQuery(
                "SELECT a FROM Administrador a WHERE a.nombre = :nombre", Administrador.class);
            query.setParameter("nombre", nombre);
            List<Administrador> resultados = query.getResultList();
            return resultados.isEmpty() ? null : resultados.get(0);
        } finally {
            if (em == null && entityManager != null && entityManager.isOpen()) {
                entityManager.close();
            }
        }
    }

    public List<Administrador> listarTodos() {
        EntityManager entityManager = getEntityManager();
        try {
            TypedQuery<Administrador> query = entityManager.createQuery("SELECT a FROM Administrador a", Administrador.class);
            return query.getResultList();
        } finally {
            if (em == null && entityManager != null && entityManager.isOpen()) {
                entityManager.close();
            }
        }
    }

    public boolean validarCredenciales(String nombre, String telefono) {
        EntityManager entityManager = getEntityManager();
        try {
            TypedQuery<Administrador> query = entityManager.createQuery(
                "SELECT a FROM Administrador a WHERE a.nombre = :nombre AND a.telefono = :telefono", Administrador.class);
            query.setParameter("nombre", nombre);
            query.setParameter("telefono", telefono);
            return !query.getResultList().isEmpty();
        } finally {
            if (em == null && entityManager != null && entityManager.isOpen()) {
                entityManager.close();
            }
        }
    }

    // Método para cerrar el EntityManagerFactory si es necesario
    public void close() {
        if (emf != null && emf.isOpen()) {
            emf.close();
        }
    }
}