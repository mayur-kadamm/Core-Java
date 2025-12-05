package com.mayur.compile_time_polymorphism;

class Student {
    String name;
    int age;

    Student() {
        System.out.println("Default Constructor");
    }

    Student(String name) {
        this.name = name;
        System.out.println("Name: " + name);
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        new Student();
        new Student("Mayur");
        new Student("Mayur", 23);
    }
}

