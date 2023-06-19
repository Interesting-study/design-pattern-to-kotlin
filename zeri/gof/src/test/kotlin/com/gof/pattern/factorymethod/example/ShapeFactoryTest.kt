package com.gof.pattern.factorymethod.example

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class ShapeFactoryTest {
    @Test
    @DisplayName("ShapeFactory 가 정상적으로 작동한다")
    fun shapeFactoryTest() {
        // given
        val factory = ShapeFactory()

        // when
        val circle = factory.createShape(ShapeType.CIRCLE, ShapeColor.RED)
        val square = factory.createShape(ShapeType.SQUARE, ShapeColor.BLUE)
        val triangle = factory.createShape(ShapeType.TRIANGLE, ShapeColor.YELLOW)

        // then
        assertTrue(circle is Circle)
        assertTrue(square is Square)
        assertTrue(triangle is Triangle)
    }
}
