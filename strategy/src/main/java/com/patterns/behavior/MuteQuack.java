package com.patterns.behavior;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("<<silence>>");
    }

}
