package com.mayur.setter_getter;

public class Basic_Code02 {

	public String m1() {
		System.out.println("I'm method 01...");
		return "This is the return value of the method 01";
	}
	
	
	
	public static void main(String[] args) {
		
		Basic_Code02 obj = new Basic_Code02();
	    String result = obj.m1()	;
	    System.out.println(result);
	    System.out.println("This is out of the code :"+result);
	}

}
