package com.gof.pattern.factory

interface ShipFactory {
    fun orderShip(name: String, email: String): Ship {
        validate(name, email)
        prepareFor(name)
        val ship = createShip()
        sendEmailTo(email, ship)
        return ship
    }

    fun createShip(): Ship

    fun validate(name: String, email: String) {
        if (name.isNullOrBlank()) {
            throw java.lang.IllegalStateException("배 이름을 지어주세요.")
        }
        if (email.isNullOrBlank()) {
            throw java.lang.IllegalStateException("연락처를 남겨주세요.")
        }
    }

    fun prepareFor(name: String) {
        println("$name 만들 준비 중")
    }

    fun sendEmailTo(email: String, ship: Ship)
}
