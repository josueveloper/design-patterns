package com.patterns;

import com.patterns.behavior.FlyNoWay;
import com.patterns.behavior.Quack;
import com.patterns.behavior.Squeak;

public class RubberDuck extends Duck {
    @Override
    public void display() {
        System.out.println("im a Rubber duck");
    }

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }
}
