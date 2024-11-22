import entity.Member;
import entity.Team;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Main {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpatest");
        EntityManagerFactory emf2 = Persistence.createEntityManagerFactory("jpatest");

        System.out.println(emf == emf2); //false

        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        try {
            tx.begin();
//            logic(em);
            tx.commit();
        } catch (Exception e) {
            e.printStackTrace();
            tx.rollback();
        } finally {
            em.close();
        }
//
//        EntityManager em2 = emf.createEntityManager();
//        EntityTransaction tx2 = em2.getTransaction();
//
//        try {
//            tx2.begin();
//            Member member = em2.getReference(Member.class, 1L);
//            tx2.commit();
//            em2.close();
////            System.out.println(member.getUsername());
//        } catch (Exception e) {
//            e.printStackTrace();
//            tx.rollback();
//        } finally {
//            em.close();
//        }
//        emf.close();
    }

    private static void logic(EntityManager em) {
        long id = 1L;
        String name = "tkdgus";
        int age = 28;

        Member m = new Member(id, name, age);
        Team team = new Team("팀1");

        System.out.println(m);
        em.persist(team);
        em.persist(m);

//        m.changeTeam(team);

        System.out.println(team);
    }
}
