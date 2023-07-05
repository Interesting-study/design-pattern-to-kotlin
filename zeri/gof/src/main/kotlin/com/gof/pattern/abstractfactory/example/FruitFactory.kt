package com.gof.pattern.abstractfactory.example

import java.util.*

class FruitFactory {
    companion object {
        fun createFruit(fruitType: String): Fruit {
            return when (FruitType.valueOf(fruitType.uppercase(Locale.getDefault()))) {
                FruitType.APPLE -> Apple()
                FruitType.BANANA -> Banana()
                else -> throw IllegalArgumentException("Invalid fruit type: $fruitType")
            }
        }
    }
}

