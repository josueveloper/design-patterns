package com.patterns.gumballMachine;

class NoCoin implements State {
    GumballMachine gumballMachine;

    public NoCoin(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Coin inserted");
        gumballMachine.setState(gumballMachine.getHasCoin());
    }

    @Override
    public void retreiveCoin() {
        System.out.println("There's no coin");
    }

    @Override
    public void pull() {
        System.out.println("There's no coin");
    }

    @Override
    public void obtainGumball() {
        System.out.println("There's no coin");
    }

}
