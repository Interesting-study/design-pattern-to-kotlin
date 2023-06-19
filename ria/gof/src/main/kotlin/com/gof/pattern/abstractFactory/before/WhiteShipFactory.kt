package com.gof.pattern.abstractFactory.before

import com.gof.pattern.factory.DefaultShipFactory
import com.gof.pattern.factory.Ship
import com.gof.pattern.factory.WhiteShip

class WhiteShipFactory : DefaultShipFactory() {

    override fun createShip(): Ship {
        val ship = WhiteShip()
        ship.anchor = WhiteAnchor()
        ship.wheel = WhiteWheel()
        return ship
    }
}
