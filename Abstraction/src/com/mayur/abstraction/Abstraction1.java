package com.mayur.abstraction;


//Basic Abstract Class & Method
abstract class Animal1 {
    // abstract method
    abstract void sound();

    // concrete method
    void sleep() {
        System.out.println("Animal sleeps");
    }
}

class Dog extends Animal1 {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Abstraction1 {
    public static void main(String[] args) {
        Animal1 a = new Dog();
        a.sound();  // Dog's implementation
        a.sleep();  // inherited concrete method
    }
}

