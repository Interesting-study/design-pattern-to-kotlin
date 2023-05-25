package com.gof.pattern.singleton;

public class Settings2 {

    private static Settings2 instance;

    private Settings2() {
    }

    /** 멀티스레드 환경에서 안전함 / 성능 이슈 존재 **/
    public static synchronized Settings2 getInstance() {
        if (instance == null) {
            instance = new Settings2();
        }
        return instance;
    }
}
