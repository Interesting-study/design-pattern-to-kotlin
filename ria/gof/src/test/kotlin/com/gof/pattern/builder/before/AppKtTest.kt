package com.gof.pattern.builder.before

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import java.time.LocalDate

class AppKtTest {

    @Test
    @DisplayName("빌더 패턴 적용 전 성공 테스트")
    fun beforeBuilderSuccessTest() {
        // given
        val plan = TourPlan()
        // when
        plan.title = "세노떼 여행"
        plan.startDate = LocalDate.of(2023, 11, 4)
        plan.whereToStay = "리조트"
        // then
        assertThat(plan.title).isEqualTo("세노떼 여행")
        assertThat(plan.whereToStay).isEqualTo("리조트")
    }

    @Test
    @DisplayName("빌더 패턴 적용 전 실패 테스트")
    fun beforeBuilderFailTest() {
        // given
        var title: String = "세노떼 여행"
        var nights: Int = 2
        var days: Int = 3
        var startDate: LocalDate = LocalDate.of(2024, 7, 2)
        var whereToStay: String = "리조트"
        var plans: MutableList<DetailPlan> = mutableListOf()
        // then
        var plan = TourPlan(whereToStay, days, nights, startDate, title, plans)
        // then
        assertThat(plan.title).isEqualTo("세노떼 여행")
        assertThat(plan.whereToStay).isEqualTo("리조트")
    }
}
