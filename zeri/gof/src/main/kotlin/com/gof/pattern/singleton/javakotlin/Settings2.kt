package com.gof.pattern.singleton.javakotlin

/**
 * [가장 단순히 구현하는 법]
 * - 클래스 안에서 private 한 인스턴스 변수를 생성한 후 static 메소드를 통해 객체를 생성하려는 순간, 객체가 비어있다면
 * 새로 생성하고 그렇지 않다면 클래스 안에 있는 인스턴스 변수를 전달한다.
 * -  thread safe 하지 않다.
 * - 동시에 다른 thread 에서 빈 인스턴스 변수에 접근하려고 했을 때 어떻게 될지?
 */
class Settings2 private constructor() {
    companion object {
        private var instance: Settings2? = null

        fun getInstance(): Settings2 {
            if (instance == null) {
                instance = Settings2()
            }

            return instance!!
        }
    }
}
