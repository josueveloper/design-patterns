package com.patterns.behavior;

public class FlyRocketPowered implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Flying with rockets");
    }

}
