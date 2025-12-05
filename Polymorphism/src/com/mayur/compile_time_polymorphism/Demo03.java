package com.mayur.compile_time_polymorphism;

class Demo3 {
    int multiply(int a, int b) {
        return a * b;
    }

    double multiply(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        Demo3 d = new Demo3();
        System.out.println(d.multiply(5, 6));
        System.out.println(d.multiply(2.5, 3.5));
    }
}
