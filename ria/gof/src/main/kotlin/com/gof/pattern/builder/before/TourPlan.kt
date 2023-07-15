package com.gof.pattern.builder.before

import java.time.LocalDate

class TourPlan {

    var title: String? = null
    var nights: Int = 0
    var days: Int = 0
    var startDate: LocalDate? = null
    var whereToStay: String? = null
    var plans: MutableList<DetailPlan> = mutableListOf()

    constructor()

    constructor(
        title: String?,
        nights: Int,
        days: Int,
        startDate: LocalDate?,
        whereToStay: String?,
        plans: MutableList<DetailPlan>
    ) {
        this.title = title
        this.nights = nights
        this.days = days
        this.startDate = startDate
        this.whereToStay = whereToStay
        this.plans = plans
    }

    fun addPlan(day: Int, plan: String) {
        if (this.plans == null) {
            this.plans = mutableListOf()
        }
        this.plans.add(DetailPlan(day, plan))
    }
}
