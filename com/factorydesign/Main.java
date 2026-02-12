package com.factorydesign;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Payment upi= new UpiPayment();
        Payment card = new CardPayment();
        PaymentFactory factory = new PaymentFactory(Arrays.asList(upi,card));
        Payment cardpayment = factory.getPayment("Card payment ");
        cardpayment.pay(5000.00);
        Payment upipayment = factory.getPayment("Upi");
        upipayment.pay(70000.00);

    }
}
