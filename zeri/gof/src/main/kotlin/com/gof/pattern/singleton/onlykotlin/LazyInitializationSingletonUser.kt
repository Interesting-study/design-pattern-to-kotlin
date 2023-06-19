package com.gof.pattern.singleton.onlykotlin

/**
 * [코틀린에서 싱글톤 패턴 구현하기]
 * [ V ] lazy 초기화
 * lazy 를 이용해서 instance 생성을 지연 초기화하며 처음 접근되는 시점에서 초기화 된다
 * 그 이후에는 초기화된 값을 재사용한다
 */
class LazyInitializationSingletonUser private constructor(
    var firstName: String? = null,
    var lastName: String? = null,
) {
    companion object {
        private val singletonUser by lazy(LazyThreadSafetyMode.PUBLICATION) { LazyInitializationSingletonUser() }
        fun getInstance(): LazyInitializationSingletonUser = singletonUser
    }
}
