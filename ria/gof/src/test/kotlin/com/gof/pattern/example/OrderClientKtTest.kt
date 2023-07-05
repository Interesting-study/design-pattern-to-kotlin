package com.gof.pattern.example

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

class OrderClientKtTest {

    @ParameterizedTest
    @EnumSource(OrderType::class)
    @DisplayName("팩토리 패턴을 적용한 주문 처리 테스트")
    fun orderProcessorTest(orderType: OrderType) {
        // given
        val order = OrderFactory.createOrder(orderType)
        // then
        when (orderType) {
            OrderType.ONLINE -> assertTrue(order is OnlineOrder)
            OrderType.OFFLINE -> assertTrue(order is OfflineOrder)
            OrderType.PHONE -> assertTrue(order is PhoneOrder)
        }
    }
}
