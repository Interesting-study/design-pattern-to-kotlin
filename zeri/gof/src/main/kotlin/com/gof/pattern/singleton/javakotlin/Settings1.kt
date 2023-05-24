package com.gof.pattern.singleton.javakotlin

/**
 * 싱글톤 패턴이 지켜지지 않는 예시
 */
class Settings1 private constructor() {

    companion object {
        fun getInstance(): Settings1 = Settings1()
    }
}
