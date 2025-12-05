package com.mayur.hierarchical_inheritance;


// Bank → SBI, HDFC
class Bank {
    void interest() { System.out.println("Bank interest"); }
}

class SBI extends Bank {
    void rate() { System.out.println("SBI rate: 5%"); }
}

class HDFC extends Bank {
    void rate() { System.out.println("HDFC rate: 6%"); }
}

public class Test5 {
    public static void main(String[] args) {
        new SBI().rate();
        new HDFC().rate();
    }
}

