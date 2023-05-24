package com.gof.pattern.singleton.onlykotlin

/**
 * [코틀린에서 싱글톤 패턴 구현하기]
 * [ V ] 패키지 수준 함수(Package-Level Function)
 */
private var instance: PackageLevelSingletonUser? = null

fun getPackageLevelSingletonInstance(): PackageLevelSingletonUser {
    return instance ?: synchronized(PackageLevelSingletonUser::class) {
        instance ?: PackageLevelSingletonUser().also { instance = it }
    }
}

class PackageLevelSingletonUser() {
    // 클래스의 내용
}
