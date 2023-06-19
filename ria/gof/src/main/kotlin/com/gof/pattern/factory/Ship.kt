package com.gof.pattern.factory

import com.gof.pattern.abstractFactory.after.Anchor
import com.gof.pattern.abstractFactory.after.Wheel

open class Ship {
    var name: String? = null
    var color: String? = null
    var logo: String? = null
    var anchor: Anchor? = null
    var wheel: Wheel? = null
}
