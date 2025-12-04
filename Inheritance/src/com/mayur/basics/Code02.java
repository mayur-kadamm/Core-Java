package com.mayur.basics;

public class Code02 {
   
	public String m1() {
		System.out.println("I'm method 01...");
		return "This is the return value of the method 01";
	}
	
	
	
	public static void main(String[] args) {
		
		Code02 obj = new Code02();
	    String result = obj.m1()	;
	    System.out.println(result);
	    System.out.println("This is out of the code :"+result);
	}

}
