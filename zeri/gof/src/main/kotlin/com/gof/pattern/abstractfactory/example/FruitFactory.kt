package com.gof.pattern.abstractfactory.example

import java.util.*

class FruitFactory {
    companion object {
        fun createFruit(fruitType: String): Fruit? {
            return try {
                when (FruitType.valueOf(fruitType.uppercase(Locale.getDefault()))) {
                    FruitType.APPLE -> Apple()
                    FruitType.BANANA -> Banana()
                }
            } catch (ex: IllegalArgumentException) {
                null
            }
        }
    }
}
