package com.mayur.run_time_polymorphism;

//Constructor + Overriding (Dynamic Behavior)
class Vehicle {
    void start() {
        System.out.println("Vehicle starts");
    }
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike starts with kick");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car starts with key");
    }
}

public class Test5 {
    public static void main(String[] args) {
        Vehicle v;

        v = new Bike();
        v.start();

        v = new Car();
        v.start();
    }
}
