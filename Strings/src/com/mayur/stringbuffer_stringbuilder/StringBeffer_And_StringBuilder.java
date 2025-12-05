package com.mayur.stringbuffer_stringbuilder;

public class StringBeffer_And_StringBuilder {


	void show() {
		StringBuffer buffer  = new StringBuffer();
		StringBuilder builder = new StringBuilder();
	
		
		//both have same default capacity 
		System.out.println(buffer.capacity()); //16
		System.out.println(builder.capacity()); //16
		// String does't have capacity method
		
		// reverse method
		buffer.append("Mayur Kadam");
		System.out.println(buffer.reverse()); // madaK ruyaM
		System.out.println(buffer); // madaK ruyaM it shows updated output becouase it mutable 
		
		//CharAt method
		builder.append("Java is programming language ");
		System.out.println(builder.charAt(5)); // i
		
	}
	public static void main(String[] args) {
		
		new StringBeffer_And_StringBuilder().show();

	}

}
