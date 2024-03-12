package com.patterns;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        Door door = new Door();

        RemoteControl control = new RemoteControl();

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        DoorOpenCommand doorOpenCommand = new DoorOpenCommand(door);
        DoorCloseCommand doorCloseCommand = new DoorCloseCommand(door);

        control.setSlot1(lightOnCommand, lightOffCommand);
        control.setSlot2(doorOpenCommand, doorCloseCommand);

        control.getSlot1().pressOn();
        control.getSlot1().pressOff();

        control.undo();

        control.getSlot2().pressOn();
        control.getSlot2().pressOff();

        control.undo();
        control.undo();
        control.undo();
        control.undo();
        control.undo();
        control.undo();
        control.undo();
        control.undo();

        control.getSlot3().pressOn();
    }
}