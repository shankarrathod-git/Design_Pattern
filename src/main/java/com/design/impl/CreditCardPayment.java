package com.design.impl;

public class CreditCardPayment implements Payment{

    @Override
    public void pay(double amount) {
        System.out.println("PAID " + amount + " through Credit card");
    }
}
