package com.designpatterns.structural.facade;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FacadeTest {

	private HotelFacade facade;

	@BeforeEach
	public void setUp() {
		facade = new HotelFacade();
	}

	@Test
	public void testFacade() {
		assertEquals("Eating Veg", facade.findRestaurant(Type.VEG));
		assertEquals("Eating NonVeg", facade.findRestaurant(Type.NONVEG));
		assertEquals("Eating Veg and NonVeg both", facade.findRestaurant(Type.BOTH));
	}

}
