package com.gof.pattern.builder.before

import java.time.LocalDate

data class TourPlan(
    var title: String,
    var nights: Int,
    var days: Int,
    var startDate: LocalDate,
    var whereToStay: String,
    var plans: List<DetailPlan>,
) {
    constructor() : this("", 0, 0, LocalDate.now(), "", listOf())

    override fun toString(): String {
        return "TourPlan{ title= $title , nights =  $nights, days =  $days , startDate =  $startDate , whereToStay =  $whereToStay , plans =  $plans }"
    }

    fun addPlan(day: Int, plan: String) {
        plans = plans + DetailPlan(day, plan)
    }
}
