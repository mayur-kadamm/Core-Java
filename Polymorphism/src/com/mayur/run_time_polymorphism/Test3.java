package com.mayur.run_time_polymorphism;

//Overriding + Upcasting Example
class Payment {
    void pay() {
        System.out.println("Processing payment...");
    }
}

class UPI extends Payment {
    void pay() {
        System.out.println("Paying through UPI");
    }
}

class Card extends Payment {
    void pay() {
        System.out.println("Paying through Card");
    }
}

public class Test3 {
    public static void main(String[] args) {
        Payment p = new UPI();
        p.pay();    // UPI

        p = new Card();
        p.pay();    // Card
    }
}

