package com.gof.pattern.abstractFactory.after;

public interface ShipPartsFactory {

    Anchor createAnchor();

    Wheel createWheel();
}
