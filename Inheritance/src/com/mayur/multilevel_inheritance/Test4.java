package com.mayur.multilevel_inheritance;

class Vehicle {
    void start() { System.out.println("Vehicle starts"); }
}

class Car extends Vehicle {
    void features() { System.out.println("Car has features"); }
}

class SportsCar extends Car {
    void turbo() { System.out.println("SportsCar turbo"); }
}

public class Test4 {
    public static void main(String[] args) {
        SportsCar s = new SportsCar();
        s.start();
        s.features();
        s.turbo();
    }
}

