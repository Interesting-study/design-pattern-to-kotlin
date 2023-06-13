package com.gof.pattern.example

fun main() {
    val online = OrderProcessorFactory.createOrderProcessor(OrderType.ONLINE)
    online.order()

    val offline = OrderProcessorFactory.createOrderProcessor(OrderType.OFFLINE)
    offline.order()

    val phone = OrderProcessorFactory.createOrderProcessor(OrderType.PHONE)
    phone.order()
}
