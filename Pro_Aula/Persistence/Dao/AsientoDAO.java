package Persistence.Dao;

import Dominio.Entidades.Administrador;
import Dominio.Entidades.Asiento;
import Dominio.Entidades.Avion;
import Dominio.Entidades.Vuelo;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.LockModeType;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class AsientoDAO {

    private EntityManager em;

    public AsientoDAO(EntityManager em) {
        this.em = em;
    }

    // Crear asiento
    public void crear(Asiento asiento) {
        try {
            em.getTransaction().begin();
            em.persist(asiento);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        }
    }

    // Editar asiento
    public void editar(Asiento asiento) {
        try {
            em.getTransaction().begin();
            em.merge(asiento);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        }
    }
    public void actualizar(Asiento asiento) {
        em.merge(asiento);
    }

public void eliminar(Long idAsiento) {
    Asiento asiento = em.find(Asiento.class, idAsiento);
    if (asiento != null) {
        em.getTransaction().begin();
        em.remove(asiento);
        em.getTransaction().commit();
    }
}


    // Buscar asiento por ID
    public Asiento buscarPorId(Long id) {
        return em.find(Asiento.class, id);
    }

    // Listar todos los asientos
    public List<Asiento> obtenerTodos() {
        TypedQuery<Asiento> query = em.createQuery("SELECT a FROM Asiento a", Asiento.class);
        return query.getResultList();
    }

    // Contar asientos por vuelo (útil para generar el número de asiento automáticamente)
    public int contarAsientosPorVuelo(int idVuelo) {
        TypedQuery<Long> query = em.createQuery(
                "SELECT COUNT(a) FROM Asiento a WHERE a.vuelo.idVuelo = :idVuelo", Long.class);
        query.setParameter("idVuelo", idVuelo);
        return query.getSingleResult().intValue();
    }

   public List<Asiento> buscarPorVuelo(Long idVuelo) {
    return em.createQuery("SELECT a FROM Asiento a WHERE a.vuelo.idVuelo = :idVuelo", Asiento.class)
            .setParameter("idVuelo", idVuelo)
            .getResultList();
}

    public List<Asiento> buscarPorClase(String clase) {
        return em.createQuery("SELECT a FROM Asiento a WHERE a.clase = :clase", Asiento.class)
                .setParameter("clase", clase)
                .getResultList();
    }

    public List<Asiento> buscarPorDisponibilidad(boolean disponible) {
        return em.createQuery("SELECT a FROM Asiento a WHERE a.disponible = :disponible", Asiento.class)
                .setParameter("disponible", disponible)
                .getResultList();
    }
    public List<Asiento> obtenerAsientosDisponiblesPorVuelo(int idVuelo) {
        try {
            return em.createQuery(
                "SELECT a FROM Asiento a " +
                "WHERE a.vuelo.idVuelo = :idVuelo " +
                "AND a.disponible = true " +
                "AND NOT EXISTS (" +
                "   SELECT r FROM Reserva r " +
                "   WHERE r.vuelo.idVuelo = :idVuelo " +
                "   AND r.asiento.numero = a.numero " +
                "   AND r.estado = 'PEN'" +
                ")", Asiento.class)
                .setParameter("idVuelo", idVuelo)
                .getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }


public List<Asiento> obtenerPorAvion(Avion avion) {
    return em.createQuery("SELECT a FROM Asiento a JOIN a.vuelo v WHERE v.avion = :avion", Asiento.class)
             .setParameter("avion", avion)
             .getResultList();
}


public List<Asiento> listarTodos() {
    return em.createQuery("SELECT a FROM Asiento a", Asiento.class).getResultList();
}

   // En tu clase AsientoDAO.java
public int contarAsientosPorAvion(int idAvion) {
    EntityTransaction tx = em.getTransaction();
    try {
        tx.begin();
        // Cambia el parámetro a Long
        Query query = em.createQuery("SELECT COUNT(a) FROM Asiento a WHERE a.avion.idAvion = :idAvion");
        query.setParameter("idAvion", (long)idAvion); // Conversión explícita a Long
        Long count = (Long) query.getSingleResult();
        tx.commit();
        return count != null ? count.intValue() : 0;
    } catch (Exception e) {
        if (tx != null && tx.isActive()) {
            tx.rollback();
        }
        e.printStackTrace();
        return 0;
    }
}

  // En AsientoDAO.java
public Asiento buscarPorNumero(String numero) {
    try {
        return em.createQuery(
            "SELECT a FROM Asiento a WHERE a.numero = :numero", Asiento.class)
            .setParameter("numero", numero)
            .setMaxResults(1) // Limitar a 1 resultado
            .getSingleResult();
    } catch (NoResultException e) {
        return null;
    } catch (NonUniqueResultException e) {
        // Si hay duplicados, obtener el primero
        List<Asiento> resultados = em.createQuery(
            "SELECT a FROM Asiento a WHERE a.numero = :numero", Asiento.class)
            .setParameter("numero", numero)
            .setMaxResults(1)
            .getResultList();
        return resultados.isEmpty() ? null : resultados.get(0);
    }
}

   // En AsientoDAO.java
public List<String> obtenerNumerosDeAsientosPorAvion(Long idAvion) {
    try {
        return em.createQuery(
            "SELECT a.numero FROM Asiento a WHERE a.avion.idAvion = :idAvion", String.class)
            .setParameter("idAvion", idAvion)  // Asegúrate que idAvion sea Long
            .getResultList();
    } catch (Exception e) {
        throw new RuntimeException("Error al obtener asientos del avión", e);
    }
}

public boolean verificarDisponibilidadAsiento(int idVuelo, String numeroAsiento) {
        try {
            Long count = em.createQuery(
                "SELECT COUNT(r) FROM Reserva r " +
                "WHERE r.vuelo.idVuelo = :idVuelo " +
                "AND r.asiento.numero = :numeroAsiento " +
                "AND r.estado = 'PEN'", Long.class)
                .setParameter("idVuelo", idVuelo)
                .setParameter("numeroAsiento", numeroAsiento)
                .getSingleResult();
            
            return count == 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

  public long contarAsientosPorAvionYClase(long idAvion, String clase) {
        try {
            return em.createQuery(
                "SELECT COUNT(a) FROM Asiento a WHERE a.avion.idAvion = :idAvion AND a.clase = :clase", 
                Long.class)
                .setParameter("idAvion", idAvion)
                .setParameter("clase", clase)
                .getSingleResult();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
public Asiento obtenerUltimoAsientoPorAvionYClase(long idAvion, String clase) {
        try {
            return em.createQuery(
                "SELECT a FROM Asiento a WHERE a.avion.idAvion = :idAvion AND a.clase = :clase " +
                "ORDER BY a.numero DESC", Asiento.class)
                .setParameter("idAvion", idAvion)
                .setParameter("clase", clase)
                .setMaxResults(1)
                .getSingleResult();
        } catch (NoResultException e) {
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

   public Asiento buscarPorIdConBloqueo(Long id) {
    try {
        return em.createQuery(
            "SELECT a FROM Asiento a WHERE a.idAsiento = :id", Asiento.class)
            .setParameter("id", id)
            .setLockMode(LockModeType.PESSIMISTIC_WRITE)
            .getSingleResult();
    } catch (NonUniqueResultException e) {
        // Manejar duplicados devolviendo el primero
        return em.createQuery(
            "SELECT a FROM Asiento a WHERE a.idAsiento = :id", Asiento.class)
            .setParameter("id", id)
            .setMaxResults(1)
            .getResultList()
            .get(0);
    } catch (NoResultException e) {
        return null;
    }
}

    public List<Asiento> obtenerAsientosPorAvion(long idAvion) {
    return em.createQuery(
        "SELECT a FROM Asiento a WHERE a.avion.id = :idAvion ORDER BY a.numero", 
        Asiento.class)
        .setParameter("idAvion", idAvion)
        .getResultList();
}

    public Asiento buscarPorNumeroYVuelo(String numero, int idVuelo) {
    TypedQuery<Asiento> query = em.createQuery(
        "SELECT a FROM Asiento a WHERE a.numero = :numero AND a.vuelo.idVuelo = :idVuelo", Asiento.class);
    query.setParameter("numero", numero);
    query.setParameter("idVuelo", idVuelo);

    List<Asiento> resultados = query.getResultList();
    return resultados.isEmpty() ? null : resultados.get(0);
}

    public List<Asiento> obtenerAsientosDisponibles() {
    try {
        // Consulta JPQL para obtener asientos disponibles (disponible = true)
        String jpql = "SELECT a FROM Asiento a WHERE a.disponible = true";
        TypedQuery<Asiento> query = em.createQuery(jpql, Asiento.class);
        return query.getResultList();
    } catch (Exception e) {
        System.err.println("Error al obtener asientos disponibles: " + e.getMessage());
        return new ArrayList<>(); // Retorna lista vacía en caso de error
    }
}

  

}
