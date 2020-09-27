package com.company;

//customer attributes
public class Customer {
    String name;
    int id;
    double balance;

//constructor for name and id

    public Customer(String newname, int i_d) {

        name = newname;
        id = i_d;
        balance = 0;
    }

    public Customer(String newname, int i_d, double newbalance){

        name = newname;
        id = i_d;
        balance = newbalance;

    }
    //make a method to add balance

    public void deposit (double amount) {
        if (amount > 0) {
            balance = ( balance + amount );
        } else {
            System.out.println("cannot add negative amount of money");
        }
    }

    // make a method to widthdraw cash
    public void withdraw (double amount) {
        if (amount > balance) {
            balance = ( balance - amount );
        } else {
            System.out.println("cannot withraw more money than you have!");
        }
    }

}
