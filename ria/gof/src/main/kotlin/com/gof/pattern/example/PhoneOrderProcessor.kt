package com.gof.pattern.example

class PhoneOrderProcessor : OrderProcessor() {
    override fun order(): Order {
        println("전화 주문")
        return PhoneOrder()
    }
}