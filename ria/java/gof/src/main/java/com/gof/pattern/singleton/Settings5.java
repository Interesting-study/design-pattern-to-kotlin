package com.gof.pattern.singleton;

import java.io.Serializable;

public class Settings5 implements Serializable { // 직렬화
    /** static inner 클래스 사용 -> 멀티스레드 환경에서 안전, lazy 로딩 가능 **/
    private Settings5() {
    }

    // static inner class
    private static class SettingsHolder {
        private static final Settings5 INSTANCE = new Settings5();
    }

    public static Settings5 getInstance() {
        return SettingsHolder.INSTANCE;
    }

    /**
     * 역직렬화 대응 방안
     * 해당 메서드가 없으면, return new Instance()
     **/
    protected Object readResolve() {
        return getInstance();
    }
}
