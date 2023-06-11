package com.gof.pattern.example

class OnlineOrder : Order() {
    init {
        orderType = "online"
        item = "맥북"
        price = "1000000"
    }
}
