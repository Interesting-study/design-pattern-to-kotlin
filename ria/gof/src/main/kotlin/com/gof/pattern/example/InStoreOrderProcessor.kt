package com.gof.pattern.example

class InStoreOrderProcessor : OrderProcessor() {
    override fun order(): Order {
        println("매장 주문")
        return InStoreOrder()
    }
}
