package com.gof.pattern.builder.after

import com.gof.pattern.builder.before.TourPlan
import java.time.LocalDate

interface TourPlanBuilder {
    fun nightsAndDays(nights: Int, days: Int): TourPlanBuilder
    fun title(title: String): TourPlanBuilder
    fun startDate(localDate: LocalDate): TourPlanBuilder
    fun whereToStay(whereToStay: String): TourPlanBuilder
    fun addPlan(day: Int, plan: String): TourPlanBuilder
    fun getPlan(): TourPlan
}
