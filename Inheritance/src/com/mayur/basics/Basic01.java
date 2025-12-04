package com.mayur.basics;

public class Basic01 { //update
	
	private String name; // private field 
	//updatee
	
	
	 // Getter Method
	public String getName() {
		return name;
	}
	
	// Setter Method 
	public void setName(String name) {
		this.name= name;
	}
	
	public static void main(String[] args) {
		
		Basic01 obj = new Basic01();
		obj.setName("Mayur");
		System.out.println(obj.getName());
	}

}
