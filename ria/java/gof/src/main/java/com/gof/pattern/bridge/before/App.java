package com.gof.pattern.bridge.before;

public class App {

    public static void main(String[] args) {
        Champion kda아리 = new KDA아리();
        kda아리.move();
        kda아리.skillQ();
    }
}
