package com.gof.pattern.builder.java;

import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        Stream<String> names = Stream.<String>builder().add("keesun").add("whiteship").build();
        names.forEach(System.out::println);
    }
}
