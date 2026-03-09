package com.cg.ManyToMany;

import jakarta.persistence.*;

import java.util.Set;
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String sid;
    private String sname;
    @ManyToMany
    private Set<Course> course;

    public Student(){}
    public Student(String sid, String sname, Set<Course> course) {
        this.sid = sid;
        this.sname = sname;
        this.course = course;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Set<Course> getCourse() {
        return course;
    }

    public void setCourse(Set<Course> course) {
        this.course = course;
    }
}
