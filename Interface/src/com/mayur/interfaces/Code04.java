package com.mayur.interfaces;

// Multiple Interface Implementation
interface A{
	void show();
}

interface B{
	void display();
}

public class Code04 implements A, B{
	@Override
	public void show() {
		System.out.println("Showing........");
	}
	
	@Override
	public void display() {
		System.out.println("Desplaying.......");
	}
	
	public static void main(String[] args) {
	Code04	v = new Code04();
	v.show();
	v.display();
	
	}

}
