package com.mayur.thread;

// By extending Thread class 
public class Class01 extends Thread {

	@Override
	public void run() {
		for(int i = 1; i<=5; i++) {
			System.out.println("Run method executed :- "+i);
		}
		
	}
	public static void main(String[] args) {
		Class01 op = new Class01();
		Thread t1 = new Thread(op);
		t1.start();  // Class01 run() executed

		// Second Thread 
		Thread t2 = new Thread();
		t2.start(); // Thread class run() execute 

	}

}
