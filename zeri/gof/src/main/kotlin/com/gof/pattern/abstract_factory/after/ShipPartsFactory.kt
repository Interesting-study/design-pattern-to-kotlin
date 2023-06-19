package com.gof.pattern.abstract_factory.after

interface ShipPartsFactory {

    fun createAnchor() : Anchor

    fun createWheel() : Wheel
}
