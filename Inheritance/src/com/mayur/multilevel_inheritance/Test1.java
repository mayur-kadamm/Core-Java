package com.mayur.multilevel_inheritance;

class A { void a() { 
	System.out.println("A");
	}
}
class B extends A {
	void b() { 
		System.out.println("B");
		}
	}
class C extends B {
	void c() {
		System.out.println("C"); 
		} 
	}

public class Test1{ 
	public static void main(String[] args) 
	{ new C().a();
	} 
}

