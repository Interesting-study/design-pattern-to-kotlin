package com.gof.pattern.example

class InStoreOrder : Order() {
    init {
        orderType = "inStore"
        item = "pen"
        price = "1500"
    }
}
