package com.cognizant.adapter;

public class RazorpayAdapter implements PaymentProcessor {

    private RazorpayGateway razorpay = new RazorpayGateway();

    @Override
    public void processPayment(double amount) {
        razorpay.pay(amount);
    }

}