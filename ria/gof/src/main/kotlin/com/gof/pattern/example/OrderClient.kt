package com.gof.pattern.example

fun main() {
    val online = OrderProcessorFactory.createOrderProcessor("online")
    online.order()

    val inStore = OrderProcessorFactory.createOrderProcessor("inStore")
    inStore.order()

    val phone = OrderProcessorFactory.createOrderProcessor("phone")
    phone.order()

    val refund = OrderProcessorFactory.createOrderProcessor("refund")
    refund.order()
}