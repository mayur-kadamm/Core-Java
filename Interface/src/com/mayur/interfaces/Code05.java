package com.mayur.interfaces;

interface Calculator{
	default void info() { // Default method 
		System.out.println("Calculator Inforamation");
	}
	
	
	static void greet() { // static method
		System.out.println("Hello from calculator");
	}
	
	
	int add(int a, int b); // abstract method
} // end of interface 


public class Code05  implements Calculator {
	@Override
	public int add(int a, int b) {
		return a+b;
	}

	public static void main(String[] args) {
		Code05 o = new Code05();
		System.out.println(o.add(5, 5));
		o.info();
		Calculator.greet();
	} // end of main method 
}
