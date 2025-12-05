package com.mayur.hierarchical_inheritance;

// Shape → Circle, Triangle
class Shape {
    void draw() { System.out.println("Drawing shape"); }
}

class Circle extends Shape {
    void area() { System.out.println("Circle area"); }
}

class Triangle extends Shape {
    void area() { System.out.println("Triangle area"); }
}

public class Test3 {
    public static void main(String[] args) {
        new Circle().draw();
        new Triangle().draw();
    }
}

