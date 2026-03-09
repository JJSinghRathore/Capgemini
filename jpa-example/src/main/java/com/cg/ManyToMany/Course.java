package com.cg.ManyToMany;

import jakarta.persistence.*;

import java.util.List;
@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cid;
    private String cname;
    @ManyToMany(mappedBy="course")
    private List<Student> students;
    public Course(){}

    public Course(String cname) {
        this.cname = cname;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
