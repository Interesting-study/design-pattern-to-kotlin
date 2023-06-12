package com.gof.pattern.factorymethod.example

class Square(color: ShapeColor) : Shape() {
    init {
        this.lines = 4
        this.name = "I'm Square"
        this.color = color
        this.shapeType = ShapeType.SQUARE
    }
}