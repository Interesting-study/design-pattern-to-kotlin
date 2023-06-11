package com.gof.pattern.example

class OrderProcessorFactory {
    companion object {
        fun createOrderProcessor(orderType: String): OrderProcessor {
            when (orderType) {
                "online" -> {
                    return OnlineOrderProcessor()
                }
                "inStore" -> {
                    return InStoreOrderProcessor()
                }
                "phone" -> {
                    return PhoneOrderProcessor()
                }
                else -> {
                    throw java.lang.IllegalStateException("존재하지 않는 주문 타입입니다. $orderType")
                }
            }
        }
    }
}