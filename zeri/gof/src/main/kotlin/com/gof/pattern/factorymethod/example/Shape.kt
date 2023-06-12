package com.gof.pattern.factorymethod.example

open class Shape {
    var lines = 0
    var name: String? = null
    var color: ShapeColor? = null
    var shapeType: ShapeType? = ShapeType.BASIC


    override fun toString(): String {
        return "Shape(lines=$lines, name=$name, color=$color, shapeType=$shapeType)"
    }
}