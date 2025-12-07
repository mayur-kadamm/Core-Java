package com.mayur.functional_interface;
@FunctionalInterface
interface Sayable{
	void say(); // functional interface only contains only one abstract method 
}


public class Code01 {
	public static void main(String[] args) {
		Sayable s = () -> System.out.println("Hellow !"); // lamda expression
		s.say();
	}
}
