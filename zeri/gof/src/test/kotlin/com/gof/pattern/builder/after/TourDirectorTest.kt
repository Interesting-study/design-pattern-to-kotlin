package com.gof.pattern.builder.after

import com.gof.pattern.builder.before.DetailPlan
import com.gof.pattern.builder.before.TourPlan
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import java.time.LocalDate

class TourDirectorTest {
    @Test
    @DisplayName("빌더 패턴이 정상적으로 작동한다")
    fun builderPatternAfterTest() {
        // given
        val director = TourDirector(DefaultTourBuilder())

        // when
        val cancunPlan: TourPlan = director.cancunTrip()
        val longBeachTrip: TourPlan = director.longBeachTrip()

        // then
        assertEquals("롱비치", longBeachTrip.title)
        assertEquals(LocalDate.of(2021, 7, 15), longBeachTrip.startDate)

        assertEquals("칸쿤 여행", cancunPlan.title)
        assertEquals(2, cancunPlan.nights)
        assertEquals(3, cancunPlan.days)
        assertEquals(LocalDate.of(2020, 12, 9), cancunPlan.startDate)
        assertEquals("리조트", cancunPlan.whereToStay)
        assertEquals(2, cancunPlan.plans.size)
        assertEquals(DetailPlan(0, "체크인하고 짐 풀기"), cancunPlan.plans[0])
        assertEquals(DetailPlan(0, "저녁 식사"), cancunPlan.plans[1])
    }
}
