package com.patterns;

public class DoorOpenCommand implements Command {
    Door door;

    DoorOpenCommand(Door door) {
        this.door = door;
    }

    @Override
    public void excecute() {
        door.unlock();
        door.open();
    }

    @Override
    public void undo() {
        door.close();
        door.lock();
    }

}
