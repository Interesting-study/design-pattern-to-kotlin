package com.gof.pattern.abstractFactory.after;

import com.gof.pattern.factoryMethod.after.Ship;
import com.gof.pattern.factoryMethod.after.ShipFactory;

public class ShipInventory {
    public static void main(String[] args) {
//        ShipFactory shipFactory = new WhiteShipFactory(new WhitePartsProFactory());
        ShipFactory shipFactory = new WhiteShipFactory(new WhiteShipPartsFactory());
        Ship ship = shipFactory.createShip();
        System.out.println("ship.getAnchor().getClass() = " + ship.getAnchor().getClass());
        System.out.println("ship.getWheel().getClass() = " + ship.getWheel().getClass());
    }
}