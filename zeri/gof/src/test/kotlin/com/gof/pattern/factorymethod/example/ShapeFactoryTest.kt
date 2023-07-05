package com.gof.pattern.factorymethod.example

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class ShapeFactoryTest {
    @Test
    @DisplayName("ShapeFactory 가 정상적으로 작동한다")
    fun shapeFactoryTest() {
        // given && when
        val circle = ShapeFactory.createShape(ShapeType.CIRCLE, ShapeColor.RED)
        val square = ShapeFactory.createShape(ShapeType.SQUARE, ShapeColor.BLUE)
        val triangle = ShapeFactory.createShape(ShapeType.TRIANGLE, ShapeColor.YELLOW)

        // then
        assertTrue(circle is Circle)
        assertTrue(circle.color == ShapeColor.RED)

        assertTrue(square is Square)
        assertTrue(square.color == ShapeColor.BLUE)

        assertTrue(triangle is Triangle)
        assertTrue(triangle.color == ShapeColor.YELLOW)
    }
}
