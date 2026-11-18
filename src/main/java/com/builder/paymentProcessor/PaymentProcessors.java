package com.builder.paymentProcessor;

import com.builder.impl.PaymentRequest;

public interface PaymentProcessors {
    void processPayment(PaymentRequest request);
}
