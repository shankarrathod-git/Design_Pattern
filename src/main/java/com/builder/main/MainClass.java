package com.builder.main;

import com.builder.factory.PaymentFactory;
import com.builder.impl.PaymentRequest;
import com.builder.paymentProcessor.PaymentProcessors;

public class MainClass {
    public static void main(String[] args) {
        
            PaymentRequest request = PaymentRequest.builder()
                    .transactionId("TXN123")
                    .paymentMethod("UPI")
                    .amount(5000.00)
                    .currency("INR")
                    .merchantId("M123")
                    .saveCard(true)
                    .build();

            System.out.println(request);

    }
}
