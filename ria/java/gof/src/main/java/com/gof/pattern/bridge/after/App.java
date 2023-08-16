package com.gof.pattern.bridge.after;

import com.gof.pattern.bridge.before.Champion;

//
public class App {
    public static void main(String[] args) {
        Champion kda아리 = new 아리(new KDA());
        kda아리.move();
        kda아리.skillR();
    }
}
