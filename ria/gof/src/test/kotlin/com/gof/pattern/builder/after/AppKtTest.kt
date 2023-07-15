package com.gof.pattern.builder.after

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AppKtTest {

    @Test
    fun `빌더패턴 적용 후 성공 테스트`() {
        // given
        var director = TourDirector(DefaultTourBuilder())
        // when
        val cancunTrip = director.cancunTrip()
        // then
        assertThat(cancunTrip.title).isEqualTo("칸쿤 여행")
        assertThat(cancunTrip.whereToStay).isEqualTo("리조트")
        assertThat(cancunTrip.plans.map { it.plan }).contains("저녁 식사")
    }
}
