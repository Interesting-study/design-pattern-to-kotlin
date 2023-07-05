package com.gof.pattern.singleton.onlykotlin

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class KotlinSingletonTest() {
    @Test
    @DisplayName("객체 선언으로 싱글톤 패턴을 구현할 수 있다")
    fun objectDeclarationTest() {
        val user = ObjectDeclarationSingletonUser
        val user2 = ObjectDeclarationSingletonUser

        assertTrue(user === user2)
    }

    @Test
    @DisplayName("패키지 수준 함수로 싱글톤 패턴을 구현할 수 있다")
    fun packageLevelFunctionTest() {
        val user = getPackageLevelSingletonInstance()

        assertTrue(user === getPackageLevelSingletonInstance())
    }

    @Test
    @DisplayName("동반 객체로 싱글톤 패턴을 구현할 수 있다")
    fun companionObjectTest() {
        val user = CompanionObjectSingletonUser.getInstance()

        assertTrue(user === CompanionObjectSingletonUser.getInstance())
    }

    @Test
    @DisplayName("lazy 초기화를 사용한 싱글톤 패턴 테스트")
    fun lazyInitializationTest() {
        val user = LazyInitializationSingletonUser.getInstance()

        assertTrue(user === LazyInitializationSingletonUser.getInstance())
    }
}
