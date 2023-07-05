package com.gof.pattern.factorymethod.example

class Circle(color: ShapeColor) : Shape() {
    init {
        this.name = "I'm Circle"
        this.shapeType = ShapeType.CIRCLE
        this.color = color
    }
}
