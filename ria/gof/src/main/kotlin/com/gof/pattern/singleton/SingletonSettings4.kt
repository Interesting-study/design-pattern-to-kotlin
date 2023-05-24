package com.gof.pattern.singleton

class SingletonSettings4 private constructor() {
    // companion ~= static
    companion object {
        private var instance: SingletonSettings4? = null
        fun getInstance(): SingletonSettings4 {
            if (instance == null) {
                @Synchronized
                if (instance == null) {
                    instance = SingletonSettings4()
                }
            }
            return instance as SingletonSettings4
        }
    }
}
