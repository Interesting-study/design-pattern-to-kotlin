package com.gof.pattern.factoryMethod.after;

public class Client {
    public static void main(String[] args) {

//        Ship whiteship = new WhiteshipFactory().orderShip("Whiteship", "ria@email.com");
//        System.out.println("whiteship = " + whiteship);
//        Ship blackship = new BlackshipFactory().orderShip("Blackship", "ria@email.com");
//        System.out.println("blackship = " + blackship);

        /** 클라이언트 코드 변경 최소화 **/
        Client client = new Client();
        client.print(new WhiteShipFactory(), "whiteship", "ria@email.com");
        client.print(new BlackShipFactory(), "blackship", "ria@email.com");
    }

    private void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name, email));
    }
}
