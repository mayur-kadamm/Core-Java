package com.mayur.hierarchical_inheritance;

// Vehicle → Bike, Car
class Vehicle {
    void fuel() { System.out.println("Vehicle needs fuel"); }
}

class Bike extends Vehicle {
    void wheels() { System.out.println("Bike has 2 wheels"); }
}

class Car extends Vehicle {
    void wheels() { System.out.println("Car has 4 wheels"); }
}

public class Test4 {
    public static void main(String[] args) {
        new Bike().fuel();
        new Car().fuel();
    }
}

