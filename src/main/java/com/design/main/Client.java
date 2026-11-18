package com.design.main;

import com.design.factory.PaymentFactory;
import com.design.impl.Payment;

public class Client {
    public static void main(String[] args) {

     Payment payment = PaymentFactory.getPayment("NETBANKING");

       payment.pay(500);
    }
}
