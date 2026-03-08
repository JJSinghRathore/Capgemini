package com.cg.dao;

import com.cg.bean.Employee;
import jakarta.persistence.*;

import java.util.List;

public class EmployeeDao implements IEmployeeDao{
    private static EntityManager em;
    static{
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("my-pu");
        em=emf.createEntityManager();
//        EntityTransaction tx=em.getTransaction();
    }

    @Override
    public String saveEmployee(Employee emp) {
        em.getTransaction().begin();
        em.persist(emp);
        em.getTransaction().commit();
        return "Employee added...";
    }

    @Override
    public String removeEmployee(String empid) {

        Employee emp=em.find(Employee.class,empid);
        if(emp!=null){
            em.getTransaction().begin();
            em.remove(emp);
            em.getTransaction().commit();
            return "Deleted...";
        }
        else{
            return "not deleted";
        }

    }

    @Override
    public Employee findEmployee(String empid) {
        Employee emp=em.find(Employee.class, empid);
            return emp;

    }

    @Override
    public List<Employee> getAll() {
        Query q=em.createQuery("from Employee");
        List<Employee> li=q.getResultList();
        return li;
    }

    @Override
    public String updateEmployee(Employee emp) {
        Employee e=em.find(Employee.class,emp.getEmpid());
        if(e!=null){
            em.getTransaction().begin();
            e.setName(emp.getName());
            e.setDob(emp.getDob());
            e.setEmail(emp.getEmail());
            em.getTransaction().commit();
            return "Employee updated...";
        }else{
            return "Not updated";
        }
    }
}
