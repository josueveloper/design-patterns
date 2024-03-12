package com.patterns.impl;

import com.patterns.interfaces.Duck;

public class NormalDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("Quack!!");
    }

    @Override
    public void fly() {
        System.out.println("Fly like a duck");
    }

}
