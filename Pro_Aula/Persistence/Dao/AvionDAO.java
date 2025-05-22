package Persistence.Dao;

import Dominio.Entidades.Avion;
import java.util.Collections;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class AvionDAO {

    private final EntityManager em;

    public AvionDAO(EntityManager em) {
        this.em = em;
    }

  

    public void crear(Avion avion) {
        if (!em.getTransaction().isActive()) {
            EntityTransaction tx = em.getTransaction();
            try {
                tx.begin();
                em.persist(avion);
                tx.commit();
            } catch (Exception e) {
                if (tx.isActive() && !tx.getRollbackOnly()) {
                    tx.rollback();
                }
                throw new RuntimeException("Error al crear avión", e);
            }
        } else {
            em.persist(avion);
        }
    }
     public Avion buscarPorId(long id) {
        return em.find(Avion.class, id);
    }
    
    // Método para buscar por matrícula
  public Avion buscarPorMatricula(String matricula) {
    try {
        TypedQuery<Avion> query = em.createQuery(
            "SELECT a FROM Avion a WHERE a.matricula = :matricula", Avion.class);
        query.setParameter("matricula", matricula);
        return query.getSingleResult();
    } catch (NoResultException e) {
        return null;
    }
}


    public List<Avion> listarTodos() {
        TypedQuery<Avion> query = em.createQuery("SELECT a FROM Avion a", Avion.class);
        return query.getResultList();
    }

    public List<Avion> listarDisponibles() {
        TypedQuery<Avion> query = em.createQuery(
            "SELECT a FROM Avion a WHERE a.disponible = true", Avion.class);
        return query.getResultList();
    }


    public void actualizar(Avion avion) {
      EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            em.merge(avion);
            tx.commit();
        } catch (Exception e) {
            if (tx.isActive()) {
                tx.rollback();
            }
            throw new RuntimeException("Error al actualizar avión", e);
        }
    }

    // Método para eliminar
    public void eliminar(long id) {
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            Avion avion = em.find(Avion.class, id);
            if (avion != null) {
                em.remove(avion);
            }
            tx.commit();
        } catch (Exception e) {
            if (tx.isActive()) {
                tx.rollback();
            }
            throw new RuntimeException("Error al eliminar avión", e);
        }
    }
    public void cambiarEstado(int id, String nuevoEstado) {
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            Avion avion = em.find(Avion.class, id);
            if (avion != null) {
                avion.setEstado(nuevoEstado);
                em.merge(avion);
            }
            tx.commit();
        } catch (Exception e) {
            if (tx.isActive()) {
                tx.rollback();
            }
            throw new RuntimeException("Error al cambiar estado del avión", e);
        }
        
    }
    public boolean existeMatricula(String matricula) {
    try {
        Query query = em.createQuery("SELECT COUNT(a) FROM Avion a WHERE a.matricula = :matricula");
        query.setParameter("matricula", matricula);
        return (Long)query.getSingleResult() > 0;
    } catch (Exception e) {
        throw new PersistenceException("Error al verificar matrícula", e);
    }
}

   public List<Avion> obtenerTodos() {
    try {
        return em.createQuery("SELECT a FROM Avion a", Avion.class).getResultList();
    } catch (Exception e) {
        System.out.println("Error al obtener aviones: " + e.getMessage());
        return Collections.emptyList();
    }
}
public Avion buscarPorId(Long id) { // Cambiado a Long
    try {
        return em.find(Avion.class, id);
    } catch (Exception e) {
        e.printStackTrace();
        return null;
    }
}

}
    

