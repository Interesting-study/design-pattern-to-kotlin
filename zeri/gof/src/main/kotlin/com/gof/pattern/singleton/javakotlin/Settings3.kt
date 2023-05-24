package com.gof.pattern.singleton.javakotlin

/**
 * [멀티 쓰레드 환경에서 안전하게 구현하는 방법]
 * - synchronized 사용하기
 */
class Settings3 private constructor() {
    companion object {
        private var instance: Settings3? = null

        @Synchronized
        fun getInstance(): Settings3 {
            return instance ?: Settings3().also { instance = it }
        }
    }
}
