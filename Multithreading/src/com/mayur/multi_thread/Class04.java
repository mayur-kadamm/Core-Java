package com.mayur.multi_thread;

public class Class04 extends Thread  {
	@Override
	public void run() {
		System.out.println("I'm going to interview..");
		for(int i = 1; i<= 5; i++ ) {
			System.out.println("This is my "+i+" Interview");
		}
		
		System.out.println("I got placed, Now i can relax...");
		
		try {
			Thread.sleep(3000);
		}catch(Exception e) {
			System.err.println("Someone Interuped This Thread ");
		}
		
		System.out.println("Time to go to office...");
	}
	public static void main(String[] args) {
		Class04 c = new Class04();
		Thread t = new Thread(c);
		
		t.start();
		
	}

}
