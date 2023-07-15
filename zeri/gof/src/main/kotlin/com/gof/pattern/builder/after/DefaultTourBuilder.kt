package com.gof.pattern.builder.after

import com.gof.pattern.builder.before.DetailPlan
import com.gof.pattern.builder.before.TourPlan
import java.time.LocalDate

class DefaultTourBuilder : TourPlanBuilder {
    private var title: String = ""
    private var nights: Int = 0
    private var days: Int = 0
    private var startDate: LocalDate = LocalDate.now()
    private var whereToStay: String = ""
    private var plans: MutableList<DetailPlan>? = null

    override fun nightsAndDays(nights: Int, days: Int): TourPlanBuilder {
        this.nights = nights
        this.days = days
        return this
    }

    override fun title(title: String): TourPlanBuilder {
        this.title = title
        return this
    }

    override fun startDate(localDate: LocalDate): TourPlanBuilder {
        this.startDate = localDate
        return this
    }

    override fun whereToStay(whereToStay: String): TourPlanBuilder {
        this.whereToStay = whereToStay
        return this
    }

    override fun addPlan(day: Int, plan: String): TourPlanBuilder {
        if (plans == null) {
            plans = mutableListOf()
        }

        plans?.add(DetailPlan(day, plan))
        return this
    }

    override fun getPlan(): TourPlan {
        return TourPlan(title, nights, days, startDate, whereToStay, plans ?: emptyList())
    }
}
