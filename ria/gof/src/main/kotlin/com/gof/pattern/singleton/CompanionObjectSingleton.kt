package com.gof.pattern.singleton

/** 동반 객체로 싱글톤 구현 **/
class CompanionObjectSingleton private constructor() {

    companion object {
        private var instance = CompanionObjectSingleton()

        fun getInstance(): CompanionObjectSingleton = instance
    }
}
