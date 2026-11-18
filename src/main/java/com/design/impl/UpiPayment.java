package com.design.impl;

public class UpiPayment implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("PAID " + amount + " through UPI.");
    }
}
