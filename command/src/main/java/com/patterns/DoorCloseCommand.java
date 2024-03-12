package com.patterns;

public class DoorCloseCommand implements Command {
    Door door;

    DoorCloseCommand(Door door) {
        this.door = door;
    }

    @Override
    public void excecute() {
        door.close();
        door.lock();
    }

    @Override
    public void undo() {
        door.unlock();
        door.open();
    }
}
