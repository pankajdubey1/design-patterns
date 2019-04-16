package com.designpatterns.creational.factory;

import java.util.InputMismatchException;

public class VehicleFactory {

	public Vehicle getVehicle(VehicleType type) {
		Vehicle vehicle;
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
