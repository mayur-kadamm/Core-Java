package com.mayur.multi_thread;

public class Class01B extends Thread{

	public static void main(String[] args) {
		Class01A obj = new Class01A();
		obj.start();
	}
}
