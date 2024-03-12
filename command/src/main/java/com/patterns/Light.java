package com.patterns;

public class Light {
    private boolean state = false;

    public void turnOn() {
        state = true;
        System.out.println("Light on");
    }

    public void turnOff() {
        state = false;
        System.out.println("Light off");
    }

    public boolean getState() {
        return state;
    }
}
