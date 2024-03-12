package com.patterns;

public abstract class Beverage {

    String description = "Unknown descripition";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
