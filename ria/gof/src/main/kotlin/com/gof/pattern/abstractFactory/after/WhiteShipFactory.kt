package com.gof.pattern.abstractFactory.after

import com.gof.pattern.factory.DefaultShipFactory
import com.gof.pattern.factory.Ship
import com.gof.pattern.factory.WhiteShip

class WhiteShipFactory(private val shipPartsFactory: ShipPartsFactory) : DefaultShipFactory() {

    override fun createShip(): Ship {
        val ship = WhiteShip()
        ship.anchor = shipPartsFactory.createAnchor()
        ship.wheel = shipPartsFactory.createWheel()
        return ship
    }
}
