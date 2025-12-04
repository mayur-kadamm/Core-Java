package com.mayur.string;

public class CompareString_Code02 {

	
	void toCompareString() {
		String s1 = "Mayur";
		String s2 = new String("Mayur");

		String s3 = "Mayur";
		String s4 = new String("Mayur");
		
		System.out.println(s1==s2);	 //False because addresses is different 
		System.out.println(s1.equals(s2)); //True because content is same
		
		System.out.println(s1 == s3); // true because they're in SCP so if they have same content then same address allocated 
		System.out.println(s2 == s4); // False because they're in heap memory so they allocate different address 
			
		}
		
	
	public static void main(String[] args) {
						CompareString_Code02	obj	= new CompareString_Code02();
						obj.toCompareString();
	}

}
