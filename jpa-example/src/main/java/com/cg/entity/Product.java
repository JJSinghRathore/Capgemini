package com.cg.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Product {
    @Id
    private int pid;
    private String name;
    private double price;
    private int qty;
    private LocalDate dom;

    public Product() {

    }

    @Override
    public String toString() {
        return "Product{" +
                "pid=" + pid +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", qty=" + qty +
                ", dom=" + dom +
                '}';
    }

    public Product(int pid, String name, double price, int qty, LocalDate dom) {
        super();
        this.pid = pid;
        this.name = name;
        this.price = price;
        this.qty = qty;
        this.dom = dom;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public LocalDate getDom() {
        return dom;
    }

    public void setDom(LocalDate dom) {
        this.dom = dom;
    }
}
