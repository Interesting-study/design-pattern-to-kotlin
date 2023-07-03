package com.gof.pattern.abstractfactory.example

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class FruitFactoryTest {
    @Test
    @DisplayName("추상팩토리패턴 예제가 정상적으로 작동한다.")
    fun abstractFactoryMethodTest()  {
        // given && when
        val apple: Fruit = FruitFactory.createFruit("APPLE")
        val banana: Fruit = FruitFactory.createFruit("BANANA")

        assertThrows<IllegalArgumentException> {
            FruitFactory.createFruit("ORANGE")
        }

        // then
        assertTrue(apple is Apple)
        assertEquals(apple.getName(), "사과")

        assertTrue(banana is Banana)
        assertEquals(banana.getName(), "바나나")
    }
}
