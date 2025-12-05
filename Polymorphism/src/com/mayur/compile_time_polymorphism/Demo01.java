package com.mayur.compile_time_polymorphism;

class Demo1 {
    void add(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }

    void add(int a, int b, int c) {
        System.out.println("Sum = " + (a + b + c));
    }

    public static void main(String[] args) {
        Demo1 d = new Demo1();
        d.add(10, 20);
        d.add(10, 20, 30);
    }
}

