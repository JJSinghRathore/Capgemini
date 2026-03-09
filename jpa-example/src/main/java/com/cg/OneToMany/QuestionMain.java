package com.cg.OneToMany;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.util.ArrayList;
import java.util.List;

public class QuestionMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
        EntityManager em = emf.createEntityManager();

//        em.getTransaction().begin();
//        Question q = new Question("What is JPA?","M");
//        List<Answer> li = new ArrayList<>();
//        li.add(new Answer("JPA is ORM standard",q));
//        li.add(new Answer("usesto map the obj in db",q));
////        li.add(new Answer("Java is Simple"));
//        q.setAnswer(li);
//        em.persist(q);
//        em.getTransaction().commit();
//        System.out.println("Created...");

//        Question q=em.find(Question.class,102);
//        System.out.println(q.getQuesName());
//        q.getAnswer().forEach(a-> System.out.println(a.getAnswer()));

        Answer ans= em.find(Answer.class,1);
        System.out.println("----Answer");
        System.out.println(ans.getAnswer());
        System.out.println("----Question");
        System.out.println(ans.getQuestion().getQuesName());
    }
}
