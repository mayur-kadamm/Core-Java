package com.mayur.single_inheritance;

// Vehicle Example
class Vehicle {
    void start() { System.out.println("Vehicle starts"); }
}
class Bike extends Vehicle {
    void ride() { System.out.println("Bike riding"); }
}

public class Test4 { public static void main(String[] args) { new Bike().start(); } }

