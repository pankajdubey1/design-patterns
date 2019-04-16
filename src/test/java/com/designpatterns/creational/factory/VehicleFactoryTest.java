package com.designpatterns.creational.factory;

import static org.junit.jupiter.api.Assertions.*;

import java.util.InputMismatchException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VehicleFactoryTest {

	private VehicleFactory vehicleFactory;

	@BeforeEach
	public void setUp() {
		vehicleFactory = new VehicleFactory();
	}

	@Test
	public void testGetVehicle() {
		String expected = "Bike";
		String actual = vehicleFactory.getVehicle(VehicleType.BIKE).getInfo();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetVehicleExceptionCase() {
		assertThrows(InputMismatchException.class, () -> vehicleFactory.getVehicle(VehicleType.DEFAULT));
	}
}
