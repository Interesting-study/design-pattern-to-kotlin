package com.gof.pattern.factorymethod.javatokotlin.after

interface ShipFactory {
    fun orderShip(name: String, email: String): Ship {
        validate(name, email)
        prepareFor(name)
        val ship = createShip()
        sendEmailTo(email, ship)
        return ship
    }

    fun sendEmailTo(name: String, ship: Ship)

    fun createShip(): Ship

    private fun validate(name: String, email: String) {
        if (name.isBlank()) throw IllegalArgumentException("배 이름을 지어주세요")
        if (email.isBlank()) throw IllegalArgumentException("연락처를 남겨주세요")
    }

    private fun prepareFor(name: String) {
        println("$name 만들 준비 중")
    }
}
