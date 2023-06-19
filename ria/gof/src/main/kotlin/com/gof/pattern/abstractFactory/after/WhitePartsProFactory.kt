package com.gof.pattern.abstractFactory.after

class WhitePartsProFactory : ShipPartsFactory {

    override fun createAnchor(): Anchor {
        return WhiteAnchorPro()
    }

    override fun createWheel(): Wheel {
        return WhiteWheelPro()
    }
}
