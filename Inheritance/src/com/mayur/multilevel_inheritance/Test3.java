package com.mayur.multilevel_inheritance;

class Person {
    void talk() { System.out.println("Person talking"); }
}

class Employee extends Person {
    void work() { System.out.println("Employee working"); }
}

class Manager extends Employee {
    void manage() { System.out.println("Manager managing"); }
}

public class Test3 {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.talk();
        m.work();
        m.manage();
    }
}
