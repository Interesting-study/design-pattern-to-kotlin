package com.gof.pattern.singleton

class SingletonSettings2 private constructor() {
    // companion ~= static
    companion object {
        private var instance: SingletonSettings2? = null // null 허용

        @Synchronized
        fun getInstance(): SingletonSettings2 {
            if (instance == null) {
                instance = SingletonSettings2()
            }
            /**
             * null 이 아닌 경우에만, 타입 캐스팅
             * null 인 경우, null 반환
             */
            return instance as SingletonSettings2
        }
    }
}