package com.designpatterns.creational.builder;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LunchOrderBuilderTest {

	@Test
	void testLunchOrderBuilder() {
		LunchOrder actual = new LunchOrderBuilder().setBread("bread").setButter("butter").setVegitables("vegitables")
				.build();
		assertEquals("bread", actual.getBread());
		assertEquals("butter", actual.getButter());
		assertNull(actual.getColdDrinks());
	}
}
