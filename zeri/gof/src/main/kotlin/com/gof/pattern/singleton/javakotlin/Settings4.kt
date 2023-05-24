package com.gof.pattern.singleton.javakotlin

/**
 * [멀티 쓰레드 환경에서 안전하게 구현하는 방법]
 * - 이른 초기화 사용
 */
class Settings4 private constructor() {
    companion object {
        private val instance: Settings4 = Settings4()

        fun getInstance(): Settings4 = instance
    }
}
