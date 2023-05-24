package com.gof.pattern.singleton;

public class Settings3 {

    /** 이른 초기화 사용하기 -> 멀티스레드 환경에서 안전함 / 비용 이슈 존재 **/
    private static final Settings3 INSTANCE = new Settings3();

    private Settings3() {
    }

    public static Settings3 getInstance() {
        return INSTANCE;
    }
}
