package com.gof.pattern.example

class OfflineOrder : Order() {
    init {
        orderType = OrderType.OFFLINE
        item = "pen"
        price = "1500"
    }
}
