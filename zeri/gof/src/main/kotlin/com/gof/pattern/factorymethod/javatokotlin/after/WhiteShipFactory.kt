package com.gof.pattern.factorymethod.javatokotlin.after

class WhiteShipFactory : DefaultShipFactory() {
    override fun createShip(): Ship = WhiteShip()
}
