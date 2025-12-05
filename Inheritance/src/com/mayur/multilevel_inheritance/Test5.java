package com.mayur.multilevel_inheritance;

class Aa {
    void showA() { System.out.println("A"); }
}

class Bb extends Aa {
    void showB() { System.out.println("B"); }
}

class Cc extends Bb {
    void showC() { System.out.println("C"); }
}

public class Test5 {
    public static void main(String[] args) {
        Cc obj = new Cc();
        obj.showA();
        obj.showB();
        obj.showC();
    }
}
