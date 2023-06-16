package com.gof.pattern.factory

class BlackShipFactory : DefaultShipFactory() {
    override fun createShip(): Ship = BlackShip()
}
