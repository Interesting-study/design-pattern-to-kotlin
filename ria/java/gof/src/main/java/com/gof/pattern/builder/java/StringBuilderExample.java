package com.gof.pattern.builder.java;

public class StringBuilderExample {
    public static void main(String[] args) {
        // synchronized 사용x
        StringBuilder stringBuilder = new StringBuilder();
        String result = stringBuilder.append("whiteship")
                .append("keesun")
                .toString();
        System.out.println("result = " + result);
    }
}
