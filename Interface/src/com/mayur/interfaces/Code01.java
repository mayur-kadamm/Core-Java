package com.mayur.interfaces;


 interface Animal {
	void sound();
}

class Dog implements Animal{
	@Override
	public void sound() {
		System.out.println("Dog barks...");
	}
}

class Cat implements Animal{
	@Override
	public void sound() {
	 System.out.println("Cat meuu.....");
		
	}
}
public class Code01 {
	public static void main(String[] args) {
		new Dog().sound();
		new Cat().sound();
	}
}
