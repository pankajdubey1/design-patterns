package com.designpatterns.structural.decorator;

public class FreshTomatoTopping extends ToppingsDecorator {

	private Pizza pizza;

	public FreshTomatoTopping(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDescription() {
		return pizza.getDescription() + ", FreshTomato Toppings";
	}

	@Override
	public int getCost() {
		return 40 + pizza.getCost();
	}

}
