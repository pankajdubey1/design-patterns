package com.designpatterns.creational.prototype;

public class Car implements Vehicle {

	private double price;

	private String desc;

	public Car(double price, String desc) {
		this.price = price;
		this.desc = desc;
	}

	@Override
	public Vehicle clone() {
		return new Car(price, desc);
	}

	public double getPrice() {
		return price;
	}

	public String getDesc() {
		return desc;
	}

}
