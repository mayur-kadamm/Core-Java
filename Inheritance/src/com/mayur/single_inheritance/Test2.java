package com.mayur.single_inheritance;

// Arithmetic 
class Add {
    int add(int a, int b) { return a + b; }
}
class Calculator extends Add {
    int square(int x) { return x * x; }
}

public class Test2 {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(2, 3));
        System.out.println(c.square(4));
    }
}
