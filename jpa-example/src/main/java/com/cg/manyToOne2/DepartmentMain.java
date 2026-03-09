package com.cg.manyToOne2;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.ArrayList;
import java.util.List;

public class DepartmentMain {
    static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Department d=new Department("HR");
        List<Employee> li=new ArrayList<Employee>();
        li.add(new Employee("pragya",d));
        li.add(new Employee("aniket",d));
        li.add(new Employee("karan",d));
        d.setEmployees(li);



        em.persist(d);
        em.getTransaction().commit();
        System.out.println("Created...");
    }
}
