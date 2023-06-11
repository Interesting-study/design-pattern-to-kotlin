package com.gof.pattern.factoryMethod.example;

public class OnlineOrder extends Order {

    public OnlineOrder() {
        setOrderType("online");
        setItem("맥북");
        setPrice("1000000");
    }
}
