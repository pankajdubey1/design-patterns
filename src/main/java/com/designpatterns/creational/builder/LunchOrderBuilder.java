package com.designpatterns.creational.builder;

public class LunchOrderBuilder {

	String bread;

	String butter;

	String vegitables;

	String coldDrinks;

	String desserts;

	public LunchOrderBuilder setBread(String bread) {
		this.bread = bread;
		return this;
	}

	public LunchOrderBuilder setButter(String butter) {
		this.butter = butter;
		return this;
	}

	public LunchOrderBuilder setVegitables(String vegitables) {
		this.vegitables = vegitables;
		return this;
	}

	public LunchOrderBuilder setColdDrinks(String coldDrinks) {
		this.coldDrinks = coldDrinks;
		return this;
	}

	public LunchOrderBuilder setDesserts(String desserts) {
		this.desserts = desserts;
		return this;
	}

	public LunchOrder build() {
		return new LunchOrder(this);
	}
}
