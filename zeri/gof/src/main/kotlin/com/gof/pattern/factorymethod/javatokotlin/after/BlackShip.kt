package com.gof.pattern.factorymethod.javatokotlin.after

class BlackShip : Ship() {
    init {
        this.name = "BlackShip"
        this.logo = "⚓"
        this.color = "black"
    }
}
