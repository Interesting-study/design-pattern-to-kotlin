package com.gof.pattern.singleton

/** 패키지 레벨 함수를 사용하여 싱글톤 구현 **/
private var initialized = false

fun initializeSingleton() {
    if (!initialized) {
        initialized = true
    }
}

fun useSingleton() {
    if (!initialized) {
        initializeSingleton()
    }
}
