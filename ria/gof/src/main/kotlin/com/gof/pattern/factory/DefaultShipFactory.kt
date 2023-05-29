package com.gof.pattern.factory

abstract class DefaultShipFactory : ShipFactory {

    override fun sendEmailTo(email: String, ship: Ship) {
        println(ship.name + " 다 만들었습니다.")
    }
}