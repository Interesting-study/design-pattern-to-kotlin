package com.gof.pattern.singleton

class SingletonSettings1 private constructor() {
    // companion ~= static
    companion object {
        private var instance: SingletonSettings1? = null // null 허용

        fun getInstance(): SingletonSettings1 {
            if (instance == null) {
                instance = SingletonSettings1()
            }
            /**
             * null 이 아닌 경우에만, 타입 캐스팅
             * null 인 경우, null 반환
             */
            return instance as SingletonSettings1
        }
    }
}
