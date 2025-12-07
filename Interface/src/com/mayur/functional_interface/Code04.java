package com.mayur.functional_interface;

interface EvenCheck{
	boolean isEven(int n); // abstract method
}

public class Code04 {
	public static void main(String[] args) {
	EvenCheck ec = (n) -> n % 2 == 0; // Lamda expression to check even number 
	System.out.println(ec.isEven(12)); 
	}
}
