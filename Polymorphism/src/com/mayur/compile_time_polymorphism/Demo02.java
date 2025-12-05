package com.mayur.compile_time_polymorphism;

class Demo2 {
    void show(int a) {
        System.out.println("Integer: " + a);
    }

    void show(String a) {
        System.out.println("String: " + a);
    }

    public static void main(String[] args) {
        Demo2 d = new Demo2();
        d.show(50);
        d.show("Mayur");
    }
}

