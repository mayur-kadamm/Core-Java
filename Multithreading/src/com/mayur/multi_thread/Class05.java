package com.mayur.multi_thread;
public class Class05 extends Thread  {
	@Override
	public void run() {
		System.out.println("I'm gonna eat samosa's");
		for(int i = 1; i<= 5; i++ ) {
			System.out.println("I eat "+i+" Samosa");
		}
		
		System.out.println("I'm full now...");
		
		try {
			Thread.sleep(3000); // sleep 3 seconds not sure 
		}catch(Exception e) {
			System.err.println("Someone Interuped This Thread "); // when someone interrupted
		}
		
		System.out.println("I'm hungry i need to eat now ");
	}
	public static void main(String[] args) {
		Class05 c = new Class05();
		Thread t = new Thread(c);
		
		t.start();
		t.interrupt(); // It'll interrupt the t thread 
		
	}

}