package com.mayur.abstraction;

// Interface (Pure Abstraction)
interface Shape {
    double area();
    double perimeter();
}

class Circle implements Shape {
    private double r;
    Circle(double r) {
    	this.r = r; 
    	}
    public double area() { 
    	return Math.PI * r * r;
    	}
    public double perimeter() {
    	return 2 * Math.PI * r;
    	}
}

public class Abstraction5 {
    public static void main(String[] args) {
        Shape s = new Circle(2.0);
        System.out.println("Area: " + s.area());
        System.out.println("Perimeter: " + s.perimeter());
    }
}
