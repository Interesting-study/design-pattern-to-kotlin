package com.gof.pattern.singleton.javakotlin

/**
 * [멀티 쓰레드 환경에서 안전하게 구현하는 방법]
 * - double checked locking 사용하기
 */
class Settings5 private constructor() {
    companion object {
        @Volatile
        private var instance: Settings5? = null

        fun getInstance(): Settings5 {
            return instance ?: synchronized(this) {
                instance ?: Settings5().also { instance = it }
            }
        }
    }
}
