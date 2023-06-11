package com.gof.pattern.factoryMethod.before;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BeforeClientTest {

    @Test
    @DisplayName("팩토리 메서드 패턴 적용 전 성공 테스트")
    void beforeFactorySuccessTest() {
        Ship whiteShip = ShipFactory.orderShip("whiteShip", "ria@eamil.com");
        assertThat(whiteShip.getLogo()).isEqualTo("\uD83D\uDEE5");
        Ship blackShip = ShipFactory.orderShip("blackShip", "ria@email.com");
        assertThat(blackShip.getLogo()).isEqualTo("⚓");
        Ship blueShip = ShipFactory.orderShip("blueShip", "ria@email.com");
        System.out.println("blueShip = " + blueShip);
    }

    @Test
    @DisplayName("팩토리 메서드 패턴 적용 전 실패 테스트")
    void beforeFactoryFailTest() {
        Ship blueShip = ShipFactory.orderShip("blueShip", "ria@email.com");
        assertThat(blueShip.getLogo()).isNull();
    }
}