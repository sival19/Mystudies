package com.company;

public class Main {

    public static void main(String[] args) {
        Customer aCustomer = new Customer("simon", 1 , 99.9);  //make a new customer

        aCustomer.getBalance();  //get the current ballance
        System.out.println();

        //deposit cash
        aCustomer.deposit(5);
        System.out.println();


        //withraw cash
        aCustomer.withdraw(55);

        CustomerDatabase[] newCustomer = new CustomerDatabase[aCustomer.id];

    }
}
