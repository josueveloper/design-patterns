package com.patterns;

import com.patterns.behavior.FlyConUnaAla;
import com.patterns.behavior.FlyNoWay;
import com.patterns.behavior.Squeak;

public class Main {
    public static void main(String[] args) {
        Duck mallar = new MallardDuck();
        mallar.performQuack();
        mallar.performFly();

        mallar.setFlyBehavior(new FlyNoWay());
        mallar.setQuackBehavior(new Squeak());

        mallar.setFlyBehavior(new FlyConUnaAla());

        mallar.performFly();
        mallar.performQuack();

        // Duck model = new ModelDuck();
        // model.performFly();
        // model.performQuack();

        // model.setFlyBehavior(new FlyRocketPowered());

        // model.performFly();
    }
}