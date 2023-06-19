package com.gof.pattern.abstract_factory.after

import com.gof.pattern.abstract_factory.before.WhiteAnchor
import com.gof.pattern.abstract_factory.before.WhiteWheel

class WhiteShipPartsFactory : ShipPartsFactory {
    override fun createAnchor(): Anchor = WhiteAnchor()

    override fun createWheel(): Wheel = WhiteWheel()
}
