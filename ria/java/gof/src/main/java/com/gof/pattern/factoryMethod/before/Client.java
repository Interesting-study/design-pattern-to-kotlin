package com.gof.pattern.factoryMethod.before;

public class Client {
    public static void main(String[] args) {
        Ship whiteShip = ShipFactory.orderShip("whiteShip", "ria@email.com");
        System.out.println("whiteShip = " + whiteShip);
        Ship blackShip = ShipFactory.orderShip("blackShip", "ria@email.com");
        System.out.println("blackShip = " + blackShip);
    }
}
