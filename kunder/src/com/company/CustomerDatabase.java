package com.company;

public class CustomerDatabase {

    //add attribute
    Customer[] customers;

    //constructor make a new array
    public CustomerDatabase() {
        customers = new Customer[10];
    }
    //constructor add customer id from Customer to array
    void add(Customer customer) {
        customers[customer.id] = customer;

    }

    //constructor remove id from array if empty

    void remove(int id) {
        customers[id] = null;
    }

    //method that returns value of customers array

    Customer get(int id) {
        return customers[id];
    }

    void print() {
        for (Customer c : customers) {
            if (c == null) {
                continue;
            }
            System.out.println(c.name);
        }
    }
}
