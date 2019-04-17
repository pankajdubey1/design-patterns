package com.designpatterns.structural.decorator;

public class PaneerTopping extends ToppingsDecorator {

	private Pizza pizza;

	public PaneerTopping(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDescription() {
		return pizza.getDescription() + ", Paneer Toppings";
	}

	@Override
	public int getCost() {
		return 60 + pizza.getCost();
	}

}
