package com.designpatterns.creational.factory;

public class Car implements Vehicle {

	private VehicleType type;

	public VehicleType getType() {
		return type;
	}

	public void setType(VehicleType type) {
		this.type = type;
	}

	@Override
	public String getInfo() {
		return "Car";
	}
}
