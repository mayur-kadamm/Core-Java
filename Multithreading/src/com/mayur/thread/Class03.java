package com.mayur.thread;

// diff b/w run() and start():
public class Class03 extends Thread {

	@Override 
	public void run() {
		System.out.println("Class03 run method executed ");
	}
	public static void main(String[] args) {
	       Class03 obj = new Class03();
	       Thread t = new Thread(obj);
	      
	       t.start(); // It'll create new Thread which is responsible for your Class03 run method 
	       t.run(); //Directly your calling run method from Class03 by using method-overriding concept, It Wouldn't create new Thread 
	       
	}

}
