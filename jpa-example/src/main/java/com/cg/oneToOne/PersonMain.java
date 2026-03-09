package com.cg.OneToOne;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

public class PersonMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
//        Person p = new Person("Sadiq", LocalDate.of(2002`,7,16));
//        Dl obj = new Dl(LocalDate.of(2042,12,20),LocalDate.of(2022,12,20),"LMV,HMV");
//        p.setDl(obj);
////        em.persist(obj);
//        em.persist(p);
//        em.getTransaction().commit();
//        System.out.println("Person Created.....");

        // to find a data
        Person p = em.find(Person.class,52);
        System.out.println(p.getName());
//        em.detach(p);
//        System.out.println("=====DL=====");
//        em.remove(p);
//        System.out.println("Person removed");
//        em.getTransaction().commit();

        // update data
        Dl d = em.find(Dl.class,52);
        d.setType("LMV");
        em.getTransaction().commit();

    }
}
