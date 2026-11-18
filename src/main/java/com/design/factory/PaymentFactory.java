package com.design.factory;

import com.design.impl.*;

public class PaymentFactory {

    public static Payment getPayment(String type){

        switch(type.toUpperCase()){

            case "UPI":
                return new UpiPayment();

            case "CREDIT":
                return new CreditCardPayment();

            case "PAYPAL":
                return new PaypalPayment();

            case "NETBANKING":
               return new NetBanking();

            default :
                throw new IllegalArgumentException("Invalid Payment Method.");

        }
    }
}
