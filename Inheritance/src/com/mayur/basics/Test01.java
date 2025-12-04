package com.mayur.basics;


class A{
	int num = 400;
	void meth01()	{
		System.out.println("I'm parent class method ");
	}
}


class B extends A{
	int num = 300;
	void show() {
		System.out.println(super.num);
		super.meth01();
	}
	
}
public class Test01  extends B {

	public static void main(String[] args) {
		B obj = new B();
		obj.show();

	}

}
