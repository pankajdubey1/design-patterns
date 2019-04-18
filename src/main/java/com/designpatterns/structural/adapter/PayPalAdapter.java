package com.designpatterns.structural.adapter;

public class PayPalAdapter implements PaymentAdapter {

	private PayPal payPal;

	public PayPalAdapter() {
		payPal = new PayPal();
	}

	@Override
	public String pay(int amount) {
		return payPal.sendPayment(amount);
	}
}
