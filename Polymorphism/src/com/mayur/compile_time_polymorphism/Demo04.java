package com.mayur.compile_time_polymorphism;

class Demo4 {
    void display(int a, String b) {
        System.out.println("Integer then String");
    }

    void display(String a, int b) {
        System.out.println("String then Integer");
    }

    public static void main(String[] args) {
        Demo4 d = new Demo4();
        d.display(10, "Hello");
        d.display("Hello", 10);
    }
}

