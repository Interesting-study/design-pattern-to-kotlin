package com.gof.pattern.factoryMethod.after;

public abstract class DefaultShipFactory implements ShipFactory{

    // 기존에 private 메서드 오버라이딩
    @Override
    public void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getName() + " 다 만들었습니다.");
    }
}
