package com.gof.pattern.factorymethod.javatokotlin.after

import com.gof.pattern.abstract_factory.after.Anchor
import com.gof.pattern.abstract_factory.after.Wheel

open class Ship {
    var name: String = ""
    var color: String = ""
    var logo: String? = ""
    var wheel: Wheel? = null
        set(value) {
            field = value
        }
    var anchor: Anchor? = null
        set(value) {
            field = value
        }

    override fun toString(): String {
        return "Ship(name='$name', color='$color', logo=$logo)"
    }
}

