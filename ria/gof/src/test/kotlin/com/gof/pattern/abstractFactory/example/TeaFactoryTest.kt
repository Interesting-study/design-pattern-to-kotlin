package com.gof.pattern.abstractFactory.example

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

class TeaFactoryTest {

    @ParameterizedTest
    @EnumSource(TeaType::class)
    fun `블랙티_타입을 반환하는 테스트`(teaType: TeaType) {
        // given
        val tea = TeaFactory.makeTea(teaType)
        // when
        when (teaType) {
            TeaType.BLACK_TEA -> assertTrue(tea is BlackTea)
            TeaType.GREEN_TEA -> assertTrue((tea is GreenTea))
        }
    }
}
