package com.gof.pattern.abstractfactory.after

import com.gof.pattern.abstractfactory.before.WhiteAnchor
import com.gof.pattern.abstractfactory.before.WhiteWheel

class WhiteShipPartsFactory : ShipPartsFactory {
    override fun createAnchor(): Anchor = WhiteAnchor()

    override fun createWheel(): Wheel = WhiteWheel()
}
