package com.gof.pattern.example

class PhoneOrder : Order() {
    init {
        orderType = "phone"
        item = "travel"
        price = "400000"
    }
}