package com.mayur.basics;

public class Code01 {
	int a = 10;
	void meth01() {
		Code01 m1 = new Code01();
		System.out.println("This is method 01 :"+a+10);
	    m1.meth02();
	}
	
	void meth02() {
		Code01 m2 = new Code01();
		System.out.println("This is method 02 :"+a+20);
	    m2.meth03();
	}
	
	void meth03() {
		Code01 m3 = new Code01();
		System.out.println("This is method 03 :"+30+a);
	    m3.meth04();
	}
	
	void meth04() {
		System.out.println("This is method 04 :"+a+40);
	}
	public static void main(String[] args) {
		System.out.println("Main method start.....");
		System.out.println("This is main method :"+10);
		Code01 obj = new Code01();
		obj.meth01();
		
		System.out.println("For git ");
		System.out.println("main method end.........");
		
	}

}
