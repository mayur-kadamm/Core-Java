package com.mayur.compile_time_polymorphism;

public class CopileTimePolymorphism {
	// Compile time polymorphism aslo called as method overloading 
	 void show() {
 		System.out.println("Same without parameter");
    }
	void show(int a) {
		System.out.println("Same name but int parameter");
	}
    void show(String s) {
    	System.out.println("Same name but String parameter");
	}
    void show(String s, int a) {
    	System.out.println("Same name but String and int parameter");
    }
    void show(int a,String s) {
    	System.out.println("Same name but String and int parameter");
    }
	public static void main(String[] args) {
		CopileTimePolymorphism c1= new CopileTimePolymorphism();
		c1.show();
		c1.show(5);
		c1.show("Mayur");
		c1.show("Mayur", 5);
		c1.show(4,"Mayur");

	}

}
