package com.gof.pattern.factoryMethod.after;

public class Client {
    public static void main(String[] args) {

        Ship whiteship = new WhiteshipFactory().orderShip("Whiteship", "ria@email.com");
        System.out.println("whiteship = " + whiteship);
        Ship blackship = new BlackshipFactory().orderShip("Blackship", "ria@email.com");
        System.out.println("blackship = " + blackship);
    }
}
