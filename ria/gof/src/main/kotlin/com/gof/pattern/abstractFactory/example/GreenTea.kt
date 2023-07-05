package com.gof.pattern.abstractFactory.example

class GreenTea : Tea {
    override fun getName(): String {
        return "green tea"
    }

    override fun getTemperature(): String {
        return "ice"
    }
}
