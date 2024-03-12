package com.patterns;

public class LightOffCommand implements Command {
    private Light light;

    LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void excecute() {
        light.turnOff();
    }

    @Override
    public void undo() {
        light.turnOn();
    }

}
