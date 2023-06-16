package com.gof.pattern.singleton

import java.io.Serializable

// : extends or implements
class SingletonSettings5 private constructor() : Serializable {
    private object SingletonHolder {
        val INSTANCE =
            SingletonSettings5()
    }

    companion object {
        fun getInstance(): SingletonSettings5 = SingletonHolder.INSTANCE
    }
}
