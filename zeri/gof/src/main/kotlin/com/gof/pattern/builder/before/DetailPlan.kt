package com.gof.pattern.builder.before

data class DetailPlan(var day: Int, var plan: String) {

    override fun toString(): String {
        return "DetailPlan{ day= $day , plan =  $plan }"
    }
}
