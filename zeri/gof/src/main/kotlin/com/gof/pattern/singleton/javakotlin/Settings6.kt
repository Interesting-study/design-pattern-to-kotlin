package com.gof.pattern.singleton.javakotlin

/**
 * [멀티 쓰레드 환경에서 안전하게 구현하는 방법]
 * - static inner 클래스 사용하기
 * (권장하는 방법)
 */
class Settings6 private constructor() {

    companion object {
        private object SettingsHolder {
            val instance = Settings6()
        }

        fun getInstance(): Settings6 = SettingsHolder.instance
    }
}
