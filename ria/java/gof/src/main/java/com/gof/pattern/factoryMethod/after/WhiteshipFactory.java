package com.gof.pattern.factoryMethod.after;

public class WhiteshipFactory extends DefaultShipFactory {
    @Override
    public Ship createShip() {
        return new Whiteship();
    }
}