package com.mayur.run_time_polymorphism;

//Basic Method Overriding (Parent → Child)
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Test1 {
    public static void main(String[] args) {
        Animal a = new Dog();   // Upcasting
        a.sound();                        // Dog version executes
    }
}

