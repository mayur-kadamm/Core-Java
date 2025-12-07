package com.mayur.functional_interface;

@FunctionalInterface
interface Calculator{
	int add(int a, int b);
}

public class Code02 {
	public static void main(String[] args) {
		Calculator c = (a,b) -> (a+b);    // lamda expression 
		System.out.println(c.add(5, 5));
	}
}
