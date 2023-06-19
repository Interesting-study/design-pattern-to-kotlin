package com.gof.pattern.abstractfactory.after

import com.gof.pattern.factorymethod.javatokotlin.after.DefaultShipFactory
import com.gof.pattern.factorymethod.javatokotlin.after.Ship
import com.gof.pattern.factorymethod.javatokotlin.after.WhiteShip

class WhiteShipFactory(private val shipPartsFactory: ShipPartsFactory) : DefaultShipFactory() {

    override fun createShip(): Ship {
        val ship: Ship = WhiteShip()
        ship.anchor = shipPartsFactory.createAnchor()
        ship.wheel = shipPartsFactory.createWheel()
        return ship
    }
}
