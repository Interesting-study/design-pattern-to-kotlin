package com.gof.pattern.factorymethod.javatokotlin.after

open class Ship {
    var name: String = ""
    var color: String = ""
    var logo: String? = ""
    private var wheel: Wheel? = null
    private var anchor: Anchor? = null

    override fun toString(): String {
        return "Ship(name='$name', color='$color', logo=$logo)"
    }
}
