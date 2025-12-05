package com.mayur.single_inheritance;

// Method overloading 
class Parent {
    void message() { System.out.println("Parent"); }
}
class Child extends Parent {
    void message() { System.out.println("Child"); }
}

public class Test3 {
    public static void main(String[] args) {
        new Child().message();
    }
}

