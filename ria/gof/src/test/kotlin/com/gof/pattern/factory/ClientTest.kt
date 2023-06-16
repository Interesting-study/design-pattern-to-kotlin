package com.gof.pattern.factory

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class ClientTest {

    @Test
    @DisplayName("팩토리 메서드 패턴 적용 후 성공 테스트 1")
    fun whiteShipFactoryTest() {
        // given
        val whiteShipFactory = WhiteShipFactory()
        // when
        val whiteShip = whiteShipFactory.orderShip("whiteShip", "ria@email.com")
        // then
        assertThat(whiteShip.name).isEqualTo("whiteShip")
        assertThat(whiteShip.logo).isEqualTo("\uD83D\uDEE5")
        assertThat(whiteShip.color).isEqualTo("white")
    }

    @Test
    @DisplayName("팩토리 메서드 패턴 적용 후 성공 테스트 2")
    fun blackShipFactoryTest() {
        // given
        val blackShipFactory = BlackShipFactory()
        // when
        val blackShip = blackShipFactory.orderShip("blackShip", "ria@email.com")
        // then
        assertThat(blackShip.name).isEqualTo("blackShip")
        assertThat(blackShip.logo).isEqualTo("⚓")
        assertThat(blackShip.color).isEqualTo("black")
    }
}
