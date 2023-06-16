package com.gof.pattern.example

class OnlineOrder : Order() {
    init {
        orderType = OrderType.ONLINE
        item = "mac"
        price = "1000000"
    }
}
