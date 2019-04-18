package com.designpatterns.structural.adapter;

public class PayPal {

	public String sendPayment(int amount) {
		System.out.println("paid amount: " + amount);
		return "Success";
	}
}
