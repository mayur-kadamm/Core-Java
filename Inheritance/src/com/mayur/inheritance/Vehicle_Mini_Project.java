package com.mayur.inheritance;

// It is parent class to help to start engine for child classes
  class Vehicle {
	public void startEngine() {}
	}
  
  
//extends vehicle for start the engine 
class Car extends Vehicle {
	@Override
	public void startEngine() {
		System.out.println("Car Car Engine started....");
	}
}


// extends vehicle for start the engine 
class Bike extends Vehicle{
	@Override
	public void startEngine() {
		System.out.println("Bike Engine started....");
	}
}


//Electric car for extending car and car extends vehicle class the method for start engine
class ElectricCar extends Car{
	@Override
	public void startEngine() {
		System.out.println("Electric Car Engine started....");
	}
		
	public void chargeBattery() {
		System.out.println("Car Batter charging............");
	}
}



// To execute the code here
class Vehicle_Mini_Project extends Vehicle{
	public static void main(String[] args) {
		
		Vehicle obj = new ElectricCar();
		obj.startEngine();	
	}
}

