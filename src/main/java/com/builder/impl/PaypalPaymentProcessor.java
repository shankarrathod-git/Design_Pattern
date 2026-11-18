package com.builder.impl;

import com.builder.paymentProcessor.PaymentProcessors;

public class PaypalPaymentProcessor implements PaymentProcessors {
    @Override
    public void processPayment(PaymentRequest request) {
        System.out.println("Paypal Payment Processes");
        System.out.println(request);
    }
}
