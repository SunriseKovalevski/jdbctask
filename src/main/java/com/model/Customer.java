package com.model;

import java.util.List;

public class Customer {
    private int id;
    private String name;
    private String surname;
    private List<Deal> deals;

    public Customer() {
    }

    public Customer(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Customer(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<Deal> getDeals() {
        return deals;
    }

    public void setDeals(List<Deal> deals) {
        this.deals = deals;
    }
    
}
