package com.gof.pattern.abstractFactory.example

class BlackTea : Tea {
    override fun getName(): String {
        return "black tea"
    }

    override fun getTemperature(): String {
        return "hot"
    }
}
