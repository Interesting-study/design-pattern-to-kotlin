package com.gof.pattern.example

class OfflineOrderProcessor : OrderProcessor() {
    override fun order(): Order {
        println("매장 주문")
        return OfflineOrder()
    }
}
