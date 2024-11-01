package com.model;

import java.util.List;

public class Deal {
    private int id;
    private int amount;
    private List<Customer> customers;
    private List<Product> products;

    public Deal() {
    }

    public Deal(int id, int amount) {
        this.id = id;
        this.amount = amount;
    }

    public Deal(int amount) {
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
    
}
