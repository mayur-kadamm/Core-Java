package com.mayur.setter_getter;
class Employee {
	private int empId;
	
	public int getId() {
		return empId; 
	}
	
	public void setId(int empId) {
		this.empId = empId; 
	}
}
public class SetterGetter_Code02 {
	public static void main(String[] args) {
		Employee obj = new Employee();
		obj.setId(1231);
		System.out.println(obj.getId());

	}
}
