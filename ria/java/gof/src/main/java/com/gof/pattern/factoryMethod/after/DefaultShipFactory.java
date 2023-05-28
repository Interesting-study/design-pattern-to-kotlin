package com.gof.pattern.factoryMethod.after;

/** 자바 8을 사용하는 경우, 추상 클래스로 구현 **/
public abstract class DefaultShipFactory implements ShipFactory{

    // 기존 private 메서드 오버라이딩
    @Override
    public void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getName() + " 다 만들었습니다.");
    }
}
