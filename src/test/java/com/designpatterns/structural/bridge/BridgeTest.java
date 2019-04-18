package com.designpatterns.structural.bridge;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BridgeTest {

	private Color redColor;
	private Color greenColor;

	@BeforeEach
	public void setUp() {
		redColor = new RedColor();
		greenColor = new GreenColor();
	}

	@Test
	public void testBridgeRed() {
		Shape shape = new Triangle(redColor);
		String expected = "RED Triangle";
		String actual = shape.applyColor();
		assertEquals(expected, actual);
	}

	@Test
	public void testBridgeGreen() {
		Shape shape = new Triangle(greenColor);
		String expected = "GREEN Triangle";
		String actual = shape.applyColor();
		assertEquals(expected, actual);
	}

}
