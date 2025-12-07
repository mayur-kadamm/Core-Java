package com.mayur.multi_thread;

public class Class02A extends Thread {

	@Override
	public void run() {
		for(int i = 1; i<=5; i++) {
			System.out.println("Class B Run method created "+i);
		}
	}
	
}
