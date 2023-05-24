package com.gof.pattern.singleton

/** object 키워드로 싱글톤 구현 **/
object SingletonSettings {}

fun main() {
    var singletonSettings = SingletonSettings
    var singletonSettings1 = SingletonSettings

    println(singletonSettings == singletonSettings1) // 동등성 비교 -> true
    println(singletonSettings === singletonSettings1) // 동일성 비교 -> true

    var singletonSettings3 = SingletonSettings3.getInstance()
    var singletonSettings33 = SingletonSettings3.getInstance()
    println(singletonSettings3 === singletonSettings33) // true

    val singletonSettings4 = SingletonSettings4.getInstance()
    val singletonSettings44 = SingletonSettings4.getInstance()
    println(singletonSettings4 === singletonSettings44)

    val singletonSettings6 = SingletonSettings6.INSTANCE
    val singletonSettings66 = SingletonSettings6.INSTANCE
    println(singletonSettings6 === singletonSettings66)
}

