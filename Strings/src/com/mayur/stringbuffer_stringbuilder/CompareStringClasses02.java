package com.mayur.stringbuffer_stringbuilder;

public class CompareStringClasses02 {

	void display() {
		
		String s1  = new String ("Mayur");
		StringBuffer buffer1 = new StringBuffer("Mayur");
		StringBuilder builder1 = new StringBuilder("Mayur");
		
		//for comaprision perpose 
		String s2 = new String ("Mayur");
		StringBuffer buffer2 = new StringBuffer("Mayur");
		StringBuilder builder2 = new StringBuilder("Mayur");
		
		
			// .equals method checks only content 
			System.out.println(s1.equals(s2)); // true bcz in String class  .equals method checks content only  
			System.out.println(buffer1.equals(buffer2)); //false bcz in StringBuffer class .equals method checks address only 
			System.out.println(builder1.equals(builder2));//false bcz in StringBuilder class .equals method checks address only 
			
			}
	public static void main(String[] args) {
		
		new CompareStringClasses02().display();

	}

}
