package com.gof.pattern.example

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class OrderClientKtTest {

    @Test
    @DisplayName("팩토리 패턴을 적용한 주문 처리 테스트")
    fun orderProcessorTest() {
        val online = OrderProcessorFactory.createOrderProcessor("online")
        val onlineOrder = online.order()
        assertThat(onlineOrder.orderType).isEqualTo("online")
        assertThat(onlineOrder.item).isEqualTo("맥북")

        val inStore = OrderProcessorFactory.createOrderProcessor("inStore")
        val inStoreOrder = inStore.order()
        assertThat(inStoreOrder.orderType).isEqualTo("inStore")
        assertThat(inStoreOrder.item).isEqualTo("pen")

        val phone = OrderProcessorFactory.createOrderProcessor("phone")
        val phoneOrder = phone.order()
        assertThat(phoneOrder.orderType).isEqualTo("phone")
        assertThat(phoneOrder.item).isEqualTo("travel")
    }

    @Test
    @DisplayName("존재하지 않는 주문 타입으로 요청 시 예외가 발생하는 테스트")
    fun notExistOrderTypeTest() {
        assertThrows(
            IllegalStateException::class.java,
        ) { OrderProcessorFactory.createOrderProcessor("refund") }
    }
}
