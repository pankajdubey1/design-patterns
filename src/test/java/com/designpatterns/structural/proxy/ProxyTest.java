package com.designpatterns.structural.proxy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProxyTest {

	private Internet internet;

	@BeforeEach
	public void setUp() {
		internet = new ProxyInternet();
	}

	@Test
	public void testProxyBannedSites() {
		String expected = "URL is blocked";
		String actual = internet.connect("banned_site1");
		assertEquals(expected, actual);
	}

	@Test
	public void testProxyInternet() {
		String expected = "Connected";
		String actual = internet.connect("valid_site");
		assertEquals(expected, actual);
	}

}
