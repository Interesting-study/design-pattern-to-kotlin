package com.gof.pattern.abstractFactory.after

interface ShipPartsFactory {
    fun createAnchor(): Anchor
    fun createWheel(): Wheel
}
