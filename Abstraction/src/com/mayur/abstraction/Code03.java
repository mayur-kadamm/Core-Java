package com.mayur.abstraction;


abstract class Animal{
	abstract void eat();
}

class Monkey extends Animal{
	
	@Override
	void eat() {
		System.out.println("Monkey Eating Banana...");
	}
}


public class Code03 extends Monkey  {

	public static void main(String[] args) {
                                  Monkey   obj = new Code03();		
                                  obj.eat();
                                  //updated
	}

}
