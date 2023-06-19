package com.gof.pattern.abstractFactory.after

import com.gof.pattern.abstractFactory.before.WhiteAnchor
import com.gof.pattern.abstractFactory.before.WhiteWheel
import com.gof.pattern.factory.Ship
import com.gof.pattern.factory.ShipFactory
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class ShipInventoryTest {

    @Test
    @DisplayName("whiteShipPartsFactory 타입의 배를 만드는 테스트")
    fun whiteShipPartsFactory() {
        // given
        val shipFactory: ShipFactory = WhiteShipFactory(WhiteShipPartsFactory())
        // when
        val ship: Ship = shipFactory.createShip()
        // then
        assertThat(ship.anchor!!::class).isEqualTo(WhiteAnchor::class)
        assertThat(ship.wheel!!::class).isEqualTo(WhiteWheel::class)
    }

    @Test
    @DisplayName("whiteShipPartsProFactory 타입의 배를 만드는 테스트")
    fun whiteShipPartsProFactory() {
        // given
        val shipFactory: ShipFactory = WhiteShipFactory(WhitePartsProFactory())
        // when
        val ship: Ship = shipFactory.createShip()
        // then
        assertThat(ship.anchor!!::class).isEqualTo(WhiteAnchorPro::class)
        assertThat(ship.wheel!!::class).isEqualTo(WhiteWheelPro::class)
    }
}
