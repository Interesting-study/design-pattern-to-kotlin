package com.gof.pattern.factoryMethod.before;

/**
 * OCP 원칙 위반
 * 제품이 추가될 경우 기존 코드가 수정됨
 * 핵심 로직
 * 1. 유효성 체크
 * 2. 배 제작 (이름에 따른 로고, 색 설정) -> 수정되는 코드
 * 3. 제작 완료 후 이메일 발송
 */
public class ShipFactory {

    public static Ship orderShip(String name, String email) {
        // validate
        if (name == null || name.isBlank()) {
            throw new IllegalStateException("배 이름을 지어주세요.");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalStateException("연락처를 남겨주세요.");
        }
        prepareFor(name);

        Ship ship = new Ship();
        ship.setName(name);

        // Customizing for specific name
        if (name.equalsIgnoreCase("whiteShip")) {
            ship.setLogo("\uD83D\uDEE5");
        } else if (name.equalsIgnoreCase("blackShip")) {
            ship.setLogo("⚓");
        }

        // coloring
        if (name.equalsIgnoreCase("whiteShip")) {
            ship.setColor("white");
        } else if (name.equalsIgnoreCase("blackShip")) {
            ship.setColor("black");
        }

        // notify
        sendEmailTo(email, ship);
        return ship;
    }

    private static void prepareFor(String name) {
        System.out.println(name + " 만들 준비 중");
    }

    private static void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getName() + " 다 만들었습니다.");
    }
}

