package com.gof.pattern.builder.before;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class AppTest {

    @Test
    @DisplayName("빌더 패턴 적용 전 성공 테스트")
    void beforeBuilderSuccessTest() {
        // given
        TourPlan plan = new TourPlan();
        // when
        plan.setTitle("세노떼 여행");
        plan.setStartDate(LocalDate.of(2023, 11, 23));
        plan.setWhereToStay("리조트");
        // then
        assertThat(plan.getTitle()).isEqualTo("세노떼 여행");
        assertThat(plan.getWhereToStay()).isEqualTo("리조트");
    }

    /**
     * 생성자 호출 시 순서 보장x
     */
    @Test
    @DisplayName("빌더 패턴 적용 전 실패 테스트")
    void beforeBuilderFailTest() {
        // given
        String title = "세노떼 여행";
        int nights = 2;
        int days = 3;
        LocalDate startDate = LocalDate.of(2023, 11, 11);
        String whereToStay = "리조트";
        List<DetailPlan> plans = new ArrayList<>();
        // when
        TourPlan plan = new TourPlan(whereToStay, days, nights, startDate, title, plans);
        // then
        assertThat(plan.getTitle()).isEqualTo("세노떼 여행");
        assertThat(plan.getDays()).isEqualTo(3);
    }
}