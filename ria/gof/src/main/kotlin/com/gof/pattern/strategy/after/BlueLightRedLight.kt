package com.gof.pattern.strategy.after

class BlueLightRedLight {

    fun blueLight(speed: Speed) {
        speed.blueLight()
    }

    fun redLight(speed: Speed) {
        speed.redLight()
    }
}