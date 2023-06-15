package com.gof.pattern.factoryMethod.example;

public class InStoreOrderProcessor extends OrderProcessor {
    @Override
    public InStoreOrder order() {
        System.out.println("매장 주문");
        return new InStoreOrder();
    }
}
