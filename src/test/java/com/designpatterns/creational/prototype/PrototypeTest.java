package com.designpatterns.creational.prototype;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PrototypeTest {

	@Test
	public void testPrototype() {
		Bike expected = new Bike(81.0, "This is a Bike");
		Bike actual = (Bike) expected.clone();

		assertEquals(expected.getPrice(), actual.getPrice());
		assertEquals(expected.getDesc(), actual.getDesc());
	}

}
