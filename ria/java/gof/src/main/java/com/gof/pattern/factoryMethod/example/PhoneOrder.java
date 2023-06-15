package com.gof.pattern.factoryMethod.example;

public class PhoneOrder extends Order{
    public PhoneOrder() {
        setOrderType("phone");
        setItem("travel");
        setPrice("400000");
    }
}
