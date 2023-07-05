package com.gof.pattern.abstractFactory.after;

import com.gof.pattern.factoryMethod.after.DefaultShipFactory;
import com.gof.pattern.factoryMethod.after.Ship;
import com.gof.pattern.factoryMethod.after.WhiteShip;

public class WhiteShipFactory extends DefaultShipFactory {

    private ShipPartsFactory shipPartsFactory;

    public WhiteShipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        WhiteShip ship = new WhiteShip();
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());
        return ship;
    }
}
