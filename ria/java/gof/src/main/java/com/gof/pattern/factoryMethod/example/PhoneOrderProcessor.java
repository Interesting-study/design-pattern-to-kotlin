package com.gof.pattern.factoryMethod.example;

public class PhoneOrderProcessor extends OrderProcessor {
    @Override
    public PhoneOrder order() {
        System.out.println("전화 주문");
        return new PhoneOrder();
    }
}
