package com.gof.pattern.strategy.after

class Normal : Speed {
    override fun blueLight() {
        println("무 궁 화   꽃  이")
    }

    override fun redLight() {
        println("피 었 습 니 다.")
    }
}