package com.factorydesign;

public class CardPayment implements Payment{
    @Override
    public void pay(double pay) {
        System.out.println("Card Payment"+" "+pay);
    }

    @Override
    public String getType() {
        return "Card payment ";
    }
}
