package com.gof.pattern.strategy.before

class BlueLightRedLight(private val speed: Int) {

    fun blueLight() {
        when (speed) {
            1 -> println("무 궁 화   꽃  이")
            2 -> println("무궁화꽃이")
            else -> println("무광꼬치")
        }
    }

    fun redLight() {
        when (speed) {
            1 -> println("피 었 습 니 다.")
            2 -> println("피었습니다.")
            3 -> println("피었슴다")
        }
    }
}