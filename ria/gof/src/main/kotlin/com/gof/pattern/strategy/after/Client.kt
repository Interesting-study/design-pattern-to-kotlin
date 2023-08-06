package com.gof.pattern.strategy.after

class Client {
}

fun main() {
    val game = BlueLightRedLight()
    game.blueLight(Normal())
    game.redLight(Faster())
    game.blueLight(object : Speed {
        override fun blueLight() {
            println("blue light")
        }

        override fun redLight() {
            println("red light")
        }
    })
}