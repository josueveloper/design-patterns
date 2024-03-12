package com.patterns;

import java.util.ArrayList;
import java.util.List;

import com.patterns.ingredients.Cheese;
import com.patterns.ingredients.Clams;
import com.patterns.ingredients.Dough;
import com.patterns.ingredients.Pepperoni;
import com.patterns.ingredients.Sauce;
import com.patterns.ingredients.Veggies;

public abstract class Pizza {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Veggies[] veggies;
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clams clams;

    public abstract void prepare();

    public void bake() {
        System.out.println("baking");
    }

    public void cut() {
        System.out.println("cutting");
    }

    public void box() {
        System.out.println("boxing");
    }

    public void setName(String name) {
        this.name = name;
    }

}
