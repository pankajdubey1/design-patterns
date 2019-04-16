package com.designpatterns.creational.singlton;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.designpatterns.creational.singlton.EnumSinglton;

class EnumSingltonTest {

	@Test
	void testEnumMethod() {
		String expected = "EnumSinglton";
		String actual = EnumSinglton.INSTANCE.method();
		assertEquals(expected, actual);
	}
}
