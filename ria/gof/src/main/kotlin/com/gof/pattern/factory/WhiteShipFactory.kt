package com.gof.pattern.factory

class WhiteShipFactory : DefaultShipFactory() {
    override fun createShip(): Ship = WhiteShip()
}
