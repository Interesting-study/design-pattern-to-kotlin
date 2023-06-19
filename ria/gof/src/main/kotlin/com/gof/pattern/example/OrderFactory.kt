package com.gof.pattern.example

import java.lang.IllegalArgumentException

class OrderFactory {
    companion object {
        fun createOrder(orderType: OrderType): Order {
            return when (orderType) {
                OrderType.ONLINE ->
                    OnlineOrder()
                OrderType.OFFLINE ->
                    OfflineOrder()
                OrderType.PHONE ->
                    PhoneOrder()
                else ->
                    throw IllegalArgumentException("존재하지 않는 주문 타입입니다. $orderType")
            }
        }
    }
}
