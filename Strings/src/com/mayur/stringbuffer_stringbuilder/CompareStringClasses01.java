package com.mayur.stringbuffer_stringbuilder;

public class CompareStringClasses01 {
	
	void display() {
		String s = new String ("Java");
		StringBuffer buffer = new StringBuffer("Java");
		StringBuilder builder = new StringBuilder("Java");
		
		// for adding strings concat and append method
		s.concat(" is awesome");
		buffer.append(" is awesome");
		builder.append(" is awesome");
		
	
		System.out.println("String Class : "+s); // Output Java only beacouse it immutable 
		System.out.println("StringBuffer Class : "+buffer); // Java is awesome beacouse it mutable 
		System.out.println("StringBuilder Class : "+builder); // Java is awesome beacouse it mutable 
	}
	public static void main(String[] args) {
		
		new CompareStringClasses01().display();

	}

}
