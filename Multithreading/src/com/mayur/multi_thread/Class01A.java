package com.mayur.multi_thread;

public class Class01A extends Thread{
@Override
public void run() {
	for(int i = 1; i<=5; i++) {
		System.out.println("run method created "+i);
	}
}
}
