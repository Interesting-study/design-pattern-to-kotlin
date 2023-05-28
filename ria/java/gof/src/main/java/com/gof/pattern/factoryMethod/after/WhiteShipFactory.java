package com.gof.pattern.factoryMethod.after;

public class WhiteShipFactory extends DefaultShipFactory {
    @Override
    public Ship createShip() {
        return new WhiteShip();
    }
}