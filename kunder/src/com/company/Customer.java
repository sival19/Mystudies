package com.company;


//customer attributes
public class Customer {
    String name;
    int id;
    double balance;


//constructor for name and id

    public Customer(String newname, int id) {

        name = newname;
        this.id = id;
        balance = 0;
    }

    public Customer(String newname, int id, double newbalance) {

        name = newname;
        this.id = id;
        balance = newbalance;

    }
    //make a method to add balance

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("You have deposited: " + amount);
            System.out.println("Your new ballance is: " + balance);
        } else {
            System.out.println("cannot add negative amount of money");
        }
    }

    // make a method to widthdraw cash
    public void withdraw(double amount) {
        if (amount < balance) {
            balance -= amount;
            System.out.println("You have withrawn: " + amount);
            System.out.println("Your new ballance is: " + balance);

        } else {
            System.out.println("cannot withraw more money than you have!");
        }
    }

    //make method to show balance
    public void getBalance() {
        System.out.println("Your current ballance is: " + balance);
    }



}
