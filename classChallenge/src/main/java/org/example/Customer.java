package org.example;

import java.time.temporal.ChronoUnit;

public class Customer {
    //name,creditLimit,email
    private String name;
    private double creditLimit;
    private String email;

    public Customer(){
        this("A Guru Aakash",234.9,"guru123@gmail.com");
        System.out.println("\nEmpty Customer constructor");
    }

    public Customer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public Customer(String name,String email){
        this(name,111.3,email);
    }

    //getters
    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
