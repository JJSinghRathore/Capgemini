package com.cg.entity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;

import java.util.List;


public class CriteriaDemo {
    static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
        EntityManager em=emf.createEntityManager();
        CriteriaBuilder cb=em.getCriteriaBuilder();
        CriteriaQuery<Product> cq=cb.createQuery(Product.class);
        Root<Product> r=cq.from(Product.class);

        
        Predicate con1=cb.greaterThan(r.get("price"), 50000);
        Predicate con2=cb.lessThan(r.get("price"), 70000);
        cq.select(r).where(cb.or(con1,con2));
        List<Product> li= em.createQuery(cq).getResultList();
        li.forEach(p-> System.out.println(p));

    }
}
