package com.gof.pattern.factorymethod.before

import com.gof.pattern.factorymethod.javatokotlin.before.ShipFactory
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class BeforeFactoryMethodTest {
    @Test
    @DisplayName("팩토리 메소드 패턴 before 테스트")
    fun beforeFactoryMethodTest() {
        // given & when
        val whiteShip = ShipFactory.orderShip("WhiteShip", "rt.slowth@gmail.com")
        val blackShip = ShipFactory.orderShip("BlackShip", "rt.slowth@gmail.com")

        // then

        assertEquals("WhiteShip", whiteShip.name)
        assertEquals("BlackShip", blackShip.name)
    }
}
