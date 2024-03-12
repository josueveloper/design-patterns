package com.patterns;

import java.util.EmptyStackException;
import java.util.Stack;

public class RemoteControl {
    private Slot slot1;
    private Slot slot2;
    private Slot slot3;
    private Slot slot4;
    private Stack<Command> history;

    RemoteControl() {
        Command noCommand = new NoCommand();
        history = new Stack<>();
        slot1 = new Slot(noCommand, noCommand, history);
        slot2 = new Slot(noCommand, noCommand, history);
        slot3 = new Slot(noCommand, noCommand, history);
        slot4 = new Slot(noCommand, noCommand, history);
    }

    public void undo() {

        try {
            Command command = history.pop();
            command.undo();
        } catch (EmptyStackException e) {
            System.out.println("History is empty");
        }
    }

    public Slot getSlot1() {
        return slot1;
    }

    public Slot getSlot2() {
        return slot2;
    }

    public Slot getSlot3() {
        return slot3;
    }

    public Slot getSlot4() {
        return slot4;
    }

    public void setSlot1(Command on, Command off) {
        slot1.setCommand(on, off);
    }

    public void setSlot2(Command on, Command off) {
        slot2.setCommand(on, off);
    }

    public void setSlot3(Command on, Command off) {
        slot3.setCommand(on, off);
    }

    public void setSlot4(Command on, Command off) {
        slot4.setCommand(on, off);
    }

}
