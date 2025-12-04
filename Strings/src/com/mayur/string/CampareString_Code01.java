package com.mayur.string;

public class CampareString_Code01 {
	void compareString() {
		String s1 = "Java";
		String s2 = "Java";
		
		String s3 = new String("Java");
		String s4 = new String("Java");
		
		/* In order to compare two String we having two options 
			1. "  == " Double Equals operator 
			 					It'll compare the address location of the string 
		
			2. " .equals() " dot equals method 
								It'll compare the content of the string 
		*/
		
		//This both object is in heap area having one String Constant Pool (SCP) There will be located 
		//It Doesn't allow  duplicates It'll automatically change the objects 
		System.out.println("Comparing s1 and s3 with same name Java ");
		System.out.println("By using == option :"+s1==s3);  //
		System.out.println("Comparing s3 and s4 with same name Java ");
		System.out.println("By using == option :"+s3==s4);
		
		System.out.println("=================================");
		System.out.println("Comparing s1 and s1 with same name Java ");
		System.out.println("By using .equals() method option :"+s1.equals(s2));
		System.out.println("Comparing s3 and s4 with same name Java ");
		System.out.println("By using .equals() method option :"+s3.equals(s4));
		
		
	}
	public static void main(String[] args) {
			new  CampareString_Code01().compareString();
	}

}
