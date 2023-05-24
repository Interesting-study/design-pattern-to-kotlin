package com.gof.pattern.factorymethod.javatokotlin.after

class BlackShipFactory : DefaultShipFactory() {
    override fun createShip(): Ship = BlackShip()
}
