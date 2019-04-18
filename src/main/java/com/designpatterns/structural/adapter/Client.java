package com.designpatterns.structural.adapter;

public class Client {

	public static void main(String[] args) {
		PaymentAdapter paymentAdapter = new PayPalAdapter();
		paymentAdapter.pay(1000);

		// Notice that Client is not aware of the actual method of third party API
		// PayPal class. Later, lets assume
		// if PayPal changes the method name from sendPayment(int amount) to
		// payAmount(int amount), then in that case,
		// Clients will not be affected by this change and we have to make the
		// adjustment in the adapter only.
	}
}
