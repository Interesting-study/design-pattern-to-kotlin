package com.gof.pattern.factoryMethod.example;

public class OnlineOrder extends Order {

    public OnlineOrder() {
        setOrderType("online");
        setItem("mac");
        setPrice("1000000");
    }
}
