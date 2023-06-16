package com.gof.pattern.example

class PhoneOrder : Order() {
    init {
        orderType = OrderType.PHONE
        item = "travel"
        price = "400000"
    }
}
