package com.gof.pattern.abstractFactory.after;

import com.gof.pattern.abstractFactory.before.WhiteAnchor;
import com.gof.pattern.abstractFactory.before.WhiteWheel;

public class WhiteShipPartsFactory implements ShipPartsFactory {
    @Override
    public Anchor createAnchor() {
        return new WhiteAnchor();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheel();
    }
}
