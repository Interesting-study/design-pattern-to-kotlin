package com.gof.pattern.factorymethod.example

class Triangle(color: ShapeColor) : Shape() {
    init {
        this.lines = 3
        this.color = color
        this.shapeType = ShapeType.TRIANGLE
        this.name = "I'm Triangle"
    }
}
