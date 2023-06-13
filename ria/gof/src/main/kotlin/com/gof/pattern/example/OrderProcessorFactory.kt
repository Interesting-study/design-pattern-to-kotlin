package com.gof.pattern.example

class OrderProcessorFactory {
    companion object {
        fun createOrderProcessor(orderType: OrderType): OrderProcessor {
            return when (orderType) {
                OrderType.ONLINE ->
                    OnlineOrderProcessor()
                OrderType.OFFLINE ->
                    OfflineOrderProcessor()
                OrderType.PHONE ->
                    PhoneOrderProcessor()
                else ->
                    throw java.lang.IllegalArgumentException("존재하지 않는 주문 타입입니다. $orderType")
            }
        }
    }
}
