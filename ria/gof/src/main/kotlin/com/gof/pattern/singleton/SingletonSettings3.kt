package com.gof.pattern.singleton

class SingletonSettings3 private constructor() {
    // companion ~= static
    companion object {
        private var INSTANCE = SingletonSettings3()
        fun getInstance(): SingletonSettings3 = INSTANCE
    }
}
