package com.gof.pattern.abstractFactory.example

class TeaFactory {

    companion object {
        fun makeTea(teaType: TeaType): Tea {
            return when (teaType) {
                TeaType.BLACK_TEA -> BlackTea()
                TeaType.GREEN_TEA -> GreenTea()
                else -> throw IllegalArgumentException("존재하지 않는 티 타입입니다. $teaType")
            }
        }
    }
}
