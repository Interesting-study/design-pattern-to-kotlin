package com.gof.pattern.builder.before

import java.time.LocalDate

class App

fun main() {
    var shortTrip = TourPlan()
    shortTrip.title = "세노떼 여행"
    shortTrip.startDate = LocalDate.of(2023, 10, 11)

    var tourPlan = TourPlan()
    tourPlan.title = "칸쿤 여행"
    tourPlan.nights = 2
    tourPlan.days = 3
    tourPlan.startDate = LocalDate.of(2024, 3, 2)
    tourPlan.whereToStay = "리조트"
    tourPlan.addPlan(0, "체크인 이후 짐풀기")
    tourPlan.addPlan(1, "조식 뷔페에서 식사")
    tourPlan.addPlan(1, "수영하기")
    tourPlan.addPlan(2, "체크아웃")
}
