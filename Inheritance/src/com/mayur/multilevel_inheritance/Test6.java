package com.mayur.multilevel_inheritance;

class Shape {
    void draw() { System.out.println("Drawing shape"); }
}

class Rectangle extends Shape {
    void area() { System.out.println("Rectangle area"); }
}

class Square extends Rectangle {
    void sides() { System.out.println("Square has 4 equal sides"); }
}

public class Test6 {
    public static void main(String[] args) {
        Square s = new Square();
        s.draw();
        s.area();
        s.sides();
    }
}

