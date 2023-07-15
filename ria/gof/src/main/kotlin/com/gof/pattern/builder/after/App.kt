package com.gof.pattern.builder.after

class App

fun main() {
    var director = TourDirector(DefaultTourBuilder())
    val cancunTrip = director.cancunTrip()
    val longBeachTrip = director.longBeachTrip()
}
