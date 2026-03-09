package com.cg.entity;

import jakarta.persistence.*;

import java.sql.ResultSet;
import java.util.List;

public class ProductMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
        EntityManager em = emf.createEntityManager();

//        TypedQuery<Product> q = em.createQuery("select p from Product p",Product.class);
//
//        List<Product> pl = q.getResultList();
//        pl.forEach(p-> System.out.println(p.getName()+"\t"+p.getPrice()));

        // 2 ways to query multiple columns
//        TypedQuery<Object[]> q = em.createQuery("select p.name, p.price, p.mfd from Product p",Object[].class);

//        TypedQuery<ProductDTO> q= em.createQuery("select new ProductDTO(p.name, p.price, p.mfd) from Product p",ProductDTO.class);

//        TypedQuery<Product> q = em.createQuery("select p from Product p", Product.class);

//        TypedQuery<Product> q = em.createQuery("select p from Product p where p.price<:p", Product.class);
//        q.setParameter("p", 80000);

//        TypedQuery<Product> q = em.createQuery("select p from Product p where p.name like :p", Product.class);
//        q.setParameter("p", "M%");

//        List<Product> pl=q.getResultList();

//        List<ProductDTO> pl=q.getResultList();

//        pl.forEach(p-> System.out.println(p));

        em.getTransaction().begin();
        //Query to class
//        Query q1=em.createQuery("update Product p set p.price=10000 where p.pid=:p");
//        q1.setParameter("p",102);
//        int row=q1.executeUpdate();

        //Query to table
        Query q2=em.createQuery("update product p set p.price=10000 where p.pid=:p");
        q2.setParameter("p",10);
        int row=q2.executeUpdate();
        em.getTransaction().commit();

    }


}