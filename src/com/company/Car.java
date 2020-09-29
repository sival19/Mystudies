package com.company;

public class Car {
    String brand;
    String color = "red";
    String type = "diesel";
    int topspeed;
    int speed = 0;

    public Car(String brandname, int ts) {
        brand = brandname;
        topspeed = ts;
    }

    public Car(int ts) {
        topspeed = ts;
        brand = "zenvo";
    }
    public void setSpeed (int i) {
        if (i > topspeed) {
            speed = topspeed;
        } else {
            speed = i;
        }
    }

    public static void main(String[] args) {
        Car c = new Car(180);
        System.out.println(c.speed);
        c.setSpeed(5000);
        System.out.println(c.speed);
        c.setSpeed(100);
        System.out.println(c.speed);
    }
}
