package com.designpatterns.structural.adapter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AdapterTest {

	private PaymentAdapter adapter;

	@BeforeEach
	public void setUp() {
		adapter = new PayPalAdapter();
	}

	@Test
	public void testAdapter() {
		String expected = "Success";
		String actual = adapter.pay(1000);
		assertEquals(expected, actual);
	}

}
