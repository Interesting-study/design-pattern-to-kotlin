package com.gof.pattern.factoryMethod.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class OrderTest {

    @Test
    @DisplayName("팩토리 패턴을 적용한 주문 처리 테스트")
    void orderProcessorTest() {
        OrderProcessor online = OrderProcessorFactory.createOrderProcessor("online");
        Order onlineOrder = online.order();
        assertThat(onlineOrder.getOrderType()).isEqualTo("online");
        assertThat(onlineOrder.getItem()).isEqualTo("맥북");

        OrderProcessor inStore = OrderProcessorFactory.createOrderProcessor("inStore");
        Order inStoreOrder = inStore.order();
        assertThat(inStoreOrder.getOrderType()).isEqualTo("inStore");
        assertThat(inStoreOrder.getItem()).isEqualTo("pen");

        OrderProcessor phone = OrderProcessorFactory.createOrderProcessor("phone");
        Order phoneOrder = phone.order();
        assertThat(phoneOrder.getOrderType()).isEqualTo("phone");
        assertThat(phoneOrder.getItem()).isEqualTo("travel");
    }

    @Test
    @DisplayName("존재하지 않는 주문 타입으로 요청 시 예외가 발생하는 테스트")
    void notExistOrderTypeTest() {
        Assertions.assertThrows(IllegalStateException.class,
                () -> OrderProcessorFactory.createOrderProcessor("refund"));
    }
}