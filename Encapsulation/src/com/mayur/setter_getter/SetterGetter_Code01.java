package com.mayur.setter_getter;
public class SetterGetter_Code01 {
		
		private String name; // private field
		
		
		 // Getter Method
		public String getName() {
			return name;
		}
		
		// Setter Method 
		public void setName(String name) {
			this.name= name;
		}
		
		public static void main(String[] args) {
			
			SetterGetter_Code01 obj = new SetterGetter_Code01();
			obj.setName("Mayur");
			System.out.println(obj.getName());
		}

	}

