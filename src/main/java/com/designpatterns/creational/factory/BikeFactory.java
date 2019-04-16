package com.designpatterns.creational.factory;

import java.util.InputMismatchException;

public class BikeFactory {

	private Vehicle vehicle;

	public Vehicle getVehicle(VehicleType type) {
		switch (type) {
		case BIKE:
			vehicle = new Bike();
			break;
		case CAR:
			vehicle = new Car();
			break;
		default:
			throw new InputMismatchException("Vehicle type is not specified");
		}
		return vehicle;
	}
}
