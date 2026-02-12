package com.factorydesign;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PaymentFactory {
    private  static final Map<String , Payment> paymentMap = new HashMap<>();

    public PaymentFactory(List<Payment> payments){
        for(Payment payment:payments){
            paymentMap.put(payment.getType(),payment);
        }

    }
    public static Payment getPayment(String type){
        Payment payment =paymentMap.get(type);
        if(payment==null){
            throw new IllegalArgumentException("Invalid Payment type");
        }
        return payment;
    }
}
