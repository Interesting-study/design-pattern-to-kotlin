package com.gof.pattern.factorymethod.javatokotlin.after

class WhiteShip : Ship() {
    init {
        this.name = "WhiteShip"
        this.logo = "\uD83D\uDEE5️"
        this.color = "white"
    }
}
