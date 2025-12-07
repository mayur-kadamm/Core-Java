package com.mayur.thread_synchronized;

public class Class01 extends Thread{

	@Override
	public void run() {
		criticalResource();
	}
	
    synchronized	void criticalResource() {
		String name = Thread.currentThread().getName();
		System.out.println(name+" Thread Entered..");
		for(int i = 1; i<=5; i++) {
			System.out.println(name+" Thread Execution.................."+i);
		}
		System.out.println(name+" Thread Excuted");
	}
	public static void main(String[] args) {
		Class01 c = new Class01();
		Thread t1 = new Thread(c);
		Thread t2 = new Thread(c);
		
		t1.setName("First Thread");
		t2.setName("Second Thread");
		
		t1.start();
		t2.start();
	}

}
