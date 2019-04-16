package com.designpatterns.creational.abstractfactory;

import java.util.InputMismatchException;

public class AbstractVehicleFactory {

	public Vehicle getVehicle(VehicleType type) {
		Vehicle vehicle;
		switch (type) {
		case BIKE:
			vehicle = new BikeFactory().getVehicle();
			break;
		case CAR:
			vehicle = new CarFatory().getVehicle();
			break;
		default:
			throw new InputMismatchException("Vehicle type is not specified");
		}
		return vehicle;
	}
}
