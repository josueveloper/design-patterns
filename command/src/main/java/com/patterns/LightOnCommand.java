package com.patterns;

public class LightOnCommand implements Command {

    private Light light;

    LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void excecute() {
        light.turnOn();
    }

    @Override
    public void undo() {
        light.turnOff();
    }

}
