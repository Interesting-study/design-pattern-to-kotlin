package com.gof.pattern.singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringExample {
    public static void main(String[] args) {
        /**
         * 싱글톤 스코프
         * ApplicationContext 내부에서 유일한 인스턴스로 관리해줌 -> 싱글톤 패턴과는 다른 개념임
         */
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
        String hello = ac.getBean("hello", String.class);
        String hello2 = ac.getBean("hello", String.class);
        System.out.println(hello == hello2); // true
    }
}
