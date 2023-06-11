package com.gof.pattern.factoryMethod.example;

public class OrderProcessorFactory {
    public static OrderProcessor createOrderProcessor(String orderType) {
        switch (orderType) {
            case "online":
                return new OnlineOrderProcessor();
            case "inStore":
                return new InStoreOrderProcessor();
            case "phone":
                return new PhoneOrderProcessor();
            default:
                throw new IllegalStateException("존재하지 않는 주문 타입니다. " + orderType);
        }
    }
}
