package com.designpatterns.creational.abstractfactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AbstractVehicleFactoryTest {

	private AbstractVehicleFactory factory;

	@BeforeEach
	public void setUp() {
		factory = new AbstractVehicleFactory();
	}

	@Test
	void testGetVehicle() {
		String expected = "Bike";
		String actual = factory.getVehicle(VehicleType.BIKE).getInfo();
		assertEquals(expected, actual);
	}

}
