package com.mayur.setter_getter;

public class Basic_Code01 {
	int a = 10;
	void meth01() {
		Basic_Code01 m1 = new Basic_Code01();
		System.out.println("This is method 01 :"+a+10);
	    m1.meth02();
	}
	
	void meth02() {
		Basic_Code01 m2 = new Basic_Code01();
		System.out.println("This is method 02 :"+a+20);
	    m2.meth03();
	}
	
	void meth03() {
		Basic_Code01 m3 = new Basic_Code01();
		System.out.println("This is method 03 :"+30+a);
	    m3.meth04();
	}
	
	void meth04() {
		System.out.println("This is method 04 :"+a+40);
	}
	public static void main(String[] args) {
		System.out.println("Main method start.....");
		System.out.println("This is main method :"+10);
		Basic_Code01 obj = new Basic_Code01();
		obj.meth01();
		
		System.out.println("For git ");
		System.out.println("main method end.........");
		
	}
}
