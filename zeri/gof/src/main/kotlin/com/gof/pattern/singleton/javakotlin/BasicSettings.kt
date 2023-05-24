package com.gof.pattern.singleton.javakotlin

class BasicSettings() {

    companion object {
        fun getInstance(): BasicSettings = BasicSettings()
    }
}
