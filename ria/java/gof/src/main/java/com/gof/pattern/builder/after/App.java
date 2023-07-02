package com.gof.pattern.builder.after;

import com.gof.pattern.builder.before.TourPlan;

/**
 * 빌더패턴
 * 장점) 구체 로직 은닉, 다양한 빌더를 통해 다양한 로직 구현 가능
 * 단점) 구조가 복잡해짐, 빌더 사용을 위한 인스턴스 생성
 */
public class App {
    public static void main(String[] args) {
//        DefaultTourBuilder builder = new DefaultTourBuilder();
//        TourPlan plan = builder.title("칸쿤 여행")
//                .nightsAndDays(2, 3)
//                .startDate(LocalDate.of(2023, 8, 29))
//                .whereToStay("리조트")
//                .addPlan(0, "체크인하고 짐 풀기")
//                .addPlan(0, "저녁 식사")
//                .getPlan();
//
//        TourPlan longBeachTrip = builder.title("롱비치")
//                .startDate(LocalDate.of(2023, 10, 5))
//                .getPlan();

        TourDirector director = new TourDirector(new DefaultTourBuilder());
        TourPlan cancunTrip = director.cancunTrip();
        TourPlan longBeachTrip = director.longBeachTrip();
    }
}
