package com.patterns;

import com.patterns.behavior.FlyWithWings;
import com.patterns.behavior.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("im a MallarDuck");
    }
}
