package com.designpatterns.creational.singlton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LazySingltonTest {

	@Test
	public void testGetInstance() {
		LazySinglton expected = LazySinglton.getInstance();
		LazySinglton actual = LazySinglton.getInstance();
		assertSame(expected, actual);
	}

	@Test
	public void testGetInstanceCloning() {
		LazySinglton instance = LazySinglton.getInstance();
		assertThrows(CloneNotSupportedException.class, instance::clone);
	}
}
