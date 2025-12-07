package com.mayur.thread;

public class Class05 implements Runnable {

	@Override
	public void run() {
		 String name = Thread.currentThread().getName(); 
		 int priority = Thread.currentThread().getPriority(); // getPriority() Return type int 
		for(int i = 1; i<=5; i++) {
			System.out.println(name+" executed run() method - "+i +"  Priority :- "+ priority );
		} // end for loop
	} // end run()
	
	
	public static void main(String[] args) {
		Class05 obj = new Class05();
		Thread t1 = new Thread(obj); // 1st Thread 
		Thread t2 = new Thread(obj); // 2nd Thread 
		
		t1.setName("Mayur Thread"); // we can set the name of Thread 
		t1.start(); //  
		t2.start();
	}
}
