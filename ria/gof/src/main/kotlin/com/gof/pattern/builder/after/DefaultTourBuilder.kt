package com.gof.pattern.builder.after

import com.gof.pattern.builder.before.DetailPlan
import com.gof.pattern.builder.before.TourPlan
import java.time.LocalDate

class DefaultTourBuilder : TourPlanBuilder {

    var title: String? = null
    var nights: Int = 0
    var days: Int = 0
    var startDate: LocalDate? = null
    var whereToStay: String? = null
    var plans: MutableList<DetailPlan> = mutableListOf()

    override fun title(title: String): TourPlanBuilder {
        this.title = title
        return this
    }

    override fun nightsAndDays(nights: Int, days: Int): TourPlanBuilder {
        this.nights = nights
        this.days = days
        return this
    }

    override fun startDate(localDate: LocalDate): TourPlanBuilder {
        this.startDate = startDate
        return this
    }

    override fun whereToStay(whereToStay: String): TourPlanBuilder {
        this.whereToStay = whereToStay
        return this
    }

    override fun addPlan(day: Int, plan: String): TourPlanBuilder {
        if (this.plans == null) {
            this.plans = mutableListOf()
        }
        plans.add(DetailPlan(day, plan))
        return this
    }

    override fun getPlan(): TourPlan {
        return TourPlan(title, nights, days, startDate, whereToStay, plans)
    }
}
