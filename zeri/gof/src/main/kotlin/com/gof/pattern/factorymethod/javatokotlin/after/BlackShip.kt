package com.gof.pattern.factorymethod.javatokotlin.after

import com.gof.pattern.factorymethod.javatokotlin.after.Ship

class BlackShip : Ship() {
    init {
        this.name = "BlackShip"
        this.logo = "⚓"
        this.color = "black"
    }
}
