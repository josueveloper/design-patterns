package com.patterns;

import java.util.Stack;

public class Slot {

    private Command on;
    private Command off;
    private Stack<Command> history;

    Slot(Command on, Command off, Stack<Command> history) {
        this.on = on;
        this.off = off;
        this.history = history;
    }

    public void setCommand(Command on, Command off) {
        this.on = on;
        this.off = off;
    }

    public void pressOn() {
        on.excecute();
        history.add(on);
    }

    public void pressOff() {
        off.excecute();
        history.add(off);
    }
}
