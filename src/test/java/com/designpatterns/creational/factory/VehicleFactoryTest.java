package com.designpatterns.creational.factory;

import static org.junit.jupiter.api.Assertions.*;

import java.util.InputMismatchException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VehicleFactoryTest {

	private BikeFactory bikeFactory;

	@BeforeEach
	public void setUp() {
		bikeFactory = new BikeFactory();
	}

	@Test
	public void testGetVehicle() {
		String expected = "Bike";
		String actual = bikeFactory.getVehicle(VehicleType.BIKE).getInfo();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetVehicleExceptionCase() {
		assertThrows(InputMismatchException.class, () -> bikeFactory.getVehicle(VehicleType.DEFAULT));
	}
}
