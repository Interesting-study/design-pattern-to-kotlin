package com.gof.pattern.factorymethod.javatokotlin.after

import com.gof.pattern.factorymethod.javatokotlin.after.Ship
import com.gof.pattern.factorymethod.javatokotlin.after.ShipFactory

abstract class DefaultShipFactory : ShipFactory {
    override fun sendEmailTo(name: String, ship: Ship) {
        println("$name 다 만들었습니다.")
    }
}
