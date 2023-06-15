package com.gof.pattern.factoryMethod.after;

/**
 * OCP 원칙 지킴
 **/
public interface ShipFactory {

    // 로직이 간결해짐
    default Ship orderShip(String name, String email) {
        validate(name, email);
        prepareFor(name);
        Ship ship = createShip();
        sendEmailTo(email, ship);
        return ship;
    }

    // 하위 클래스에서 구현
    Ship createShip();

    private void validate(String name, String email) {
        if (name == null || name.isBlank()) {
            throw new IllegalStateException("배 이름을 지어주세요.");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalStateException("연락처를 남겨주세요.");
        }
    }

    // private 메서드 자바 9 이후 버전부터 가능
    private void prepareFor(String name) {
        System.out.println(name + " 만들 준비 중");
    }

    void sendEmailTo(String email, Ship ship);
}
