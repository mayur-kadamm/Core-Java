package com.mayur.string;

public class BasicString_Code01 {

	// Most common ways of creating a string 
	void meth() {
	
	String s1 =  "Java";
	
	String s2 = new String("Java");
	
	char arr[] = {'J','a','v','a'};
	String s3 = new String(arr);
	
	String s4 = new String(arr,1,2);
	
	
	System.out.println("S1 :"+s1);
	System.out.println("S2 :"+s2);
	System.out.println("S3 :"+s3);
	System.out.println("S4 :"+s4);
	}
	public static void main(String[] args) {
		
		 	BasicString_Code01	obj =	new BasicString_Code01();
		 	obj.meth();
	}
	
}
