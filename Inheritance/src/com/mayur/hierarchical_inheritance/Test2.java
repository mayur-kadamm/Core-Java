package com.mayur.hierarchical_inheritance;

// Person → Student, Teacher
class Person {
    void speak() { System.out.println("Person speaking"); }
}

class Student extends Person {
    void study() { System.out.println("Student studying"); }
}

class Teacher extends Person {
    void teach() { System.out.println("Teacher teaching"); }
}

public class Test2 {
    public static void main(String[] args) {
        new Student().speak();
        new Teacher().speak();
    }
}

