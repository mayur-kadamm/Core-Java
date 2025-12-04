package com.mayur.string;

public class BasicString_Code02 {

	void stringConvertor() {
		String s1 = "My Name Is ";
		System.out.println(s1);
		
		//String is immutable but by using concat() method we can add the string
		
		//1st adding String 
		System.out.println(s1.concat("Mayur"));
		
		//We can also add like this way 
		s1= s1.concat("Mayur");
		System.out.println(s1);
	}
	
	public static void main(String[] args) {
		
		BasicString_Code02 obj=	new BasicString_Code02();
		obj.stringConvertor();

	}

}
