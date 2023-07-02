package com.gof.pattern.builder.before;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
        TourPlan shortTrip = new TourPlan();
        shortTrip.setTitle("세노떼 여행");
        shortTrip.setStartDate(LocalDate.of(2023, 11, 12));

        TourPlan tourPlan = new TourPlan();
        tourPlan.setTitle("칸쿤 여행");
        tourPlan.setNights(2);
        tourPlan.setDays(3);
        tourPlan.setStartDate(LocalDate.of(2023, 11, 29));
        tourPlan.setWhereToStay("리조트");
        tourPlan.addPlan(0, "체크인 이후 짐풀기");
        tourPlan.addPlan(0, "저녁 식사");
        tourPlan.addPlan(1, "조식 뷔페에서 식사");
        tourPlan.addPlan(1, "해변가 산책");
        tourPlan.addPlan(2, "체크아웃");
    }
}
