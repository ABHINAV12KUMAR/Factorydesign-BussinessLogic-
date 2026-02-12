package com.factorydesign;

public class UpiPayment implements Payment{
    @Override
    public void pay(double pay) {
        System.out.println("Upi Payment"+" "+pay);
    }

    @Override
    public String getType() {
        return "Upi";
    }
}
