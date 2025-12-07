package com.mayur.multi_thread;

public class Class02B extends Thread{

	@Override
	public void run() {
		for(int i = 1; i<=5; i++) {
			System.out.println("Class A run method created "+i);
		}
	}
	public static void main(String[] args) throws InterruptedException {
		Class02B b = new Class02B();
		b.start(); // B class thread created 
		b.join(); // It'll shift to A Thread
		
		Class02A a = new Class02A();
		a.start(); //  A class thread created 
		
		
		
		
	}

}
