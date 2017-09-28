
package diometre.db;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import servlets.User;

public class UserDB {
  

    public static void create(User user) {
        EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("TOBAPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(user);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    public static void insert(User user) {
        EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("TOBAPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(user);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
    
}
