package com.pattern.gof.singleton.onlykotlin

/**
 * [코틀린에서 싱글톤 패턴 구현하기]
 * [ V ] 동반 객체(Companion Object)
 */
class CompanionObjectSingletonUser private constructor() {
    companion object {
        private val instance = CompanionObjectSingletonUser()

        fun getInstance(): CompanionObjectSingletonUser = instance
    }
}
