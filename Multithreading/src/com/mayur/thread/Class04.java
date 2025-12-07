package com.mayur.thread;

public class Class04 extends Thread{

	@Override
	public void run() {
		 String name = Thread.currentThread().getName(); // getName() return type string
		for(int i = 1; i<=5; i++) {
			System.out.println(name+" executed run() - "+i);
		} // end for loop
	} // end run()
	
	public static void main(String[] args) {
		Class04 obj = new Class04();
		Thread t1 = new Thread(obj); // 1st Thread 
		Thread t2 = new Thread(obj); // 2nd Thread 
		
		t1.setName("Mayur Thread"); // we can set the name of Thread 
		t1.start(); //  
		t2.start();
	}
}
/*
   Thread Schedular :
   			- It is responsible for starting the Thread 
   			- It'll desided which thread should start 1st 
   			- It desided on two concept -
   								1) Thread Priority 
   								2) Underlying Operating System (OS)
   		
   	Thread Priority various between 1 to 10.
   			  1 == Minimum priority 
   			  5 == Default / Normal Priority 
   			10 == Maximum priority 
   			
   
   
 */
