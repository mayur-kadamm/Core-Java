package com.mayur.thread;

public class Class06 extends Thread {

	@Override
	public void run() {
		int priority = Thread.currentThread().getPriority();
		for(int i = 1; i<=5; i++) {
			System.out.println("priority :- "+priority+" executed run() - "+i);
		} 
	}
	public static void main(String[] args) {
		Class06 obj = new Class06();
		Thread t1 = new Thread(obj); // 1st Thread 
		Thread t2 = new Thread(obj); // 2nd Thread 
		
		t1.setPriority(MIN_PRIORITY);
		t2.setPriority(10);
		
		t1.start();  
		t2.start();

	}

}
