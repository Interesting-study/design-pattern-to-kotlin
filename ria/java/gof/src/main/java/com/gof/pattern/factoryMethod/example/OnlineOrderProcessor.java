package com.gof.pattern.factoryMethod.example;

public class OnlineOrderProcessor extends OrderProcessor {
    @Override
    public OnlineOrder order() {
        System.out.println("온라인 주문");
        return new OnlineOrder();
    }
}
