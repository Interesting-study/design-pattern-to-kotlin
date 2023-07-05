package com.gof.pattern.abstractfactory.after

interface ShipPartsFactory {

    fun createAnchor(): Anchor

    fun createWheel(): Wheel
}
