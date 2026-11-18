package com.design.impl;

public class NetBanking implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("PAID "+ amount + " through NetBanking.");


    }
}
