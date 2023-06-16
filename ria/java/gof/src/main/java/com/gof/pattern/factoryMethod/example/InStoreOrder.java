package com.gof.pattern.factoryMethod.example;

public class InStoreOrder extends Order {
    public InStoreOrder() {
        setOrderType("inStore");
        setItem("pen");
        setPrice("1500");
    }
}
