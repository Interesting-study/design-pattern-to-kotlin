package com.gof.pattern.factorymethod.after

import com.gof.pattern.factorymethod.javatokotlin.after.BlackShipFactory
import com.gof.pattern.factorymethod.javatokotlin.after.ShipFactory
import com.gof.pattern.factorymethod.javatokotlin.after.WhiteShipFactory
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import java.util.*

@SpringBootTest
class AfterFactoryMethodTest {

    @Test
    @DisplayName("팩토리 메소드 패턴 after 테스트")
    fun afterFactoryMethodTest() {
        val whiteShipFactory = WhiteShipFactory()
        val whiteShip = factoryOrderShip(whiteShipFactory, "WhiteShip", "rt.slowth@gmail.com")

        val blackShipFactory = BlackShipFactory()
        val blackShip = factoryOrderShip(blackShipFactory, "BlackShip", "rt.slowth@gmail.com")

        assertEquals("WhiteShip", whiteShip.name)
        assertEquals("white", whiteShip.color)
        assertEquals("BlackShip", blackShip.name)
        assertEquals("black", blackShip.color)
    }

    private fun factoryOrderShip(shipFactory: ShipFactory, name: String, email: String) = shipFactory.orderShip(name, email)

    @Test
    @DisplayName("Calendar 클래스에서의 팩토리 메서드 패턴")
    fun calendarExampleTest() {
        assertTrue(Calendar::class.java.isAssignableFrom(GregorianCalendar::class.java))
        assertTrue(Calendar::class.java.isAssignableFrom(Calendar.getInstance(Locale.forLanguageTag("th-TH")).javaClass))
        assertTrue(Calendar::class.java.isAssignableFrom(Calendar.getInstance(Locale.forLanguageTag("ja-JP-x-lvariant-JP")).javaClass))
    }

/*
    @Test
    @DisplayName("Spring Bean Factory 에서 확인하는 팩토리 메소드 패턴 -> 추상 메소드 패턴 이후 작성 예정")
    fun springBeanFactoryExampleTest(){
        // given
        val xmlFactory: BeanFactory = ClassPathXmlApplicationContext("config.xml")
        val hello = xmlFactory.getBean("hello", String::class.java)
        val javaFactory: BeanFactory = AnnotationConfigApplicationContext(Config::class.java)
        val hi = javaFactory.getBean("hello", String::class.java)

        // when
        assertTrue(hello == hi)

        // then
    }
*/
}
