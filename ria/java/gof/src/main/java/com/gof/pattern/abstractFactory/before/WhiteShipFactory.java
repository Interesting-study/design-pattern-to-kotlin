package com.gof.pattern.abstractFactory.before;

import com.gof.pattern.factoryMethod.after.DefaultShipFactory;
import com.gof.pattern.factoryMethod.after.Ship;
import com.gof.pattern.factoryMethod.after.WhiteShip;

public class WhiteShipFactory extends DefaultShipFactory {

    @Override
    public Ship createShip() {
        WhiteShip ship = new WhiteShip();
        ship.setAnchor(new WhiteAnchor());
        ship.setWheel(new WhiteWheel());
        return ship;
    }
}
