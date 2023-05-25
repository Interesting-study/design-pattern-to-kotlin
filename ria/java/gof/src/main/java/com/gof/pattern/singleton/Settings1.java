package com.gof.pattern.singleton;

public class Settings1 {

    private static Settings1 instance;

    private Settings1() {
    }

    /** 멀티스레드에 안전하지 않음 **/
    public static Settings1 getInstance() {
        if (instance == null) {
            instance = new Settings1();
        }
        return instance;
    }
}
