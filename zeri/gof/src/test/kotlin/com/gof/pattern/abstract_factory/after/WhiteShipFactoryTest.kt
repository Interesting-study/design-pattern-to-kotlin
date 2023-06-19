package com.gof.pattern.abstract_factory.after

import com.gof.pattern.abstract_factory.before.WhiteAnchor
import com.gof.pattern.abstract_factory.before.WhiteWheel
import com.gof.pattern.factorymethod.javatokotlin.after.Ship
import com.gof.pattern.factorymethod.javatokotlin.after.ShipFactory
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class WhiteShipFactoryTest{
    @Test
    @DisplayName("추상팩토리 메소드 패턴")
    fun abstractFactoryMethodTest() {
        // given
        val shipFactory : ShipFactory = WhiteShipFactory(WhiteShipPartsFactory())

        // when
        val ship : Ship = shipFactory.createShip()

        // then
        assertTrue(ship.anchor is WhiteAnchor)
        assertTrue(ship.wheel is WhiteWheel)
    }

}
