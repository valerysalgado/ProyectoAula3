import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public static void main(String[] args) {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("ConfigDB");
    EntityManager em = emf.createEntityManager();
    em.close();
    emf.close();
}