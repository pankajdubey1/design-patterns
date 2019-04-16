package com.designpatterns.creational.abstractfactory;

public class Bike implements Vehicle {

	private VehicleType type;

	public VehicleType getType() {
		return type;
	}

	public void setType(VehicleType type) {
		this.type = type;
	}

	@Override
	public String getInfo() {
		return "Bike";
	}
}
