package com.mayur.string;

public class StringMethods {

	void stringMethods() {
		String s1 = "Java";
		String s2 = "Mayur Learning";
		
		System.out.println(s2.concat("Java Language")); // Mayur Learning Java Language. Return Type String
		System.out.println(s1.length()); //  4 because java have 4 letters it also count space. Return Type int 
		System.out.println(s1.charAt(0)); // It'll Show first character on index.  Return type char
		//equals and startwith methods 
		System.out.println(s1.equals(s2)); // check the content. Return Type Boolean
		System.out.println(s1.equalsIgnoreCase(s2)); // It'll ignore the case like uper case or lower case 
		System.out.println(s1.startsWith("J")); // It'll check the starting letter. Return Type Boolean
		//convert upper case & lower case method
		System.out.println(s1.toLowerCase()); // convert into lower case 
		System.out.println(s2.toUpperCase()); // convert into upper case
		//substring methods 
		System.out.println(s2.substring(5)); // It'll return Learning becouase L is starts from index 5 position 
		System.out.println(s2.substring(2,5)); //It'll return yur 2 starting position 5 is ending position
		// Replace methods 
		String s3 = "Java";
		System.out.println(s3.replace('a', 'A')); // output JAvA
		System.out.println(s3); // Java only bcz String is immutable 
		//Strim method
		String s4 = " Mayur Kadam ";
		System.out.println(s4.length()); // 13 space will be counted 
		System.out.println(s4.trim().length()); // trim will trim the starting and ending space not in the middle 
		//IndexOf method 
		System.out.println(s3.indexOf('a')); // output 1  Java from s3 object 
		System.out.println(s3.indexOf(2)); // 
		
		
		
	}
	public static void main(String[] args) {
				 
				new StringMethods().stringMethods();
	}

}
