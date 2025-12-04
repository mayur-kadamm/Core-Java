package com.mayur.abstraction;



abstract class A{
	abstract void meth01();
}

class B extends A{
	@Override
	void meth01() {
		System.out.println("This is the way that i can execute the abstract class method");
	}
	
}
public class Code02 extends B {

	public static void main(String[] args) {
		
					B	obj = new	 Code02();
					obj.meth01();
	}

}
