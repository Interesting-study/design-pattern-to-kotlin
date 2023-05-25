package com.gof.pattern.singleton;

public class RuntimeExample {
    public static void main(String[] args) {
        /** 싱글톤 패턴이 적용된 클래스 **/
        Runtime runtime = Runtime.getRuntime(); // 생성자로 생성 불가
        System.out.println(runtime.maxMemory());
    }
}
