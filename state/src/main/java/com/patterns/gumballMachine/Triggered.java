package com.patterns.gumballMachine;

class Triggered implements State {

    GumballMachine gumballMachine;

    public Triggered(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Not allow to put coin yet");
    }

    @Override
    public void retreiveCoin() {
        System.out.println("There's no coin");
    }

    @Override
    public void pull() {
        System.out.println("Wait until gumball is dispensed");
    }

    @Override
    public void obtainGumball() {
        System.out.println("Throwing gumball...");
        gumballMachine.decreaseCount();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoCoin());
        } else {
            gumballMachine.setState(gumballMachine.getSoldOut());
        }
    }

}
