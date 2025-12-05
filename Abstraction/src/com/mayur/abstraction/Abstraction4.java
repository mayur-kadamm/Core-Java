package com.mayur.abstraction;


// Abstract Class + Polymorphism (Multiple Implementations)
abstract class Payment {
    abstract void pay(double amount);
}

class UPI extends Payment {
    void pay(double amount) { 
    	System.out.println("Paying " + amount + " via UPI");
    	}
}

class Card extends Payment {
    void pay(double amount) { 
    	System.out.println("Paying " + amount + " via Card");
    	}
}

public class Abstraction4 {
    public static void main(String[] args) {
        Payment p = new UPI();
        p.pay(250.0);
        p = new Card();
        p.pay(499.99);
    }
}

