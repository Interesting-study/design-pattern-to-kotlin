package com.gof.pattern.abstractFactory.after

import com.gof.pattern.abstractFactory.before.WhiteAnchor
import com.gof.pattern.abstractFactory.before.WhiteWheel

class WhiteShipPartsFactory : ShipPartsFactory {

    override fun createAnchor(): Anchor {
        return WhiteAnchor()
    }

    override fun createWheel(): Wheel {
        return WhiteWheel()
    }
}
