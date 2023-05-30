package com.gof.pattern.factoryMethod.after;

import com.gof.pattern.factoryMethod.before.Ship;
import com.gof.pattern.factoryMethod.before.ShipFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ClientTest {

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

    @Test
    @DisplayName("팩토리 메서드 패턴 적용 후 성공 테스트 1")
    void whiteShipFactoryTest() {
        com.gof.pattern.factoryMethod.after.ShipFactory whiteShipFactory = new WhiteShipFactory();
        com.gof.pattern.factoryMethod.after.Ship whiteShip = whiteShipFactory.orderShip("whiteShip", "ria@email.com");
        assertThat(whiteShip).isNotNull();
        assertThat(whiteShip.getName()).isEqualTo("whiteShip");
        assertThat(whiteShip.getLogo()).isEqualTo("\uD83D\uDEE5");
        assertThat(whiteShip.getColor()).isEqualTo("white");
    }

    @Test
    @DisplayName("팩토리 메서드 패턴 적용 후 성공 테스트 2")
    void blackShipFactoryTest() {
        com.gof.pattern.factoryMethod.after.ShipFactory blackShipFactory = new BlackShipFactory();
        com.gof.pattern.factoryMethod.after.Ship blackShip = blackShipFactory.orderShip("BlackShip", "ria@email.com");
        assertThat(blackShip).isNotNull();
        assertThat(blackShip.getName()).isEqualTo("blackShip");
        assertThat(blackShip.getLogo()).isEqualTo("⚓");
        assertThat(blackShip.getColor()).isEqualTo("black");
    }
}