package com.gof.pattern.abstractFactory.after

import com.gof.pattern.abstractFactory.before.WhiteAnchor
import com.gof.pattern.abstractFactory.before.WhiteWheel
import com.gof.pattern.factory.Ship
import com.gof.pattern.factory.ShipFactory
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class ShipInventoryTest {

    @Test
    fun `whiteShipPartsFactory 타입의 배를 만드는 테스트`() {
        // given
        val shipFactory: ShipFactory = WhiteShipFactory(WhiteShipPartsFactory())
        // when
        val ship: Ship = shipFactory.createShip()
        // then
        assertTrue(ship.anchor is WhiteAnchor)
        assertTrue(ship.wheel is WhiteWheel)
    }

    @Test
    fun `whiteShipPartsProFactory 타입의 배를 만드는 테스트`() {
        // given
        val shipFactory: ShipFactory = WhiteShipFactory(WhitePartsProFactory())
        // when
        val ship: Ship = shipFactory.createShip()
        // then
        assertTrue(ship.anchor is WhiteAnchorPro)
        assertTrue(ship.wheel is WhiteWheelPro)
    }
}
