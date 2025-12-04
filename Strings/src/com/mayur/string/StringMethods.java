package com.mayur.string;

public class StringMethods {

	void stringMethods() {
		String s1 = "Java";
		String s2 = "Mayur Learning";
		
		System.out.println(s2.concat("Java Language")); // Mayur Learning Java Language. Return Type String
		System.out.println(s1.length()); //  4 because java have 4 letters it also count space. Return Type int 
		System.out.println(s1.charAt(0)); // It'll Show first character on index.  Return type char
		System.out.println(s1.indexOf(1));
		System.out.println(s1.equals(s2)); // check the content. Return Type Boolean
		System.out.println(s1.equalsIgnoreCase(s2)); // It'll ignore the case like uper case or lower case 
		System.out.println(s1.startsWith("J")); // It'll check the starting letter. Return Type Boolean
		System.out.println(s1.toLowerCase()); // convert into lower case 
		System.out.println(s2.toUpperCase()); // convert into upper case
		
	}
	public static void main(String[] args) {
				 
				new StringMethods().stringMethods();
	}

}
