package com.cg.manyToOne2;

import jakarta.persistence.*;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int eid;
    private String ename;
    @ManyToOne
    @JoinColumn(name="department_id")
    private Department department;

    public Employee() {}
    public Employee( String ename,Department department) {

        this.ename = ename;
        this.department = department;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
