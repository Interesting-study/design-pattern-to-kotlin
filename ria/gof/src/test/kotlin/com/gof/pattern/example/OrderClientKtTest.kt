package com.gof.pattern.example

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class OrderClientKtTest {

    @Test
    @DisplayName("팩토리 패턴을 적용한 주문 처리 테스트")
    fun orderProcessorTest() {
        // given
        val online = OrderFactory.createOrder(OrderType.ONLINE)
        // then
        assertTrue(online is OnlineOrder)

        // given
        val offline = OrderFactory.createOrder(OrderType.OFFLINE)
        // then
        assertTrue(offline is OfflineOrder)

        // given
        val phone = OrderFactory.createOrder(OrderType.PHONE)
        // then
        assertTrue(phone is PhoneOrder)
    }

//    @Test
//    @DisplayName("존재하지 않는 주문 타입으로 요청 시 예외가 발생하는 테스트")
//    fun notExistOrderTypeTest() {
//        assertThrows(
//            IllegalStateException::class.java,
//        ) { OrderProcessorFactory.createOrderProcessor("refund") }
//    }
}
