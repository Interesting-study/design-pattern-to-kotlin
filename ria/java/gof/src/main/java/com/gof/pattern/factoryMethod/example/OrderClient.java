package com.gof.pattern.factoryMethod.example;

public class OrderClient {
    public static void main(String[] args) {
        OrderProcessor online = OrderProcessorFactory.createOrderProcessor("online");
        online.order();

        OrderProcessor inStore = OrderProcessorFactory.createOrderProcessor("inStore");
        inStore.order();

        OrderProcessor phone = OrderProcessorFactory.createOrderProcessor("phone");
        phone.order();

        OrderProcessor refund = OrderProcessorFactory.createOrderProcessor("refund");
        refund.order();
    }
}
