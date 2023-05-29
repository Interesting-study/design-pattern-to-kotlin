package com.gof.pattern.factory

class Client {
    fun print(shipFactory: ShipFactory, name: String, email: String) {
        println(shipFactory.orderShip(name, email))
    }
}

fun main() {
    val client = Client()
    client.print(WhiteShipFactory(), "whiteship", "ria@email.com")
    client.print(BlackShipFactory(), "blackship", "ria@eamil.com")
}