package com.designpatterns.structural.decorator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DecoratorTest {

	@Test
	public void testDecorator() {

		Pizza pizza = new FarmHouse();
		int costWithoutTopping = pizza.getCost();
		String descWithoutTopppings = pizza.getDescription();

		pizza = new PaneerTopping(pizza);
		int costWithTopping = pizza.getCost();
		String descWithTopppings = pizza.getDescription();

		assertEquals(200, costWithoutTopping);
		assertEquals("FarmHouse", descWithoutTopppings);

		assertEquals(260, costWithTopping);
		assertEquals("FarmHouse, Paneer Toppings", descWithTopppings);
	}

}
