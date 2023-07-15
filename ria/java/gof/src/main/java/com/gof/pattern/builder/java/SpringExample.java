package com.gof.pattern.builder.java;

import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

/**
 * uri를 문자열로 만들 때보다 안전하게 만들 수 있음
 */
public class SpringExample {
    public static void main(String[] args) {
        UriComponents howToStudyJava = UriComponentsBuilder.newInstance()
                .scheme("http")
                .host("www.whiteship.me")
                .path("java-playList-ep1")
                .build().encode();
        System.out.println("howToStudyJava = " + howToStudyJava);
    }
}
