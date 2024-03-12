package com.patterns;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    protected String name;
    protected String dough;
    protected String sauce;
    protected List<String> toppings = new ArrayList<>();

    public void prepare() {
        System.out.println("preparing " + name);
        System.out.println("tossing dough");
        System.out.println("adding sauce");
        System.out.println("adding toppings:");
        for (String topping : toppings) {
            System.out.println("    " + topping);
        }
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
