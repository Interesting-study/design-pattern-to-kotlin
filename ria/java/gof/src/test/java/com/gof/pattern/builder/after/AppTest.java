package com.gof.pattern.builder.after;

import com.gof.pattern.builder.before.TourPlan;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AppTest {

    @Test
    @DisplayName("빌더 패턴 적용 후 성공 테스트")
    void afterBuilderSuccessTest() {
        // given
        TourDirector director = new TourDirector(new DefaultTourBuilder());
        // when
        TourPlan cancunTrip = director.cancunTrip();
        // then
        assertThat(cancunTrip.getTitle()).isEqualTo("칸쿤 여행");
        assertThat(cancunTrip.getWhereToStay()).isEqualTo("리조트");
        assertThat(cancunTrip.getPlans().contains("저녁 식사"));
    }
}