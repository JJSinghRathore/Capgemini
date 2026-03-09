package com.cg.manyToOne2;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int did;
    @Column(unique = true)
    private String dname;
    @OneToMany(mappedBy="department", cascade = CascadeType.ALL)
    private List<Employee> employees;

    public Department() {}
    public Department( String dname) {

        this.dname = dname;
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }
    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
