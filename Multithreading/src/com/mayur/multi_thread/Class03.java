package com.mayur.multi_thread;

public class Class03 {

	public static void main(String[] args) throws InterruptedException{
			System.out.println("M");
			Thread.sleep(3000);         // The Thread is waiting for 3000 ms means - 3 seconds 
			System.out.println("A");
			Thread.sleep(3000);
			System.out.println("Y");
			Thread.sleep(3000);
			System.out.println("U");
			Thread.sleep(3000);
			System.out.println("R");
	}
}
