package com.builder.impl;

import com.builder.paymentProcessor.PaymentProcessors;

public class CreditCardPaymentProcessor implements PaymentProcessors {
    @Override
    public void processPayment(PaymentRequest request) {
        System.out.println("Creditcard Payment Process");
        System.out.println(request);
    }
}
