package com.gof.pattern.factorymethod.example


class ShapeFactory {
    fun createShape(shapeType: ShapeType, color: ShapeColor): Shape {
        return when (shapeType) {
            ShapeType.CIRCLE -> Circle(color)
            ShapeType.TRIANGLE -> Triangle(color)
            ShapeType.SQUARE -> Square(color)
            else -> throw IllegalArgumentException("Invalid shape type")
        }
    }
}