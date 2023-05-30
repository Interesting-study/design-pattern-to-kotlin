package com.gof.pattern.singleton

/** 지연 초기화로 싱글톤 구현 **/
class LazyInitializationSingleton private constructor() {
    companion object {
        val instance: LazyInitializationSingleton by lazy { LazyInitializationSingleton() }
    }
}
