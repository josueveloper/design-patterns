package com.patterns;

public abstract class Pizza {
    public void prepare() {
        System.out.println("preparing");
    }

    public void bake() {
        System.out.println("baking");
    }

    public void cut() {
        System.out.println("cutting");
    }

    public void box() {
        System.out.println("boxing");
    }

}
