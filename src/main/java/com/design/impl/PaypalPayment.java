package com.design.impl;

public class PaypalPayment implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("PAID " + amount + " through Paypal.");
    }
}
