package com.gof.pattern.strategy.before

class Client {
}

fun main() {
    val blueLightRedLight = BlueLightRedLight(3)
    blueLightRedLight.blueLight()
    blueLightRedLight.redLight()
}