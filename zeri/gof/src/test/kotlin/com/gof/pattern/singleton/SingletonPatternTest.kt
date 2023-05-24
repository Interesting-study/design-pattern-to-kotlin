package com.gof.pattern.singleton

import com.gof.pattern.singleton.javakotlin.BasicSettings
import com.gof.pattern.singleton.javakotlin.Settings
import com.gof.pattern.singleton.javakotlin.Settings1
import com.gof.pattern.singleton.javakotlin.Settings2
import com.gof.pattern.singleton.javakotlin.Settings3
import com.gof.pattern.singleton.javakotlin.Settings4
import com.gof.pattern.singleton.javakotlin.Settings5
import com.gof.pattern.singleton.javakotlin.Settings6
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.Execution
import org.junit.jupiter.api.parallel.ExecutionMode
import org.springframework.boot.test.context.SpringBootTest
import java.util.concurrent.ConcurrentHashMap
import kotlin.reflect.full.declaredMemberProperties
import kotlin.reflect.full.primaryConstructor
import kotlin.reflect.jvm.isAccessible

@SpringBootTest
@Execution(ExecutionMode.CONCURRENT)
class SingletonPatternTest() {
    @Test
    @DisplayName("싱글톤 패턴이 적용되지 않아 같은 클래스로 만든 인스턴스는 서로 다르다")
    fun singletonBySettingsTest() {
        val basicSettings = BasicSettings()
        val basicSettings2 = BasicSettings()

        assertTrue(basicSettings != basicSettings2)
    }

    @Test
    @DisplayName("private 생성자에 static 메소드로 생성자를 전달해줘도 인스턴스는 서로 다르다")
    fun singletonBySettings1Test() {
        val settings1 = Settings1.getInstance()
        val settings2 = Settings1.getInstance()

        assertTrue(settings1 != settings2)
    }

    @Test
    @DisplayName("static 인스턴스를 생성해서 객체가 null 이면 한번 생성하고 그 이후엔 그 객체를 유지해서 싱글톤 패턴을 유지한다")
    fun singletonBySettings2Test() {
        val settings1 = Settings2.getInstance()
        val settings2 = Settings2.getInstance()
        assertTrue(settings1 === settings2)
    }

    @Test
    @DisplayName("Settings2 클래스에서 한번 인스턴스를 생성하고 난 후에는 getInstance 로 호출한 객체는 전부 같다")
    fun singletonBySettings2Test2() {
        val settings = Settings2.getInstance()
        assertTrue(settings === Settings2.getInstance())
    }

    @Test
    @DisplayName("Settings3 클래스에서 멀티 스레드 환경일 때 객체가 일치하는지 확인한다")
    fun singletonBySettings3Test() {
        val instances: MutableSet<Settings3> = ConcurrentHashMap.newKeySet()
        val threadCount = 100

        val threads = mutableListOf<Thread>()

        for (i in 1..threadCount) {
            val thread = Thread {
                val instance = Settings3.getInstance()
                instances.add(instance)
            }
            threads.add(thread)
            thread.start()
        }

        for (thread in threads) {
            thread.join()
        }

        assertEquals(1, instances.size)
    }

    @Test
    @DisplayName("BasicSettings 클래스에서 멀티 스레드 환경일 때 객체가 일치하는지 않는지 확인한다")
    fun notSingletonByMultiThreadTest() {
        val instances: MutableSet<BasicSettings> = ConcurrentHashMap.newKeySet()
        val threadCount = 100

        val threads = mutableListOf<Thread>()

        for (i in 1..threadCount) {
            val thread = Thread {
                val instance = BasicSettings.getInstance()
                instances.add(instance)
            }
            threads.add(thread)
            thread.start()
        }

        for (thread in threads) {
            thread.join()
        }

        assertEquals(100, instances.size)
    }

    @Test
    @DisplayName("이른 초기화(eager initialization) 사용하기")
    fun singletonBySettings4() {
        val settings = Settings4.getInstance()
        assertTrue(settings === Settings4.getInstance())
    }

    @Test
    @DisplayName("싱글톤 패턴 구현 방법을 깨트리는 방법(리플렉션)")
    fun breakSingleton() {
        // given
        val settings = Settings6.getInstance()

        val constructor = Settings6::class.primaryConstructor!!
        constructor.isAccessible = true

        // when
        val settings2 = constructor.call()

        // then
        assertTrue(settings != settings2)
    }

    @Test
    @DisplayName("싱글톤 패턴 구현(ENUM 과 reflection)")
    fun singletonByEnumTest() {
        // given
        val settings = Settings.INSTANCE

        // when
        val enumClass = Settings::class
        val enumProperties = enumClass.declaredMemberProperties

        // then
        enumProperties.forEach { property ->
            property.isAccessible = true
            val settings1: Any? = property.get(settings) // Any? 타입으로 선언

            assertTrue(settings === settings1)
        }
    }

    @Test
    @DisplayName("double checked locking 사용하기")
    fun singletonBySettings5Test() {
        val settings1 = Settings5.getInstance()

        assertTrue(settings1 === Settings5.getInstance())
    }

    @Test
    @DisplayName("static inner 클래스 사용하기")
    fun singletonBySetting6Test() {
        val settings1 = Settings6.getInstance()

        assertTrue(settings1 === Settings6.getInstance())
    }
}
