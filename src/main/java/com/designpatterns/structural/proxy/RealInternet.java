package com.designpatterns.structural.proxy;

public class RealInternet implements Internet {

	@Override
	public String connect(final String url) {
		return "Connected";
	}

}
