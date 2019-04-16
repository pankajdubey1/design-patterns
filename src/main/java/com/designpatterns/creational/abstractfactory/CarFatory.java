package com.designpatterns.creational.abstractfactory;

public class CarFatory implements VehicleFactory {

	@Override
	public Vehicle getVehicle() {
		return new Car();
	}
	
}
