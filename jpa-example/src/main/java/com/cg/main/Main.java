package com.cg.main;

import com.cg.entity.Product;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

public class Main {
    static void main(String[] args) {
//        Product p1= new Product(103,"Book",5000,60, LocalDate.of(2025,9,16));
//        Product p2= new Product(104,"Ball",500,45, LocalDate.of(2021,6,22));
//        Product p3= new Product(105,"HP-ENVY",135000,38, LocalDate.of(2024,12,6));
//        Product p4= new Product(106,"Laptop-Dell",45000,56, LocalDate.of(2025,8,5));

        EntityManagerFactory emf= Persistence.createEntityManagerFactory("my-pu");

        EntityManager em=emf.createEntityManager();
        EntityTransaction tx=em.getTransaction();
//        tx.begin();
//        em.persist(p1);
//        em.persist(p2);
//        em.persist(p3);
//        em.persist(p4);
//        tx.commit();
//        System.out.println("Product created....");


//        tx.begin();
//        Product p=em.find(Product.class,103);
//        if(p!=null){
//            System.out.println(p);
//        }else{
//            System.out.println("product not found...");
//        }
//        tx.commit();


//        Product p=new Product();
//        p.setPid(101);
//        boolean b=em.contains(p);
//        System.out.println(b);
        
        
         
    }
}
