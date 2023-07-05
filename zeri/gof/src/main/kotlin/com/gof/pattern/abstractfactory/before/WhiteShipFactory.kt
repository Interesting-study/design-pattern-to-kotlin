package com.gof.pattern.abstractfactory.before

import com.gof.pattern.factorymethod.javatokotlin.after.DefaultShipFactory
import com.gof.pattern.factorymethod.javatokotlin.after.Ship
import com.gof.pattern.factorymethod.javatokotlin.after.WhiteShip

class WhiteShipFactory : DefaultShipFactory() {
    override fun createShip(): Ship {
        val ship: Ship = WhiteShip()
        ship.anchor = WhiteAnchor()
        ship.wheel = WhiteWheel()
        return ship
    }
}
