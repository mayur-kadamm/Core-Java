package com.mayur.functional_interface;

@FunctionalInterface
interface Greet{
	void msg(String name); // Single abstract method
	
	static void show1() {
		System.out.println("This is static method from functional interface");
	}
	
	default void show2() {
		System.out.println("Default method from Functional interface");
	}
}

public class Code03 {
	public static void main(String[] args) {
		Greet g = (name) -> System.out.println("Hello my name is : "+name); // Lamda expression
		g.msg("Mayur");
		g.show2();
		Greet.show1();
	
	}
}
