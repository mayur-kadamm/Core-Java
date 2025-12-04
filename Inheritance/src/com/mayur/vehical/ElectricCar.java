package com.mayur.vehical;

public class ElectricCar extends Car{

	@Override
	public void startEngine() {
		System.out.println("Electric Car Engine started....");
	}
	
	
	public void chargeBattery() {
		System.out.println("Car Batter charging............");
	}

}
