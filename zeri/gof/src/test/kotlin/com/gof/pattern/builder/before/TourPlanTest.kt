package com.gof.pattern.builder.before

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import java.time.LocalDate

class TourPlanTest {
    @Test
    @DisplayName("빌더패턴 적용 전 테스트가 정상 작동한다.")
    fun builderPatternBeforeTest() {
        // given
        val shortPlan = TourPlan()
        val tourPlan = TourPlan()

        // when
        shortPlan.title = "오레곤 롱비치 여행"
        shortPlan.startDate = LocalDate.of(2021, 7, 15)

        tourPlan.title = "칸쿤 여행"
        tourPlan.nights = 2
        tourPlan.days = 3
        tourPlan.startDate = LocalDate.of(2020, 12, 9)
        tourPlan.whereToStay = "리조트"
        tourPlan.addPlan(0, "체크인 이후 짐풀기")
        tourPlan.addPlan(0, "저녁 식사")
        tourPlan.addPlan(1, "조식 뷔페에서 식사")
        tourPlan.addPlan(1, "해변가 산책")
        tourPlan.addPlan(1, "점심은 수영장 근처에서 먹기")
        tourPlan.addPlan(1, "리조트 수영장에서 놀기")
        tourPlan.addPlan(1, "저녁은 BBQ 식당에서 스테이크")
        tourPlan.addPlan(2, "조식 부페에서 식사")
        tourPlan.addPlan(2, "체크아웃")

        // then
        assertEquals("오레곤 롱비치 여행", shortPlan.title)
        assertEquals(LocalDate.of(2021, 7, 15), shortPlan.startDate)

        assertEquals("칸쿤 여행", tourPlan.title)
        assertEquals(2, tourPlan.nights)
        assertEquals(3, tourPlan.days)
        assertEquals(LocalDate.of(2020, 12, 9), tourPlan.startDate)
        assertEquals("리조트", tourPlan.whereToStay)
        assertEquals(9, tourPlan.plans.size)
    }
}
