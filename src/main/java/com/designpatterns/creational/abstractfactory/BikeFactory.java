package com.designpatterns.creational.abstractfactory;

public class BikeFactory implements VehicleFactory {

	@Override
	public Vehicle getVehicle() {
		return new Bike();
	}

}
