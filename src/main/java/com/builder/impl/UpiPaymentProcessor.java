package com.builder.impl;

import com.builder.paymentProcessor.PaymentProcessors;

public class UpiPaymentProcessor implements PaymentProcessors {
    @Override
    public void processPayment(PaymentRequest request) {
        System.out.println("Processing Upi Payment");
        System.out.println(request);
    }
}
