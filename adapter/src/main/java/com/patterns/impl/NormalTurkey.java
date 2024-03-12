package com.patterns.impl;

import com.patterns.interfaces.Turkey;

public class NormalTurkey implements Turkey {

    @Override
    public void gobble() {
        System.out.println("Gobble gobble gobble!!");
    }

    @Override
    public void fly() {
        System.out.println("Fly like a turkey");
    }

}
