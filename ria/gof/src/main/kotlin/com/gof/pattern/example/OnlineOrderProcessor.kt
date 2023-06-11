package com.gof.pattern.example

class OnlineOrderProcessor : OrderProcessor() {
    override fun order(): Order {
        println("온라인 주문")
        return OnlineOrder()
    }
}
