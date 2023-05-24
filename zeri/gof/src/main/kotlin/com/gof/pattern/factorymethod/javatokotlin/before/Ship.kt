package com.gof.pattern.factorymethod.javatokotlin.before

open class Ship {
    var name: String? = null
    private var color: String? = null
    var logo: String? = null

    override fun toString(): String {
        return "Ship(name='$name', color='$color', logo=$logo)"
    }
}
