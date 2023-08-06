package com.gof.pattern.strategy.after

class Faster : Speed {
    override fun blueLight() {
        println("무궁화꽃이")
    }

    override fun redLight() {
        println("피었습니다.")
    }
}