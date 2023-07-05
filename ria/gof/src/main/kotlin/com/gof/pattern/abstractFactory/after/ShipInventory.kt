package com.gof.pattern.abstractFactory.after

import com.gof.pattern.factory.Ship
import com.gof.pattern.factory.ShipFactory

class ShipInventory

fun main() {
    val shipFactory: ShipFactory = WhiteShipFactory(WhitePartsProFactory())
    val ship: Ship = shipFactory.createShip()
    println("ship.anchor.class() = ${ship.anchor!!::class}")
    println("ship.wheel.class() = ${ship.wheel!!::class}")
}
