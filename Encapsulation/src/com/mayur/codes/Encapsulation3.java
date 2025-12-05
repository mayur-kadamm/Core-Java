package com.mayur.codes;

// Employee Salary Secure Access
class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() { return name; }

    public double getSalary() { return salary; }

    public void setSalary(double salary) {
        if (salary > 0) this.salary = salary;
    }
}

public class Encapsulation3 {
    public static void main(String[] args) {
        Employee e = new Employee("John", 30000);

        System.out.println(e.getName());
        System.out.println(e.getSalary());

        e.setSalary(40000);
        System.out.println("Updated Salary: " + e.getSalary());
    }
}

