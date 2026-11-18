package com.builder.factory;

import com.builder.impl.CreditCardPaymentProcessor;
import com.builder.impl.PaypalPaymentProcessor;
import com.builder.impl.UpiPaymentProcessor;
import com.builder.paymentProcessor.PaymentProcessors;

public class PaymentFactory {

    public static PaymentProcessors getProcessor(String type){

        switch(type.toUpperCase()){

            case "UPI":
                return new UpiPaymentProcessor();

            case "CARD":
                return new CreditCardPaymentProcessor();

            case "PAYPAL":
                return new PaypalPaymentProcessor();

            default:
                throw new IllegalArgumentException("Invalid Payment type.");

        }
    }
}
