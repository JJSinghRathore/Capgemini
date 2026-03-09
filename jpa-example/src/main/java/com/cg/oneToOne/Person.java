package com.cg.OneToOne;

import jakarta.persistence.*;

import java.time.LocalDate;

//@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int pid;
    private String name;
    private LocalDate dob;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    // with help of cascade if the person has Dl then it will automatically persist the Dl when we persist the person in main
    // otherwise we have to persist the dl first then persist person
    // default fetch type is EAGER in which when person is loaded then dl is also loaded automatically but with LAZY only person is loaded and dl is loaded only when it is required
    @JoinColumn(name = "person_dl")
    private Dl dl;

    public Person(){}

    public Person(String name, LocalDate dob) {
        this.name = name;
        this.dob = dob;
//        this.dl = dl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Dl getDl() {
        return dl;
    }

    public void setDl(Dl dl) {
        this.dl = dl;
    }
}


