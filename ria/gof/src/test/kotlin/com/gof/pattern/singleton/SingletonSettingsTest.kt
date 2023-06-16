package com.gof.pattern.singleton

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.ObjectInputStream
import java.io.ObjectOutputStream
import kotlin.reflect.full.primaryConstructor
import kotlin.reflect.jvm.isAccessible

class SingletonSettingsTest {
    @Test
    @DisplayName("싱글톤 패턴이 적용되지 않은 클래스 테스트")
    fun notApplySingleton() {
        // given
        val instance1 = Settings()
        val instance2 = Settings()
        // then
        assertTrue(instance1 != instance2)
    }

    @Test
    @DisplayName("초기 인스턴스가 null이면 객체를 생성하고, null이 아니면 같은 인스턴스를 사용하는지 확인하는 테스트")
    fun useSameInstanceCheck() {
        // given
        val singletonSettings1 = SingletonSettings1.getInstance()
        val singletonSettings11 = SingletonSettings1.getInstance()
        // then
        assertTrue(singletonSettings1 === singletonSettings11)
    }

    // TODO 테스트 실패 -> set으로 변경
    @Test
    @DisplayName("멀티스레드에 안전하지 않은 싱글톤 패턴 테스트")
    fun notThreadSafetySingleton() {
        // given
        val numThreads = 10
        val instances = mutableListOf<SingletonSettings1>() // 각 스레드에서 생성된 인스턴스 저장
        // when
        repeat(numThreads) {
            Thread {
                val instance = SingletonSettings1.getInstance()
                instances.add(instance)
            }.start()
        }
//        Thread.sleep(1000)
        val firstInstance = instances.firstOrNull()
//        assertTrue(instances.any { it != firstInstance })
    }

    @Test
    @DisplayName("멀티 스레드에 안전한 싱글톤 패턴 테스트")
    fun threadSafetySingleton() {
        // given
        val numThreads = 10
        val instances = mutableListOf<SingletonSettings2>()
        // when
        repeat(numThreads) {
            Thread {
                val instance = SingletonSettings2.getInstance()
                instances.add(instance)
            }.start()
        }
        Thread.sleep(1000)
        val firstInstance = instances.firstOrNull()
        // then
        assertTrue(instances.any { it === firstInstance })
    }

    @Test
    @DisplayName("이른 초기화를 사용한 싱글톤 패턴 테스트")
    fun earlyInitializationSingleton() {
        // given
        val singletonSettings3 = SingletonSettings3.getInstance()
        // then
        assertTrue(singletonSettings3 === SingletonSettings3.getInstance())
    }

    @Test
    @DisplayName("double checked locking을 사용한 싱글톤 패턴 테스트")
    fun doubleCheckedLockingSingleton() {
        // given
        val numThreads = 10
        val threads = arrayOfNulls<Thread>(numThreads) // 스레드
        val instances = arrayOfNulls<SingletonSettings4>(numThreads) // 인스턴스
        // when
        for (i in 0 until numThreads) {
            threads[i] = Thread {
                instances[i] = SingletonSettings4.getInstance()
            }
            threads[i]?.start()
        }
        for (i in 0 until numThreads) {
            threads[i]?.join()
        }
        // then
        val firstInstance = instances[0]
        for (i in 1 until numThreads) {
            assertTrue(firstInstance === instances[i])
        }
    }

    @Test
    @DisplayName("리플렉션을 사용해서 싱글톤을 깨뜨리는 방법 테스트")
    fun reflectionSingleton() {
        // given
        val singletonSettings5 = SingletonSettings5.getInstance()
        val constructor = singletonSettings5::class.primaryConstructor!!
        // when
        constructor.isAccessible = true
        val singletonSettings51 = constructor.call()
        // then
        assertTrue(singletonSettings5 != singletonSettings51)
    }

    @Test
    @DisplayName("직렬화를 사용해서 싱글톤을 깨뜨리는 방법 테스트")
    fun serializeSingleton() {
        // given
        val singletonSettings5 = SingletonSettings5.getInstance()
        // when
        // 직렬화
        val bos = ByteArrayOutputStream()
        val oos = ObjectOutputStream(bos)
        oos.writeObject(singletonSettings5)
        oos.flush()
        // 역직렬화
        val bytes = bos.toByteArray()
        val bis = ByteArrayInputStream(bytes)
        val ois = ObjectInputStream(bis)
        val deserialized = ois.readObject() as SingletonSettings5
        // then
        assertTrue(singletonSettings5 != deserialized)
    }

    @Test
    @DisplayName("enum 클래스 싱글톤 테스트")
    fun enumSingleton() {
        // given
        val singletonSettings6 = SingletonSettings6.INSTANCE
        // when
        // 직렬화
        val bos = ByteArrayOutputStream()
        val oos = ObjectOutputStream(bos)
        oos.writeObject(singletonSettings6)
        oos.flush()
        // 역직렬화
        val bytes = bos.toByteArray()
        val bis = ByteArrayInputStream(bytes)
        val ois = ObjectInputStream(bis)
        val deserialized = ois.readObject() as SingletonSettings6
        // then
        assertTrue(singletonSettings6 === deserialized)
    }

    @Test
    @DisplayName("object 키워드로 싱글톤 구현 테스트")
    fun objectDeclarationSingleton() {
        // given
        val instance = ObjectDeclarationSingleton
        val instance2 = ObjectDeclarationSingleton
        // then
        assertTrue(instance === instance2)
    }

    @Test
    @DisplayName("지연 초기화로 싱글톤 구현 테스트")
    fun lazyInitializationSingleton() {
        // given
        val instance = LazyInitializationSingleton
        val instance2 = LazyInitializationSingleton
        // then
        assertTrue(instance === instance2)
    }

    @Test
    @DisplayName("동반 객체로 싱글톤 구현 테스트")
    fun companionObjectSingleton() {
        // given
        val instance = CompanionObjectSingleton.getInstance()
        val instance2 = CompanionObjectSingleton.getInstance()
        // then
        assertTrue(instance === instance2)
    }

    @Test
    @DisplayName("패키지 레벨 함수로 싱글톤 구현 테스트")
    fun packageLevelSingleton() {
        // given
        useSingleton()
        // then
        assertTrue(useSingleton() === initializeSingleton())
    }
}
