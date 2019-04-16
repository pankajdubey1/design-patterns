package com.designpatterns.creational.builder;

public class LunchOrder {

	private String bread;

	private String butter;

	private String vegitables;

	private String coldDrinks;

	private String desserts;

	public LunchOrder(LunchOrderBuilder builder) {
		this.bread = builder.bread;
		this.butter = builder.butter;
		this.vegitables = builder.vegitables;
		this.coldDrinks = builder.coldDrinks;
		this.desserts = builder.desserts;
	}

	public String getBread() {
		return bread;
	}

	public String getButter() {
		return butter;
	}

	public String getVegitables() {
		return vegitables;
	}

	public String getColdDrinks() {
		return coldDrinks;
	}

	public String getDesserts() {
		return desserts;
	}
}
