package com.mayur.single_inheritance;

// Student Example
class Person {
    void details() { System.out.println("Person Details"); }
}
class Student extends Person {
    void study() { System.out.println("Student studies"); }
}

public class Test5 { public static void main(String[] args) { new Student().details(); } }

