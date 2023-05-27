package com.gof.pattern.factoryMethod.before;

public class Client {
    public static void main(String[] args) {
        Ship whiteship = ShipFactory.orderShip("Whiteship", "ria@email.com");
        System.out.println("whiteship = " + whiteship);
        Ship blackship = ShipFactory.orderShip("Blackship", "ria@email.com");
        System.out.println("blackship = " + blackship);
    }
}
