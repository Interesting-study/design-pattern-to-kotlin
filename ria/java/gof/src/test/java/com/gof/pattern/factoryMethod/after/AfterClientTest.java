package com.gof.pattern.factoryMethod.after;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AfterClientTest {

    @Test
    @DisplayName("팩토리 메서드 패턴 적용 후 성공 테스트 1")
    void whiteShipFactoryTest() {
        WhiteShipFactory whiteShipFactory = new WhiteShipFactory();
        Ship whiteShip = whiteShipFactory.orderShip("whiteShip", "ria@email.com");
        assertThat(whiteShip).isNotNull();
        assertThat(whiteShip.getName()).isEqualTo("whiteShip");
        assertThat(whiteShip.getLogo()).isEqualTo("\uD83D\uDEE5");
        assertThat(whiteShip.getColor()).isEqualTo("white");
    }

    @Test
    @DisplayName("팩토리 메서드 패턴 적용 후 성공 테스트 2")
    void blackShipFactoryTest() {
        ShipFactory blackShipFactory = new BlackShipFactory();
        Ship blackShip = blackShipFactory.orderShip("BlackShip", "ria@email.com");
        assertThat(blackShip).isNotNull();
        assertThat(blackShip.getName()).isEqualTo("blackShip");
        assertThat(blackShip.getLogo()).isEqualTo("⚓");
        assertThat(blackShip.getColor()).isEqualTo("black");
    }
}