package com.patterns.gumballMachine;

class HasCoin implements State {

    GumballMachine gumballMachine;

    public HasCoin(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Has coin already");
    }

    @Override
    public void retreiveCoin() {
        System.out.println("Coin removed");
        gumballMachine.setState(gumballMachine.getNoCoin());
    }

    @Override
    public void pull() {
        System.out.println("Machine triggered");
        gumballMachine.setState(gumballMachine.getTriggered());
    }

    @Override
    public void obtainGumball() {
        System.out.println("Not triggered yet");
    }

}
