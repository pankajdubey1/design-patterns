package com.designpatterns.creational.prototype;

public class Bike implements Vehicle {

	private double price;

	private String desc;

	public Bike(double price, String desc) {
		this.price = price;
		this.desc = desc;
	}

	@Override
	public Vehicle clone() {
		return new Bike(price, desc);
	}

	public double getPrice() {
		return price;
	}

	public String getDesc() {
		return desc;
	}

}
