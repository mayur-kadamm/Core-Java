package com.mayur.abstraction;

// Abstract Class with Fields and Constructor
abstract class Vehicle {
    String brand;
    Vehicle(String brand) { this.brand = brand; }
    abstract void start();
    void info() { System.out.println("Brand: " + brand); }
}

class Car extends Vehicle {
    Car(String brand) { super(brand); }
    @Override
    void start() { System.out.println(brand + " car starts with key"); }
}

public class Abstraction2 {
    public static void main(String[] args) {
        Vehicle v = new Car("Toyota");
        v.info();
        v.start();
    }
}
