package com.gof.pattern.abstractfactory.after

import com.gof.pattern.abstractfactory.before.WhiteAnchor
import com.gof.pattern.abstractfactory.before.WhiteWheel
import com.gof.pattern.factorymethod.javatokotlin.after.Ship
import com.gof.pattern.factorymethod.javatokotlin.after.ShipFactory
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class WhiteShipFactoryTest {
    @Test
    @DisplayName("추상팩토리 메소드 패턴이 정상적으로 작동한다")
    fun abstractFactoryMethodTest() {
        // given
        val shipFactory: ShipFactory = WhiteShipFactory(WhiteShipPartsFactory())

        // when
        val ship: Ship = shipFactory.createShip()

        // then
        assertTrue(ship.anchor is WhiteAnchor)
        assertTrue(ship.wheel is WhiteWheel)
    }
}
