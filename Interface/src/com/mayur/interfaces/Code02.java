package com.mayur.interfaces;

// Interface with Multiple Methods
interface Vehicle{
	void start();
	void stop();
}

class Car implements Vehicle{
	@Override
	public void start() {
		System.out.println("Car Start.....");
	}
	
	@Override
	public void stop() {
		System.out.println("Car Stop......");
	}
}


public class Code02 {
	public static void main(String[] args) {
	new Car().start();
	new Car().stop();
	}
}
